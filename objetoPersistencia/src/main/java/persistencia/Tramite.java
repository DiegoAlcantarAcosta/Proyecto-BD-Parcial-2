/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *@author Héctor Francisco Báez Luque
 * @author Diego
 */

/**
 * Clase que representa un trámite.
 */
@Entity
@Table(name="Tramites")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "tipo_tramite", discriminatorType = DiscriminatorType.STRING)
public class Tramite implements Serializable {

    /**
     * Identificador único del trámite.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Costo del trámite.
     */
    @Column(name="costo", nullable=false)
    private float costo;
    
    /**
     * Estado del trámite.
     */
    @Column(name="estado", nullable=false)
    private String estado;
    
    /**
     * Fecha de expedición del trámite.
     */
    @Column(name = "fecha_expedicion")
    @Temporal(TemporalType.DATE)
    private Calendar fechaExpedicion;
    
    /**
     * Persona asociada al trámite.
     */
    @ManyToOne
    @JoinColumn(name="persona_id", nullable=false)
    private Persona persona;

    /**
     * Constructor por defecto de la clase Tramite.
     */
    public Tramite() {
    }

    /**
     * Constructor de la clase Tramite.
     *
     * @param costo           Costo del trámite.
     * @param estado          Estado del trámite.
     * @param fechaExpedicion Fecha de expedición del trámite.
     * @param persona         Persona asociada al trámite.
     */
    public Tramite(float costo, String estado, Calendar fechaExpedicion, Persona persona) {
        this.costo = costo;
        this.estado = estado;
        this.fechaExpedicion = fechaExpedicion;
        this.persona = persona;
    }

    // Getters y setters

    // toString

    /**
     * Obtiene el estado del trámite.
     *
     * @return Estado del trámite.
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Establece el estado del trámite.
     *
     * @param estado Estado del trámite.
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    /**
     * Obtiene el identificador único del trámite.
     *
     * @return Identificador único del trámite.
     */
    public Long getId() {
        return id;
    }

    /**
     * Establece el identificador único del trámite.
     *
     * @param id Identificador único del trámite.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Obtiene el costo del trámite.
     *
     * @return Costo del trámite.
     */
    public float getCosto() {
        return costo;
    }

    /**
     * Establece el costo del trámite.
     *
     * @param costo Costo del trámite.
     */
    public void setCosto(float costo) {
        this.costo = costo;
    }

    /**
     * Obtiene la fecha de expedición del trámite.
     *
     * @return Fecha de expedición del trámite.
     */
    public Calendar getFechaExpedicion() {
        return fechaExpedicion;
    }

    /**
     * Establece la fecha de expedición del trámite.
     *
     * @param fechaExpedicion Fecha de expedición del trámite.
     */
    public void setFechaExpedicion(Calendar fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    /**
     * Obtiene la persona asociada al trámite.
     *
     * @return Persona asociada al trámite.
     */
    public Persona getPersona() {
        return persona;
    }

    /**
     * Establece la persona asociada al trámite.
     *
     * @param persona Persona asociada al trámite.
     */
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    /**
     * Retorna una representación en forma de cadena del trámite.
     *
     * @return Cadena que representa el trámite.
     */
    @Override
    public String toString() {
        return "Tramite{" +
                "id=" + id +
                ", costo=" + costo +
                ", estado='" + estado + '\'' +
                ", fechaExpedicion=" + fechaExpedicion +
                ", persona=" + persona +
                '}';
    }
    
    /**
     * Obtiene el valor del discriminador para el tipo de trámite.
     *
     * @return Valor del discriminador para el tipo de trámite.
     */
    @Transient
    public String getDecriminatorValue() {
        return this.getClass().getAnnotation(DiscriminatorValue.class).value();
    }
}
