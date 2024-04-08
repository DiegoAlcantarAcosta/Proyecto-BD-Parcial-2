/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import daos.LicenciaDAO;
import daos.PlacaDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import persistencia.Licencia;
import persistencia.Placa;

/**
 *
 * @author Diego
 */
public class consultas2Form extends javax.swing.JFrame {

    LicenciaDAO l = new LicenciaDAO();
    PlacaDAO p = new PlacaDAO();
    String dato;
    String tipoConsulta;
    String buscarPor;
    Date fecha;

    /**
     * Creates new form menuForm
     */
    public consultas2Form(String tipo, String busqueda, String info) throws ParseException {
        initComponents();
        dato = info;
        tipoConsulta = tipo;
        buscarPor = busqueda;
        seleccion();
    }

     public consultas2Form(String tipo, String busqueda, Date info) throws ParseException {
        initComponents();
        fecha = info;
        tipoConsulta = tipo;
        buscarPor = busqueda;
        seleccion();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        regresarButton = new javax.swing.JButton();
        consultasTable = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.setToolTipText("");

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));
        jPanel2.setForeground(new java.awt.Color(153, 0, 0));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Gobierno del Estado de Sonora");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Modulo de Consultas");

        regresarButton.setBackground(new java.awt.Color(255, 255, 255));
        regresarButton.setForeground(new java.awt.Color(0, 0, 0));
        regresarButton.setText("Regresar");
        regresarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarButtonActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Tipo", "Fecha", "Costo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        consultasTable.setViewportView(tabla);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(regresarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(consultasTable, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(consultasTable, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(regresarButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void regresarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarButtonActionPerformed
        dispose();
    }//GEN-LAST:event_regresarButtonActionPerformed

    public void seleccion() throws ParseException {
        if (tipoConsulta.equalsIgnoreCase("LICENCIA") && buscarPor.equalsIgnoreCase("NOMBRE")) {
            licenciaNombre();
        } else if (tipoConsulta.equalsIgnoreCase("LICENCIA") && buscarPor.equalsIgnoreCase("FECHA")) {
            licenciaFecha();
        } else if (tipoConsulta.equalsIgnoreCase("LICENCIA") && buscarPor.equalsIgnoreCase("RFC")) {
            licenciaRFC();
        } else if (tipoConsulta.equalsIgnoreCase("PLACA") && buscarPor.equalsIgnoreCase("NOMBRE")) {
            placasNombre();
        } else if (tipoConsulta.equalsIgnoreCase("PLACA") && buscarPor.equalsIgnoreCase("FECHA")) {
            placaFecha();
        } else if (tipoConsulta.equalsIgnoreCase("PLACA") && buscarPor.equalsIgnoreCase("RFC")) {
            placasRFC();
        }
    }

    private void placaFecha() throws ParseException {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Tipo");
        modelo.addColumn("Fecha");
        modelo.addColumn("Costo");

        SimpleDateFormat formatoSalida = new SimpleDateFormat("dd/MM/yyyy");

        try {
            List<Placa> todos = p.getPlacasPorFecha(fecha);
             if (todos.size() == 0){
                JOptionPane.showMessageDialog(this, "No se encontraron resultados", "AVISO", JOptionPane.WARNING_MESSAGE);
                dispose();
            }
            for (int i = 0; i < todos.size(); i++) {
                String[] datos = new String[3];
                datos[0] = "Placa";
                String fechaRegreso = formatoSalida.format(todos.get(i).getFechaExpedicion().getTime());
                datos[1] = fechaRegreso;
                datos[2] = "" + todos.get(i).getCosto();

                modelo.addRow(datos);
            }
            tabla.setModel(modelo);
        } catch (Exception e) {
            throw e;
        }
    }

    private void placasRFC() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Tipo");
        modelo.addColumn("Fecha");
        modelo.addColumn("Costo");

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        try {
            List<Placa> todos = p.getPlacasPorRFC(dato);
             if (todos.size() == 0){
                JOptionPane.showMessageDialog(this, "No se encontraron resultados", "AVISO", JOptionPane.WARNING_MESSAGE);
                dispose();
            }
            for (int i = 0; i < todos.size(); i++) {
                String[] datos = new String[3];
                datos[0] = "Placa";
                String fecha = formato.format(todos.get(i).getFechaExpedicion().getTime());
                datos[1] = fecha;
                datos[2] = "" + todos.get(i).getCosto();

                modelo.addRow(datos);
            }
            tabla.setModel(modelo);
        } catch (Exception e) {
            throw e;
        }
    }

    private void placasNombre() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Tipo");
        modelo.addColumn("Fecha");
        modelo.addColumn("Costo");

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        try {
            List<Placa> todos = p.getPlacasPorNombre(dato);
             if (todos.size() == 0){
                JOptionPane.showMessageDialog(this, "No se encontraron resultados", "AVISO", JOptionPane.WARNING_MESSAGE);
                dispose();
            }
            for (int i = 0; i < todos.size(); i++) {
                String[] datos = new String[3];
                datos[0] = "Placa";
                String fecha = formato.format(todos.get(i).getFechaExpedicion().getTime());
                datos[1] = fecha;
                datos[2] = "" + todos.get(i).getCosto();

                modelo.addRow(datos);
            }
            tabla.setModel(modelo);
        } catch (Exception e) {
            throw e;
        }
    }

    private void licenciaRFC() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Tipo");
        modelo.addColumn("Fecha");
        modelo.addColumn("Costo");

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        try {
            List<Licencia> todos = l.getLicenciasPorRFC(dato);
             if (todos.size() == 0){
                JOptionPane.showMessageDialog(this, "No se encontraron resultados", "AVISO", JOptionPane.WARNING_MESSAGE);
                dispose();
            }
            for (int i = 0; i < todos.size(); i++) {
                String[] datos = new String[3];
                datos[0] = "Licencia";
                String fecha = formato.format(todos.get(i).getFechaExpedicion().getTime());
                datos[1] = fecha;
                datos[2] = "" + todos.get(i).getCosto();

                modelo.addRow(datos);
            }
            tabla.setModel(modelo);
        } catch (Exception e) {
            throw e;
        }
    }

    private void licenciaNombre() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Tipo");
        modelo.addColumn("Fecha");
        modelo.addColumn("Costo");

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        try {
            List<Licencia> todos = l.getLicenciasPorNombre(dato);
            if (todos.size() == 0){
                JOptionPane.showMessageDialog(this, "No se encontraron resultados", "AVISO", JOptionPane.WARNING_MESSAGE);
                dispose();
            }
            for (int i = 0; i < todos.size(); i++) {
                String[] datos = new String[3];
                datos[0] = "Licencia";
                String fecha = formato.format(todos.get(i).getFechaExpedicion().getTime());
                datos[1] = fecha;
                datos[2] = "" + todos.get(i).getCosto();

                modelo.addRow(datos);
            }
            tabla.setModel(modelo);
        } catch (Exception e) {
            throw e;
        }
    }

    private void licenciaFecha() throws ParseException {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Tipo");
        modelo.addColumn("Fecha");
        modelo.addColumn("Costo");

        SimpleDateFormat formatoSalida = new SimpleDateFormat("dd/MM/yyyy");
        try {
            List<Licencia> todos = l.getLicenciasPorFecha(fecha);
             if (todos.size() == 0){
                JOptionPane.showMessageDialog(this, "No se encontraron resultados", "AVISO", JOptionPane.WARNING_MESSAGE);
                dispose();
            }
            for (int i = 0; i < todos.size(); i++) {
                String[] datos = new String[3];
                datos[0] = "Licencia";
                String fechaRegreso = formatoSalida.format(todos.get(i).getFechaExpedicion().getTime());
                datos[1] = fechaRegreso;
                datos[2] = "" + todos.get(i).getCosto();

                modelo.addRow(datos);
            }
            tabla.setModel(modelo);
        } catch (Exception e) {
            throw e;
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane consultasTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton regresarButton;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
