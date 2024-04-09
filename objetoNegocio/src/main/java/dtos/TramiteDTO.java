/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dtos;

import java.util.Calendar;
import tramite.EstadoTramite;

/**
 *
 * @author Héctor Francisco Báez Luque
 * @author Diego Alcantar Acosta
 */
public class TramiteDTO {
    
    private Calendar fechaExpedicion;
    private Float costo;
    private EstadoTramite estado;
    
    /**
     * Constructor vacío de la clase TramiteDTO.
     */
    public TramiteDTO() {
    }

    /**
     * Constructor de la clase TramiteDTO que inicializa todos los atributos.
     * 
     * @param fechaExpedicion La fecha de expedición del trámite.
     * @param costo El costo del trámite.
     * @param estado El estado del trámite.
     */
    public TramiteDTO(Calendar fechaExpedicion, Float costo, EstadoTramite estado) {
        this.fechaExpedicion = fechaExpedicion;
        this.costo = costo;
        this.estado = estado;
    }

    /**
     * Método para obtener la fecha de expedición del trámite.
     * 
     * @return La fecha de expedición del trámite.
     */
    public Calendar getFechaExpedicion() {
        return fechaExpedicion;
    }

    /**
     * Método para establecer la fecha de expedición del trámite.
     * 
     * @param fechaExpedicion La fecha de expedición del trámite.
     */
    public void setFechaExpedicion(Calendar fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    /**
     * Método para obtener el costo del trámite.
     * 
     * @return El costo del trámite.
     */
    public Float getCosto() {
        return costo;
    }

    /**
     * Método para establecer el costo del trámite.
     * 
     * @param costo El costo del trámite.
     */
    public void setCosto(Float costo) {
        this.costo = costo;
    }

    /**
     * Método para obtener el estado del trámite.
     * 
     * @return El estado del trámite.
     */
    public EstadoTramite getEstado() {
        return estado;
    }

    /**
     * Método para establecer el estado del trámite.
     * 
     * @param estado El estado del trámite.
     */
    public void setEstado(EstadoTramite estado) {
        this.estado = estado;
    }
    
    /**
     * Retorna una representación en cadena del objeto TramiteDTO.
     * 
     * @return Una cadena que representa el objeto TramiteDTO.
     */
    @Override
    public String toString() {
        return "TramiteDTO{" + "fechaExpedicion=" + fechaExpedicion + ", numeroAlfanumerico=" + '}';
    }
}
