package app;

import static app.variables.idc;
import static app.variables.ide;
import static app.variables.pass;
import static app.variables.usuario;
import conexion.conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Clientes extends javax.swing.JFrame {

    conexion con1 = new conexion();
    Connection conet;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    private JTextField txtIDCliente;
    private JTextField txtCliente;
    private JTextField txtFecha;
    
    public Clientes() {
        initComponents();
        Consultar();
        setLocationRelativeTo(null);
        
        //SACAR LA PANTALLA CENTRADA
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnMOD = new javax.swing.JButton();
        btnADD = new javax.swing.JButton();
        btnCrearPedido = new javax.swing.JButton();
        btnDEL = new javax.swing.JButton();
        btnNEW1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        cerrar = new javax.swing.JMenu();
        menu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OPCIONES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rockwell Extra Bold", 1, 24), new java.awt.Color(0, 0, 204))); // NOI18N

        btnMOD.setBackground(new java.awt.Color(153, 153, 153));
        btnMOD.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnMOD.setText("MODIFICAR");
        btnMOD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMODActionPerformed(evt);
            }
        });

        btnADD.setBackground(new java.awt.Color(153, 153, 153));
        btnADD.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnADD.setText("AÑADIR");
        btnADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnADDActionPerformed(evt);
            }
        });

        btnCrearPedido.setBackground(new java.awt.Color(153, 153, 153));
        btnCrearPedido.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCrearPedido.setText("CREAR PEDIDO");
        btnCrearPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearPedidoActionPerformed(evt);
            }
        });

        btnDEL.setBackground(new java.awt.Color(153, 153, 153));
        btnDEL.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnDEL.setText("ELIMINAR");
        btnDEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDELActionPerformed(evt);
            }
        });

        btnNEW1.setBackground(new java.awt.Color(153, 153, 153));
        btnNEW1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnNEW1.setText("NUEVO");
        btnNEW1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNEW1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnADD, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnMOD, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnDEL, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnNEW1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCrearPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMOD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDEL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnADD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNEW1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS CLIENTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rockwell Extra Bold", 1, 24), new java.awt.Color(0, 0, 204))); // NOI18N

        jLabel1.setText("ID");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellidos");

        jLabel4.setText("Edad");

        txtID.setEditable(false);
        txtID.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtID)
                    .addComponent(txtNombre)
                    .addComponent(txtApellidos)
                    .addComponent(txtEdad, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Base de datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rockwell Extra Bold", 1, 24), new java.awt.Color(0, 0, 204))); // NOI18N

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Apellido", "Edad"
            }
        ));
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(286, 286, 286))
        );

        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_logout_black_24dp.png"))); // NOI18N
        cerrar.setText("Salir");
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarMouseClicked(evt);
            }
        });
        jMenuBar1.add(cerrar);

        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_home_black_24dp.png"))); // NOI18N
        menu.setText("Menu");
        menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMouseClicked(evt);
            }
        });
        jMenuBar1.add(menu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADDActionPerformed
        Agregar();
        Consultar();
        Nuevo();
    }//GEN-LAST:event_btnADDActionPerformed

    private void btnMODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMODActionPerformed
        Modificar();
        Consultar();
        Nuevo();
    }//GEN-LAST:event_btnMODActionPerformed

    private void btnDELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDELActionPerformed
        Eliminar();
        Consultar();
        Nuevo();
    }//GEN-LAST:event_btnDELActionPerformed

    private void btnCrearPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPedidoActionPerformed
        try {
            String IDClienteString = txtID.getText();
            ide = idc;
            String NombreCliente = txtNombre.getText();
            
            LocalDateTime fechaActual = LocalDateTime.now();
            
            DateTimeFormatter formatterFecha = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String fecha = fechaActual.format(formatterFecha);
            
            DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm:ss");
            String hora = fechaActual.format(formatterHora);
            
        
            String fechaYHora = fecha + " " + hora;
            
            Pedido pedidos = new Pedido();
            pedidos.aniadirCampos(ide, NombreCliente, fechaYHora);

            pedidos.setVisible(true);
            this.dispose();
        } catch (NumberFormatException e) {
               e.printStackTrace();
        }
    }//GEN-LAST:event_btnCrearPedidoActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        int fila = Tabla.getSelectedRow();
        if (fila ==-1){
            JOptionPane.showMessageDialog(null, "No has seleccionado ninguna fila.");
        }else{
            idc = Integer.parseInt((String) Tabla.getValueAt(fila,0).toString());
            String nom = (String) Tabla.getValueAt(fila,1);
            String ape = (String) Tabla.getValueAt(fila,2);
            int edad = Integer.parseInt ((String) Tabla.getValueAt(fila, 3).toString());
            txtID.setText(" "+idc);
            txtNombre.setText(nom);
            txtApellidos.setText(ape);
            txtEdad.setText(" "+edad);
        }
    }//GEN-LAST:event_TablaMouseClicked

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        Login principal = new Login();
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cerrarMouseClicked

    private void menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseClicked
        menu men = new menu();
        men.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuMouseClicked

    private void btnNEW1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNEW1ActionPerformed
        Nuevo();
    }//GEN-LAST:event_btnNEW1ActionPerformed

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
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes().setVisible(true);
            }
        });
    }

    void Modificar() {
        String Nombre = txtNombre.getText(); 
        String Apellidos = txtApellidos.getText(); 
        String Edad = txtEdad.getText(); 
        try {
            if (Nombre.equals("") || Apellidos.equals("") || Edad.equals("")) {
                JOptionPane.showMessageDialog(null, "Faltan datos");
                limpiarTabla(); 
            } else {
                String sql = "UPDATE Clientes set ID= ' " +idc+ " ', Nombre = '" +Nombre+ " ', Apellidos='" +Apellidos+ " ',Edad=' " +Edad+ "' where ID= " +idc;
                conet = con1.conectar(usuario, pass); 
                st = conet.createStatement(); 
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Cliente actualizado"); 
                limpiarTabla(); 
            }
        } catch (Exception e) {
        }
    }
    
        void Agregar(){
        String Nombre = txtNombre.getText();
        String Apellidos = txtApellidos.getText();
        String Edad = txtEdad.getText();
        try{
            if(Nombre.equals("") || Apellidos.equals("") || Edad.equals("")){
                JOptionPane.showMessageDialog(null, "Faltan datos. ");
                limpiarTabla();
            } else{
                String sql = "insert into Clientes(Nombre,Apellidos,Edad) values('" +Nombre+" ',' "+Apellidos+" ',' "+Edad+"')";
                //String sql = "update clientes set nombre= ' "+Nombre+"',apellidos='"+Apellidos+"',edad='"+Edad+"' where id="+idc;
                       
                conet = con1.conectar(usuario, pass); 
                st = conet.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Nuevo cliente");
                limpiarTabla();
            }       
        }catch (Exception e){
        }
    }
        
    void Consultar(){
        String sql = "Select * from Clientes ";
        try{
            conet = con1.conectar(usuario, pass); 
            st = conet.createStatement();
            rs = st.executeQuery(sql);
            Object[] Cliente = new Object [4];
            modelo = (DefaultTableModel) Tabla.getModel();
            
            while(rs.next()){
                Cliente[0]= rs.getInt("ID");
                Cliente[1] = rs.getString("Nombre");
                Cliente[2]= rs.getString("Apellidos");
                Cliente[3]= rs.getInt("Edad");
                modelo.addRow(Cliente);
            }
            
        }catch (Exception e){
            
        }
    }
    
    void limpiarTabla(){
        for(int i=0; i<Tabla.getRowCount();i++){
            modelo.removeRow(i);
            i=i-1;
        }
    }
    
    void Eliminar(){
        int fila = Tabla.getSelectedRow();
        try{
            if(fila <0){
                JOptionPane.showMessageDialog(null, "Seleccionar una fila.");
                limpiarTabla();
            }else{
             String sql = "delete from Clientes where ID="+idc;
             conet = con1.conectar(usuario, pass); 
             st = conet.createStatement();
             st.executeUpdate(sql);
             JOptionPane.showMessageDialog(null, "Cliente eliminado");
             limpiarTabla();
            }
        }catch(Exception e){
        }
    }
    
    void Nuevo(){
        txtID.setText("");
        txtNombre.setText("");
        txtApellidos.setText("");
        txtEdad.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnADD;
    private javax.swing.JButton btnCrearPedido;
    private javax.swing.JButton btnDEL;
    private javax.swing.JButton btnMOD;
    private javax.swing.JButton btnNEW1;
    private javax.swing.JMenu cerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu menu;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
