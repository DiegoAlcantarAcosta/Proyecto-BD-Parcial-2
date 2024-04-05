/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dtos;

import java.util.Calendar;
import persistencia.Vehiculo;
import tramite.EstadoTramite;

/**
 *
 * @author Héctor Francisco Báez Luque
 * @author Diego Alcantar Acosta
 */
public class PlacaDTO extends TramiteDTO{
    
    private String numeroAlfanumerico;
    private Vehiculo vehiculo;
    private Calendar fechaRecepcion;

    public PlacaDTO() {
    }

    public PlacaDTO(String numeroAlfanumerico, Vehiculo vehiculo, Calendar fechaRecepcion) {
        this.numeroAlfanumerico = numeroAlfanumerico;
        this.vehiculo = vehiculo;
        this.fechaRecepcion = fechaRecepcion;
    }

    public PlacaDTO(String numeroAlfanumerico, Vehiculo vehiculo, Calendar fechaRecepcion, Calendar fechaExpedicion, Float costo, EstadoTramite estado) {
        super(fechaExpedicion, costo, estado);
        this.numeroAlfanumerico = numeroAlfanumerico;
        this.vehiculo = vehiculo;
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

    public Calendar getFechaRecepcion() {
        return fechaRecepcion;
    }

    public void setFechaRecepcion(Calendar fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    @Override
    public String toString() {
        return "PlacaDTO{" + "numeroAlfanumerico=" + numeroAlfanumerico + ", vehiculo=" + vehiculo + ", fechaRecepcion=" + fechaRecepcion + '}';
    }
}
