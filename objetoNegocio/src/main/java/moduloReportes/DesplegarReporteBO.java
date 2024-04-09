/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moduloReportes;

import java.io.FileOutputStream;
import javax.swing.text.Document;

/**
 *
 * @author Héctor Francisco Báez Luque
 * @author Diego Alcantar Acosta
 */
public class DesplegarReporteBO implements IDesplegarReporteBO{
    
     private IConexionDAO conexionDAO;
    private IReporteDAO reporteDAO;

    public ReporteBO(IConexionDAO conexionDAO, IReporteDAO reporteDAO) {
        this.conexionDAO = conexionDAO;
        this.reporteDAO = reporteDAO;
    }

    @Override
    public void generarReportePlacas(List<PlacaDTO> placas) {
        Document doc = new Document();

        try {
            PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream("ReportePlacas.pdf"));
            writer.setPageEvent(new PageNumberEvent());

            Font tituloFont = new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD);
            Paragraph titulo = new Paragraph("Reporte de Placas", tituloFont);
            titulo.setAlignment(Element.ALIGN_CENTER);

            Date fechaActual = new Date();
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            Paragraph fecha = new Paragraph("Fecha de generación: " + formatoFecha.format(fechaActual));
            fecha.setAlignment(Element.ALIGN_RIGHT);

            PdfPTable tabla = new PdfPTable(4);
            tabla.addCell(createCell("Fecha", true));
            tabla.addCell(createCell("Costo", true));
            tabla.addCell(createCell("Trámite", true));
            tabla.addCell(createCell("Persona", true));

            for (PlacaDTO placa : placas) {

                String fechaExpedicionFormateada = (placa.getFechaExpedicion() != null) ? formatoFecha.format(placa.getFechaExpedicion().getTime()) : "NoDate";
                tabla.addCell(createCell(fechaExpedicionFormateada, false));

                tabla.addCell(createCell(String.valueOf(placa.getCosto()), false));
                tabla.addCell(createCell("Expedición de Placas", false));
                tabla.addCell(createCell(placa.getNombrePersona(), false));
            }

            doc.open();
            doc.add(titulo);
            doc.add(Chunk.NEWLINE);
            doc.add(fecha);
            doc.add(Chunk.NEWLINE);
            doc.add(Chunk.NEWLINE);
            doc.add(tabla);
            doc.close();

            JOptionPane.showMessageDialog(null, "PDF exportado! Ruta: ReportePlacas.pdf", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al generar el reporte de placas.");
        }
    }

    @Override
    public void generarReporteLicencias(List<LicenciaDTO> licencias) {
        Document doc = new Document();

        try {
            PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream("ReporteLicencias.pdf"));
            writer.setPageEvent(new PageNumberEvent());

            Font tituloFont = new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD);
            Paragraph titulo = new Paragraph("Reporte de Licencias", tituloFont);
            titulo.setAlignment(Element.ALIGN_CENTER);

            Date fechaActual = new Date();
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            Paragraph fecha = new Paragraph("Fecha de generación: " + formatoFecha.format(fechaActual));
            fecha.setAlignment(Element.ALIGN_RIGHT);

            PdfPTable tabla = new PdfPTable(5);
            tabla.addCell(createCell("Fecha", true));
            tabla.addCell(createCell("Costo", true));
            tabla.addCell(createCell("Trámite", true));
            tabla.addCell(createCell("Vigencia", true));
            tabla.addCell(createCell("Persona", true));

            for (LicenciaDTO licencia : licencias) {

                String fechaExpedicionFormateada = (licencia.getFechaExpedicion() != null) ? formatoFecha.format(licencia.getFechaExpedicion().getTime()) : "NoDate";
                tabla.addCell(createCell(fechaExpedicionFormateada, false));

                tabla.addCell(createCell(String.valueOf(licencia.getCosto()), false));
                tabla.addCell(createCell("Expedición de Licencias", false));

                String fechaVigenciaFormateada = (licencia.getFechaVigencia() != null) ? formatoFecha.format(licencia.getFechaVigencia().getTime()) : "NoDate";
                tabla.addCell(createCell(fechaVigenciaFormateada, false));

                tabla.addCell(createCell(licencia.getNombrePersona(), false));
            }

            doc.open();
            doc.add(titulo);
            doc.add(Chunk.NEWLINE);
            doc.add(fecha);
            doc.add(Chunk.NEWLINE);
            doc.add(Chunk.NEWLINE);
            doc.add(tabla);
            doc.close();

            JOptionPane.showMessageDialog(null, "PDF exportado! Ruta: ReporteLicencias.pdf", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al generar el reporte de licencias.");
        }
    }

    @Override
    public void generarReporteTramites(List<TramiteDTO> tramites) {
        Document doc = new Document();

        try {
            PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream("ReporteTramites.pdf"));
            writer.setPageEvent(new PageNumberEvent());

            Font tituloFont = new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD);
            Paragraph titulo = new Paragraph("Reporte de Trámites", tituloFont);
            titulo.setAlignment(Element.ALIGN_CENTER);

            Date fechaActual = new Date();
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            Paragraph fecha = new Paragraph("Fecha de generación: " + formatoFecha.format(fechaActual));
            fecha.setAlignment(Element.ALIGN_RIGHT);

            PdfPTable tabla = new PdfPTable(5);
            tabla.addCell(createCell("Fecha", true));
            tabla.addCell(createCell("Costo", true));
            tabla.addCell(createCell("Estado", true));
            tabla.addCell(createCell("Persona", true));
            tabla.addCell(createCell("Trámite", true));

            for (TramiteDTO tramite : tramites) {
                String fechaExpedicionFormateada = (tramite.getFechaExpedicion() != null) ? formatoFecha.format(tramite.getFechaExpedicion().getTime()) : "NoDate";
                tabla.addCell(createCell(fechaExpedicionFormateada, false));
                tabla.addCell(createCell(Double.toString(tramite.getCosto()), false));
                tabla.addCell(createCell(String.valueOf(tramite.getEstado()), false));
                tabla.addCell(createCell(tramite.getNombrePersona(), false));
                tabla.addCell(createCell(tramite.getTipoTramite(), false));
            }

            doc.open();
            doc.add(titulo);
    
}
