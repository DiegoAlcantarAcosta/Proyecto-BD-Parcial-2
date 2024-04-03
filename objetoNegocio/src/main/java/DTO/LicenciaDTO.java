/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Calendar;

/**
 *
 * @author Diego
 */
public class LicenciaDTO {
    private Calendar vigencia;

    public LicenciaDTO(Calendar vigencia) {
        this.vigencia = vigencia;
    }

    public Calendar getVigencia() {
        return vigencia;
    }

    public void setVigencia(Calendar vigencia) {
        this.vigencia = vigencia;
    }

    @Override
    public String toString() {
        return "LicenciaDTO{" + "vigencia=" + vigencia + '}';
    }
    
    
}
