/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.interfaz.iniciosesion;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import com.interfaz.dashboard.dashboard.dashboard1;
import java.awt.Frame;
import com.font.InstallFont;
import com.interfaz.loader.LoaderService2;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author macbook
 */
public class inicioSesion1 extends javax.swing.JFrame {
    String pin = "1234";
    int x = 1;
    /**
     * Creates new form inicioSesion
     */
    public inicioSesion1() {
        initComponents();
        setLocationRelativeTo(null);
       
        
        
            new Thread(() -> {
         try {
        while (true) { // Bucle infinito
            text.setText("BIENVENIDO");
            Thread.sleep(800);

            text.setText("WELCOME");
            Thread.sleep(800);

            text.setText("BIENVENUE");
            Thread.sleep(800);
            
            text.setText("ALLIN HAMUY");
            Thread.sleep(800);
        }
        } catch (InterruptedException e) {
        e.printStackTrace();
       }
       }).start();

        
        }
        
    
    private void abrirVentanaReg() {
    Register ventanaReg = new Register();
    
    ventanaReg.setVisible(true);
    /*
    ventanaReg.setOpacity(0); // Establece la opacidad inicial en 0
    ventanaReg.setVisible(true); // Ahora se muestra la ventana en invisible
    ventanaReg.fadeIn(); /// Abre la nueva ventana
    */
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        panelRound5 = new com.interfaz.iniciosesion.PanelRound();
        jLabel5 = new javax.swing.JLabel();
        panelRound6 = new com.interfaz.iniciosesion.PanelRound();
        getDniIni = new javax.swing.JTextField();
        panelRound7 = new com.interfaz.iniciosesion.PanelRound();
        btnINi = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        panelRound8 = new com.interfaz.iniciosesion.PanelRound();
        passIni = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        text = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        paneMess = new javax.swing.JPanel();
        showmes2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel13.setFont(new java.awt.Font("Red Hat Display", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("¿Olvidaste Tu Contraseña?");
        jLabel13.setToolTipText("");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound5.setBackground(new java.awt.Color(240, 240, 240));
        panelRound5.setRoundBottomLeft(50);
        panelRound5.setRoundBottomRight(50);
        panelRound5.setRoundTopLeft(50);
        panelRound5.setRoundTopRight(50);
        panelRound5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Red Hat Display", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CLAVE");
        jLabel5.setToolTipText("");
        panelRound5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 90, 20));

        panelRound6.setBackground(new java.awt.Color(255, 255, 255));
        panelRound6.setRoundBottomLeft(12);
        panelRound6.setRoundBottomRight(12);
        panelRound6.setRoundTopLeft(12);
        panelRound6.setRoundTopRight(12);

