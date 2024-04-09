/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Héctor Francisco Báez Luque
 * @author Diego
 */

/**
 * Clase que representa una placa.
 */
@Entity
@Table(name = "Placas")
@DiscriminatorValue("Placa")
public class Placa extends Tramite implements Serializable {

    /**
     * Fecha de recepción de la placa.
     */
    @Column(name = "fecha_recepcion")
    @Temporal(TemporalType.DATE)
    private Calendar fechaRecepcion;

    /**
     * Número alfanumérico de la placa.
     */
    @Column(name = "numero_alfanumerico", length = 7, nullable = false)
    private String numeroAlfanumerico;

    /**
     * Vehículo asociado a la placa.
     */
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "vehiculo_id", nullable = false)
    private Vehiculo vehiculo;

    /**
     * Constructor de la clase Placa.
     *
     * @param fechaRecepcion       Fecha de recepción de la placa.
     * @param numeroAlfanumerico   Número alfanumérico de la placa.
     * @param vehiculo             Vehículo asociado a la placa.
     */
    public Placa(Calendar fechaRecepcion, String numeroAlfanumerico, Vehiculo vehiculo) {
        this.fechaRecepcion = fechaRecepcion;
        this.numeroAlfanumerico = numeroAlfanumerico;
        this.vehiculo = vehiculo;
    }

    /**
     * Constructor de la clase Placa con todos los parámetros.
     *
     * @param numeroAlfanumerico   Número alfanumérico de la placa.
     * @param vehiculo             Vehículo asociado a la placa.
     * @param costo                Costo del trámite.
     * @param estado               Estado del trámite.
     * @param fechaExpedicion      Fecha de expedición del trámite.
     * @param persona              Persona asociada al trámite.
     */
    public Placa(String numeroAlfanumerico, Vehiculo vehiculo, float costo, String estado, Calendar fechaExpedicion, Persona persona) {
        super(costo, estado, fechaExpedicion, persona);
        this.numeroAlfanumerico = numeroAlfanumerico;
        this.vehiculo = vehiculo;
    }

    /**
     * Constructor por defecto de la clase Placa.
     */
    public Placa() {
    }

    // Getters y setters

    /**
     * Obtiene la fecha de recepción de la placa.
     *
     * @return Fecha de recepción de la placa.
     */
    public Calendar getFechaRecepcion() {
        return fechaRecepcion;
    }

    /**
     * Establece la fecha de recepción de la placa.
     *
     * @param fechaRecepcion Fecha de recepción de la placa.
     */
    public void setFechaRecepcion(Calendar fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    /**
     * Obtiene el número alfanumérico de la placa.
     *
     * @return Número alfanumérico de la placa.
     */
    public String getNumeroAlfanumerico() {
        return numeroAlfanumerico;
    }

    /**
     * Establece el número alfanumérico de la placa.
     *
     * @param numeroAlfanumerico Número alfanumérico de la placa.
     */
    public void setNumeroAlfanumerico(String numeroAlfanumerico) {
        this.numeroAlfanumerico = numeroAlfanumerico;
    }

    /**
     * Obtiene el vehículo asociado a la placa.
     *
     * @return Vehículo asociado a la placa.
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    /**
     * Establece el vehículo asociado a la placa.
     *
     * @param vehiculo Vehículo asociado a la placa.
     */
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    /**
     * Retorna una representación en forma de cadena de la placa.
     *
     * @return Cadena que representa la placa.
     */
    @Override
    public String toString() {
        return "Placa{" +
                "fechaRecepcion=" + fechaRecepcion +
                ", numeroAlfanumerico='" + numeroAlfanumerico + '\'' +
                ", vehiculo=" + vehiculo +
                '}';
    }
}
