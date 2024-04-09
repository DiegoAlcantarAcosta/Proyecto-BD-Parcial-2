/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package moduloLicencias;

import persistencia.Licencia;

/**
 *
 * @author Héctor Francisco Báez Luque
 * @author Diego Alcantar Acosta
 */
public interface ITramitarLicenciaBO {
    /**
     * Registra una nueva licencia para el RFC dado con la vigencia y costo especificados.
     * 
     * @param rfc El RFC de la persona para la cual se está registrando la licencia.
     * @param vigencia La vigencia de la licencia en meses.
     * @param costo El costo de la licencia.
     * @return La licencia registrada.
     */
    public Licencia registrar(String rfc, int vigencia, float costo);
    
    /**
     * Verifica si hay una licencia activa para el RFC dado.
     * 
     * @param rfc El RFC de la persona para la cual se quiere verificar la activación de la licencia.
     * @return true si hay una licencia activa para el RFC dado, false en caso contrario.
     */
    public boolean isLicenciaActiva(String rfc);
    
}
