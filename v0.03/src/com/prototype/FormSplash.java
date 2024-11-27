package com.prototype;

public class FormSplash extends javax.swing.JFrame {

    public FormSplash() {
        
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblEstado = new javax.swing.JLabel();
        lblPorcentaje = new javax.swing.JLabel();
        pgBarraCarga = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 500));
        jPanel1.setLayout(null);

        lblEstado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEstado.setForeground(new java.awt.Color(255, 0, 0));
        lblEstado.setText("Cargando...");
        jPanel1.add(lblEstado);
        lblEstado.setBounds(20, 470, 280, 15);

        lblPorcentaje.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPorcentaje.setForeground(new java.awt.Color(204, 0, 0));
        lblPorcentaje.setText("0 %");
        jPanel1.add(lblPorcentaje);
        lblPorcentaje.setBounds(340, 470, 40, 15);

        pgBarraCarga.setForeground(new java.awt.Color(0, 255, 102));
        pgBarraCarga.setToolTipText("");
        pgBarraCarga.setPreferredSize(new java.awt.Dimension(146, 12));
        jPanel1.add(pgBarraCarga);
        pgBarraCarga.setBounds(0, 485, 650, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProyectoPlantilla/splash.png"))); // NOI18N
        jLabel1.setText("jLabel2");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 650, 460);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FormSplash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormSplash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormSplash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormSplash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormSplash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel lblEstado;
    public javax.swing.JLabel lblPorcentaje;
    public javax.swing.JProgressBar pgBarraCarga;
    // End of variables declaration//GEN-END:variables
}

