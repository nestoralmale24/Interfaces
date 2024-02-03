/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app;

import static app.variables.pass;
import static app.variables.usuario;
import conexion.conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nesto
 */
public class Productos extends javax.swing.JFrame {

    conexion con1 = new conexion();
    Connection conet;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    int idc;
    
    public Productos() {
        initComponents();
        Consultar();
        setLocationRelativeTo(null);
        
        //SACAR LA PANTALLA CENTRADA
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtSKU = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtIVA = new javax.swing.JTextField();
        btnADD = new javax.swing.JButton();
        btnNEW = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        btnMOD = new javax.swing.JButton();
        btnDEL = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS PRODUCTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rockwell Extra Bold", 1, 24), new java.awt.Color(0, 0, 204))); // NOI18N

        jLabel1.setText("ID");

        jLabel2.setText("Descripcion");

        jLabel3.setText("Codigo SKU");

        jLabel4.setText("Precio");

        txtID.setEditable(false);
        txtID.setEnabled(false);

        jLabel5.setText("IVA");

        btnADD.setBackground(new java.awt.Color(153, 153, 153));
        btnADD.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnADD.setText("AÑADIR");
        btnADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnADDActionPerformed(evt);
            }
        });

        btnNEW.setBackground(new java.awt.Color(153, 153, 153));
        btnNEW.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnNEW.setText("LIMPIAR");
        btnNEW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNEWActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtID)
                            .addComponent(txtDescripcion)
                            .addComponent(txtSKU)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                            .addComponent(txtIVA)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(btnADD, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addComponent(btnNEW, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSKU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtIVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNEW, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnADD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INFORMACION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rockwell Extra Bold", 1, 24), new java.awt.Color(0, 0, 204))); // NOI18N

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Descripcion", "Codigo SKU", "Precio", "IVA"
            }
        ));
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla);

        btnMOD.setBackground(new java.awt.Color(153, 153, 153));
        btnMOD.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnMOD.setText("MODIFICAR");
        btnMOD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMODActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(btnMOD, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(btnDEL, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMOD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDEL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(220, 220, 220))
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_logout_black_24dp.png"))); // NOI18N
        jMenu1.setText("Salir");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(66, 66, 66)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void btnNEWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNEWActionPerformed
        Nuevo();
    }//GEN-LAST:event_btnNEWActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        int fila = Tabla.getSelectedRow();
        if (fila ==-1){
            JOptionPane.showMessageDialog(null, "No has seleccionado ninguna fila.");
        }else{
            idc = Integer.parseInt((String) Tabla.getValueAt(fila,0).toString());
            String nom = (String) Tabla.getValueAt(fila,1);
            String ape = (String) Tabla.getValueAt(fila,2);
            int edad = Integer.parseInt ((String) Tabla.getValueAt(fila, 3).toString());
            int iva = Integer.parseInt ((String) Tabla.getValueAt(fila, 4).toString());
            txtID.setText(" "+idc);
            txtDescripcion.setText(nom);
            txtSKU.setText(ape);
            txtPrecio.setText(" "+edad);
            txtIVA.setText(" "+iva);
        }
    }//GEN-LAST:event_TablaMouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        Login principal = new Login();
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseClicked
        menu men = new menu();
        men.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuMouseClicked

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
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Productos().setVisible(true);
            }
        });
    }

    void Modificar() {
        String Descripcion = txtDescripcion.getText(); 
        String SKU = txtSKU.getText(); 
        String Precio = txtPrecio.getText(); 
        String IVA = txtIVA.getText(); 
        try {
            if (Descripcion.equals("") || SKU.equals("") || Precio.equals("") || IVA.equals("")) {
                JOptionPane.showMessageDialog(null, "Faltan datos");
                limpiarTabla(); 
            } else {
                //String sql = "insert into clientes(Nombre,Apellidos,Edad) values('" +Nombre+" ',' "+Apellido+" ',' "+Edad+"')";
                String sql = "UPDATE Productos set ID= '"+idc+"',Descripcion='"+Descripcion+"',CodigoSKU='"+SKU+"',Precio='"+Precio+"',IVA='"+IVA+"'where ID= " +idc;
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
        String Descripcion = txtDescripcion.getText(); 
        String SKU = txtSKU.getText(); 
        String Precio = txtPrecio.getText(); 
        String IVA = txtIVA.getText(); 

        try{
            if (Descripcion.equals("") || SKU.equals("") || Precio.equals("") || IVA.equals("")) {
                JOptionPane.showMessageDialog(null, "Faltan datos. ");
                limpiarTabla(); 
            } else{
                String sql = "insert into Productos(Descripcion,CodigoSKU,Precio,IVA) values('" +Descripcion+ "','"+SKU+"','"+Precio+"','"+IVA+"')";

                conet = con1.conectar(usuario, pass); 
                st = conet.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Nuevo producto agregado");
                limpiarTabla();
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

        
      void Consultar(){
        String sql = "Select * from Productos ";
        try{
            conet = con1.conectar(usuario, pass); 
            st = conet.createStatement();
            rs = st.executeQuery(sql);
            Object[] Producto = new Object [5];
            modelo = (DefaultTableModel) Tabla.getModel();
            
            while(rs.next()){
                Producto[0]= rs.getInt("ID");
                Producto[1] = rs.getString("Descripcion");
                Producto[2]= rs.getString("CodigoSKU");
                Producto[3]= rs.getInt("Precio");
                Producto[4]= rs.getInt("IVA");
                modelo.addRow(Producto);
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
             String sql = "delete from Productos where ID="+idc;
             conet = con1.conectar(usuario, pass); 
             st = conet.createStatement();
             st.executeUpdate(sql);
             JOptionPane.showMessageDialog(null, "Producto eliminado");
             limpiarTabla();
            }
        }catch(Exception e){
        }
    }
    
    void Nuevo(){
        txtID.setText("");
        txtDescripcion.setText("");
        txtSKU.setText("");
        txtPrecio.setText("");
        txtIVA.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnADD;
    private javax.swing.JButton btnDEL;
    private javax.swing.JButton btnMOD;
    private javax.swing.JButton btnNEW;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu menu;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIVA;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtSKU;
    // End of variables declaration//GEN-END:variables
}