        getDniIni.setFont(new java.awt.Font("Red Hat Display", 0, 13)); // NOI18N
        getDniIni.setForeground(new java.awt.Color(153, 153, 153));
        getDniIni.setText("DNI");
        getDniIni.setBorder(null);
        getDniIni.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                getDniIniFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                getDniIniFocusLost(evt);
            }
        });
        getDniIni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                getDniIniMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout panelRound6Layout = new javax.swing.GroupLayout(panelRound6);
        panelRound6.setLayout(panelRound6Layout);
        panelRound6Layout.setHorizontalGroup(
            panelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(getDniIni, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRound6Layout.setVerticalGroup(
            panelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(getDniIni, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        panelRound5.add(panelRound6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 270, 30));

        panelRound7.setBackground(new java.awt.Color(170, 0, 0));
        panelRound7.setRoundBottomLeft(25);
        panelRound7.setRoundBottomRight(25);
        panelRound7.setRoundTopLeft(25);
        panelRound7.setRoundTopRight(25);

        btnINi.setFont(new java.awt.Font("Red Hat Display", 1, 14)); // NOI18N
        btnINi.setForeground(new java.awt.Color(255, 255, 255));
        btnINi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnINi.setText("INICIO SESION");
        btnINi.setToolTipText("");
        btnINi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnINi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnINiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnINiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnINiMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnINiMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelRound7Layout = new javax.swing.GroupLayout(panelRound7);
        panelRound7.setLayout(panelRound7Layout);
        panelRound7Layout.setHorizontalGroup(
            panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound7Layout.createSequentialGroup()
                .addComponent(btnINi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelRound7Layout.setVerticalGroup(
            panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnINi, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panelRound5.add(panelRound7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 150, 40));

        jLabel10.setFont(new java.awt.Font("Red Hat Display", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(170, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("INICIO SESION");
        jLabel10.setToolTipText("");
        panelRound5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 150, 52));

        jLabel11.setFont(new java.awt.Font("Red Hat Display", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("USUARIO");
        jLabel11.setToolTipText("");
        panelRound5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 110, 20));

        panelRound8.setBackground(new java.awt.Color(255, 255, 255));
        panelRound8.setRoundBottomLeft(12);
        panelRound8.setRoundBottomRight(12);
        panelRound8.setRoundTopLeft(12);
        panelRound8.setRoundTopRight(12);

        passIni.setBorder(null);

        javax.swing.GroupLayout panelRound8Layout = new javax.swing.GroupLayout(panelRound8);
        panelRound8.setLayout(panelRound8Layout);
        panelRound8Layout.setHorizontalGroup(
            panelRound8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(passIni, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRound8Layout.setVerticalGroup(
            panelRound8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(passIni, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        panelRound5.add(panelRound8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, -1, -1));

        jPanel3.setBackground(new java.awt.Color(240, 240, 240));

        text.setFont(new java.awt.Font("Red Hat Display", 1, 40)); // NOI18N
        text.setForeground(new java.awt.Color(170, 0, 0));
        text.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        text.setText("BIENVENIDO");
        text.setToolTipText("");

        jLabel12.setFont(new java.awt.Font("Red Hat Display", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("ACCEDER");
        jLabel12.setToolTipText("");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Recurso 2.png"))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Red Hat Display", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 51, 204));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Contactar Soporte");
        jLabel15.setToolTipText("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(16, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addContainerGap())
        );

        panelRound5.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 320, 230));

        jLabel3.setFont(new java.awt.Font("Red Hat Display", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("¿Olvidaste Tu Contraseña?");
        jLabel3.setToolTipText("");

        paneMess.setBackground(new java.awt.Color(255, 255, 255));

        showmes2.setBackground(new java.awt.Color(102, 255, 51));
        showmes2.setFont(new java.awt.Font("Red Hat Display", 1, 14)); // NOI18N
        showmes2.setForeground(new java.awt.Color(255, 255, 255));
        showmes2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showmes2.setToolTipText("");

        javax.swing.GroupLayout paneMessLayout = new javax.swing.GroupLayout(paneMess);
        paneMess.setLayout(paneMessLayout);
        paneMessLayout.setHorizontalGroup(
            paneMessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneMessLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(showmes2, javax.swing.GroupLayout.PREFERRED_SIZE, 887, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        paneMessLayout.setVerticalGroup(
            paneMessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneMessLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(showmes2, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Red Hat Display", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("v0.8");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(panelRound5, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(363, 363, 363)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(paneMess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(107, 107, 107)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(419, 419, 419)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(455, 455, 455)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(paneMess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(201, 201, 201)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(panelRound5, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 947, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnINiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnINiMouseEntered
        // TODO add your handling code here:
        panelRound7.setBackground(Color.gray);
    }//GEN-LAST:event_btnINiMouseEntered

    private void btnINiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnINiMouseExited
        panelRound7.setBackground(new Color(170, 0, 0));
    }//GEN-LAST:event_btnINiMouseExited

    private void getDniIniFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_getDniIniFocusGained
        // TODO add your handling code here:
        getDniIni.setText("");
    }//GEN-LAST:event_getDniIniFocusGained

    private void getDniIniFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_getDniIniFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_getDniIniFocusLost

    private void btnINiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnINiMouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_btnINiMouseClicked

    private void btnINiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnINiMousePressed
        try {
            // TODO add your handling code here:
            dashboard1 ventana2 = new dashboard1();
            String pin1 = "1234";
            String user = "23978040";
            
            LoaderService2 load = new LoaderService2();
            
            load.openLink();
            
            
            
            if ( passIni.getText().equals(pin1) && (getDniIni.getText().equals(user))) {
                
                
                for (Frame frame : Frame.getFrames()) {
                    frame.dispose();
                }
                
                ventana2.setVisible(true);
                
                
            } else {
                paneMess.setBackground(new Color(170, 0, 0));
                showmes2.setText("LOS DATOS INGRESADOS SON INCORRECTOS");
            }
            
            
        } catch (InterruptedException ex) {
            Logger.getLogger(inicioSesion1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnINiMousePressed

    private void getDniIniMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getDniIniMouseEntered
        // TODO add your handling code here:
        getDniIni.setText("");
    }//GEN-LAST:event_getDniIniMouseEntered

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(inicioSesion1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicioSesion1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicioSesion1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicioSesion1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicioSesion1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnINi;
    private javax.swing.JTextField getDniIni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel paneMess;
    private com.interfaz.iniciosesion.PanelRound panelRound5;
    private com.interfaz.iniciosesion.PanelRound panelRound6;
    private com.interfaz.iniciosesion.PanelRound panelRound7;
    private com.interfaz.iniciosesion.PanelRound panelRound8;
    private javax.swing.JPasswordField passIni;
    private javax.swing.JLabel showmes2;
    private javax.swing.JLabel text;
    // End of variables declaration//GEN-END:variables
}
