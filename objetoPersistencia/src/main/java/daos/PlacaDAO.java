/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import conexionEM.Conexion;
import conexionEM.IConexion;
import dtos.PersonaDTO;
import dtos.PlacaDTO;
import interfaces.daos.IPlacaDAO;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TemporalType;
import javax.persistence.TypedQuery;
import persistencia.Persona;
import persistencia.Placa;
import persistencia.Vehiculo;
import tramite.EstadoTramite;

/**
 *
 * @author Héctor Francisco Báez Luque
 * @author Diego Alcantar Acosta
 */
public class PlacaDAO implements IPlacaDAO{

    private IConexion conexion;

    public PlacaDAO() {
        conexion = new Conexion();
    }
    
    @Override
    public PlacaDTO registrarPlaca(Vehiculo vehiculo, float costo, String claveNumerica, PersonaDTO persona) {
        EntityManager em = conexion.abrir();
        em.getTransaction().begin();

        try {

            Calendar fechaExpedicion = Calendar.getInstance();
            
            PersonaDAO buscaPersona = new PersonaDAO();
            Persona personaTramite = buscaPersona.consultarPersona(persona.getRfc());

            Placa placa = new Placa(claveNumerica, vehiculo, costo, EstadoTramite.ACTIVA, fechaExpedicion, personaTramite);
            em.persist(placa);
            em.getTransaction().commit();

            PlacaDTO placaDTO = new PlacaDTO();
            placaDTO.setNumeroAlfanumerico(claveNumerica);
            placaDTO.setEstado(placa.getEstado());
            placaDTO.setFechaExpedicion(placa.getFechaExpedicion());
            placaDTO.setVehiculo(placa.getVehiculo());
            placaDTO.setCosto(placa.getCosto());

            return placaDTO;
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
            throw e;
        } finally {
            em.close();
        }
    }

    @Override
    public Placa getPlacaActiva(Vehiculo vehiculo) {
        EntityManager em = conexion.abrir();
        try {
            String sentencia = "SELECT p FROM Placa p WHERE p.vehiculo = :vehiculo AND p.estado = :estado";
            TypedQuery<Placa> query = em.createQuery(sentencia, Placa.class);
            query.setParameter("vehiculo", vehiculo);
            query.setParameter("estado", EstadoTramite.ACTIVA);
            return query.getSingleResult();
        } catch (NoResultException e) {
            e.printStackTrace();
            return null;
        } finally {
            em.close();
        }
    }

    @Override
    public void desactivarPlaca(Vehiculo vehiculo) {
        EntityManager em = conexion.abrir();
        em.getTransaction().begin();
        try {
            Placa placa = getPlacaActiva(vehiculo);
            if (placa != null) {
                placa.setEstado(EstadoTramite.VENCIDA);
                placa.setFechaRecepcion(Calendar.getInstance());
                em.merge(placa);
                em.getTransaction().commit();
            } else {
                System.out.println("No hay placas que pertenezcan al vehículo.");
            }
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    @Override
    public List<Placa> getPlacasPorRFC(String rfc) {
        EntityManager em = conexion.abrir();
        em.getTransaction().begin();

        try {
            String sentencia = "SELECT p FROM Placa p WHERE p.persona.rfc = :rfc";
            TypedQuery<Placa> query = em.createQuery(sentencia, Placa.class);
            query.setParameter("rfc", rfc);
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    @Override
    public List<Placa> reportePlacas(Date desde, Date hasta, String nombre) {
        EntityManager em = conexion.abrir();
        em.getTransaction().begin();
        TypedQuery<Placa> query;

        try {
            String sentencia = "SELECT p FROM Placa p WHERE 1 = 1"; 

            if (desde != null && hasta != null) {
                sentencia += " AND p.fechaExpedicion BETWEEN :desde AND :hasta";
            }

            if (nombre != null && !nombre.isEmpty()) {
                sentencia += " AND p.persona.nombre LIKE :nombre";
            }

            query = em.createQuery(sentencia, Placa.class);

            if (desde != null && hasta != null) {
                query.setParameter("desde", desde, TemporalType.DATE);
                query.setParameter("hasta", hasta, TemporalType.DATE);
            }

            if (nombre != null && !nombre.isEmpty()) {
                query.setParameter("nombre", "%" + nombre + "%");
            }

            return query.getResultList();
        } finally {
            em.close();
        }
    }
    
}
