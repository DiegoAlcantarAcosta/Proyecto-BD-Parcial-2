/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import conexionEM.Conexion;
import conexionEM.IConexion;
import dtos.PersonaDTO;
import interfaces.daos.IPersonaDAO;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import persistencia.Persona;

/**
 *
 * @author Héctor Francisco Báez Luque
 * @author Diego Alcantar Acosta
 */
public class PersonaDAO implements IPersonaDAO{

    private final IConexion conexion;

    public PersonaDAO() {
        conexion = new Conexion();
    }
    
    @Override
    public void registrar(PersonaDTO persona) {
        
        EntityManager em = conexion.abrir();
        em.getTransaction().begin();

        try {
            Persona personaRegistrar = new Persona(persona.getRfc(), 
                    persona.getNombre(), persona.getApellidoPaterno(), persona.getApellidoMaterno(), 
                    persona.getTelefono(), persona.getFechaNacimiento(), persona.isDiscapacidad());
            em.persist(personaRegistrar);
            em.getTransaction().commit();
            
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
            throw e;
        } finally {
            em.close();
        }
        
    }

    @Override
    public boolean personaRegistrada(String rfc) {
        EntityManager em = conexion.abrir();
        em.getTransaction().begin();

        try {
            String sentencia = "SELECT COUNT(p) FROM Persona p WHERE p.rfc = :rfc";
            TypedQuery<Long> query = em.createQuery(sentencia, Long.class);
            query.setParameter("rfc", rfc);
            Long count = query.getSingleResult();

            em.getTransaction().commit();

            return count > 0;
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
            throw e;
        } finally {
            em.close();
        }
    }

    @Override
    public PersonaDTO getPersona(String rfc) {
        EntityManager em = conexion.abrir();
        em.getTransaction().begin();

        try {
            String sentencia = "SELECT p FROM Persona p WHERE p.rfc = :rfc";
            TypedQuery<Persona> query = em.createQuery(sentencia, Persona.class);
            query.setParameter("rfc", rfc);
            Persona personaBuscada = query.getSingleResult();
            em.getTransaction().commit();

            PersonaDTO personaDTO = new PersonaDTO();
            personaDTO.setRfc(personaBuscada.getRfc());
            personaDTO.setNombre(personaBuscada.getNombre());
            personaDTO.setApellidoPaterno(personaBuscada.getApellidoPaterno());
            personaDTO.setApellidoMaterno(personaBuscada.getApellidoMaterno());
            personaDTO.setTelefono(personaBuscada.getTelefono());
            personaDTO.setFechaNacimiento(personaBuscada.getFechaNacimiento());
            personaDTO.setDiscapacidad(personaBuscada.isDiscapacidad());

            return personaDTO;
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
            throw e;
        } finally {
            em.close();
        }
    }

    @Override
    public Persona consultarPersona(String rfc) {
        EntityManager em = conexion.abrir();
        em.getTransaction().begin();

        try {

            String sentencia = "SELECT p FROM Persona p WHERE p.rfc = :rfc";
            TypedQuery<Persona> query = em.createQuery(sentencia, Persona.class);
            query.setParameter("rfc", rfc);
            
            return query.getSingleResult();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
            throw e;
        } finally {
            em.close();
        }
    }

    @Override
    public boolean esMayorDeEdad(String rfc) {
        Persona persona = consultarPersona(rfc);
        if (persona != null) {
            Calendar fechaNacimientoCalendar = persona.getFechaNacimiento();
            
            LocalDate fechaNacimiento = LocalDate.of(
                    fechaNacimientoCalendar.get(Calendar.YEAR),
                    fechaNacimientoCalendar.get(Calendar.MONTH) + 1, 
                    fechaNacimientoCalendar.get(Calendar.DAY_OF_MONTH)
            );
            LocalDate fechaActual = LocalDate.now();
            Period periodo = Period.between(fechaNacimiento, fechaActual);
            int edad = periodo.getYears();
            return edad >= 18;
        } else {
            return false;
        }
    }

    @Override
    public List<Persona> buscarPersonaPorNombreSimilar(String nombre) {
        EntityManager em = conexion.abrir();
        em.getTransaction().begin();
        try {
            String sentencia = "SELECT p FROM Persona p WHERE p.nombre LIKE :nombre";
            TypedQuery<Persona> query = em.createQuery(sentencia, Persona.class);
            query.setParameter("nombre", "%" + nombre + "%");
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    @Override
    public List<Persona> buscarPersonaPorFechaNacimiento(Date fechaNacimiento) {
        EntityManager em = conexion.abrir();
        em.getTransaction().begin();
        try {
            String sentencia = "SELECT p FROM Persona p WHERE p.fechaNacimiento = :fechaNacimiento";
            TypedQuery<Persona> query = em.createQuery(sentencia, Persona.class);
            query.setParameter("fechaNacimiento", fechaNacimiento);
            return query.getResultList();
        } finally {
            em.close();
        }
    }
}
