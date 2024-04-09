/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package moduloReportes;

import dtos.LicenciaDTO;
import dtos.PlacaDTO;
import dtos.TramiteDTO;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Héctor Francisco Báez Luque
 * @author Diego Alcantar Acosta
 */
public interface IDesplegarReporteBO {
    
    void generarReportePlacas(List<PlacaDTO> placas);
    void generarReporteLicencias(List<LicenciaDTO> licencias);
    void generarReporteTramites(List<TramiteDTO> tramites);

    List<TramiteDTO> buscarTramites(Date fechaInicio, Date fechaFin, String nombre);
    List<LicenciaDTO> buscarLicencias(Date fechaInicio, Date fechaFin, String nombre);
    List<PlacaDTO> buscarPlacas(Date fechaInicio, Date fechaFin, String nombre);
    
}
