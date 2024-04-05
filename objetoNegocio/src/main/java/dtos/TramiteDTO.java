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
    
    public TramiteDTO() {
    }

    public TramiteDTO(Calendar fechaExpedicion, Float costo, EstadoTramite estado) {
        this.costo = costo;
        this.estado = estado;
    }

    public Calendar getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(Calendar fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    public Float getCosto() {
        return costo;
    }

    public void setCosto(Float costo) {
        this.costo = costo;
    }

    public EstadoTramite getEstado() {
        return estado;
    }

    public void setEstado(EstadoTramite estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString() {
        return "TramiteDTO{" + "fechaExpedicion=" + fechaExpedicion + ", numeroAlfanumerico=" + '}';
    }
}
