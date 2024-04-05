/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import tramite.EstadoTramite;

/**
 *
 * @author Héctor Francisco Báez Luque
 * @author Diego Alcantar Acosta
 */
@Entity
@Table(name = "Placas")
@DiscriminatorValue("Placa")
public class Placa extends Tramite implements Serializable {

    @Column(name = "fecha_recepcion")
    @Temporal(TemporalType.DATE)
    private Calendar fechaRecepcion;
    
    @Column(name="numero_alfanumerico", length=7, nullable=false)
    private String numeroAlfanumerico;
    
    @ManyToOne
    @JoinColumn(name="vehiculo_id", nullable=false)
    private Vehiculo vehiculo;

    public Placa(Calendar fechaRecepcion, String numeroAlfanumerico, Vehiculo vehiculo) {
        this.fechaRecepcion = fechaRecepcion;
        this.numeroAlfanumerico = numeroAlfanumerico;
        this.vehiculo = vehiculo;
    }

    public Placa(String numeroAlfanumerico, Vehiculo vehiculo, float costo, EstadoTramite estado, Calendar fechaExpedicion, Persona persona) {
        super(costo, estado, fechaExpedicion, persona);
        this.numeroAlfanumerico = numeroAlfanumerico;
        this.vehiculo = vehiculo;
    }

    public Placa() {
    }

    public Calendar getFechaRecepcion() {
        return fechaRecepcion;
    }

    public void setFechaRecepcion(Calendar fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    public String getNumeroAlfanumerico() {
        return numeroAlfanumerico;
    }

    public void setNumeroAlfanumerico(String numeroAlfanumerico) {
        this.numeroAlfanumerico = numeroAlfanumerico;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Placa{" + "fechaRecepcion=" + fechaRecepcion + ", numeroAlfanumerico=" + numeroAlfanumerico + ", vehiculo=" + vehiculo + '}';
    }
    
}
