
import java.awt.Font;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nitsh
 */
public class so extends javax.swing.JFrame {

    /**
     * Creates new form so
     */
    public so() {
        initComponents(); this.setBounds(0,0,1320,820);
        this.setLocationRelativeTo(null);
        q1.setVisible(false);
         q2.setVisible(false);
          q3.setVisible(false);
          q4.setVisible(false);
          q5.setVisible(false);
          t1.setVisible(false);
          t2.setVisible(false);
          t.setVisible(false);
          jScrollPane1.setVisible(false);
          t.setRowHeight(30);
        t.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 25));
        int i=0;
        //for(int j=i;j<5;j++)
        int[] cs={200,300,200,300};
        for(int j:cs)
        {
        TableColumn c= t.getColumnModel().getColumn(i++);
        c.setMinWidth(j);
        c.setMaxWidth(j);
        c.setPreferredWidth(j);}
          
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        goback = new javax.swing.JButton();
        goback7 = new javax.swing.JButton();
        q2 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        q4 = new javax.swing.JButton();
        q3 = new javax.swing.JLabel();
        q5 = new javax.swing.JButton();
        set = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        q1 = new javax.swing.JLabel();
        rcid = new javax.swing.JRadioButton();
        rname = new javax.swing.JRadioButton();
        next = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        goback.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        goback.setText("<- GO BACK");
        goback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gobackActionPerformed(evt);
            }
        });

        goback7.setBackground(new java.awt.Color(189, 189, 247));
        goback7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        goback7.setForeground(new java.awt.Color(102, 0, 102));
        goback7.setText("HOME");
        goback7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goback7ActionPerformed(evt);
            }
        });

        q2.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        q2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q2.setText("OWNER ID :");

        t1.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N

        q4.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        q4.setText("SEARCH");
        q4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q4ActionPerformed(evt);
            }
        });

        q3.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        q3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q3.setText("OWNER NAME :");

        q5.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        q5.setText("SELECT AGAIN");
        q5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q5ActionPerformed(evt);
            }
        });

        set.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        set.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        t2.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N

        q1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        q1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q1.setText("ENTER THE FOLLOWING DETAILS :");

        buttonGroup1.add(rcid);
        rcid.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        rcid.setText("OWNER ID");
        rcid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rcidActionPerformed(evt);
            }
        });

        buttonGroup1.add(rname);
        rname.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        rname.setText(" OWNER NAME");

        next.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        next.setText("NEXT");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SELECT ANY ONE OF THE ATTRIBUTES OF OWNER ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("INFORMATION TO SEARCH :");

        t.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        t.setModel(new javax.swing.table.DefaultTableModel(
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
                "OWNER ID", "OWNER NAME", "TEAM ID", "TEAM NAME"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        t.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(t);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(goback)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(99, 99, 99))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(265, 265, 265)))
                .addComponent(goback7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(160, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(q2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(389, 389, 389))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(13, 13, 13)
                                    .addComponent(q3, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(391, 391, 391)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(q1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(q4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rcid)
                                .addGap(104, 104, 104)
                                .addComponent(rname)
                                .addGap(103, 103, 103)
                                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1016, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(q5, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(523, 523, 523))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(set, javax.swing.GroupLayout.PREFERRED_SIZE, 865, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(169, 169, 169))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(goback7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(goback)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(rcid, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rname)))
                .addGap(19, 19, 19)
                .addComponent(set, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q1)
                    .addComponent(q4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(q5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gobackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gobackActionPerformed
        // TODO add your handling code here:
        try{
            Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","NitishR","dbms");
            con.commit();
        }
        catch(Exception e )
        {
            System.err.println(e);
        }owner a =new owner();
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
        aftrlogin a =new aftrlogin();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_goback7ActionPerformed

    private void q4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q4ActionPerformed
        // TODO add your handling code here:
        String s = t1.getText();
        String s1=t2.getText();
        if(rcid.isSelected())
        {if(s.isEmpty()==true)
        {
            set.setText("PLEASE ENTER THE OWNER ID");}
        else{
            try{
            Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","NitishR","dbms");
            Statement st= con.createStatement();
            ResultSet rs=st.executeQuery("select o.oid,o.oname,o.tid,t.tname from owner o,team t where o.tid=t.tid and o.oid='"+s+"'");
            if(rs.next()==false)
                {
                    set.setText("NO RECORDS FOUND");
                }
                do{

                    DefaultTableModel model = (DefaultTableModel) t.getModel();
                    model.insertRow(1,new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)});
                }while(rs.next());

        }
        catch(Exception e)
        {
            System.err.println(e);
        }
        }}
        else {
           if(s1.isEmpty()==true)
        {
            set.setText("PLEASE ENTER THE OWNER NAME");
        }
           else{
        
          try{
            Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","NitishR","dbms");
            Statement st= con.createStatement();
            ResultSet rs=st.executeQuery("select o.oid,o.oname,o.tid,t.tname from owner o,team t where o.tid=t.tid and o.oname='"+s1+"'");
            if(rs.next()==false)
                {
                    set.setText("NO RECORDS FOUND");
                }
                do{

                    DefaultTableModel model = (DefaultTableModel) t.getModel();
                    model.insertRow(1,new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)});
                }while(rs.next());

        }
        catch(Exception e)
        {
            System.err.println(e);
        }  
        } 
        }
        
    }//GEN-LAST:event_q4ActionPerformed

    private void q5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q5ActionPerformed
        // TODO add your handling code here:
        so a =new so();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_q5ActionPerformed

    private void rcidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rcidActionPerformed
        // TODO add your handling code here:
        int i=0;
    }//GEN-LAST:event_rcidActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        // TODO add your handling code here:
        
        if(rcid.isSelected())
        {
            q2.setVisible(true); t1.setVisible(true);t.setVisible(true);
        jScrollPane1.setVisible(true);
        q1.setVisible(true);
        q4.setVisible(true);
        q5.setVisible(true);
        }
        if(rname.isSelected())
        {
            q3.setVisible(true);t2.setVisible(true);
            t.setVisible(true);
        jScrollPane1.setVisible(true);
        q1.setVisible(true);
        q4.setVisible(true);
        q5.setVisible(true);
        }
        
    }//GEN-LAST:event_nextActionPerformed

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
            java.util.logging.Logger.getLogger(so.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(so.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(so.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(so.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new so().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton goback;
    private javax.swing.JButton goback7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton next;
    private javax.swing.JLabel q1;
    private javax.swing.JLabel q2;
    private javax.swing.JLabel q3;
    private javax.swing.JButton q4;
    private javax.swing.JButton q5;
    private javax.swing.JRadioButton rcid;
    private javax.swing.JRadioButton rname;
    private javax.swing.JLabel set;
    private javax.swing.JTable t;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    // End of variables declaration//GEN-END:variables
}
