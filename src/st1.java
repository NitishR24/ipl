
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
public class st1 extends javax.swing.JFrame {

    /**
     * Creates new form st1
     */
    public st1() {
        initComponents();this.setBounds(0,0,1350,820);
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

        cidd = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        q2 = new javax.swing.JLabel();
        q3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        goback = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        goback7 = new javax.swing.JButton();
        q1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cidd.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        cidd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciddActionPerformed(evt);
            }
        });
        getContentPane().add(cidd, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, 272, 56));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jButton2.setText("SEARCH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 410, 137, 56));

        q2.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        q2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q2.setText("TEAM NAME ");
        getContentPane().add(q2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 660, 56));

        q3.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        q3.setText("CLEAR ALL");
        q3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q3ActionPerformed(evt);
            }
        });
        getContentPane().add(q3, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 505, 235, 48));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 652, 1031, 47));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ENTER THE TEAM ID OF THE TEAM WHOSE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 842, -1));

        goback.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        goback.setText("<- GO BACK");
        goback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gobackActionPerformed(evt);
            }
        });
        getContentPane().add(goback, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 24, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("INFORMATION IS TO BE SEARCHED :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 658, -1));

        goback7.setBackground(new java.awt.Color(189, 189, 247));
        goback7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        goback7.setForeground(new java.awt.Color(102, 0, 102));
        goback7.setText("HOME");
        goback7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goback7ActionPerformed(evt);
            }
        });
        getContentPane().add(goback7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1114, 29, 140, 50));

        q1.setBackground(new java.awt.Color(0, 102, 102));
        q1.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        q1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q1.setText("TEAM ID :");
        getContentPane().add(q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 211, 56));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -80, 1300, 890));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String s = cidd.getText();
        if(s.isEmpty()==true)
        {
            jLabel7.setText("PLEASE ENTER THE TEAM ID");
        }
        try{
            Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","NitishR","dbms");
            Statement st= con.createStatement();
            ResultSet rs=st.executeQuery("select tname from team where tid='"+s+"'");
            if(rs.next()){

                q2.setText(rs.getString(1));
                q1.setVisible(true);
                q2.setVisible(true);
                q3.setVisible(true);
            }
            else{
                jLabel7.setText("PLEASE ENTER THE CORRECT TEAM ID");
            }

        }
        catch(Exception e)
        {
            System.err.println(e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void q3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q3ActionPerformed
        // TODO add your handling code here:
        st1 a =new st1();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_q3ActionPerformed

    private void gobackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gobackActionPerformed
        // TODO add your handling code here:
        try{
            Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","NitishR","dbms");
            con.commit();
        }
        catch(Exception e )
        {
            System.err.println(e);
        }team1 a =new team1();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_gobackActionPerformed

    private void goback7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goback7ActionPerformed
        // TODO add your handling code here:
        try{
            Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","NitishR","dbms");
            con.commit();
        }
        catch(Exception e )
        {
            System.err.println(e);
        }
        aftrlogin1 a =new aftrlogin1();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_goback7ActionPerformed

    private void ciddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ciddActionPerformed

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
            java.util.logging.Logger.getLogger(st1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(st1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(st1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(st1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new st1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cidd;
    private javax.swing.JButton goback;
    private javax.swing.JButton goback7;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel q1;
    private javax.swing.JLabel q2;
    private javax.swing.JButton q3;
    // End of variables declaration//GEN-END:variables
}