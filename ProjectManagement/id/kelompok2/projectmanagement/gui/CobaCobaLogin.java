/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.kelompok2.projectmanagement.gui;

/**
 *
 * @author Iwan Ma'ruf
 */
public class CobaCobaLogin extends javax.swing.JFrame {

    /**
     * Creates new form CobaCobaLogin
     */
    public CobaCobaLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        username1 = new javax.swing.JTextField();
        login = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        firstName = new javax.swing.JTextField();
        firstname = new javax.swing.JTextField();
        lastaname = new javax.swing.JTextField();
        mail = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        password2 = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Sitka Text", 0, 45)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ON-BOARD");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(280, 0, 247, 70);

        jLabel3.setFont(new java.awt.Font("Sitka Text", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nobody's left behind with ON-BOARD");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(530, 0, 444, 34);

        username1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        username1.setText("Username");
        username1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                username1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                username1FocusLost(evt);
            }
        });
        username1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username1ActionPerformed(evt);
            }
        });
        getContentPane().add(username1);
        username1.setBounds(540, 40, 110, 30);

        login.setText("Log In");
        getContentPane().add(login);
        login.setBounds(850, 40, 113, 30);

        jLabel4.setFont(new java.awt.Font("Sitka Text", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("SIGN UP FOR FREE");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(620, 130, 320, 30);

        firstName.setText("First name");
        getContentPane().add(firstName);
        firstName.setBounds(2015, 155, 152, 28);

        firstname.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        firstname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        firstname.setText(" First name");
        firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameActionPerformed(evt);
            }
        });
        getContentPane().add(firstname);
        firstname.setBounds(570, 190, 200, 30);

        lastaname.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        lastaname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lastaname.setText("Last name");
        getContentPane().add(lastaname);
        lastaname.setBounds(780, 190, 190, 30);

        mail.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        mail.setText("Email");
        getContentPane().add(mail);
        mail.setBounds(570, 250, 400, 30);

        jTextField2.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jTextField2.setText("Username");
        jTextField2.setToolTipText("");
        getContentPane().add(jTextField2);
        jTextField2.setBounds(570, 310, 400, 30);

        password.setText("Password");
        password.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        getContentPane().add(password);
        password.setBounds(701, 40, 100, 30);

        password2.setText("Password");
        getContentPane().add(password2);
        password2.setBounds(570, 370, 400, 30);

        jCheckBox1.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Female");
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(640, 510, 110, 31);

        jCheckBox2.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setText("Male");
        getContentPane().add(jCheckBox2);
        jCheckBox2.setBounds(820, 510, 110, 31);

        jLabel5.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("By clicking Sign Up, you agree to our Terms");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(620, 580, 320, 20);

        jLabel6.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText(" and that you have read our Data Policy");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(640, 600, 280, 30);

        jTextField1.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Month");
        getContentPane().add(jTextField1);
        jTextField1.setBounds(730, 440, 90, 30);

        jButton1.setFont(new java.awt.Font("Sitka Text", 0, 36)); // NOI18N
        jButton1.setText("Sign In");
        getContentPane().add(jButton1);
        jButton1.setBounds(680, 630, 210, 70);

        jTextField4.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("Year");
        getContentPane().add(jTextField4);
        jTextField4.setBounds(879, 440, 90, 30);

        jTextField3.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("Day");
        getContentPane().add(jTextField3);
        jTextField3.setBounds(570, 440, 90, 30);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1370, 0);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackgroundLogin.jpg"))); // NOI18N
        jLabel7.setText("a");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 1010, 870);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void username1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_username1FocusGained

    }//GEN-LAST:event_username1FocusGained

    private void username1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_username1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_username1FocusLost

    private void username1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username1ActionPerformed

    private void firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameActionPerformed

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
            java.util.logging.Logger.getLogger(CobaCobaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CobaCobaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CobaCobaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CobaCobaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CobaCobaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField firstName;
    private javax.swing.JTextField firstname;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField lastaname;
    private javax.swing.JButton login;
    private javax.swing.JTextField mail;
    private javax.swing.JPasswordField password;
    private javax.swing.JPasswordField password2;
    private javax.swing.JTextField username1;
    // End of variables declaration//GEN-END:variables
}
