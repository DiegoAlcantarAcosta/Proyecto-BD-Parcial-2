/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import conexionEM.Conexion;
import conexionEM.IConexion;
import interfaces.daos.ILicenciaDAO;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TemporalType;
import javax.persistence.TypedQuery;
import persistencia.Licencia;
import persistencia.Persona;
import persistencia.Tramite;

/**
 *
 * @author Héctor Francisco Báez Luque
 * @author Diego Alcantar Acosta
 */
public class LicenciaDAO implements ILicenciaDAO {

    private final IConexion conexion;

    /**
     * Constructor predeterminado que inicializa la conexión con la base de datos utilizando la implementación predeterminada de {@link IConexion}.
     */
    public LicenciaDAO() {
        conexion = new Conexion();
    }

    @Override
    public Licencia registrar(String rfc, int vigencia, float costo) {
        EntityManager em = conexion.abrir();
        em.getTransaction().begin();

        try {

            Calendar fechaActual = Calendar.getInstance();

            Calendar fechaVigencia = Calendar.getInstance();
            fechaVigencia.setTimeInMillis(fechaActual.getTimeInMillis());
            fechaVigencia.add(Calendar.YEAR, vigencia);

            PersonaDAO personaObtenida = new PersonaDAO();
            Persona persona = personaObtenida.consultarPersona(rfc);

            Licencia licencia = new Licencia(fechaVigencia, costo, "ACTIVA", fechaActual, persona);
            em.persist(licencia);
            em.getTransaction().commit();

            Licencia licenciaDTO = new Licencia();
            licenciaDTO.setFechaExpedicion(licencia.getFechaExpedicion());
            licenciaDTO.setVigencia(licencia.getVigencia());
            licenciaDTO.setCosto(licencia.getCosto());
            licenciaDTO.setEstado(licencia.getEstado());

            return licenciaDTO;

        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    @Override
    public boolean consultarLicencia(Persona persona) {

        List<Tramite> tramites = persona.getTramites();

        for (Tramite tramite : tramites) {
            if (tramite instanceof Licencia) {
                Licencia licencia = (Licencia) tramite;
                String estado = licencia.estadoLicencia();
                if (estado.equalsIgnoreCase("ACTIVA")) {
                    return true;
                }
            }
        }
        return false;

    }

    @Override
    public boolean isLicenciaActiva(String rfc) {
        EntityManager em = conexion.abrir();
        em.getTransaction().begin();

        try {
            String sentencia = "SELECT l FROM Licencia l WHERE l.persona.rfc = :rfc "
                    + "AND l.estado = :estado AND l.vigencia >= :fechaActual";
            TypedQuery<Licencia> query = em.createQuery(sentencia, Licencia.class);
            query.setParameter("rfc", rfc);
            query.setParameter("estado", "ACTIVA");
            query.setParameter("fechaActual", Calendar.getInstance(), TemporalType.DATE);

            Licencia licencia = null;
            try {
                licencia = query.getSingleResult();
            } catch (NoResultException e) {
                // No se encontraron resultados, por lo que la licencia no está activa
            }

            em.getTransaction().commit();
            return licencia != null;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            em.close();
        }
    }

    @Override
    public List<Licencia> getLicenciasPorRFC(String rfc) {
        EntityManager em = conexion.abrir();
        em.getTransaction().begin();
        try {
            String sentencia = "SELECT l FROM Licencia l WHERE l.persona.rfc = :rfc";
            TypedQuery<Licencia> query = em.createQuery(sentencia, Licencia.class);
            query.setParameter("rfc", rfc);
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    @Override
    public List<Licencia> reporteLicencias(Date desde, Date hasta, String nombre) {
        EntityManager em = conexion.abrir();
        em.getTransaction().begin();
        TypedQuery<Licencia> query;

        try {
            String sentencia = "SELECT l FROM Licencia l WHERE 1 = 1";

            if (desde != null && hasta != null) {
                sentencia += " AND l.fechaExpedicion BETWEEN :desde AND :hasta";
            }

            if (nombre != null && !nombre.isEmpty()) {
                sentencia += " AND l.persona.nombre LIKE :nombre";
            }

            query = em.createQuery(sentencia, Licencia.class);

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

    @Override
    public List<Licencia> getLicenciasPorNombre(String nombre) {
        EntityManager em = conexion.abrir();
        em.getTransaction().begin();
        try {
            String sentencia = "SELECT l FROM Licencia l "
                    + "JOIN l.persona p "
                    + "WHERE p.nombre = :nombre";
            TypedQuery<Licencia> query = em.createQuery(sentencia, Licencia.class);
            query.setParameter("nombre", nombre);
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    @Override
    public List<Licencia> getLicenciasPorFecha(Date fecha) {
        EntityManager em = conexion.abrir();
        em.getTransaction().begin();
        try {
            String sentencia = "SELECT l "
                    + "FROM Licencia l "
                    + "JOIN l.persona t "
                    + "WHERE t.fechaNacimiento = :fechaNacimiento";
            TypedQuery<Licencia> query = em.createQuery(sentencia, Licencia.class);
            query.setParameter("fechaNacimiento", fecha);
            return query.getResultList();
        } finally {
            em.close();
        }
    }

}
