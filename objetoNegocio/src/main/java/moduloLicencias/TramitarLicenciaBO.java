/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moduloLicencias;

import daos.LicenciaDAO;
import persistencia.Licencia;

/**
 *
 * @author Héctor Francisco Báez Luque
 * @author Diego Alcantar Acosta
 */
public class TramitarLicenciaBO implements ITramitarLicenciaBO{

    /**
     * Registra una nueva licencia para el RFC dado con la vigencia y costo especificados.
     * 
     * @param rfc El RFC de la persona para la cual se está registrando la licencia.
     * @param vigencia La vigencia de la licencia en meses.
     * @param costo El costo de la licencia.
     * @return La licencia registrada.
     */
    @Override
    public Licencia registrar(String rfc, int vigencia, float costo) {
        LicenciaDAO licencia = new LicenciaDAO();
        return licencia.registrar(rfc, vigencia, costo);
    }

    /**
     * Verifica si hay una licencia activa para el RFC dado.
     * 
     * @param rfc El RFC de la persona para la cual se quiere verificar la activación de la licencia.
     * @return true si hay una licencia activa para el RFC dado, false en caso contrario.
     */
    @Override
    public boolean isLicenciaActiva(String rfc) {
        LicenciaDAO licencia = new LicenciaDAO();
        return licencia.isLicenciaActiva(rfc);
    }
}
