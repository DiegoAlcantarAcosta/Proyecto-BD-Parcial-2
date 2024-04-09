/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dtos;

import java.util.Calendar;

/**
 *
 * @author Héctor Francisco Báez Luque
 * @author Diego Alcantar Acosta
 */
public class LicenciaDTO extends TramiteDTO{
    
    private Calendar vigencia;

    /**
     * Constructor vacío de la clase LicenciaDTO.
     */
    public LicenciaDTO() {
    }
    
    /**
     * Constructor de la clase LicenciaDTO que inicializa el atributo vigencia.
     * 
     * @param vigencia La fecha de vigencia de la licencia.
     */
    public LicenciaDTO(Calendar vigencia) {
        this.vigencia = vigencia;
    }

    /**
     * Método para obtener la vigencia de la licencia.
     * 
     * @return La fecha de vigencia de la licencia.
     */
    public Calendar getVigencia() {
        return vigencia;
    }

    /**
     * Método para establecer la vigencia de la licencia.
     * 
     * @param vigencia La fecha de vigencia de la licencia.
     */
    public void setVigencia(Calendar vigencia) {
        this.vigencia = vigencia;
    }

    /**
     * Retorna una representación en cadena del objeto LicenciaDTO.
     * 
     * @return Una cadena que representa el objeto LicenciaDTO.
     */
    @Override
    public String toString() {
        return "LicenciaDTO{" + "vigencia=" + vigencia + '}';
    }
    
    
}
