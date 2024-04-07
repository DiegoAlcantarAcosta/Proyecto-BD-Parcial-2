/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces.daos;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import persistencia.Licencia;
import persistencia.Persona;

/**
 *
 * @author Héctor Francisco Báez Luque
 * @author Diego Alcantar Acosta
 */
public interface ILicenciaDAO {
    
    public boolean consultarLicencia(Persona persona);
    public Licencia registrar(String rfc, int vigencia, float costo);
    public boolean isLicenciaActiva(String rfc);
    public List<Licencia> getLicenciasPorRFC(String rfc);
    public List<Licencia> reporteLicencias(Date desde, Date hasta, String nombre);
    public List<Licencia> getLicenciasPorNombre(String nombre);
    public List<Licencia> getLicenciasPorFecha(Date fecha);
}
