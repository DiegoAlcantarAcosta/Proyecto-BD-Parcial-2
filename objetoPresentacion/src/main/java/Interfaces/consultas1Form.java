/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import controladores.controlador;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class consultas1Form extends javax.swing.JFrame {

    controlador c = new controlador();

    /**
     * Creates new form menuForm
     */
    public consultas1Form() {
        initComponents();
        datosTextField.setVisible(true);
        fechaDateChooser.setVisible(false);
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
        jLabel6 = new javax.swing.JLabel();
        datosTextField = new javax.swing.JTextField();
        placasRadioButton = new javax.swing.JRadioButton();
        licenciaRadioButton = new javax.swing.JRadioButton();
        siguienteButton = new javax.swing.JButton();
        regresarButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        nombreRadioButton = new javax.swing.JRadioButton();
        fechaNacimientoRadioButton = new javax.swing.JRadioButton();
        rfcRadioButton = new javax.swing.JRadioButton();
        fechaDateChooser = new com.toedter.calendar.JDateChooser();

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(111, 111, 111))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Modulo de Consultas");

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Tipo de consulta");

        datosTextField.setBackground(new java.awt.Color(255, 255, 255));
        datosTextField.setForeground(new java.awt.Color(0, 0, 0));

        placasRadioButton.setBackground(new java.awt.Color(153, 153, 153));
        placasRadioButton.setForeground(new java.awt.Color(0, 0, 0));
        placasRadioButton.setText("Placas");
        placasRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placasRadioButtonActionPerformed(evt);
            }
        });

        licenciaRadioButton.setBackground(new java.awt.Color(153, 153, 153));
        licenciaRadioButton.setForeground(new java.awt.Color(0, 0, 0));
        licenciaRadioButton.setText("Licencia");
        licenciaRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                licenciaRadioButtonActionPerformed(evt);
            }
        });

        siguienteButton.setBackground(new java.awt.Color(255, 255, 255));
        siguienteButton.setForeground(new java.awt.Color(0, 0, 0));
        siguienteButton.setText("Siguiente");
        siguienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteButtonActionPerformed(evt);
            }
        });

        regresarButton.setBackground(new java.awt.Color(255, 255, 255));
        regresarButton.setForeground(new java.awt.Color(0, 0, 0));
        regresarButton.setText("Regresar");
        regresarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarButtonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Buscar por:");

        nombreRadioButton.setBackground(new java.awt.Color(153, 153, 153));
        nombreRadioButton.setForeground(new java.awt.Color(0, 0, 0));
        nombreRadioButton.setText("Nombre");
        nombreRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreRadioButtonActionPerformed(evt);
            }
        });

        fechaNacimientoRadioButton.setBackground(new java.awt.Color(153, 153, 153));
        fechaNacimientoRadioButton.setForeground(new java.awt.Color(0, 0, 0));
        fechaNacimientoRadioButton.setText("Fecha Nacimiento");
        fechaNacimientoRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaNacimientoRadioButtonActionPerformed(evt);
            }
        });

        rfcRadioButton.setBackground(new java.awt.Color(153, 153, 153));
        rfcRadioButton.setForeground(new java.awt.Color(0, 0, 0));
        rfcRadioButton.setText("RFC");
        rfcRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rfcRadioButtonActionPerformed(evt);
            }
        });

        fechaDateChooser.setBackground(new java.awt.Color(255, 255, 255));
        fechaDateChooser.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(nombreRadioButton)
                                            .addGap(91, 91, 91)
                                            .addComponent(fechaNacimientoRadioButton))
                                        .addComponent(jLabel7))
                                    .addGap(34, 34, 34)))
                            .addGap(59, 59, 59)
                            .addComponent(rfcRadioButton)
                            .addGap(140, 140, 140))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(182, 182, 182)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(fechaDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(regresarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(127, 127, 127)
                                    .addComponent(siguienteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(datosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(159, 159, 159)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(194, 194, 194))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(licenciaRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(placasRadioButton)
                .addGap(160, 160, 160))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(licenciaRadioButton)
                    .addComponent(placasRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaNacimientoRadioButton)
                    .addComponent(nombreRadioButton)
                    .addComponent(rfcRadioButton))
                .addGap(18, 18, 18)
                .addComponent(datosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(fechaDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regresarButton)
                    .addComponent(siguienteButton))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void licenciaRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_licenciaRadioButtonActionPerformed
        if (licenciaRadioButton.isSelected()) {
            placasRadioButton.setSelected(false);
        }
    }//GEN-LAST:event_licenciaRadioButtonActionPerformed

    private void regresarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarButtonActionPerformed
        c.placasAMenu();
        dispose();
    }//GEN-LAST:event_regresarButtonActionPerformed

    public void seleccion() throws ParseException {
        if (licenciaRadioButton.isSelected() && nombreRadioButton.isSelected()) {
            c.consultas1Aconsultas2("LICENCIA", "NOMBRE", datosTextField.getText());
        } else if (licenciaRadioButton.isSelected() && fechaNacimientoRadioButton.isSelected()) {
            c.consultas1Aconsultas2("LICENCIA", "FECHA", fechaDateChooser.getDate());
        } else if (licenciaRadioButton.isSelected() && rfcRadioButton.isSelected()) {
            c.consultas1Aconsultas2("LICENCIA", "RFC", datosTextField.getText());
        } else if (placasRadioButton.isSelected() && nombreRadioButton.isSelected()) {
            c.consultas1Aconsultas2("PLACA", "NOMBRE", datosTextField.getText());
        } else if (placasRadioButton.isSelected() && fechaNacimientoRadioButton.isSelected()) {
            c.consultas1Aconsultas2("PLACA", "FECHA", fechaDateChooser.getDate());
        } else if (placasRadioButton.isSelected() && rfcRadioButton.isSelected()) {
            c.consultas1Aconsultas2("PLACA", "RFC", datosTextField.getText());
        } else {
            JOptionPane.showMessageDialog(this, "Falta alguna opcion por marcar", "AVISO", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void siguienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteButtonActionPerformed
        try {
            seleccion();
        } catch (ParseException ex) {
            Logger.getLogger(consultas1Form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_siguienteButtonActionPerformed

    private void placasRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placasRadioButtonActionPerformed
        if (placasRadioButton.isSelected()) {
            licenciaRadioButton.setSelected(false);
        }
    }//GEN-LAST:event_placasRadioButtonActionPerformed

    private void nombreRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreRadioButtonActionPerformed
        if (nombreRadioButton.isSelected()) {
            fechaNacimientoRadioButton.setSelected(false);
            rfcRadioButton.setSelected(false);
            fechaDateChooser.setVisible(false);
            datosTextField.setVisible(true);
        }
    }//GEN-LAST:event_nombreRadioButtonActionPerformed

    private void fechaNacimientoRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaNacimientoRadioButtonActionPerformed
        if (fechaNacimientoRadioButton.isSelected()) {
            nombreRadioButton.setSelected(false);
            rfcRadioButton.setSelected(false);
            datosTextField.setVisible(false);
            fechaDateChooser.setVisible(true);
        }
    }//GEN-LAST:event_fechaNacimientoRadioButtonActionPerformed

    private void rfcRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rfcRadioButtonActionPerformed
        if (rfcRadioButton.isSelected()) {
            fechaNacimientoRadioButton.setSelected(false);
            nombreRadioButton.setSelected(false);
            fechaDateChooser.setVisible(false);
            datosTextField.setVisible(true);
        }
    }//GEN-LAST:event_rfcRadioButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField datosTextField;
    private com.toedter.calendar.JDateChooser fechaDateChooser;
    private javax.swing.JRadioButton fechaNacimientoRadioButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton licenciaRadioButton;
    private javax.swing.JRadioButton nombreRadioButton;
    private javax.swing.JRadioButton placasRadioButton;
    private javax.swing.JButton regresarButton;
    private javax.swing.JRadioButton rfcRadioButton;
    private javax.swing.JButton siguienteButton;
    // End of variables declaration//GEN-END:variables
}