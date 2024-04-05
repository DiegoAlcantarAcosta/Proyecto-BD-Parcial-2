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
    public Licencia registrar(String rfc, int vigencia, float costo);
    public boolean isLicenciaActiva(String rfc);
    
}
