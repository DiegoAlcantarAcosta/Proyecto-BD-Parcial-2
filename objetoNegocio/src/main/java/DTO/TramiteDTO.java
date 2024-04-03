/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Calendar;
import persistence.Automovil;

/**
 *
 * @author Diego
 */
public class TramiteDTO {
    private Calendar fechaRecepcion;
    private String numeroAlfanumerico;
    private Automovil automovil;

    public TramiteDTO(Calendar fechaRecepcion, String numeroAlfanumerico, Automovil automovil) {
        this.fechaRecepcion = fechaRecepcion;
        this.numeroAlfanumerico = numeroAlfanumerico;
        this.automovil = automovil;
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

    public Automovil getAutomovil() {
        return automovil;
    }

    public void setAutomovil(Automovil automovil) {
        this.automovil = automovil;
    }

    @Override
    public String toString() {
        return "TramiteDTO{" + "fechaRecepcion=" + fechaRecepcion + ", numeroAlfanumerico=" + numeroAlfanumerico + ", automovil=" + automovil + '}';
    }
}
