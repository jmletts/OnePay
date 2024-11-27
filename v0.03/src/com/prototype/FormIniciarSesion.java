package com.prototype;

import java.awt.*;
import java.sql.*;
import javax.swing.JOptionPane;

import com.access.cConnection;

public class FormIniciarSesion extends javax.swing.JFrame {
   
   public static String NombUsuario; // Global, para usarlo en otros formularios
   
   public FormIniciarSesion() {
        initComponents();
        setLocationRelativeTo(null);  // centrar ventana
}
 @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPassw = new javax.swing.JPasswordField();
        btnIniciarSesion = new javax.swing.JButton();
        btnCancelarInicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INICIAR SESION");
        setMinimumSize(new java.awt.Dimension(200, 150));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setText("Nombre User:");

        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });

        jLabel2.setText("Password USer:");

        txtPassw.setToolTipText("");
        txtPassw.setMinimumSize(new java.awt.Dimension(150, 20));
        txtPassw.setName(""); // NOI18N

        btnIniciarSesion.setText("ACEPTAR");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });

        btnCancelarInicio.setText("CANCELAR");
        btnCancelarInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(btnIniciarSesion)
                        .addGap(34, 34, 34)
                        .addComponent(btnCancelarInicio))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txtPassw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 90, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPassw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIniciarSesion)
                    .addComponent(btnCancelarInicio))
                .addContainerGap(58, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents
private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
}//GEN-LAST:event_txtUserActionPerformed
private void btnCancelarInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarInicioActionPerformed
       System.exit(0);
}//GEN-LAST:event_btnCancelarInicioActionPerformed

private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed

    cConnection cn = new cConnection(); // invoca a la clase que conecta
    
    Statement  st = null; 
    ResultSet  rs = null;
    String query;
    
    int band = 0; //bandera para verificación
     
    String user = txtUser.getText();
    String passw = txtPassw.getText();
    
    if("".equals(txtUser.getText()))
        JOptionPane.showMessageDialog(null, "Ingrese nombre de usuario");
    else 
        if("".equals(txtPassw.getText()))
            JOptionPane.showMessageDialog(null, "Ingrese contraseña");
        else
        {   query = "SELECT * FROM Usuario WHERE NombUser = '"+user+"' AND PassUser = '"+passw+"'";

            try{
                  st = cn.ObtenerConexion().createStatement();  
                  rs = st.executeQuery(query);

                  while(rs.next()){
                        if(rs.getString(1) == null)
                                band = 0;  // no coincide user o passw
                        else
                            band = 1;
                    }
            }
            catch (SQLException ex){
                    JOptionPane.showConfirmDialog(null, "ERROR DE ACCESO"+ex);
            }
     
            if (band == 1)
            {
                NombUsuario = txtUser.getText();
                        
                this.setVisible(false);
                
                try {
                        final FormSplash sp = new FormSplash(); 
             
                        sp.setVisible(true);

                        //final FormVentanaPrincipal vp = new FormVentanaPrincipal();

                        Thread hilos = new Thread()
                        {   @Override
                            public void run(){
                                                                           
                                for(int i = 0; i<=100; i++)
                                { 
                                    sp.lblPorcentaje.setText(i+"%");  // En modo diseño, lblPorcentaje cambiar Propiedades Code a Publico

                                    if(i==10)
                                        sp.lblEstado.setText("Cargando Modulos...");  // En modo diseño, lblEstado cambiar Propiedades Code a Publico
                                    else 
                                        if(i==50)
                                            sp.lblEstado.setText("Conectando con la Base de datos...");
                                        else 
                                            if(i==90)
                                                sp.lblEstado.setText("Iniciando Aplicación...");
                                            else 
                                                if(i==100)
                                                {   sp.setVisible(false);
                                                }

                                    sp.pgBarraCarga.setValue(i);  //Coloca porcentaje en la barra // En modo diseño, pgBarraCarga cambiar Propiedades Code a Publico
                                    
                                    try {
                                        Thread.sleep(30);  //Velocidad de Carga 
                                    } 
                                    catch (InterruptedException ex) { 
                                    }
                                }
                            }
                        };
            
                        hilos.start();
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null,"Fatal ERROR, Carga erronea de los modulos"); 
                }
            }
            else
            {   JOptionPane.showMessageDialog(null,"ERROR. Vuelva a Ingresar");
                this.setVisible(rootPaneCheckingEnabled);   // muestra la ventana actual
                this.txtUser.setText("");
                this.txtPassw.setText("");
                this.txtUser.requestFocus();
            }
        }
}//GEN-LAST:event_btnIniciarSesionActionPerformed

public static void main(String args[]) {
  
     java.awt.EventQueue.invokeLater(new Runnable() {

     public void run() {
                new FormIniciarSesion().setVisible(true);
            }
     });
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarInicio;
    public javax.swing.JButton btnIniciarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtPassw;
    public javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}


