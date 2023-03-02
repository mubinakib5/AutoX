/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package autox;

import com.formdev.flatlaf.FlatIntelliJLaf;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author User
 */
public class Service_Maintenance extends javax.swing.JFrame {

    /**
     * Creates new form Service_Maintenance
     */
    public Service_Maintenance() {
        initComponents();
        
    }
    static int mid, cid;
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    public void Connect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/autox", "root", "" );
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(User_Reg_Form.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(User_Reg_Form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Service_Maintenance(String Mid, String Cid) {
        initComponents();
        mid = Integer.parseInt(Mid);
        cid = Integer.parseInt(Cid);
        Connect();
        update();
        update2();
    }
    
    public void update(){
        try {
            // TODO add your handling code here:
            //String email = txtEmail.getText();
            //String password = txtpass.getText();
            //JOptionPane.showMessageDialog(this, email + "   " + password);
            pst = con.prepareStatement("select * from maintenance where Mid = ?");
            pst.setInt(1, mid);
            rs = pst.executeQuery();
            rs.next();
            txtProblem.setText(rs.getString("P_details"));
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void update2(){
        try {
            // TODO add your handling code here:
            //String email = txtEmail.getText();
            //String password = txtpass.getText();
            //JOptionPane.showMessageDialog(this, email + "   " + password);
            pst = con.prepareStatement("select * from customer where customer_ID = ?");
            pst.setInt(1, cid);
            rs = pst.executeQuery();
            Boolean res = rs.next();
            //JOptionPane.showMessageDialog(this, res);
            
            txtIDNO.setText(rs.getString("customer_ID"));
            txtLicense.setText(rs.getString("vehicle_license_no"));
            Name.setText(rs.getString("full_name"));
            //txtCname.setToolTipText(rs.getString("full_name"));
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCname = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtLicense = new javax.swing.JLabel();
        txtIDNO = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Cost = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtProblem = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtsolution = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        txtIDNO1 = new javax.swing.JLabel();
        txtIDNO2 = new javax.swing.JLabel();
        txtLicense1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtCname.setBackground(new java.awt.Color(255, 255, 255));
        txtCname.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autox/Icons/50.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Service Maintenance");

        jButton1.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jButton1.setText("Service_Provider");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(279, 279, 279)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jButton1))
                    .addComponent(jLabel1))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        txtCname.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 959, -1));

        txtLicense.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        txtLicense.setForeground(new java.awt.Color(0, 0, 102));
        txtLicense.setText("Customer License No.");
        txtCname.add(txtLicense, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 120, 91, -1));

        txtIDNO.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        txtIDNO.setForeground(new java.awt.Color(0, 0, 102));
        txtIDNO.setText("Customer ID");
        txtCname.add(txtIDNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 69, -1));

        jLabel6.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("Problem Description");
        txtCname.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 188, -1, -1));

        jLabel7.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("Cost");
        txtCname.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 602, -1, -1));

        jLabel8.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 102));
        jLabel8.setText("Problem Solution");
        txtCname.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 396, -1, -1));

        Cost.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        Cost.setForeground(new java.awt.Color(0, 0, 102));
        txtCname.add(Cost, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 601, 350, -1));

        jButton2.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 102));
        jButton2.setText("Send For Feedback");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        txtCname.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 653, 200, -1));

        txtProblem.setColumns(20);
        txtProblem.setRows(5);
        jScrollPane1.setViewportView(txtProblem);

        txtCname.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 222, 760, 156));

        txtsolution.setColumns(20);
        txtsolution.setRows(5);
        jScrollPane2.setViewportView(txtsolution);

        txtCname.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 430, 760, 153));
        txtCname.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 124, 100, -1));

        Name.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        Name.setForeground(new java.awt.Color(0, 0, 102));
        Name.setText("jLabel4");
        txtCname.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 140, -1));

        txtIDNO1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        txtIDNO1.setForeground(new java.awt.Color(0, 0, 102));
        txtIDNO1.setText("Customer Name");
        txtCname.add(txtIDNO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, -1));

        txtIDNO2.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        txtIDNO2.setForeground(new java.awt.Color(0, 0, 102));
        txtIDNO2.setText("Customer ID");
        txtCname.add(txtIDNO2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        txtLicense1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        txtLicense1.setForeground(new java.awt.Color(0, 0, 102));
        txtLicense1.setText("Customer License No.");
        txtCname.add(txtLicense1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 158, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtCname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtCname, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            String sol = txtsolution.getText();
            String cost = Cost.getText();
            pst = con.prepareStatement("update maintenance set solution = ?, Cost = ? where Mid = ?");
            pst.setString(1, sol);
            pst.setString(2,cost );
            pst.setInt(3, mid);

            pst.executeUpdate();
            //JOptionPane.showMessageDialog(this, "Product Updated!");

        } catch (SQLException ex) {
            Logger.getLogger(Service_Maintenance.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(this, "Successfully Sent!");
        Service_Dash sd = new Service_Dash();
        sd.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Service_Dash sd = new Service_Dash();
        sd.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Service_Maintenance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Service_Maintenance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Service_Maintenance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Service_Maintenance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Service_Maintenance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cost;
    private javax.swing.JLabel Name;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel txtCname;
    private javax.swing.JLabel txtIDNO;
    private javax.swing.JLabel txtIDNO1;
    private javax.swing.JLabel txtIDNO2;
    private javax.swing.JLabel txtLicense;
    private javax.swing.JLabel txtLicense1;
    private javax.swing.JTextArea txtProblem;
    private javax.swing.JTextArea txtsolution;
    // End of variables declaration//GEN-END:variables
}
