/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import conexionEM.Conexion;
import conexionEM.IConexion;
import interfaces.daos.IAutomovilDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import persistencia.Automovil;
import persistencia.Persona;

/**
 *
 * @author Héctor Francisco Báez Luque
 * @author Diego Alcantar Acosta
 */
public class AutomovilDAO implements IAutomovilDAO {

    private final IConexion conexion;

    /**
     * Vacio
     */
    public AutomovilDAO() {
        conexion = new Conexion();
    }

    /**
     * registra
     * @param numSerie numero de serie
     * @param marca marca
     * @param linea liena
     * @param color color
     * @param modelo modelo
     * @param persona dueño
     * @return Automovil
     */
    @Override
    public Automovil registrar(String numSerie, String marca, String linea, String color, int modelo, Persona persona) {
        EntityManager entityManager = conexion.abrir();
        entityManager.getTransaction().begin();

        try {
            Automovil automovil = new Automovil(numSerie, marca, linea, color, modelo, persona);
            entityManager.persist(automovil);

            entityManager.getTransaction().commit();

            Automovil automovilDTO = new Automovil(automovil.getNumSerie(), automovil.getMarca(), automovil.getLinea(), automovil.getColor(), automovil.getModelo());
            return automovilDTO;
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            e.printStackTrace();
            throw e;
        } finally {
            entityManager.close();
        }
    }

    /**
     * Verifica si existe
     * @param numSerie numero de serie
     * @return true o false
     */
    @Override
    public boolean existeAutomovil(String numSerie) {
        EntityManager entityManager = conexion.abrir();
        entityManager.getTransaction().begin();

        try {
            String sentencia = "SELECT COUNT(a) FROM Automovil a WHERE a.numSerie = :numSerie";
            TypedQuery<Long> query = entityManager.createQuery(sentencia, Long.class);
            query.setParameter("numSerie", numSerie);
            Long count = query.getSingleResult();

            entityManager.getTransaction().commit();

            return count > 0;
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            throw e;
        } finally {
            entityManager.close();
        }
    }

    /**
     * devuelve unc carro
     * @param numSerie numero serie
     * @param rfc rfc
     * @return carro
     */
    @Override
    public Automovil obtener(String numSerie, String rfc) {
        EntityManager entityManager = conexion.abrir();
        entityManager.getTransaction().begin();

        try {
            String sentencia = "SELECT a FROM Automovil a WHERE a.numSerie = :numSerie AND a.persona.rfc = :rfc";
            TypedQuery<Automovil> query = entityManager.createQuery(sentencia, Automovil.class);
            query.setParameter("numSerie", numSerie);
            query.setParameter("rfc", rfc);
            Automovil automovilBuscado = query.getSingleResult();
            entityManager.getTransaction().commit();
            Automovil automovilDTO = new Automovil();

            automovilDTO.setNumSerie(automovilBuscado.getNumSerie());
            automovilDTO.setMarca(automovilBuscado.getMarca());
            automovilDTO.setModelo(automovilBuscado.getModelo());
            automovilDTO.setColor(automovilBuscado.getColor());
            automovilDTO.setLinea(automovilBuscado.getLinea());
            
            entityManager.close();
            
            return automovilDTO;
        } catch (Exception e) {
            throw e;
        }
    }

    /**
     * devuelve carro por numSerie
     * @param numSerie numserie
     * @return carro
     */
    @Override
    public Automovil obtenerPorNumeroSerie(String numSerie) {
        EntityManager entityManager = conexion.abrir();
        entityManager.getTransaction().begin();
        try {

            String sentencia = "SELECT a FROM Automovil a WHERE a.numSerie = :numSerie";
            TypedQuery<Automovil> query = entityManager.createQuery(sentencia, Automovil.class);
            query.setParameter("numSerie", numSerie);
            Automovil automovil = query.getSingleResult();

            entityManager.getTransaction().commit();
            return automovil;
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
        return null;
    }

    /**
     * devuelve carro por placas
     * @param claveNumerica placas
     * @param rfc rfc
     * @return carro
     */
    @Override
    public Automovil obtenerPorPlacas(String claveNumerica, String rfc) {
        EntityManager em = conexion.abrir();
        em.getTransaction().begin();

        try {
            String sentencia = "SELECT a FROM Automovil a INNER JOIN a.placas p WHERE p.numeroAlfanumerico = :numeroAlfanumerico AND a.persona.rfc = :rfc";
            TypedQuery<Automovil> query = em.createQuery(sentencia, Automovil.class);
            query.setParameter("numeroAlfanumerico", claveNumerica);
            query.setParameter("rfc", rfc);
            List<Automovil> resultados = query.getResultList();
            if (!resultados.isEmpty()) {
                Automovil automovil = resultados.get(0);
                Automovil encontrado = new Automovil();
                encontrado.setNumSerie(automovil.getNumSerie());
                encontrado.setMarca(automovil.getMarca());
                encontrado.setModelo(automovil.getModelo());
                encontrado.setLinea(automovil.getLinea());
                encontrado.setColor(automovil.getColor());
                return encontrado;
            }
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
        return null;
    }

}
