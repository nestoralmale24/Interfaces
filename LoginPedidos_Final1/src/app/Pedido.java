package app;

import static app.variables.idc;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import static app.variables.ide;
import static app.variables.pass;
import static app.variables.usuario;
import conexion.conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import javax.swing.table.DefaultTableModel;

public class Pedido extends javax.swing.JFrame {
    
    conexion con1 = new conexion();
    Connection conet;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    private int idPedido;
    
    //Llamo el id, nombre del cliente y la fecha de la clase clientes y me las guardo
    public void aniadirCampos(int ide, String NombreCliente, String Fecha){
        txtCliente.setText(NombreCliente);
        txtFecha.setText(Fecha);
    }
        
    //Inicializco el nombre del cliente y le fecha, centro la pantalla y llamo al metodo para guardar el nombre del usuario y la fecha
    public Pedido() {
        initComponents();
        this.txtCliente = txtCliente;
        this.txtFecha = txtFecha;
        setLocationRelativeTo(null);
        llenarComboBoxProductos();
        
        
        //Este metodo esta mayoritariamente hecho con chatGPT, es un evento de escucha, es decir, cuando cambia la seleccion de mi desplegable de productos me detecta el precio y me lo cambia
        txtProducto.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    actualizarPrecioProducto();
                }
            }
        });
        
        //Este igual que el anterior esta hecho mayoritariamente con chatGPT, me añade tres eventos diferentes al JTextField de txtUnidades, insertar, borrar y cambiar
    txtUnidades.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                actualizarPrecioProducto();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                actualizarPrecioProducto();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                actualizarPrecioProducto();
            }
        });
    // Consultar al abrir la ventana y mostrar los resultados
    SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            Consultar();
        }
    });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtUnidades = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        btnAnadir = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        txtProducto = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtPrecioTotal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PEDIDO CLIENTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rockwell Extra Bold", 1, 24), new java.awt.Color(0, 0, 204))); // NOI18N
        jPanel1.setToolTipText("");

        jLabel1.setText("CLIENTE");

        jLabel2.setText("FECHA");

        txtCliente.setEditable(false);
        txtCliente.setEnabled(false);

        txtFecha.setEditable(false);
        txtFecha.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                    .addComponent(txtFecha))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LINEA DE PEDIDO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rockwell Extra Bold", 1, 24), new java.awt.Color(0, 0, 204))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(0, 0, 204));

        jLabel3.setText("PRODUCTO");

        jLabel4.setText("UNIDADES");

        jLabel6.setText("PVP / UNIDAD");

        txtPrecio.setEditable(false);
        txtPrecio.setEnabled(false);

        btnAnadir.setText("AÑADIR");
        btnAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirActionPerformed(evt);
            }
        });

        btnBorrar.setText("BORRAR");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        txtProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductoActionPerformed(evt);
            }
        });

        jLabel5.setText("PVP TOTAL");

        txtPrecioTotal.setEditable(false);
        txtPrecioTotal.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUnidades)
                    .addComponent(txtPrecio)
                    .addComponent(txtProducto, 0, 223, Short.MAX_VALUE)
                    .addComponent(txtPrecioTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAnadir, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnadir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel6))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Linea", "Producto", "Unidades", "pvp / unidad", "Pvp total", "Cliente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla);
        if (Tabla.getColumnModel().getColumnCount() > 0) {
            Tabla.getColumnModel().getColumn(0).setResizable(false);
            Tabla.getColumnModel().getColumn(1).setResizable(false);
            Tabla.getColumnModel().getColumn(3).setResizable(false);
            Tabla.getColumnModel().getColumn(4).setResizable(false);
            Tabla.getColumnModel().getColumn(5).setResizable(false);
        }

        btnEliminar.setText("ELIMINAR LINEA");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setText("MODIFICAR LINEA");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_logout_black_24dp.png"))); // NOI18N
        jMenu1.setText("Salir");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_home_black_24dp.png"))); // NOI18N
        jMenu2.setText("Menu");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(btnEliminar)
                                .addGap(63, 63, 63)
                                .addComponent(btnModificar))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnModificar))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //boton de menu para ir al menu
    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        menu men = new menu();
        men.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu2MouseClicked

    //boton de salir para cerrar sesion
    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        Login principal = new Login();
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void txtProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductoActionPerformed
        //NADA
    }//GEN-LAST:event_txtProductoActionPerformed

    //boton de borrar me borra todo el contenido
    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        txtProducto.setSelectedItem("");
        txtUnidades.setText("");
        txtPrecio.setText("");
        txtPrecioTotal.setText("");
    }//GEN-LAST:event_btnBorrarActionPerformed

    //boton de añadir, llama a los metodos necesarios
    private void btnAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirActionPerformed
        actualizarPrecioProducto();
        Agregar();
        Consultar();
    }//GEN-LAST:event_btnAnadirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Eliminar();
        Consultar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        Modificar();
        Consultar();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        int fila = Tabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "No has seleccionado ninguna fila.");
        } else {
            // Corregir el tipo de dato en estas líneas
            idc = Integer.parseInt(Tabla.getValueAt(fila, 0).toString());
            String producto = (String) Tabla.getValueAt(fila, 1);
            String unidades = (String) Tabla.getValueAt(fila, 2);
            String pvpUnidad = Tabla.getValueAt(fila, 3).toString();
            String pvpTotal = Tabla.getValueAt(fila, 4).toString();

            txtProducto.setSelectedItem(producto);
            txtUnidades.setText(unidades);
            txtPrecio.setText(pvpUnidad);
            txtPrecioTotal.setText(pvpTotal);
        }
    }//GEN-LAST:event_TablaMouseClicked
    
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
            java.util.logging.Logger.getLogger(Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pedido().setVisible(true);
            }
        });
    }
    
    
    void Modificar() {
        String Producto = txtProducto.getSelectedItem().toString();
        String Unidades = txtUnidades.getText();
        String PvpUnidad = txtPrecio.getText();
        String PvpTotal = txtPrecioTotal.getText();

        try {
            if (Producto.equals("") || PvpUnidad.equals("") || PvpTotal.equals("")) {
                JOptionPane.showMessageDialog(null, "Faltan datos");
                limpiarTabla();
            } else {
                String sql = "UPDATE DetallesPedido SET Unidades = '" + Unidades + "' WHERE IDPedido = " + idc;
                conet = con1.conectar(usuario, pass);
                st = conet.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Unidades actualizadas");
                limpiarTabla();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

              
    //metodo agregar
    void Agregar() {
        try {
            conet = con1.conectar(usuario, pass);
            st = conet.createStatement();
            String insertCabeceraPedido = "INSERT INTO CabeceraPedido(IDCliente, FechaPedido) VALUES('" + ide + "', '" + txtFecha.getText() + "')";
            st.executeUpdate(insertCabeceraPedido);

            String obtenerIDPedido = "SELECT MAX(IDPedido) AS MaxID FROM CabeceraPedido ";
            ResultSet rs = st.executeQuery(obtenerIDPedido);

            if (rs.next()) {
                idPedido = rs.getInt("MaxID");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        String Producto = txtProducto.getSelectedItem().toString();
        String Unidades = txtUnidades.getText();
        String Precio = txtPrecio.getText();
        String PrecioTotal = txtPrecioTotal.getText();

        try {
            if (Producto.equals("") || Unidades.equals("") || Precio.equals("")) {
                JOptionPane.showMessageDialog(null, "Faltan datos.");
            } else {
                int IDProducto = obtenerIDProducto(Producto);
                String sql = "INSERT INTO DetallesPedido(IDPedido, IDProducto, Unidades, PvpUnidad, PvpTotal) " +
                        "VALUES('" + idPedido + "', '" + IDProducto + "', '" + Unidades + "', '" + Precio + "', '" + PrecioTotal + "' )";

                conet = con1.conectar(usuario, pass);
                st = conet.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Nuevo pedido agregado");
                limpiarTabla();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    void Eliminar() {
        int fila = Tabla.getSelectedRow();
        try {
            if (fila < 0) {
                JOptionPane.showMessageDialog(null, "Seleccionar una fila.");
            } else {
                int idPedido = Integer.parseInt(Tabla.getValueAt(fila, 0).toString());
                String sqlCabecera = "DELETE FROM CabeceraPedido WHERE IDPedido=" + idPedido;
                String sqlDetalle = "DELETE FROM DetallesPedido WHERE IDPedido=" + idPedido;

                conet = con1.conectar(usuario, pass);
                st = conet.createStatement();

                st.executeUpdate(sqlDetalle);

                st.executeUpdate(sqlCabecera);

                JOptionPane.showMessageDialog(null, "Linea eliminada");
                limpiarTabla();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    private void actualizarPrecioProducto() {
        String productoSeleccionado = txtProducto.getSelectedItem().toString();
        int idProducto = obtenerIDProducto(productoSeleccionado);

        if (idProducto != -1) {
            try {
                // OBTENGO EL PRECIO DE LA BASE DE DATOS
                String sql = "SELECT Precio FROM Productos WHERE ID = " + idProducto;
                conet = con1.conectar(usuario, pass);
                st = conet.createStatement();
                ResultSet resultSet = st.executeQuery(sql);

                if (resultSet.next()) {
                    // MUESTRO EL PRECIO RESCATADO EN EL CAMPO txtPrecio
                    double precioUnitario = resultSet.getDouble("Precio");
                    txtPrecio.setText(String.valueOf(precioUnitario));

                    // MULTIPLICO EL PRECIO POR LA CANTIDAD QUE YO PONGA
                    if (!txtUnidades.getText().isEmpty()) {
                        int unidades = Integer.parseInt(txtUnidades.getText());
                        double precioTotal = precioUnitario * unidades;
                        // Mostrar el precio total en el campo txtPrecio
                        txtPrecioTotal.setText(String.valueOf(precioTotal));
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

     
     int obtenerIDProducto(String descripcionProducto) {
        try {
            ResultSet resultSet = obtenerProductos();
            while (resultSet.next()) {
                if (resultSet.getString("Descripcion").equals(descripcionProducto)) {
                    return resultSet.getInt("ID");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }
     
    void limpiarTabla(){
        for(int i=0; i<Tabla.getRowCount();i++){
            modelo.removeRow(i);
            i=i-1;
        }
    }

    public ResultSet obtenerProductos() throws SQLException{
        String sql = "SELECT ID, Descripcion, Precio FROM Productos";
        conet = con1.conectar(usuario, pass);
        Statement statement = conet.createStatement(); 
        return statement.executeQuery(sql);
    }
    
    
    private void llenarComboBoxProductos() {
        try {
            ResultSet resultSet = obtenerProductos();
            while (resultSet.next()) {
                int IDProducto = resultSet.getInt("ID");
                String producto = resultSet.getString("Descripcion");
                txtProducto.addItem(producto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    void Consultar(){
    int idClienteSeleccionado = obtenerIDCliente(txtCliente.getText());

    if (idClienteSeleccionado != -1) {
        String sql = "SELECT c.IDPedido, c.FechaPedido, p.Descripcion AS NombreProducto, d.IDProducto, d.Unidades, d.PvpUnidad, d.PvpTotal, cl.Nombre AS NombreCliente " +
                     "FROM CabeceraPedido c " +
                     "JOIN DetallesPedido d ON c.IDPedido = d.IDPedido " +
                     "JOIN Productos p ON d.IDProducto = p.ID " +
                     "JOIN Clientes cl ON c.IDCliente = cl.ID " +
                     "WHERE c.IDCliente = " + idClienteSeleccionado + " " +
                     "ORDER BY c.IDPedido, d.IdLinea;";

        try {
            conet = con1.conectar(usuario, pass);
            st = conet.createStatement();
            rs = st.executeQuery(sql);
            Object[] Pedido = new Object[8];
            modelo = (DefaultTableModel) Tabla.getModel();

            while (rs.next()) {
                Pedido[0] = rs.getInt("IDPedido");
                Pedido[1] = rs.getString("NombreProducto");
                Pedido[2] = rs.getString("Unidades");
                Pedido[3] = rs.getString("PvpUnidad");
                Pedido[4] = rs.getString("PvpTotal");
                Pedido[5] = rs.getString("NombreCliente");
                modelo.addRow(Pedido);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    } else {
        JOptionPane.showMessageDialog(null, "Cliente no válido.");
    }
    }
    
    int obtenerIDCliente(String nombreCliente) {
        try {
            String sql = "SELECT ID FROM Clientes WHERE Nombre = '" + nombreCliente + "'";
            conet = con1.conectar(usuario, pass);
            st = conet.createStatement();
            ResultSet resultSet = st.executeQuery(sql);

            if (resultSet.next()) {
                return resultSet.getInt("ID");
            } else {
                return -1;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnAnadir;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPrecioTotal;
    private javax.swing.JComboBox<String> txtProducto;
    private javax.swing.JTextField txtUnidades;
    // End of variables declaration//GEN-END:variables
}