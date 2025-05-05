package view.gui;

import ficheros.ClassFichero;
import java.io.FileNotFoundException;

import exceptions.BadLengthException;
import exceptions.NotNumericException;
import model.validations.UserDataValidations;

/**
 *
 * @author marcespmor
 */
public class JFrameMain extends javax.swing.JFrame {

    /**
     * Creates new form JFrameMain
     */
    public JFrameMain() throws FileNotFoundException {
        initComponents();
        initConfig();
    }
    
    public void initConfig() throws FileNotFoundException {
        // Create CSV file
        ClassFichero.createFile("user_data_MEM.csv");
        
        // Buttons config
        jButtonValidar.setEnabled(true);
        jButtonEliminar.setEnabled(true);
        jButtonDescargar.setEnabled(false);
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JLabelTitulo = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabelErrorName = new javax.swing.JLabel();
        jButtonValidar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelDNI = new javax.swing.JLabel();
        jTextFieldDNI = new javax.swing.JTextField();
        jLabelData = new javax.swing.JLabel();
        jTextFieldData = new javax.swing.JTextField();
        jLabelCodigoPostal = new javax.swing.JLabel();
        jTextFieldCodigoPostal = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jButtonEliminar = new javax.swing.JButton();
        jButtonDescargar = new javax.swing.JButton();
        jLabelErrorDNI = new javax.swing.JLabel();
        jLabelErrorData = new javax.swing.JLabel();
        jLabelErrorEmail = new javax.swing.JLabel();
        jLabelErrorCodigoPostal = new javax.swing.JLabel();
        jLabelAlert = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JLabelTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JLabelTitulo.setText("VALIDADOR DATOS USUARIO");

        jLabelName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelName.setText("Nombre");

        jTextFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNameActionPerformed(evt);
            }
        });

        jLabelErrorName.setForeground(new java.awt.Color(255, 0, 0));

        jButtonValidar.setText("Validar");
        jButtonValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValidarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/gui/media/monlau.png"))); // NOI18N

        jLabelDNI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelDNI.setText("DNI");

        jTextFieldDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDNIActionPerformed(evt);
            }
        });

        jLabelData.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelData.setText("Data");

        jTextFieldData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDataActionPerformed(evt);
            }
        });

        jLabelCodigoPostal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelCodigoPostal.setText("Codigo Postal");

        jTextFieldCodigoPostal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoPostalActionPerformed(evt);
            }
        });

        jLabelEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelEmail.setText("Email");

        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButtonDescargar.setText("CSV");
        jButtonDescargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDescargarActionPerformed(evt);
            }
        });

        jLabelErrorDNI.setForeground(new java.awt.Color(255, 0, 0));

        jLabelErrorData.setForeground(new java.awt.Color(255, 0, 0));

        jLabelErrorEmail.setForeground(new java.awt.Color(255, 0, 0));

        jLabelErrorCodigoPostal.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(JLabelTitulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelName)
                                    .addComponent(jTextFieldName, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                                    .addComponent(jLabelDNI)
                                    .addComponent(jTextFieldDNI, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                                    .addComponent(jLabelErrorName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelErrorDNI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelData)
                                    .addComponent(jTextFieldData, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelEmail)
                                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelCodigoPostal)
                                    .addComponent(jTextFieldCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelErrorEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelErrorCodigoPostal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelErrorData, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButtonValidar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonEliminar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonDescargar))
                                    .addComponent(jLabelAlert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(0, 185, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(JLabelTitulo)
                                .addGap(28, 28, 28)
                                .addComponent(jLabelName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelCodigoPostal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelErrorName)
                            .addComponent(jLabelErrorCodigoPostal))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelDNI)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelEmail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelErrorDNI)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelData))
                            .addComponent(jLabelErrorEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelErrorData)
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonValidar)
                    .addComponent(jButtonEliminar)
                    .addComponent(jButtonDescargar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelAlert)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValidarActionPerformed
        boolean error = false;
        
        // Nombre
        String name = jTextFieldName.getText();
        if(!UserDataValidations.checkName(name)) {
            jLabelErrorName.setText("Error!");
            error = true;
        }else{
            jLabelErrorName.setText("");
            jTextFieldName.setEditable(false);
        }
        
        // Codigo Postal
        String codigoPostal = jTextFieldCodigoPostal.getText();
        try {
            boolean checked = UserDataValidations.checkPostalCode(codigoPostal);
            if(checked) {
                jLabelErrorCodigoPostal.setText("");
                jTextFieldCodigoPostal.setEditable(false);
            }
        } catch (BadLengthException | NotNumericException e) {
            jLabelErrorCodigoPostal.setText("Error!");
            error = true;
        }
        
        // DNI
        String dni = jTextFieldDNI.getText();
        if(!UserDataValidations.checkId(1, dni)) {
            jLabelErrorDNI.setText("Error!");
            error = true;
        } else {
            jLabelErrorDNI.setText("");
            jTextFieldDNI.setEditable(false);
        }
        
        // Data
        String data = jTextFieldData.getText();
        if(!UserDataValidations.checkFormatDate(data)) {
            jLabelErrorData.setText("Error!");
            error = true;
        } else {
            jLabelErrorData.setText("");
            jTextFieldData.setEditable(false);
        }
        
        // Email
        String email = jTextFieldEmail.getText();
        if(!UserDataValidations.checkEmail(email)) {
            jLabelErrorEmail.setText("Error!");
            error = true;
        } else {
            jLabelErrorEmail.setText("");
            jTextFieldEmail.setEditable(false);
        }
        
        if(error==false) {
            jButtonDescargar.setEnabled(true);
            jButtonValidar.setEnabled(false);
        }
    }//GEN-LAST:event_jButtonValidarActionPerformed

    private void jTextFieldDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDNIActionPerformed

    private void jTextFieldDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDataActionPerformed

    private void jTextFieldCodigoPostalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoPostalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoPostalActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        jTextFieldName.setEditable(true);
        jTextFieldName.setText("");
        jTextFieldCodigoPostal.setEditable(true);
        jTextFieldCodigoPostal.setText("");                                            
        jTextFieldDNI.setEditable(true);
        jTextFieldDNI.setText("");                                            
        jTextFieldEmail.setEditable(true);
        jTextFieldEmail.setText("");                                            
        jTextFieldData.setEditable(true);
        jTextFieldData.setText("");
        jButtonValidar.setEnabled(true);
        jButtonDescargar.setEnabled(false);
        jLabelAlert.setText("");
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonDescargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDescargarActionPerformed
        String d = String.format("%s, %s, %s, %s, %s\n", jTextFieldName.getText(), jTextFieldDNI.getText(), 
                jTextFieldData.getText(), jTextFieldCodigoPostal.getText(), jTextFieldEmail.getText());
        ClassFichero.writeFile(d);
        jLabelAlert.setText("El usuario ha sido registrado correctamente");
        jButtonDescargar.setEnabled(false);
    }//GEN-LAST:event_jButtonDescargarActionPerformed

    private void jTextFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new JFrameMain().setVisible(true);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                    System.exit(1);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelTitulo;
    private javax.swing.JButton jButtonDescargar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonValidar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAlert;
    private javax.swing.JLabel jLabelCodigoPostal;
    private javax.swing.JLabel jLabelDNI;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelErrorCodigoPostal;
    private javax.swing.JLabel jLabelErrorDNI;
    private javax.swing.JLabel jLabelErrorData;
    private javax.swing.JLabel jLabelErrorEmail;
    private javax.swing.JLabel jLabelErrorName;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldCodigoPostal;
    private javax.swing.JTextField jTextFieldDNI;
    private javax.swing.JTextField jTextFieldData;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables
}
