/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pengelolaan_Buku;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Destroy Eyes
 */
public class EditProfile extends javax.swing.JFrame {

    /**
     * Creates new form EditProfile
     */
    byte[] gambarprofile;

    public byte[] getGambarprofile() {
        return gambarprofile;
    }

    public void setGambarprofile(byte[] gambarprofile) {
        this.gambarprofile = gambarprofile;
    }
    
    public EditProfile() {
        initComponents();
        tampilkan();
    }
    
    String ImgPath = null;
    //resize Image
    public ImageIcon ResizeImage(String imagePath, byte[] pic){
        ImageIcon myImage = null;
        if(imagePath != null)
        {
            myImage = new ImageIcon(imagePath);
        } else {
        myImage = new ImageIcon(pic);
        }
        Image img = myImage.getImage();
        Image img2 = img.getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(img2);
        return image;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        btnClear = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        btnSave = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        btnBrowse = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Edit Profile");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 128, 185), 2));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 256, 200));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 150, 256, 200));

        btnCancel.setBackground(new java.awt.Color(41, 128, 220));
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCancelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCancelMouseReleased(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Cancel");

        javax.swing.GroupLayout btnCancelLayout = new javax.swing.GroupLayout(btnCancel);
        btnCancel.setLayout(btnCancelLayout);
        btnCancelLayout.setHorizontalGroup(
            btnCancelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btnCancelLayout.setVerticalGroup(
            btnCancelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel2.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(776, 422, -1, -1));

        btnClear.setBackground(new java.awt.Color(41, 128, 220));
        btnClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClearMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnClearMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnClearMouseReleased(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Clear");

        javax.swing.GroupLayout btnClearLayout = new javax.swing.GroupLayout(btnClear);
        btnClear.setLayout(btnClearLayout);
        btnClearLayout.setHorizontalGroup(
            btnClearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btnClearLayout.setVerticalGroup(
            btnClearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel2.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 422, -1, -1));

        jPanel13.setBackground(new java.awt.Color(229, 229, 229));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 400, 6));

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(52, 152, 219));
        jLabel42.setText("Nama");
        jPanel2.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, -1, -1));

        jPanel16.setBackground(new java.awt.Color(229, 229, 229));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, -1, -1));

        jPanel14.setBackground(new java.awt.Color(229, 229, 229));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, -1, -1));

        btnSave.setBackground(new java.awt.Color(41, 128, 220));
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSaveMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSaveMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnSaveMouseReleased(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Save");

        javax.swing.GroupLayout btnSaveLayout = new javax.swing.GroupLayout(btnSave);
        btnSave.setLayout(btnSaveLayout);
        btnSaveLayout.setHorizontalGroup(
            btnSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btnSaveLayout.setVerticalGroup(
            btnSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel2.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 422, -1, -1));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(52, 152, 219));
        jLabel43.setText("Username");
        jPanel2.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, -1, -1));

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(52, 152, 219));
        jLabel44.setText("Password");
        jPanel2.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, -1, -1));

        btnBrowse.setBackground(new java.awt.Color(41, 128, 220));
        btnBrowse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBrowse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBrowseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBrowseMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBrowseMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnBrowseMouseReleased(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Browse");

        javax.swing.GroupLayout btnBrowseLayout = new javax.swing.GroupLayout(btnBrowse);
        btnBrowse.setLayout(btnBrowseLayout);
        btnBrowseLayout.setHorizontalGroup(
            btnBrowseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btnBrowseLayout.setVerticalGroup(
            btnBrowseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel2.add(btnBrowse, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 378, -1, -1));

        jTextField2.setBorder(null);
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 400, 30));

        jTextField3.setBorder(null);
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 400, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(52, 152, 219));
        jLabel1.setText("EDIT ADMIN INFORMATION");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        jPasswordField1.setBorder(null);
        jPanel2.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, 400, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseEntered
        // TODO add your handling code here:
        setColorButton(btnSave);
    }//GEN-LAST:event_btnSaveMouseEntered

    private void btnSaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseExited
        // TODO add your handling code here:
        resetColor(btnSave);
    }//GEN-LAST:event_btnSaveMouseExited

    private void btnSaveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMousePressed
        // TODO add your handling code here:
        setColorClicked(btnSave);
        String UpdateQuery = null;
        PreparedStatement ps = null;
        if (ImgPath == null){
        try {
            Connection cn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/dbbuku","root","");
           UpdateQuery = "UPDATE admin SET nama_admin=?,username=?,password=?";
            ps=cn.prepareStatement(UpdateQuery);
            ps.setString(1, jTextField2.getText());
            ps.setString(2, jTextField3.getText());
            ps.setString(3, jPasswordField1.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Tersimpan");
            System.gc();
            java.awt.Window win[] = java.awt.Window.getWindows(); 
            for(int i=0;i<win.length;i++){ 
            win[i].setVisible(false);
            win[i]=null;}         
            Admin admin = new Admin();
            admin.setVisible(true);
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        } else {
            try {
            Connection cn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/dbbuku","root","");
            UpdateQuery = "UPDATE admin SET nama_admin=?,username=?,password=?,photoprofile=?";
            ps=cn.prepareStatement(UpdateQuery);
            ps.setString(1, jTextField2.getText());
            ps.setString(2, jTextField3.getText());
            ps.setString(3, jPasswordField1.getText());
            InputStream img = new FileInputStream(new File(ImgPath));
            ps.setBlob(4, img);
            ps.executeUpdate();
           JOptionPane.showMessageDialog(null, "Tersimpan");
           System.gc();
            java.awt.Window win[] = java.awt.Window.getWindows(); 
            for(int i=0;i<win.length;i++){ 
            win[i].setVisible(false);
            win[i]=null;}         
            Admin admin = new Admin();
            admin.setVisible(true);
            this.setVisible(false);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
             
        }
    }//GEN-LAST:event_btnSaveMousePressed

    private void btnSaveMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseReleased
        // TODO add your handling code here:
        setColorButton(btnSave);
    }//GEN-LAST:event_btnSaveMouseReleased

    private void btnClearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseEntered
        // TODO add your handling code here:
        setColorButton(btnClear);
    }//GEN-LAST:event_btnClearMouseEntered

    private void btnClearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseExited
        // TODO add your handling code here:
        resetColor(btnClear);
    }//GEN-LAST:event_btnClearMouseExited

    private void btnClearMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMousePressed
        // TODO add your handling code here:
        setColorClicked(btnClear);
    }//GEN-LAST:event_btnClearMousePressed

    private void btnClearMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseReleased
        // TODO add your handling code here:
        setColorButton(btnClear);
    }//GEN-LAST:event_btnClearMouseReleased

    private void btnCancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseEntered
        // TODO add your handling code here:
        setColorButton(btnCancel);
    }//GEN-LAST:event_btnCancelMouseEntered

    private void btnCancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseExited
        // TODO add your handling code here:
        resetColor(btnCancel);
    }//GEN-LAST:event_btnCancelMouseExited

    private void btnCancelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMousePressed
        // TODO add your handling code here:
        this.setVisible(false);
        setColorClicked(btnCancel);
    }//GEN-LAST:event_btnCancelMousePressed

    private void btnCancelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseReleased
        // TODO add your handling code here:
        setColorButton(btnCancel);
    }//GEN-LAST:event_btnCancelMouseReleased

    private void btnBrowseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBrowseMouseEntered
        // TODO add your handling code here:
        setColorButton(btnBrowse);
    }//GEN-LAST:event_btnBrowseMouseEntered

    private void btnBrowseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBrowseMouseExited
        // TODO add your handling code here:
        resetColor(btnBrowse);
    }//GEN-LAST:event_btnBrowseMouseExited

    private void btnBrowseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBrowseMousePressed
        // TODO add your handling code here:
        setColorClicked(btnBrowse);
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.images","jpg","png");
        file.addChoosableFileFilter(filter);
        
        int result = file.showSaveDialog(null);
        if(result == JFileChooser.APPROVE_OPTION)
        {
        File selectedFile = file.getSelectedFile();
        String path = selectedFile.getAbsolutePath();
        jLabel2.setIcon(ResizeImage(path,null));
        ImgPath=path;
        } else {
            System.out.println("No File Selected");
        }
    }//GEN-LAST:event_btnBrowseMousePressed

    private void btnBrowseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBrowseMouseReleased
        // TODO add your handling code here:
        setColorButton(btnBrowse);
    }//GEN-LAST:event_btnBrowseMouseReleased

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
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnBrowse;
    private javax.swing.JPanel btnCancel;
    private javax.swing.JPanel btnClear;
    private javax.swing.JPanel btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
void setColorButton(JPanel panel){
        panel.setBackground(new Color(52, 73, 94));
    }
    void resetColor(JPanel panel){
         panel.setBackground(new Color(41,128,220));
    }
    void setColorClicked(JPanel panel){
        panel.setBackground(new Color(52, 73, 120));
    }
    private void tampilkan() {
        try {
            Connection cn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/dbbuku","root","");
            ResultSet rs = cn.createStatement().executeQuery("select * from admin"); 
            if(rs.next()){
            jTextField2.setText(rs.getString("nama_admin"));
            jTextField3.setText(rs.getString("username"));
            jPasswordField1.setText(rs.getString("password"));
            setGambarprofile(rs.getBytes("photoprofile"));
            ImageIcon myImage = null;
            myImage = new ImageIcon(getGambarprofile());
            Image img = myImage.getImage();
            Image img2 = img.getScaledInstance(jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon image = new ImageIcon(img2);
                jLabel2.setIcon(image);
            } } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

