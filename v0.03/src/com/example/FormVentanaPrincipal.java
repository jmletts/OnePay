// AUTOR: Carol Rojas Moreno - DOCENTE Programación Orientada a Objetos
package com.example;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormVentanaPrincipal extends javax.swing.JFrame {

    // --- VARIABLES GLOBALES para usar en otros formularios ---
    Calendar calend = new GregorianCalendar();
    String DatoUsuario=FormIniciarSesion.NombUsuario; // Dato public static del FormIniciarSesion
    String TotalPago;
    String dni;
    String NumCP;
    String ItemCmbDcto;
    double sumPago =0.0;
    
    public FormVentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null); //CENTRAR VENTANA PRINCIPAL
        this.setTitle("Menu Principal");
                
        cmbDcto.removeAllItems();   //Cargar el Combo de descuento (Debe tener propiedad PUBLIC)
        
        cConnection con = new cConnection();
        
        String query = "SELECT * FROM DctoVenta"; 
        
        try
        {   Statement st = con.ObtenerConexion().createStatement(); 
            ResultSet rs = st.executeQuery(query);
            
            while(rs.next())
            {
                cmbDcto.addItem(rs.getInt("ValorDctoVenta"));
            }
        }
        catch(Exception e)
        {
        } 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frmNuevoUser = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        lblCodigoU = new javax.swing.JLabel();
        lblNombreU = new javax.swing.JLabel();
        lblPaswordU = new javax.swing.JLabel();
        lblUltimoU = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCodigoU = new javax.swing.JTextField();
        txtNombreU = new javax.swing.JTextField();
        txtPasswordU = new javax.swing.JTextField();
        btnRegistrarNuevoUsuario = new javax.swing.JButton();
        btnSalirU = new javax.swing.JButton();
        frmNuevoProducto = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        lblCodigoP = new javax.swing.JLabel();
        lblNombreP = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        lblUltimoP = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCodigoP = new javax.swing.JTextField();
        txtNombreP = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtSaldo = new javax.swing.JTextField();
        btnRegistrarNuevoProducto = new javax.swing.JButton();
        btnSalirP = new javax.swing.JButton();
        frmNuevoCliente = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        lblDNIC = new javax.swing.JLabel();
        lblNombreC = new javax.swing.JLabel();
        lblApellidoC = new javax.swing.JLabel();
        lblDireccionC = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtDNIC = new javax.swing.JTextField();
        txtNombreC = new javax.swing.JTextField();
        txtApellidoC = new javax.swing.JTextField();
        txtDireccionC = new javax.swing.JTextField();
        btnRegistrarNuevoCliente = new javax.swing.JButton();
        btnSalirC = new javax.swing.JButton();
        frmNuevoDctoProducto = new javax.swing.JFrame();
        jPanel4 = new javax.swing.JPanel();
        lblCodProdu = new javax.swing.JLabel();
        lblCodigoDctoProdu = new javax.swing.JLabel();
        lblValorDcto = new javax.swing.JLabel();
        lblFechaCreacionDcto = new javax.swing.JLabel();
        lblUltimoDcto = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCodProdu = new javax.swing.JTextField();
        txtCodDctoProd = new javax.swing.JTextField();
        txtValorDcto = new javax.swing.JTextField();
        btnBuscarProdu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbResulProducto = new javax.swing.JTable();
        btnRegistrarDctoProducto = new javax.swing.JButton();
        btnSalirDctoProd = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbReportDcto = new javax.swing.JTable();
        dateChFechaDctoProducto = new com.toedter.calendar.JDateChooser();
        frmNuevoDctoVenta = new javax.swing.JFrame();
        jPanel5 = new javax.swing.JPanel();
        lblCodigoDctoVenta = new javax.swing.JLabel();
        lblValorDctoVenta = new javax.swing.JLabel();
        lblFechaCreacionDctoVenta = new javax.swing.JLabel();
        lblUltimoDctoVenta = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblEjemplo = new javax.swing.JLabel();
        txtCodDctoVenta = new javax.swing.JTextField();
        txtValorDctoVenta = new javax.swing.JTextField();
        btnRegistrarDctoVenta = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        dateChFechaDctoVenta = new com.toedter.calendar.JDateChooser();
        frmVenta = new javax.swing.JFrame();
        jPanel6 = new javax.swing.JPanel();
        lblUltimoCP = new javax.swing.JLabel();
        lblNumCP = new javax.swing.JLabel();
        lblCodUser = new javax.swing.JLabel();
        lblFechaCP = new javax.swing.JLabel();
        lblDniClie = new javax.swing.JLabel();
        lblNomProd = new javax.swing.JLabel();
        lblCant = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblDescto = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtNumCP = new javax.swing.JTextField();
        txtCodigoUser = new javax.swing.JTextField();
        txtDNI = new javax.swing.JTextField();
        txtNombProducto = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        btnBuscarCliente = new javax.swing.JButton();
        btnNuevoCliente = new javax.swing.JButton();
        btnBuscarProducto = new javax.swing.JButton();
        btnAgregarPedido = new javax.swing.JButton();
        btnQuitarPedido = new javax.swing.JButton();
        btnEfectuar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        cmbDcto = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblClienteEncontrado = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblProductoEncontrado = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblVenta = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        dateChFechaReportVenta = new com.toedter.calendar.JDateChooser();
        frmReportarVenta = new javax.swing.JFrame();
        jPanel8 = new javax.swing.JPanel();
        lblReportar = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        btnReportar = new javax.swing.JButton();
        btSalirReport = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblResultadoReporte = new javax.swing.JTable();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        frmBuscarUsuario = new javax.swing.JFrame();
        jPanel7 = new javax.swing.JPanel();
        lblNombreUserBuscar = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtNombUserBuscar = new javax.swing.JTextField();
        btnBuscarUser = new javax.swing.JButton();
        btnSalirBuscarU = new javax.swing.JButton();
        JScrollPane3 = new javax.swing.JScrollPane();
        tblResultadoUsuario = new javax.swing.JTable();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        bmInicio = new javax.swing.JMenu();
        opNuevoUser = new javax.swing.JMenuItem();
        opBuscarUser = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        opSalir = new javax.swing.JMenuItem();
        bmGestionar = new javax.swing.JMenu();
        opNuevoProducto = new javax.swing.JMenuItem();
        opNuevoDctoProd = new javax.swing.JMenuItem();
        opNuevoDctoVent = new javax.swing.JMenuItem();
        bmTransaccion = new javax.swing.JMenu();
        opRegistVenta = new javax.swing.JMenuItem();
        opReportVenta = new javax.swing.JMenuItem();

        frmNuevoUser.setTitle("REGISTRAR NUEVO USUARIO");
        frmNuevoUser.setBounds(new java.awt.Rectangle(450, 300, 0, 0));
        frmNuevoUser.setMinimumSize(new java.awt.Dimension(450, 400));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblCodigoU.setFont(new java.awt.Font("Red Hat Display", 0, 16)); // NOI18N
        lblCodigoU.setText("Codigo:");

        lblNombreU.setFont(new java.awt.Font("Red Hat Display", 0, 16)); // NOI18N
        lblNombreU.setText("Nombre:");

        lblPaswordU.setFont(new java.awt.Font("Red Hat Display", 0, 16)); // NOI18N
        lblPaswordU.setText("Password:");

        lblUltimoU.setFont(new java.awt.Font("Red Hat Display", 0, 14)); // NOI18N
        lblUltimoU.setText(".........");

        jLabel4.setFont(new java.awt.Font("Red Hat Display", 0, 14)); // NOI18N
        jLabel4.setText("Ultimo Codigo Registrado:");

        jLabel5.setFont(new java.awt.Font("Red Hat Display", 1, 24)); // NOI18N
        jLabel5.setText("Ingresar Datos de Operador");

        txtCodigoU.setBackground(new java.awt.Color(255, 255, 204));
        txtCodigoU.setFont(new java.awt.Font("Red Hat Display", 0, 14)); // NOI18N
        txtCodigoU.setForeground(new java.awt.Color(0, 0, 255));

        txtNombreU.setFont(new java.awt.Font("Red Hat Display", 0, 14)); // NOI18N

        txtPasswordU.setFont(new java.awt.Font("Red Hat Display", 0, 14)); // NOI18N

        btnRegistrarNuevoUsuario.setBackground(new java.awt.Color(170, 0, 0));
        btnRegistrarNuevoUsuario.setFont(new java.awt.Font("Red Hat Display", 1, 14)); // NOI18N
        btnRegistrarNuevoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarNuevoUsuario.setText("Registrar");
        btnRegistrarNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarNuevoUsuarioActionPerformed(evt);
            }
        });

        btnSalirU.setFont(new java.awt.Font("Red Hat Display", 1, 14)); // NOI18N
        btnSalirU.setText("Salir");
        btnSalirU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirUActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombreU)
                            .addComponent(lblCodigoU)
                            .addComponent(lblPaswordU))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCodigoU, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreU, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(txtPasswordU)))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblUltimoU))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRegistrarNuevoUsuario)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalirU, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblUltimoU))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCodigoU)
                        .addGap(27, 27, 27)
                        .addComponent(lblNombreU))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCodigoU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(txtNombreU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPasswordU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPaswordU))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRegistrarNuevoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(btnSalirU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout frmNuevoUserLayout = new javax.swing.GroupLayout(frmNuevoUser.getContentPane());
        frmNuevoUser.getContentPane().setLayout(frmNuevoUserLayout);
        frmNuevoUserLayout.setHorizontalGroup(
            frmNuevoUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        frmNuevoUserLayout.setVerticalGroup(
            frmNuevoUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        frmNuevoProducto.setTitle("REGISTRAR NUEVO PRODUCTO");
        frmNuevoProducto.setBounds(new java.awt.Rectangle(450, 300, 0, 0));
        frmNuevoProducto.setMinimumSize(new java.awt.Dimension(450, 435));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(800, 800));
        jPanel2.setMinimumSize(new java.awt.Dimension(500, 435));
        jPanel2.setPreferredSize(new java.awt.Dimension(427, 435));

        lblCodigoP.setText("Codigo:");

        lblNombreP.setText("Nombre:");

        lblPrecio.setText("Precio:");

        lblSaldo.setText("Saldo:");

        lblUltimoP.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblUltimoP.setText(".........");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Ultimo Codigo Registrado:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("Ingresar Datos de Producto");

        txtCodigoP.setBackground(new java.awt.Color(255, 255, 204));
        txtCodigoP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCodigoP.setForeground(new java.awt.Color(0, 0, 255));

        btnRegistrarNuevoProducto.setText("Registrar");
        btnRegistrarNuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarNuevoProductoActionPerformed(evt);
            }
        });

        btnSalirP.setText("Salir");
        btnSalirP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblCodigoP)
                                .addGap(24, 24, 24))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNombreP)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblSaldo)
                                        .addComponent(lblPrecio)))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigoP, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreP, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(lblUltimoP))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnRegistrarNuevoProducto)
                        .addGap(68, 68, 68)
                        .addComponent(btnSalirP, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel7)
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblUltimoP))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigoP))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreP)
                    .addComponent(txtNombreP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecio)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSaldo)
                    .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarNuevoProducto)
                    .addComponent(btnSalirP))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout frmNuevoProductoLayout = new javax.swing.GroupLayout(frmNuevoProducto.getContentPane());
        frmNuevoProducto.getContentPane().setLayout(frmNuevoProductoLayout);
        frmNuevoProductoLayout.setHorizontalGroup(
            frmNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        frmNuevoProductoLayout.setVerticalGroup(
            frmNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        frmNuevoCliente.setTitle("REGISTRAR NUEVO CLIENTE");
        frmNuevoCliente.setBounds(new java.awt.Rectangle(450, 300, 0, 0));
        frmNuevoCliente.setMinimumSize(new java.awt.Dimension(450, 400));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        lblDNIC.setFont(new java.awt.Font("Red Hat Display", 0, 16)); // NOI18N
        lblDNIC.setText("DNI:");

        lblNombreC.setFont(new java.awt.Font("Red Hat Display", 0, 16)); // NOI18N
        lblNombreC.setText("Nombre:");

        lblApellidoC.setFont(new java.awt.Font("Red Hat Display", 0, 16)); // NOI18N
        lblApellidoC.setText("Apellido:");

        lblDireccionC.setFont(new java.awt.Font("Red Hat Display", 0, 16)); // NOI18N
        lblDireccionC.setText("Direccion:");

        jLabel9.setFont(new java.awt.Font("Red Hat Display", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(170, 0, 0));
        jLabel9.setText("Ingresar Datos de Cliente");
        jLabel9.setToolTipText("");

        txtDNIC.setBackground(new java.awt.Color(255, 204, 255));
        txtDNIC.setFont(new java.awt.Font("Red Hat Display", 0, 16)); // NOI18N
        txtDNIC.setForeground(new java.awt.Color(0, 0, 255));

        txtNombreC.setFont(new java.awt.Font("Red Hat Display", 0, 16)); // NOI18N

        txtApellidoC.setFont(new java.awt.Font("Red Hat Display", 0, 16)); // NOI18N

        txtDireccionC.setFont(new java.awt.Font("Red Hat Display", 0, 16)); // NOI18N

        btnRegistrarNuevoCliente.setBackground(new java.awt.Color(170, 0, 0));
        btnRegistrarNuevoCliente.setFont(new java.awt.Font("Red Hat Display", 1, 16)); // NOI18N
        btnRegistrarNuevoCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarNuevoCliente.setText("Registrar");
        btnRegistrarNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarNuevoClienteActionPerformed(evt);
            }
        });

        btnSalirC.setFont(new java.awt.Font("Red Hat Display", 1, 16)); // NOI18N
        btnSalirC.setText("Salir");
        btnSalirC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnRegistrarNuevoCliente)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalirC, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblApellidoC)
                            .addComponent(lblDireccionC)
                            .addComponent(lblNombreC)
                            .addComponent(lblDNIC))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDNIC)
                            .addComponent(txtNombreC)
                            .addComponent(txtApellidoC)
                            .addComponent(txtDireccionC, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDNIC)
                    .addComponent(txtDNIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreC)
                    .addComponent(txtNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidoC)
                    .addComponent(txtApellidoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccionC)
                    .addComponent(txtDireccionC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistrarNuevoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(btnSalirC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout frmNuevoClienteLayout = new javax.swing.GroupLayout(frmNuevoCliente.getContentPane());
        frmNuevoCliente.getContentPane().setLayout(frmNuevoClienteLayout);
        frmNuevoClienteLayout.setHorizontalGroup(
            frmNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        frmNuevoClienteLayout.setVerticalGroup(
            frmNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        frmNuevoDctoProducto.setTitle("REGISTRAR DESCUENTO PRODUCTO");
        frmNuevoDctoProducto.setMinimumSize(new java.awt.Dimension(600, 600));

        jPanel4.setBackground(new java.awt.Color(153, 204, 255));

        lblCodProdu.setText("Ingrese Codigo de Producto:");

        lblCodigoDctoProdu.setText("Codigo Dcto:");

        lblValorDcto.setText("Valor Descuento:");
        lblValorDcto.setToolTipText("");

        lblFechaCreacionDcto.setText("Fecha de Creación:");

        lblUltimoDcto.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblUltimoDcto.setText(".........");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("Ingresar Datos de Descuento de Producto");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Ultimo Codigo Registrado:");

        txtCodDctoProd.setBackground(new java.awt.Color(255, 255, 204));
        txtCodDctoProd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCodDctoProd.setForeground(new java.awt.Color(0, 0, 255));

        btnBuscarProdu.setText("Buscar Producto");
        btnBuscarProdu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProduActionPerformed(evt);
            }
        });

        tbResulProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo Producto", "Nombre Producto", "Precio", "Saldo"
            }
        ));
        jScrollPane1.setViewportView(tbResulProducto);

        btnRegistrarDctoProducto.setText("Registrar");
        btnRegistrarDctoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarDctoProductoActionPerformed(evt);
            }
        });

        btnSalirDctoProd.setText("Salir");
        btnSalirDctoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirDctoProdActionPerformed(evt);
            }
        });

        tbReportDcto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Codigo Dcto", "% Dcto"
            }
        ));
        jScrollPane6.setViewportView(tbReportDcto);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblFechaCreacionDcto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dateChFechaDctoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblValorDcto)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addGap(18, 18, 18)
                                            .addComponent(lblUltimoDcto))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addComponent(lblCodigoDctoProdu)
                                            .addGap(43, 43, 43)
                                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtValorDcto, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtCodDctoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(btnRegistrarDctoProducto)
                        .addGap(65, 65, 65)
                        .addComponent(btnSalirDctoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addComponent(lblCodProdu)
                                    .addGap(27, 27, 27)
                                    .addComponent(txtCodProdu, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnBuscarProdu))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                    .addGap(89, 89, 89)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(45, 45, 45))))
                .addGap(36, 98, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel8)
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodProdu)
                    .addComponent(txtCodProdu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarProdu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUltimoDcto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodDctoProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCodigoDctoProdu))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtValorDcto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValorDcto))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFechaCreacionDcto)
                    .addComponent(dateChFechaDctoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarDctoProducto)
                    .addComponent(btnSalirDctoProd))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout frmNuevoDctoProductoLayout = new javax.swing.GroupLayout(frmNuevoDctoProducto.getContentPane());
        frmNuevoDctoProducto.getContentPane().setLayout(frmNuevoDctoProductoLayout);
        frmNuevoDctoProductoLayout.setHorizontalGroup(
            frmNuevoDctoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        frmNuevoDctoProductoLayout.setVerticalGroup(
            frmNuevoDctoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        frmNuevoDctoVenta.setTitle("REGISTRAR DESCUENTO VENTAS");
        frmNuevoDctoVenta.setMinimumSize(new java.awt.Dimension(600, 600));

        jPanel5.setBackground(new java.awt.Color(153, 204, 255));

        lblCodigoDctoVenta.setText("Codigo Dcto Venta Total:");

        lblValorDctoVenta.setText("Ingrese Valor Descuento:");
        lblValorDctoVenta.setToolTipText("");

        lblFechaCreacionDctoVenta.setText("Fecha de Creación:");

        lblUltimoDctoVenta.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblUltimoDctoVenta.setText(".........");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setText("Ingresar Datos de Descuento para Venta");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Ultimo Codigo Registrado:");

        lblEjemplo.setText("en procentaje: (Ejemplo 10)");

        txtCodDctoVenta.setBackground(new java.awt.Color(255, 255, 204));
        txtCodDctoVenta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCodDctoVenta.setForeground(new java.awt.Color(0, 0, 255));

        btnRegistrarDctoVenta.setText("Registrar");
        btnRegistrarDctoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarDctoVentaActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(btnRegistrarDctoVenta)
                        .addGap(104, 104, 104)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblEjemplo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblValorDctoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCodigoDctoVenta))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodDctoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtValorDctoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addComponent(lblFechaCreacionDctoVenta)
                                .addGap(18, 18, 18)
                                .addComponent(dateChFechaDctoVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(lblUltimoDctoVenta)))
                .addContainerGap(121, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel11)
                .addGap(33, 33, 33)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUltimoDctoVenta))
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoDctoVenta)
                    .addComponent(txtCodDctoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorDctoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValorDctoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEjemplo)
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFechaCreacionDctoVenta)
                    .addComponent(dateChFechaDctoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarDctoVenta)
                    .addComponent(btnSalir))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout frmNuevoDctoVentaLayout = new javax.swing.GroupLayout(frmNuevoDctoVenta.getContentPane());
        frmNuevoDctoVenta.getContentPane().setLayout(frmNuevoDctoVentaLayout);
        frmNuevoDctoVentaLayout.setHorizontalGroup(
            frmNuevoDctoVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        frmNuevoDctoVentaLayout.setVerticalGroup(
            frmNuevoDctoVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        frmVenta.setTitle("REGISTRAR VENTA");
        frmVenta.setMinimumSize(new java.awt.Dimension(800, 1000));

        jPanel6.setBackground(new java.awt.Color(153, 204, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(800, 900));

        lblUltimoCP.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblUltimoCP.setText(".........");

        lblNumCP.setText("Numero Comprobante:");

        lblCodUser.setText("Usuario");

        lblFechaCP.setText("Fecha:");

        lblDniClie.setText("Ingrese DNI Cliente:");

        lblNomProd.setText("Ingrese Nombre Producto:");

        lblCant.setText("Cantidad:");

        lblTotal.setText("TOTAL VENTA (S/.)");

        lblDescto.setText("Asignar Porcentaje Descuento:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel15.setText("Registrar Venta");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Ultimo Comprobante Generado:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Productos a Vender");

        txtNumCP.setBackground(new java.awt.Color(255, 255, 204));
        txtNumCP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtNumCP.setForeground(new java.awt.Color(0, 0, 255));

        txtCodigoUser.setBackground(new java.awt.Color(255, 255, 204));

        txtDNI.setToolTipText("");

        txtNombProducto.setToolTipText("");

        txtCantidad.setToolTipText("");

        txtTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtTotal.setToolTipText("");
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        btnBuscarCliente.setText("Buscar Cliente");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        btnNuevoCliente.setText("Nuevo Cliente");
        btnNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoClienteActionPerformed(evt);
            }
        });

        btnBuscarProducto.setText("Buscar Producto");
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });

        btnAgregarPedido.setText("Agregar a Venta");
        btnAgregarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPedidoActionPerformed(evt);
            }
        });

        btnQuitarPedido.setText("Quitar de la Venta");
        btnQuitarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarPedidoActionPerformed(evt);
            }
        });

        btnEfectuar.setText("EfectuarVenta");
        btnEfectuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEfectuarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        cmbDcto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0" }));
        cmbDcto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDctoActionPerformed(evt);
            }
        });

        tblClienteEncontrado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "DNI Cliente", "Nombre Cliente", "Apellido Cliente"
            }
        ));
        jScrollPane2.setViewportView(tblClienteEncontrado);

        tblProductoEncontrado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cod Producto", "Nombre Producto", "Precio", "Saldo Actual"
            }
        ));
        jScrollPane3.setViewportView(tblProductoEncontrado);

        tblVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod Producto", "Nomre Producto", "Precio Venta", "Cantidad", "SubTotal"
            }
        ));
        tblVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane4.setViewportView(tblVenta);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(jLabel15)
                        .addGap(66, 66, 66)
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(lblUltimoCP))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                            .addComponent(lblDniClie)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtDNI)
                                                .addComponent(btnBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btnNuevoCliente))
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                            .addGap(1, 1, 1)
                                            .addComponent(lblNomProd)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtNombProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(jSeparator2)
                                .addComponent(jSeparator3)
                                .addComponent(jSeparator4)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                            .addComponent(lblCant)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(btnAgregarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jSeparator5))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(lblTotal)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(44, 44, 44)
                                        .addComponent(lblDescto)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cmbDcto, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnQuitarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 128, Short.MAX_VALUE)
                                    .addComponent(btnEfectuar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(71, 71, 71))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(jLabel17))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(lblNumCP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumCP, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(lblCodUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCodigoUser, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblFechaCP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dateChFechaReportVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(lblUltimoCP))
                .addGap(22, 22, 22)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNumCP)
                            .addComponent(txtNumCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFechaCP)
                            .addComponent(lblCodUser))
                        .addComponent(txtCodigoUser))
                    .addComponent(dateChFechaReportVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDniClie))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNomProd))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCant)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btnQuitarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEfectuar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDescto)
                            .addComponent(cmbDcto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTotal))))
                .addGap(105, 105, 105))
        );

        javax.swing.GroupLayout frmVentaLayout = new javax.swing.GroupLayout(frmVenta.getContentPane());
        frmVenta.getContentPane().setLayout(frmVentaLayout);
        frmVentaLayout.setHorizontalGroup(
            frmVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        frmVentaLayout.setVerticalGroup(
            frmVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 883, Short.MAX_VALUE)
        );

        frmReportarVenta.setMinimumSize(new java.awt.Dimension(600, 600));

        jPanel8.setBackground(new java.awt.Color(153, 204, 255));
        jPanel8.setMaximumSize(new java.awt.Dimension(32767, 25000));

        lblReportar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblReportar.setText("Reportar Venta");

        jLabel21.setText("Seleccione Fecha:");

        btnReportar.setText("Reportar");
        btnReportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportarActionPerformed(evt);
            }
        });

        btSalirReport.setText("Salir");
        btSalirReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirReportActionPerformed(evt);
            }
        });

        tblResultadoReporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Numero Comprobante", "Nombre Usuario", "DNI Cliente", "Monto Total"
            }
        ));
        jScrollPane5.setViewportView(tblResultadoReporte);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(lblReportar))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(btSalirReport, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(185, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnReportar)
                .addGap(185, 185, 185))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblReportar)
                .addGap(29, 29, 29)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel21)
                        .addComponent(btnReportar))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btSalirReport, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout frmReportarVentaLayout = new javax.swing.GroupLayout(frmReportarVenta.getContentPane());
        frmReportarVenta.getContentPane().setLayout(frmReportarVentaLayout);
        frmReportarVentaLayout.setHorizontalGroup(
            frmReportarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        frmReportarVentaLayout.setVerticalGroup(
            frmReportarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        frmBuscarUsuario.setTitle("BUSCAR USUARIO");
        frmBuscarUsuario.setMinimumSize(new java.awt.Dimension(450, 450));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setMinimumSize(new java.awt.Dimension(300, 300));

        lblNombreUserBuscar.setFont(new java.awt.Font("Red Hat Display", 1, 14)); // NOI18N
        lblNombreUserBuscar.setText("Ingrese Codigo Usuario a Buscar: ");

        jLabel22.setFont(new java.awt.Font("Red Hat Display", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(170, 0, 0));
        jLabel22.setText("BUSCAR USUARIO");

        txtNombUserBuscar.setFont(new java.awt.Font("Red Hat Display", 0, 14)); // NOI18N
        txtNombUserBuscar.setPreferredSize(new java.awt.Dimension(200, 200));
        txtNombUserBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombUserBuscarActionPerformed(evt);
            }
        });

        btnBuscarUser.setBackground(new java.awt.Color(170, 0, 0));
        btnBuscarUser.setFont(new java.awt.Font("Red Hat Display", 1, 14)); // NOI18N
        btnBuscarUser.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarUser.setText("BUSCAR");
        btnBuscarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarUserActionPerformed(evt);
            }
        });

        btnSalirBuscarU.setFont(new java.awt.Font("Red Hat Display", 0, 14)); // NOI18N
        btnSalirBuscarU.setText("Salir");
        btnSalirBuscarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirBuscarUActionPerformed(evt);
            }
        });

        tblResultadoUsuario.setFont(new java.awt.Font("Red Hat Display", 0, 14)); // NOI18N
        tblResultadoUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre Usuario", "Password Usuario"
            }
        ));
        JScrollPane3.setViewportView(tblResultadoUsuario);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombreUserBuscar)
                            .addComponent(txtNombUserBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarUser, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalirBuscarU, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNombreUserBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombUserBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscarUser)
                .addGap(31, 31, 31)
                .addComponent(JScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnSalirBuscarU)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout frmBuscarUsuarioLayout = new javax.swing.GroupLayout(frmBuscarUsuario.getContentPane());
        frmBuscarUsuario.getContentPane().setLayout(frmBuscarUsuarioLayout);
        frmBuscarUsuarioLayout.setHorizontalGroup(
            frmBuscarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        frmBuscarUsuarioLayout.setVerticalGroup(
            frmBuscarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA VENTAS");
        setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/example/ventas.jpg"))); // NOI18N

        bmInicio.setText("Inicio");

        opNuevoUser.setText("Nuevo Usuario");
        opNuevoUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opNuevoUserActionPerformed(evt);
            }
        });
        bmInicio.add(opNuevoUser);

        opBuscarUser.setText("Buscar Usuario");
        opBuscarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opBuscarUserActionPerformed(evt);
            }
        });
        bmInicio.add(opBuscarUser);
        bmInicio.add(jSeparator1);

        opSalir.setText("Salir (Exit)");
        opSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opSalirActionPerformed(evt);
            }
        });
        bmInicio.add(opSalir);

        jMenuBar1.add(bmInicio);

        bmGestionar.setText("Gestionar");

        opNuevoProducto.setText("Nuevo Producto");
        opNuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opNuevoProductoActionPerformed(evt);
            }
        });
        bmGestionar.add(opNuevoProducto);

        opNuevoDctoProd.setText("Nuevo Descuento Producto");
        opNuevoDctoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opNuevoDctoProdActionPerformed(evt);
            }
        });
        bmGestionar.add(opNuevoDctoProd);

        opNuevoDctoVent.setText("Nuevo Descuento Venta");
        opNuevoDctoVent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opNuevoDctoVentActionPerformed(evt);
            }
        });
        bmGestionar.add(opNuevoDctoVent);

        jMenuBar1.add(bmGestionar);

        bmTransaccion.setText("Transaccion");

        opRegistVenta.setText("Registrar Venta");
        opRegistVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opRegistVentaActionPerformed(evt);
            }
        });
        bmTransaccion.add(opRegistVenta);

        opReportVenta.setText("Reportar Montos Ventas ");
        opReportVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opReportVentaActionPerformed(evt);
            }
        });
        bmTransaccion.add(opReportVenta);

        jMenuBar1.add(bmTransaccion);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(280, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opNuevoUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opNuevoUserActionPerformed
        
        frmNuevoUser.setVisible(true);
        frmNuevoUser.setLocationRelativeTo(null);
        
        cConnection con = new cConnection();
        
        String query = "SELECT MAX(IdUser) AS IdUser FROM Usuario"; //selecciona el ultimo(MAX) registro de IdUser de la tabla
        
        try
        {
          Statement st = con.ObtenerConexion().createStatement();
          ResultSet rs = st.executeQuery(query);
             
          if(rs.next())
          {
            lblUltimoU.setText(rs.getString("IdUser"));
            int cod = Integer.parseInt(rs.getString("IdUser"));
            cod++;
            txtCodigoU.setText(String.valueOf(cod));
            txtCodigoU.setEditable(false);
            txtNombreU.requestFocus();
          }      
        }
        catch(Exception e)
        {
          JOptionPane.showMessageDialog(null,"No existe el Usuario","Mensaje",JOptionPane.CANCEL_OPTION);
        }
        
    }//GEN-LAST:event_opNuevoUserActionPerformed

    private void btnSalirUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirUActionPerformed
        
        frmNuevoUser.setVisible(false);
    }//GEN-LAST:event_btnSalirUActionPerformed

    private void btnRegistrarNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarNuevoUsuarioActionPerformed
       
        cConnection con = new cConnection();
        
        String codUser;
        String nombUser;
        String passUser;
       
        try{
              
            codUser = txtCodigoU.getText();
            nombUser = txtNombreU.getText();
            passUser = txtPasswordU.getText();
            
            Statement st = null;
            st = con.ObtenerConexion().createStatement();
            st.executeUpdate("INSERT INTO Usuario(IdUser,NombUser,PassUser)" + "values("+codUser+" , '"+nombUser+"' , '"+passUser+"')");
            
            JOptionPane.showMessageDialog(null, "Se registró usuario...");
            txtCodigoU.setText("");
            txtNombreU.setText("");
            txtPasswordU.setText("");
        }
        catch(Exception e){
                JOptionPane.showMessageDialog(null,"No se Pudo Agregar","Mensaje",JOptionPane.CANCEL_OPTION);
                txtCodigoU.setText("");
                txtNombreU.setText("");
                txtPasswordU.setText("");
        }
    }//GEN-LAST:event_btnRegistrarNuevoUsuarioActionPerformed

    private void opSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opSalirActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_opSalirActionPerformed

    private void btnRegistrarNuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarNuevoProductoActionPerformed
        
        cConnection con = new cConnection();
        
        String codProd;
        String nombProd;
        String precioProd;
        String saldoProd;
       
        try{
              
            codProd = txtCodigoP.getText();
            nombProd = txtNombreP.getText();
            precioProd = txtPrecio.getText();
            saldoProd = txtSaldo.getText();
            
            Statement st = null;
            st = con.ObtenerConexion().createStatement();
            st.executeUpdate("INSERT INTO Producto(CodProd,NombProd,Precio,Stock)" + "values("+codProd+" , '"+nombProd+"' , "+precioProd+" , "+saldoProd+")");
            
            JOptionPane.showMessageDialog(null, "Se registró producto...");
            
            txtCodigoP.setText("");
            txtNombreP.setText("");
            txtPrecio.setText("");
            txtSaldo.setText("");
        }
        catch(Exception e){
                JOptionPane.showMessageDialog(null,"No se Pudo Agregar","Mensaje",JOptionPane.CANCEL_OPTION);
                txtCodigoP.setText("");
                txtNombreP.setText("");
                txtPrecio.setText("");
                txtSaldo.setText("");
        }
    }//GEN-LAST:event_btnRegistrarNuevoProductoActionPerformed

    private void btnSalirPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirPActionPerformed
        
        frmNuevoProducto.setVisible(false);
    }//GEN-LAST:event_btnSalirPActionPerformed

    private void opNuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opNuevoProductoActionPerformed
        
        frmNuevoProducto.setVisible(true);
        frmNuevoProducto.setLocationRelativeTo(null);
        
        cConnection con = new cConnection();
        
        String queryP = "SELECT MAX(CodProd) AS CodProd FROM Producto"; //selecciona el ultimo(MAX) registro de la tabla
               
        int codP;
                
        try
        {
          Statement st = con.ObtenerConexion().createStatement();
          ResultSet rs = st.executeQuery(queryP);
             
          if(rs.next())
            { 
              lblUltimoP.setText(rs.getString("CodProd"));
              codP = Integer.parseInt(rs.getString("CodProd"));
              codP++;
              txtCodigoP.setText(String.valueOf(codP));
              txtCodigoP.setEditable(false);
              txtNombreP.requestFocus();
            } 
        }
        catch(Exception e)
        {
          JOptionPane.showMessageDialog(null,"No existe un Producto. Puede Crear nuevo","Mensaje",JOptionPane.INFORMATION_MESSAGE);
          
          codP=1;  // Para poner el primer codigo del producto
          lblUltimoP.setText("CERO");
          txtCodigoP.setText(String.valueOf(codP));
          txtCodigoP.setEditable(false);
          txtNombreP.requestFocus();
        }
    }//GEN-LAST:event_opNuevoProductoActionPerformed

    private void btnRegistrarNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarNuevoClienteActionPerformed
        
        cConnection con = new cConnection();
        
        String DniC;
        String nombC;
        String apeC;
        String direcC;
       
        try{
              
            DniC = txtDNIC.getText();
            nombC = txtNombreC.getText();
            apeC = txtApellidoC.getText();
            direcC = txtDireccionC.getText();
            
            Statement st = null;
            st = con.ObtenerConexion().createStatement();
            st.executeUpdate("INSERT INTO Cliente(DNICliente,NombreC,ApellidoC,Direccion)" + "values("+DniC+" , '"+nombC+"' , '"+apeC+"' , '"+direcC+"')");
            
            JOptionPane.showMessageDialog(null, "Se registró cliente...");
                        
            DefaultTableModel dtClienteEncontrado = new DefaultTableModel(); //Crear Modelo de Tabla tblClienteEncontrado
            tblClienteEncontrado.setModel(dtClienteEncontrado);  // Asignar el Modelo de Tabla para el tblClienteEncontrado (formulario)
 
            dtClienteEncontrado.addColumn("DNI Cliente"); //Asigna nombre a cada columna del Modelo de Tabla
            dtClienteEncontrado.addColumn("Nombres");
            dtClienteEncontrado.addColumn("Apellidos");
     
            String query = "SELECT * FROM Cliente WHERE DNICliente = "+DniC+"";
                        
            PreparedStatement pstm = con.ObtenerConexion().prepareStatement(query);
            ResultSet rs = pstm.executeQuery();         
            
            while(rs.next()){            
                dtClienteEncontrado.addRow(new Object[] {rs.getString("DNICliente"),rs.getString("NombreC"),rs.getString("ApellidoC")}); //Extrae del rs y lo añade al Modelo de Tabla
            }
            rs.close();
            
            txtDNIC.setText("");
            txtNombreC.setText("");
            txtApellidoC.setText("");
            txtDireccionC.setText("");
        }
        catch(Exception e){
                JOptionPane.showMessageDialog(null,"No se Pudo Agregar","Mensaje",JOptionPane.CANCEL_OPTION);
                txtDNIC.setText("");
                txtNombreC.setText("");
                txtApellidoC.setText("");
                txtDireccionC.setText("");
        }
    }//GEN-LAST:event_btnRegistrarNuevoClienteActionPerformed

    private void btnSalirCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirCActionPerformed
        
        frmNuevoCliente.setVisible(false);
    }//GEN-LAST:event_btnSalirCActionPerformed

    private void opNuevoDctoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opNuevoDctoProdActionPerformed
       
        frmNuevoDctoProducto.setVisible(true);
        frmNuevoDctoProducto.setLocationRelativeTo(null);
 
        dateChFechaDctoProducto.setCalendar(calend);  // Poner la fecha Actual en el JDateChooser
                
    }//GEN-LAST:event_opNuevoDctoProdActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed

        dni = txtDNI.getText();;
        
        cConnection con = new cConnection();
        
        try{
            DefaultTableModel dtReporteCliente = new DefaultTableModel();
            tblClienteEncontrado.setModel(dtReporteCliente);

            dtReporteCliente.addColumn("DNI Cliente");
            dtReporteCliente.addColumn("Nombre");
            dtReporteCliente.addColumn("Apellido");
            
            String query = "SELECT * FROM Cliente where DNICliente = "+dni+"";
            
            PreparedStatement pstm = con.ObtenerConexion().prepareStatement(query);
            ResultSet rs = pstm.executeQuery();
            
            while(rs.next())
            {
                dtReporteCliente.addRow(new Object[] {rs.getString("DNICliente"),rs.getString("NombreC"),rs.getString("ApellidoC")});
            }
            rs.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"No existe Cliente. Puede Crear Nuevo.","Mensaje",JOptionPane.CANCEL_OPTION);
        }
        
        txtDNIC.setText(dni); //Enviar DNI al TextField del Formulario NUEVOCLIENTE
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoClienteActionPerformed
        
        frmNuevoCliente.setLocationRelativeTo(null);  //CENTRAR VENTANA NUEVO CLIENTE
        frmNuevoCliente.setVisible(true);     
    }//GEN-LAST:event_btnNuevoClienteActionPerformed

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed

        String nombProd= txtNombProducto.getText();
        
        cConnection con = new cConnection();       

        try
        {
            DefaultTableModel dtResultadoProducto = new DefaultTableModel(); // Crea un Modelo de Tabla
            tblProductoEncontrado.setModel(dtResultadoProducto);  // Asigna el Model ode Tabla al tbProductoEncontrado

            dtResultadoProducto.addColumn("Codigo");
            dtResultadoProducto.addColumn("Nombre Producto");
            dtResultadoProducto.addColumn("Precio Venta");
            dtResultadoProducto.addColumn("Stock");

            String query = "SELECT * FROM Producto WHERE NombProd LIKE '"+nombProd+"%'";
                        
            Statement st = con.ObtenerConexion().createStatement();
            ResultSet rs = st.executeQuery(query);

            while(rs.next())
            {
                dtResultadoProducto.addRow(new Object[] {rs.getString("CodProd"),rs.getString("NombProd"),rs.getString("Precio"),rs.getString("Stock")});
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"No existe el Producto","Mensaje",JOptionPane.CANCEL_OPTION);
        }
    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    private void btnAgregarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPedidoActionPerformed

        cConnection con = new cConnection();
        
        String NuevoStock;
        
        int filaSeleccionada = tblProductoEncontrado.getSelectedRow();

        try{
            if (filaSeleccionada == -1) //para validar que se seleccione fila
                JOptionPane.showMessageDialog(null, "Debe Seleccionar Producto");
            else
                if(txtCantidad.getText()=="")
                    JOptionPane.showMessageDialog(null, "Debe Ingresar Cantidad");
                else
                    {   //Obtener Datos del Jtable de Producto Encontrado
                        DefaultTableModel dtReporteProd = (DefaultTableModel)tblProductoEncontrado.getModel(); // Crea un Modelo de Tabla y asigna a un jTable

                        String cod = tblProductoEncontrado.getValueAt(filaSeleccionada, 0).toString();
                        String nombProd  = tblProductoEncontrado.getValueAt(filaSeleccionada, 1).toString();
                        double prec  = Double.parseDouble(tblProductoEncontrado.getValueAt(filaSeleccionada, 2).toString());
                        int CantStock = Integer.parseInt(tblProductoEncontrado.getValueAt(filaSeleccionada, 3).toString());
                        int cantPedido   = Integer.parseInt(txtCantidad.getText());

                        //Calcular Importe de fila Sub Total
                        Double subTotal = prec * cantPedido;
                        String ImporteFila = String.valueOf(subTotal);

                        //Pasarlo al jtable de Pedido para Efecturar Venta
                        DefaultTableModel dtPedidoVenta = (DefaultTableModel)tblVenta.getModel();  // Crea un Modelo de Tabla y asigna a un jTable

                        dtPedidoVenta.addRow(new Object[]{cod,nombProd,prec,cantPedido,ImporteFila});
                       
                        sumPago = sumPago + subTotal;
                        
                        TotalPago = String.valueOf(sumPago);

                        txtTotal.setText(TotalPago);
                        txtCantidad.setText("");
                        txtNombProducto.setText("");

                        //Descontar Saldo del tbProductoEncontrado
                        int NuevoSaldo =  CantStock - cantPedido; 
                        tblProductoEncontrado.setValueAt(NuevoSaldo, 0, 3);

                        //Actualizar Stock de la Tabla Producto (Base de Datos)
                        NuevoStock = String.valueOf(NuevoSaldo);

                        String queryAcutaliza = "UPDATE Producto SET Stock="+NuevoStock+" WHERE CodProd ="+cod+"";

                        Statement st;
                        st = con.ObtenerConexion().createStatement();
                        st.executeUpdate(queryAcutaliza);
                    }
        }
        catch(Exception e){

        }

    }//GEN-LAST:event_btnAgregarPedidoActionPerformed

    private void btnQuitarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarPedidoActionPerformed

        cConnection con = new cConnection();
        
        int SaldoActual = 0;
        int NuevoSaldo;
        String NuevoStock;
        
        int filaSeleccionada  = tblVenta.getSelectedRow();
        
        try{
            if (filaSeleccionada == -1) //para validar que se seleccione fila
                JOptionPane.showMessageDialog(null, "Debe Seleccionar Producto");
            else
                {   //Obtener Datos del Jtable Venta
                    String cod    = tblVenta.getValueAt(filaSeleccionada, 0).toString();
                    String nomb   = tblVenta.getValueAt(filaSeleccionada, 1).toString();
                    double precio = Double.parseDouble(tblVenta.getValueAt(filaSeleccionada, 2).toString());
                    int canti = Integer.parseInt(tblVenta.getValueAt(filaSeleccionada, 3).toString());
                    String subT   = tblVenta.getValueAt(filaSeleccionada, 4).toString();

                    //Remover fila del tblVenta
                    DefaultTableModel modelo = (DefaultTableModel) tblVenta.getModel();
                    modelo.removeRow(filaSeleccionada);

                    //Descontar del pago total
                    sumPago = sumPago - Float.parseFloat(subT);
                    
                    TotalPago = String.valueOf(sumPago);
                    txtTotal.setText(TotalPago);

                    //Buscar Saldo de la TABLA Producto, para Regresar cantidad al Saldo
                    String queryBusca = "SELECT Stock FROM Producto WHERE CodProd = "+cod+"";

                    PreparedStatement pstm = con.ObtenerConexion().prepareStatement(queryBusca);
                    ResultSet rs = pstm.executeQuery();

                    while(rs.next())
                    {
                        SaldoActual = Integer.parseInt(rs.getString("Saldo"));

                    }
                    rs.close();

                    // Actualizar Stock de la Tabla Producto (Base de Datos)
                    NuevoSaldo = SaldoActual + canti;
                    NuevoStock = String.valueOf(NuevoSaldo);

                    String queryAcutaliza = "UPDATE Producto SET Saldo="+NuevoStock+" WHERE CodProd ="+cod+"";

                    Statement st;
                    st = con.ObtenerConexion().createStatement();
                    st.executeUpdate(queryAcutaliza);
                }
            }
        catch(Exception e){

        }

    }//GEN-LAST:event_btnQuitarPedidoActionPerformed

    private void btnEfectuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEfectuarActionPerformed

        double MBruto, MDcto;
        String FechaVenta;
        String mb;
        String md;
        String codP;
        int SaldoActual = 0;
        int NuevoSaldo;
        String NuevoStock;
        String cantV;
                
        for(int i = 0;i<tblVenta.getRowCount();i++)
        {
            try{
                    cConnection con = new cConnection();

                    ItemCmbDcto = String.valueOf(cmbDcto.getSelectedItem());
                    int porcent = Integer.parseInt(ItemCmbDcto);
                     
                    MBruto = sumPago;
                    MDcto = (MBruto*porcent)/100; 

                    TotalPago = String.valueOf(MBruto - MDcto);
                    
                    mb = String.valueOf(MBruto);
                    md = String.valueOf(MDcto);

                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); //Primero dar formato para fecha
                    FechaVenta = sdf.format(dateChFechaReportVenta.getDate());
                    
                    codP = tblVenta.getValueAt(i, 0).toString();
                    String NomP = tblVenta.getValueAt(i, 1).toString();
                    String precioP = tblVenta.getValueAt(i, 2).toString();
                    cantV = tblVenta.getValueAt(i, 3).toString();
                    String sbtotal = tblVenta.getValueAt(i, 4).toString();
                    
                    // Registrar en Cabecera Comprobante
                    Statement stCab = null;
                    stCab = con.ObtenerConexion().createStatement();
                    stCab.executeUpdate("INSERT INTO CabecDocVenta(NumDocVenta,NomUsuario,DNICli,MontoBruto,MontoDcto,MontoTotal,FechaVenta)" + "values("+NumCP+",'"+DatoUsuario+"',"+dni+","+mb+","+md+","+TotalPago+",'"+FechaVenta+"')");
                   
                    // Registrar en Detalle Comprobante
                    Statement stDetalle = null;
                    stDetalle = con.ObtenerConexion().createStatement();
                    stDetalle.executeUpdate("INSERT INTO DetalleDocVenta(NumDocV,CodProduc,CantVend,SubTot)" + "values("+NumCP+" , "+codP+" , "+cantV+" , "+sbtotal+")");
                    
                    JOptionPane.showMessageDialog(null, "Se registro correctamente la venta...\n"+"El monto a pagar es:\n"+String.valueOf(TotalPago));
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,"No se Pudo Agregar","Mensaje",JOptionPane.CANCEL_OPTION);
                tblProductoEncontrado.removeAll();
                tblVenta.removeAll();
                tblClienteEncontrado.removeAll();
                txtDNI.setText("");
                txtTotal.setText("");
               try {
                //Regresa la cantidad a la tabla Producto
                cConnection con = new cConnection();
                
                codP = tblVenta.getValueAt(i, 0).toString();
                cantV = tblVenta.getValueAt(i, 3).toString();
                
                String queryBusca = "SELECT Saldo FROM Producto WHERE CodProd = "+codP+"";

                PreparedStatement pstm = con.ObtenerConexion().prepareStatement(queryBusca);
                ResultSet rs = pstm.executeQuery();

                
                    while(rs.next())
                    {
                        SaldoActual = Integer.parseInt(rs.getString("Saldo"));

                    }
                    rs.close();

                    // Actualizar Stock de la Tabla Producto (Base de Datos)
                    NuevoSaldo = SaldoActual + Integer.parseInt(cantV);
                    NuevoStock = String.valueOf(NuevoSaldo);

                    String queryAcutaliza = "UPDATE Producto SET Saldo="+NuevoStock+" WHERE CodProd ="+codP+"";

                    Statement st;
                    st = con.ObtenerConexion().createStatement();
                    st.executeUpdate(queryAcutaliza);
                } catch (SQLException ex) {
                    
                }
                    
            }

        }
        
        tblProductoEncontrado.removeAll();
        tblVenta.removeAll();
        tblClienteEncontrado.removeAll();
        txtDNI.setText("");
        txtTotal.setText("");

    }//GEN-LAST:event_btnEfectuarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        frmVenta.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtNombUserBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombUserBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombUserBuscarActionPerformed

    private void btnBuscarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarUserActionPerformed
        
        String codUser;
              
        cConnection con = new cConnection();
        
        try{            
            codUser = txtNombUserBuscar.getText();

            DefaultTableModel dtBuscarUsuario = new DefaultTableModel(); //Crear Modelo de Tabla dtBuscarUsuario
            tblResultadoUsuario.setModel(dtBuscarUsuario);  // Asignar el Modelo de Tabla para el tblResultadoUuario (formulario)
 
            dtBuscarUsuario.addColumn("Nombre"); //Asigna nom,be a cada columna del Modelo de Tabla
            dtBuscarUsuario.addColumn("Password");
     
            String query = "SELECT * FROM Usuario WHERE IdUser = "+codUser+"";
                        
            PreparedStatement pstm = con.ObtenerConexion().prepareStatement(query);
            ResultSet rs = pstm.executeQuery();         
            
            while(rs.next()){            
                dtBuscarUsuario.addRow(new Object[] {rs.getString("NombUser"),rs.getString("PassUSer")}); //Extrae del rs y lo añade al Modelo de Tabla
            }
            rs.close();
          }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"No existe Usuario. Puede Crear Nuevo.","Mensaje",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarUserActionPerformed

    private void opBuscarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opBuscarUserActionPerformed
        
        frmBuscarUsuario.setVisible(true);
        frmBuscarUsuario.setLocationRelativeTo(null);
    }//GEN-LAST:event_opBuscarUserActionPerformed

    private void opNuevoDctoVentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opNuevoDctoVentActionPerformed
        
        frmNuevoDctoVenta.setVisible(true);
        frmNuevoDctoVenta.setLocationRelativeTo(null);
    
        dateChFechaDctoVenta.setCalendar(calend); // Poner la fecha Actual en el JDateChooser
        
        cConnection con = new cConnection();
        
        String queryDV = "SELECT MAX(IdDctoVenta) AS IdDctoVenta FROM DctoVenta"; //selecciona el ultimo(MAX) registro de la tabla
               
        int codDV;
                
        try
        {
          Statement st = con.ObtenerConexion().createStatement();
          ResultSet rs = st.executeQuery(queryDV);
             
          if(rs.next())
            { 
              lblUltimoDctoVenta.setText(rs.getString("IdDctoVenta"));
              codDV = Integer.parseInt(rs.getString("IdDctoVenta"));
              codDV++;
              txtCodDctoVenta.setText(String.valueOf(codDV));
              txtCodDctoVenta.setEditable(false);
              txtValorDctoVenta.requestFocus();
            } 
        }
        catch(Exception e)
        {
          JOptionPane.showMessageDialog(null,"No existe un Descuento de Venta. Puede Crear nuevo.","Mensaje",JOptionPane.INFORMATION_MESSAGE);
          
          codDV=1;           // Para poner el promer codigo del producto
          lblUltimoDctoVenta.setText("CERO");
          txtCodDctoVenta.setText(String.valueOf(codDV));
          txtCodDctoVenta.setEditable(false);
          txtCodDctoVenta.requestFocus();
        }
    }//GEN-LAST:event_opNuevoDctoVentActionPerformed

    private void opRegistVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opRegistVentaActionPerformed
        
        int codCP;
        
        frmVenta.setVisible(true);
        frmVenta.setLocationRelativeTo(null);
    
        dateChFechaReportVenta.setCalendar(calend);  // Poner la fecha Actual en el JDateChooser
        
        txtCodigoUser.setText(DatoUsuario);  // Colcar en la caja de Texto, el valor del Inicio de Sesion
        txtCodigoUser.setEditable(false);
        
        cConnection con = new cConnection();
        
        String queryP = "SELECT MAX(NumDocVenta) AS NumDocVenta FROM CabecDocVenta"; //selecciona el ultimo(MAX) registro de la tabla
                
        try
        {
            Statement st = con.ObtenerConexion().createStatement();
            ResultSet rs = st.executeQuery(queryP);

            if(rs.next())
              { 
                lblUltimoCP.setText(rs.getString("NumDocVenta"));
                codCP = Integer.parseInt(rs.getString("NumDocVenta"));
                codCP++;
                NumCP = String.valueOf(codCP);
                txtNumCP.setText(String.valueOf(codCP));
                txtNumCP.setEditable(false);
                txtDNI.requestFocus();
              } 
        }
        catch(Exception e)
        {
          JOptionPane.showMessageDialog(null,"No existe un Comprobante de Pago. Puede Crear nuevo","Mensaje",JOptionPane.INFORMATION_MESSAGE);
          
          lblUltimoCP.setText("CERO");
          codCP=1;           // Para poner el primer codigo del producto
          NumCP = String.valueOf(codCP);
          txtNumCP.setText(String.valueOf(codCP));
          txtNumCP.setEditable(false);
          txtDNI.requestFocus();
        }
        
    }//GEN-LAST:event_opRegistVentaActionPerformed

    private void opReportVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opReportVentaActionPerformed
        
        frmReportarVenta.setVisible(true);
        frmReportarVenta.setLocationRelativeTo(null);

        dateChFechaReportVenta.setCalendar(calend); // Poner la fecha Actual en el JDateChooser
    }//GEN-LAST:event_opReportVentaActionPerformed

    private void btnRegistrarDctoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarDctoProductoActionPerformed
        
        cConnection con = new cConnection();
        
        String codDP;
        String valorDP;
        String FechaDP; 
        String CodProduc;
        
        DefaultTableModel dtProductoDcto = new DefaultTableModel(); // Creal el Modelo de Tabla dtProductoDcto
        tbResulProducto.setModel(dtProductoDcto); // Asigna el Modelo de Tabla al JTable del Formulario para incicalizarlo
        
        DefaultTableModel dtDcto = new DefaultTableModel(); // Creal el Modelo de Tabla dtReportDcto
        tbReportDcto.setModel(dtDcto); // Asigna el Modelo de Tabla al JTable del Formulario para incicalizarlo
      
        try{   
            codDP = txtCodDctoProd.getText();
            valorDP = txtValorDcto.getText();
            CodProduc = txtCodProdu.getText();
             
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); //Primero dar formato para fecha
            FechaDP = sdf.format(dateChFechaDctoProducto.getDate());    
   
            Statement st = null;
            st = con.ObtenerConexion().createStatement();
            st.executeUpdate("INSERT INTO DctoProd(IdDctoProd,CodProduc,ValorDctoProd,FechaCreacionDctoProd)" + "values("+codDP+" , "+CodProduc+" , "+valorDP+" , '"+FechaDP+"')");
          
            JOptionPane.showMessageDialog(null, "Se registró Descuento de Producto.");
            
            txtCodDctoProd.setText("");
            txtValorDcto.setText("");
            txtCodProdu.setText("");
            
        }
        catch(Exception e){
                JOptionPane.showMessageDialog(null,"No se Pudo Agregar","Mensaje",JOptionPane.CANCEL_OPTION);
                txtCodDctoProd.setText("");
                txtValorDcto.setText("");
        }
    }//GEN-LAST:event_btnRegistrarDctoProductoActionPerformed

    private void btnSalirDctoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirDctoProdActionPerformed
        
        frmNuevoDctoProducto.setVisible(false);
    }//GEN-LAST:event_btnSalirDctoProdActionPerformed

    private void btnSalirBuscarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirBuscarUActionPerformed
       
        frmBuscarUsuario.setVisible(false);
    }//GEN-LAST:event_btnSalirBuscarUActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        
        frmNuevoDctoVenta.setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRegistrarDctoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarDctoVentaActionPerformed
       
        cConnection con = new cConnection();
        
        String codDV;
        String valorDV;
        String FechaDV;  
        
        try{   
            codDV = txtCodDctoVenta.getText();
            valorDV = txtValorDctoVenta.getText();

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); //Primero dar formato para fecha
            FechaDV = sdf.format(dateChFechaDctoVenta.getDate());

            
            Statement st = null;
            st = con.ObtenerConexion().createStatement();
            st.executeUpdate("INSERT INTO DctoVenta(IdDctoVenta,ValorDctoVenta,FechaCreacionDctoVenta)" + "values("+codDV+" , "+valorDV+" , '"+FechaDV+"')");
          
            JOptionPane.showMessageDialog(null, "Se registró Descuento de Venta...");
            
            txtCodDctoVenta.setText("");
            txtValorDctoVenta.setText("");
        }
        catch(Exception e){
                JOptionPane.showMessageDialog(null,"No se Pudo Agregar","Mensaje",JOptionPane.CANCEL_OPTION);
                txtCodDctoVenta.setText("");
                txtValorDctoVenta.setText("");
        }
    }//GEN-LAST:event_btnRegistrarDctoVentaActionPerformed

    private void btnBuscarProduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProduActionPerformed
        
        String codProd;
 
        cConnection con = new cConnection();

        try
        {
            codProd= txtCodProdu.getText();
            
            DefaultTableModel dtProductoDcto = new DefaultTableModel(); // Creal el Modelo de Tabla dtProductoDcto
            tbResulProducto.setModel(dtProductoDcto); // Asigna el Modelo de Tabla al JTable del Formulario

            dtProductoDcto.addColumn("Codigo");  //Asigna nombre a cada columna del Modelo de Tabla
            dtProductoDcto.addColumn("NombreProd");
            dtProductoDcto.addColumn("PrecioProd");
            dtProductoDcto.addColumn("SaldoProd");

            String queryP = "SELECT * from Producto WHERE CodProd = "+codProd+"";
            Statement stP = con.ObtenerConexion().createStatement();
            ResultSet rsP = stP.executeQuery(queryP);
            
            while(rsP.next())
            {  
                dtProductoDcto.addRow(new Object[] {rsP.getString("CodProd"),rsP.getString("NombProd"),rsP.getString("Precio"),rsP.getString("Stock")}); // extrae del rs y lo añade a una fila del Model ode Tabla
            }    
            
            DefaultTableModel dtDcto = new DefaultTableModel(); // Creal el Modelo de Tabla dtReportDcto
            tbReportDcto.setModel(dtDcto); // Asigna el Modelo de Tabla al JTable del Formulario

            dtDcto.addColumn("Codigo Dcto");  //Asigna nombre a cada columna del Modelo de Tabla
            dtDcto.addColumn("% Dcto");
            
            String queryDcP = "SELECT * from DctoProd WHERE CodProduc = "+codProd+"";
            Statement stDcP = con.ObtenerConexion().createStatement();
            ResultSet rsDcP = stDcP.executeQuery(queryDcP);
            
            String queryDP = "SELECT MAX(IdDctoProd) AS IdDctoProd FROM DctoProd"; //selecciona el ultimo(MAX) registro de la tabla

            int codDP;

            try
            {                         
               Statement stDP = con.ObtenerConexion().createStatement();
               ResultSet rsDP = stDP.executeQuery(queryDP);

               if(rsDP.next())
                { 
                    lblUltimoDcto.setText(rsDP.getString("IdDctoProd"));
                    codDP = Integer.parseInt(rsDP.getString("IdDctoProd"));
                    codDP++;
                    txtCodDctoProd.setText(String.valueOf(codDP));
                    txtCodDctoProd.setEditable(false);
                    txtValorDctoVenta.requestFocus();
                    
                    while(rsDcP.next())
                    {  
                        dtDcto.addRow(new Object[] {rsDcP.getString("IdDctoProd"),rsDcP.getString("ValorDctoProd")}); // extrae del rs y lo añade a una fila del Model ode Tabla
                    } 
                }    
            }
            catch(Exception e)
            {
              JOptionPane.showMessageDialog(null,"No existe un Descuento para este Producto. Puede Crear nuevo.","Mensaje",JOptionPane.INFORMATION_MESSAGE);

              codDP=1;           // Para poner el promer codigo del producto
              lblUltimoDcto.setText("CERO");
              txtCodDctoProd.setText(String.valueOf(codDP));
              txtCodDctoProd.setEditable(false);
              txtCodDctoProd.requestFocus();
             }
        }   
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"No existe el Producto","Mensaje",JOptionPane.CANCEL_OPTION);
        }
    }//GEN-LAST:event_btnBuscarProduActionPerformed

    private void btnReportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportarActionPerformed
                      
        cConnection con = new cConnection();
        
        String FechaReportVenta;
        
            
        try{            
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); //Primero dar formato para fecha
            FechaReportVenta = sdf.format(dateChFechaReportVenta.getDate());

            DefaultTableModel dtReportVenta = new DefaultTableModel(); //Crear Modelo de Tabla dtBuscarUsuario
            tblResultadoReporte.setModel(dtReportVenta);  // Asignar el Modelo de Tabla para el tblResultadoUuario (formulario)
 
            dtReportVenta.addColumn("Num Comprob"); //Asigna nom,be a cada columna del Modelo de Tabla
            dtReportVenta.addColumn("Usuario");
            dtReportVenta.addColumn("Dni Cliente");
            dtReportVenta.addColumn("Monto Total");
     
            String query = "SELECT * FROM CabecDocVenta WHERE FechaVenta = '"+FechaReportVenta+"'";
                        
            PreparedStatement pstm = con.ObtenerConexion().prepareStatement(query);
            ResultSet rsRV = pstm.executeQuery();         
 
            while(rsRV.next())
            { //Extrae del rs y lo añade al Modelo de Tabla     
              dtReportVenta.addRow(new Object[] {rsRV.getString("NumDocVenta"),rsRV.getString("NomUsuario"),rsRV.getString("DNICli"), rsRV.getString("MontoTotal") }); 
            }  
            rsRV.close();
        }        
        catch(SQLException e){
  
            JOptionPane.showMessageDialog(null,"No existe Comprobante de Venta en esta Fecha.","Mensaje",JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_btnReportarActionPerformed

    private void btSalirReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirReportActionPerformed
        
        frmReportarVenta.setVisible(false);
    }//GEN-LAST:event_btSalirReportActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void cmbDctoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDctoActionPerformed
       
       
    }//GEN-LAST:event_cmbDctoActionPerformed
  
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
            java.util.logging.Logger.getLogger(FormVentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormVentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormVentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormVentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormVentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane JScrollPane3;
    private javax.swing.JMenu bmGestionar;
    private javax.swing.JMenu bmInicio;
    private javax.swing.JMenu bmTransaccion;
    private javax.swing.JButton btSalirReport;
    private javax.swing.JButton btnAgregarPedido;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarProdu;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnBuscarUser;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEfectuar;
    private javax.swing.JButton btnNuevoCliente;
    private javax.swing.JButton btnQuitarPedido;
    private javax.swing.JButton btnRegistrarDctoProducto;
    private javax.swing.JButton btnRegistrarDctoVenta;
    private javax.swing.JButton btnRegistrarNuevoCliente;
    private javax.swing.JButton btnRegistrarNuevoProducto;
    private javax.swing.JButton btnRegistrarNuevoUsuario;
    private javax.swing.JButton btnReportar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSalirBuscarU;
    private javax.swing.JButton btnSalirC;
    private javax.swing.JButton btnSalirDctoProd;
    private javax.swing.JButton btnSalirP;
    private javax.swing.JButton btnSalirU;
    public javax.swing.JComboBox cmbDcto;
    private com.toedter.calendar.JDateChooser dateChFechaDctoProducto;
    private com.toedter.calendar.JDateChooser dateChFechaDctoVenta;
    private com.toedter.calendar.JDateChooser dateChFechaReportVenta;
    private javax.swing.JFrame frmBuscarUsuario;
    private javax.swing.JFrame frmNuevoCliente;
    private javax.swing.JFrame frmNuevoDctoProducto;
    private javax.swing.JFrame frmNuevoDctoVenta;
    private javax.swing.JFrame frmNuevoProducto;
    private javax.swing.JFrame frmNuevoUser;
    private javax.swing.JFrame frmReportarVenta;
    private javax.swing.JFrame frmVenta;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblApellidoC;
    private javax.swing.JLabel lblCant;
    private javax.swing.JLabel lblCodProdu;
    private javax.swing.JLabel lblCodUser;
    private javax.swing.JLabel lblCodigoDctoProdu;
    private javax.swing.JLabel lblCodigoDctoVenta;
    private javax.swing.JLabel lblCodigoP;
    private javax.swing.JLabel lblCodigoU;
    private javax.swing.JLabel lblDNIC;
    private javax.swing.JLabel lblDescto;
    private javax.swing.JLabel lblDireccionC;
    private javax.swing.JLabel lblDniClie;
    private javax.swing.JLabel lblEjemplo;
    private javax.swing.JLabel lblFechaCP;
    private javax.swing.JLabel lblFechaCreacionDcto;
    private javax.swing.JLabel lblFechaCreacionDctoVenta;
    private javax.swing.JLabel lblNomProd;
    private javax.swing.JLabel lblNombreC;
    private javax.swing.JLabel lblNombreP;
    private javax.swing.JLabel lblNombreU;
    private javax.swing.JLabel lblNombreUserBuscar;
    private javax.swing.JLabel lblNumCP;
    private javax.swing.JLabel lblPaswordU;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblReportar;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblUltimoCP;
    private javax.swing.JLabel lblUltimoDcto;
    private javax.swing.JLabel lblUltimoDctoVenta;
    private javax.swing.JLabel lblUltimoP;
    private javax.swing.JLabel lblUltimoU;
    private javax.swing.JLabel lblValorDcto;
    private javax.swing.JLabel lblValorDctoVenta;
    private javax.swing.JMenuItem opBuscarUser;
    private javax.swing.JMenuItem opNuevoDctoProd;
    private javax.swing.JMenuItem opNuevoDctoVent;
    private javax.swing.JMenuItem opNuevoProducto;
    private javax.swing.JMenuItem opNuevoUser;
    private javax.swing.JMenuItem opRegistVenta;
    private javax.swing.JMenuItem opReportVenta;
    private javax.swing.JMenuItem opSalir;
    private javax.swing.JTable tbReportDcto;
    public javax.swing.JTable tbResulProducto;
    public javax.swing.JTable tblClienteEncontrado;
    private javax.swing.JTable tblProductoEncontrado;
    private javax.swing.JTable tblResultadoReporte;
    private javax.swing.JTable tblResultadoUsuario;
    private javax.swing.JTable tblVenta;
    private javax.swing.JTextField txtApellidoC;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodDctoProd;
    private javax.swing.JTextField txtCodDctoVenta;
    public javax.swing.JTextField txtCodProdu;
    private javax.swing.JTextField txtCodigoP;
    private javax.swing.JTextField txtCodigoU;
    public javax.swing.JTextField txtCodigoUser;
    public javax.swing.JTextField txtDNI;
    public javax.swing.JTextField txtDNIC;
    private javax.swing.JTextField txtDireccionC;
    private javax.swing.JTextField txtNombProducto;
    private javax.swing.JTextField txtNombUserBuscar;
    private javax.swing.JTextField txtNombreC;
    private javax.swing.JTextField txtNombreP;
    private javax.swing.JTextField txtNombreU;
    public javax.swing.JTextField txtNumCP;
    private javax.swing.JTextField txtPasswordU;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtSaldo;
    public javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtValorDcto;
    private javax.swing.JTextField txtValorDctoVenta;
    // End of variables declaration//GEN-END:variables
}
