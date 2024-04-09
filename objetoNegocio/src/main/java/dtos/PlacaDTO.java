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

    /**
     * Constructor vacío de la clase PlacaDTO.
     */
    public PlacaDTO() {
    }

    /**
     * Constructor de la clase PlacaDTO que inicializa todos los atributos.
     * 
     * @param numeroAlfanumerico El número alfanumérico de la placa.
     * @param vehiculo El vehículo asociado a la placa.
     * @param fechaRecepcion La fecha en que se recibió la placa.
     */
    public PlacaDTO(String numeroAlfanumerico, Vehiculo vehiculo, Calendar fechaRecepcion) {
        this.numeroAlfanumerico = numeroAlfanumerico;
        this.vehiculo = vehiculo;
        this.fechaRecepcion = fechaRecepcion;
    }

    /**
     * Constructor de la clase PlacaDTO que inicializa todos los atributos, incluyendo los heredados de TramiteDTO.
     * 
     * @param numeroAlfanumerico El número alfanumérico de la placa.
     * @param vehiculo El vehículo asociado a la placa.
     * @param fechaRecepcion La fecha en que se recibió la placa.
     * @param fechaExpedicion La fecha de expedición del trámite.
     * @param costo El costo del trámite.
     * @param estado El estado del trámite.
     */
    public PlacaDTO(String numeroAlfanumerico, Vehiculo vehiculo, Calendar fechaRecepcion, Calendar fechaExpedicion, Float costo, EstadoTramite estado) {
        super(fechaExpedicion, costo, estado);
        this.numeroAlfanumerico = numeroAlfanumerico;
        this.vehiculo = vehiculo;
        this.fechaRecepcion = fechaRecepcion;
    }

    /**
     * Método para obtener el número alfanumérico de la placa.
     * 
     * @return El número alfanumérico de la placa.
     */
    public String getNumeroAlfanumerico() {
        return numeroAlfanumerico;
    }

    /**
     * Método para establecer el número alfanumérico de la placa.
     * 
     * @param numeroAlfanumerico El número alfanumérico de la placa.
     */
    public void setNumeroAlfanumerico(String numeroAlfanumerico) {
        this.numeroAlfanumerico = numeroAlfanumerico;
    }

    /**
     * Método para obtener el vehículo asociado a la placa.
     * 
     * @return El vehículo asociado a la placa.
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    /**
     * Método para establecer el vehículo asociado a la placa.
     * 
     * @param vehiculo El vehículo asociado a la placa.
     */
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    /**
     * Método para obtener la fecha de recepción de la placa.
     * 
     * @return La fecha de recepción de la placa.
     */
    public Calendar getFechaRecepcion() {
        return fechaRecepcion;
    }

    /**
     * Método para establecer la fecha de recepción de la placa.
     * 
     * @param fechaRecepcion La fecha de recepción de la placa.
     */
    public void setFechaRecepcion(Calendar fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    /**
     * Retorna una representación en cadena del objeto PlacaDTO.
     * 
     * @return Una cadena que representa el objeto PlacaDTO.
     */
    @Override
    public String toString() {
        return "PlacaDTO{" + "numeroAlfanumerico=" + numeroAlfanumerico + ", vehiculo=" + vehiculo + ", fechaRecepcion=" + fechaRecepcion + '}';
    }
}
