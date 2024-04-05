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

    @Override
    public Licencia registrar(String rfc, int vigencia, float costo) {
        LicenciaDAO licencia = new LicenciaDAO();
        return licencia.registrar(rfc, vigencia, costo);
    }

    @Override
    public boolean isLicenciaActiva(String rfc) {
        LicenciaDAO licencia = new LicenciaDAO();
        return licencia.isLicenciaActiva(rfc);
    }
}
