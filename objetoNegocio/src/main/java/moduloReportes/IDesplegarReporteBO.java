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
    
    /**
     * Genera un reporte en formato PDF para una lista de placas de vehículos.
     * 
     * @param placas La lista de objetos PlacaDTO para incluir en el reporte.
     */
    void generarReportePlacas(List<PlacaDTO> placas);
    
    /**
     * Genera un reporte en formato PDF para una lista de licencias.
     * 
     * @param licencias La lista de objetos LicenciaDTO para incluir en el reporte.
     */
    void generarReporteLicencias(List<LicenciaDTO> licencias);
    
    /**
     * Genera un reporte en formato PDF para una lista de trámites genéricos.
     * 
     * @param tramites La lista de objetos TramiteDTO para incluir en el reporte.
     */
    void generarReporteTramites(List<TramiteDTO> tramites);

    /**
     * Busca trámites basados en criterios específicos, como fecha y nombre.
     * 
     * @param fechaInicio La fecha de inicio del período de búsqueda.
     * @param fechaFin La fecha de fin del período de búsqueda.
     * @param nombre El nombre asociado al trámite a buscar.
     * @return Una lista de objetos TramiteDTO que coinciden con los criterios de búsqueda especificados.
     */
    List<TramiteDTO> buscarTramites(Date fechaInicio, Date fechaFin, String nombre);
    
    /**
     * Busca licencias basadas en criterios específicos, como fecha y nombre.
     * 
     * @param fechaInicio La fecha de inicio del período de búsqueda.
     * @param fechaFin La fecha de fin del período de búsqueda.
     * @param nombre El nombre asociado a la licencia a buscar.
     * @return Una lista de objetos LicenciaDTO que coinciden con los criterios de búsqueda especificados.
     */
    List<LicenciaDTO> buscarLicencias(Date fechaInicio, Date fechaFin, String nombre);
    
    /**
     * Busca placas basadas en criterios específicos, como fecha y nombre.
     * 
     * @param fechaInicio La fecha de inicio del período de búsqueda.
     * @param fechaFin La fecha de fin del período de búsqueda.
     * @param nombre El nombre asociado a la placa a buscar.
     * @return Una lista de objetos PlacaDTO que coinciden con los criterios de búsqueda especificados.
     */
    List<PlacaDTO> buscarPlacas(Date fechaInicio, Date fechaFin, String nombre);
    
}
