/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import conexionEM.Conexion;
import conexionEM.IConexion;
import interfaces.daos.IPlacaDAO;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TemporalType;
import javax.persistence.TypedQuery;
import persistencia.Licencia;
import persistencia.Persona;
import persistencia.Placa;
import persistencia.Vehiculo;

/**
 *
 * @author Héctor Francisco Báez Luque
 * @author Diego Alcantar Acosta
 */
public class PlacaDAO implements IPlacaDAO {

    private IConexion conexion;

    public PlacaDAO() {
        conexion = new Conexion();
    }

    @Override
    public Placa registrarPlaca(Vehiculo vehiculo, float costo, String claveNumerica, Persona persona) {
        try {
            EntityManager em = conexion.abrir();
            em.getTransaction().begin();
            Calendar fechaActual = Calendar.getInstance();

            PersonaDAO buscaPersona = new PersonaDAO();
            Persona personaTramite = buscaPersona.consultarPersona(persona.getRfc());

            Placa placa = new Placa(claveNumerica, vehiculo, costo, "ACTIVA", fechaActual, personaTramite);
            em.persist(placa);
            em.getTransaction().commit();

            Placa placaDTO = new Placa();
            placaDTO.setNumeroAlfanumerico(claveNumerica);
            placaDTO.setEstado(placa.getEstado());
            placaDTO.setFechaExpedicion(placa.getFechaExpedicion());
            placaDTO.setVehiculo(placa.getVehiculo());
            placaDTO.setCosto(placa.getCosto());
            em.close();
            return placaDTO;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public Placa getPlacaActiva(Vehiculo vehiculo) {
        EntityManager em = conexion.abrir();
        try {
            String sentencia = "SELECT p FROM Placa p WHERE p.vehiculo = :vehiculo AND p.estado = :estado";
            TypedQuery<Placa> query = em.createQuery(sentencia, Placa.class);
            query.setParameter("vehiculo", vehiculo);
            query.setParameter("estado", "ACTIVA");
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
                placa.setEstado("VENCIDA");
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

    public String numAlfaNiumerico() {
        Random random = new Random();
        StringBuilder codigo = new StringBuilder();

        // Generar tres letras aleatorias
        for (int i = 0; i < 3; i++) {
            char letra = (char) (random.nextInt(26) + 'A');
            codigo.append(letra);
        }

        // Añadir un guión
        codigo.append("-");

        // Generar tres dígitos aleatorios
        for (int i = 0; i < 3; i++) {
            int digito = random.nextInt(10);
            codigo.append(digito);
        }

        return codigo.toString();
    }

    @Override
    public List<Placa> getPlacasPorNombre(String nombre) {
        EntityManager em = conexion.abrir();
        em.getTransaction().begin();

        try {
            String sentencia = "SELECT p "
                    + "FROM Placas p "
                    + "JOIN p.persona pers "
                    + "WHERE pers.nombre = :nombrePersona";
            TypedQuery<Placa> query = em.createQuery(sentencia, Placa.class);
            query.setParameter("nombre", nombre);
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    @Override
    public List<Placa> getPlacasPorFecha(Date fecha) {
        EntityManager em = conexion.abrir();
        em.getTransaction().begin();
        try {
            String sentencia = "SELECT p "
                    + "FROM Placas p "
                    + "JOIN p.tramite t "
                    + "WHERE t.fechaExpedicion = :fechaExpedicion";
            TypedQuery<Placa> query = em.createQuery(sentencia, Placa.class);
            query.setParameter("fechaExpedicion", fecha);
            return query.getResultList();
        } finally {
            em.close();
        }
    }
}
