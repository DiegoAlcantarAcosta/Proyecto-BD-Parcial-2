/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moduloReportes;

import conexionEM.Conexion;
import dtos.LicenciaDTO;
import dtos.PlacaDTO;
import dtos.TramiteDTO;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.text.Document;

/**
 *
 * @author Héctor Francisco Báez Luque
 * @author Diego Alcantar Acosta
 */
public class DesplegarReporteBO implements IDesplegarReporteBO{

    public DesplegarReporteBO() {
    }
    
     @Override
    public void generarReportePlacas(List<PlacaDTO> placas) {
        try {
            File templateFile = new File("ruta_del_template_de_placas.jrxml");
            JasperCompileManager.compileReportToFile(new FileInputStream(templateFile), "PlacasReport.jasper");
            JasperPrint print = JasperFillManager.fillReport("PlacasReport.jasper", null, new JRBeanCollectionDataSource(placas));
            JasperExportManager.exportReportToPdfFile(print, "ReportePlacas.pdf");
            JOptionPane.showMessageDialog(null, "Reporte de Placas generado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al generar el reporte de Placas.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void generarReporteLicencias(List<LicenciaDTO> licencias) {
        try {
            File templateFile = new File("ruta_del_template_de_licencias.jrxml");
            JasperCompileManager.compileReportToFile(new FileInputStream(templateFile), "LicenciasReport.jasper");
            JasperPrint print = JasperFillManager.fillReport("LicenciasReport.jasper", null, new JRBeanCollectionDataSource(licencias));
            JasperExportManager.exportReportToPdfFile(print, "ReporteLicencias.pdf");
            JOptionPane.showMessageDialog(null, "Reporte de Licencias generado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al generar el reporte de Licencias.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void generarReporteTramites(List<TramiteDTO> tramites) {
        try {
            File templateFile = new File("ruta_del_template_de_tramites.jrxml");
            JasperCompileManager.compileReportToFile(new FileInputStream(templateFile), "TramitesReport.jasper");
            JasperPrint print = JasperFillManager.fillReport("TramitesReport.jasper", null, new JRBeanCollectionDataSource(tramites));
            JasperExportManager.exportReportToPdfFile(print, "ReporteTramites.pdf");
            JOptionPane.showMessageDialog(null, "Reporte de Trámites generado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al generar el reporte de Trámites.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public List<TramiteDTO> buscarTramites(Date fechaInicio, Date fechaFin, String nombre) {
        return null;
    }

    @Override
    public List<LicenciaDTO> buscarLicencias(Date fechaInicio, Date fechaFin, String nombre) {
        return null;
    }

    @Override
    public List<PlacaDTO> buscarPlacas(Date fechaInicio, Date fechaFin, String nombre) {
        return null;
    }
    
}
