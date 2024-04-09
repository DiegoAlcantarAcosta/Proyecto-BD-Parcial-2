/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import conexionEM.Conexion;
import conexionEM.IConexion;
import interfaces.daos.ITramiteDAO;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TemporalType;
import javax.persistence.TypedQuery;
import persistencia.Tramite;

/**
 *
 * @author Héctor Francisco Báez Luque
 * @author Diego Alcantar Acosta
 */
public class TramiteDAO implements ITramiteDAO {

    private IConexion conexion;

    /**
     * Constructor predeterminado que inicializa la conexión con la base de datos utilizando la implementación predeterminada de {@link IConexion}.
     */
    public TramiteDAO(IConexion conexion) {
        this.conexion = new Conexion();
    }

    @Override
    public List<Tramite> obtenerTramitesPorRFC(String rfc) {
        EntityManager em = conexion.abrir();
        em.getTransaction().begin();
        try {
            String sentencia = "SELECT t FROM Tramite t WHERE t.persona.rfc = :rfc";
            TypedQuery<Tramite> query = em.createQuery(sentencia, Tramite.class);
            query.setParameter("rfc", rfc);
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    @Override
    public List<Object[]> reporteTramites() {
        EntityManager em = conexion.abrir();
        em.getTransaction().begin();

        try {
            String sentencia = "SELECT t.fecha, t.tipoTramite, p.nombre, t.costo FROM Tramite t JOIN t.persona p";
            TypedQuery<Object[]> query = em.createQuery(sentencia, Object[].class);
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    @Override
    public List<Tramite> buscarTramites(Date desde, Date hasta, String nombre) {
        EntityManager em = conexion.abrir();
        em.getTransaction().begin();
        TypedQuery<Tramite> query;

        try {
            String sentencia = "SELECT t FROM Tramite t WHERE 1 = 1";

            if (desde != null && hasta != null) {
                sentencia += " AND t.fechaExpedicion BETWEEN :inicio AND :fin";
            }

            if (nombre != null && !nombre.isEmpty()) {
                sentencia += " AND t.persona.nombre LIKE :nombre";
            }

            query = em.createQuery(sentencia, Tramite.class);

            if (desde != null && hasta != null) {
                query.setParameter("inicio", desde, TemporalType.DATE);
                query.setParameter("fin", hasta, TemporalType.DATE);
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
