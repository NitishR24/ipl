
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nitsh
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginbutton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        usrd1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        pwd1 = new javax.swing.JPasswordField();
        t3 = new javax.swing.JPasswordField();
        s3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        createbutton1 = new javax.swing.JButton();
        loginbutton4 = new javax.swing.JButton();
        loginbutton5 = new javax.swing.JButton();
        s4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginbutton3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        loginbutton3.setText("<- GO BACK");
        loginbutton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbutton3ActionPerformed(evt);
            }
        });
        getContentPane().add(loginbutton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ENTER THE USER DETAILS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 34, 642, 60));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("USER ID :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 181, 210, 49));

        usrd1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        usrd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usrd1ActionPerformed(evt);
            }
        });
        getContentPane().add(usrd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(631, 182, 373, 50));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("PASSWORD :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 262, 210, 50));

        pwd1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        pwd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwd1ActionPerformed(evt);
            }
        });
        getContentPane().add(pwd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(631, 262, 373, 50));

        t3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(631, 343, 373, 50));

        s3.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        s3.setForeground(new java.awt.Color(204, 255, 255));
        s3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s3.setText("CONFIRM PASSWORD :");
        getContentPane().add(s3, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 341, -1, 50));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("PHONE NO :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 430, 210, 55));

        t5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(631, 430, 373, 55));

        createbutton1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        createbutton1.setText("CREATE ACCOUNT");
        createbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createbutton1ActionPerformed(evt);
            }
        });
        getContentPane().add(createbutton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 665, -1, -1));

        loginbutton4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        loginbutton4.setText("LOGIN");
        loginbutton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbutton4ActionPerformed(evt);
            }
        });
        getContentPane().add(loginbutton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 665, -1, -1));

        loginbutton5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        loginbutton5.setText("CLEAR ALL");
        loginbutton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbutton5ActionPerformed(evt);
            }
        });
        getContentPane().add(loginbutton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(867, 665, -1, -1));

        s4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        s4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(s4, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 544, 1237, 63));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\nitsh\\Downloads\\Wallpaper.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, -3, 1290, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginbutton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbutton3ActionPerformed
        // TODO add your handling code here:
        login1 l =new login1();
        this.setVisible(false);
        l.setVisible(true);
    }//GEN-LAST:event_loginbutton3ActionPerformed

    private void createbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createbutton1ActionPerformed

        String uid= usrd1.getText();
        String pswd = pwd1.getText();
        String pswd1 = t3.getText();
        String age12 = t5.getText();

        if(age12.isEmpty()== true|| pswd1.isEmpty()==true || uid.isEmpty()==true || pswd.isEmpty()==true  )
        {
            s4.setText("PLEASE ENTER ALL THE FIELDS");
        }

        else if(pswd.contains(pswd1))
        {
            try
            {
                String s= "insert into user1 values ('"+uid+"','"+pswd+"','"+age12+"')";
                Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","NitishR","dbms");
                Statement st= con.createStatement();
                int rows=st.executeUpdate(s);
                s4.setText("ACCOUNT CREATED PLEASE LOGIN TO CONTINUE");
                con.commit();
                con.close();
            }
            catch(Exception e)
            {
                System.err.println(e);
                s4.setText("PLEASE ENTER THE CORRECT VALUES");
            }
        }
        else{
        s4.setText("ENTER SAME PASSWORD");
    }
    }//GEN-LAST:event_createbutton1ActionPerformed

    private void loginbutton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbutton4ActionPerformed
        // TODO add your handling code here:
        login1 l =new login1();
        this.setVisible(false);
        l.setVisible(true);
    }//GEN-LAST:event_loginbutton4ActionPerformed

    private void loginbutton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbutton5ActionPerformed
        // TODO add your handling code here:
        NewJFrame l =new NewJFrame();
        this.setVisible(false);
        l.setVisible(true);
    }//GEN-LAST:event_loginbutton5ActionPerformed

    private void usrd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usrd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usrd1ActionPerformed

    private void pwd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwd1ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createbutton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton loginbutton3;
    private javax.swing.JButton loginbutton4;
    private javax.swing.JButton loginbutton5;
    private javax.swing.JPasswordField pwd1;
    private javax.swing.JLabel s3;
    private javax.swing.JLabel s4;
    private javax.swing.JPasswordField t3;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField usrd1;
    // End of variables declaration//GEN-END:variables
}
