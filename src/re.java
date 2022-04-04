
import java.awt.Font;
import java.sql.*;
import javax.swing.table.TableColumn;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nitsh
 */
public class re extends javax.swing.JFrame {

    /**
     * Creates new form re
     */
    public re() {
        initComponents();this.setBounds(0,0,1320,820);t.setRowHeight(30);
        this.setLocationRelativeTo(null);
        t.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 25));
        int i=0;
        //for(int j=i;j<5;j++)
        int[] cs={150,210,200,200,160,180};
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

        goback = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        goback7 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        rcid1 = new javax.swing.JRadioButton();
        rname = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        rasc = new javax.swing.JRadioButton();
        rdes = new javax.swing.JRadioButton();
        enter = new javax.swing.JButton();
        set = new javax.swing.JLabel();
        q5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        t = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        goback.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        goback.setText("<- GO BACK");
        goback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gobackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SELECT ANY ONE OF THE ATTRIBUTES AND THE PLAYER IN WHICH ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PLAYER INFORMATION IS TO BE RETRIEVED OR DISPLAYED :");

        goback7.setBackground(new java.awt.Color(189, 189, 247));
        goback7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        goback7.setForeground(new java.awt.Color(102, 0, 102));
        goback7.setText("HOME");
        goback7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goback7ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ATTRIBUTE :");

        rcid1.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        rcid1.setText("PLAYER ID");
        rcid1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rcid1ActionPerformed(evt);
            }
        });

        rname.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        rname.setText("PLAYER NAME");
        rname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rnameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ORDER :");

        rasc.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        rasc.setText("ASCENDING");
        rasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rascActionPerformed(evt);
            }
        });

        rdes.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        rdes.setText("DESCENDING");
        rdes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdesActionPerformed(evt);
            }
        });

        enter.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        enter.setText("ENTER");
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });

        set.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        set.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        q5.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        q5.setText("SELECT AGAIN");
        q5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q5ActionPerformed(evt);
            }
        });

        t.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        t.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "PLAYER ID", "PLAYER NAME", "BATTING AVG", "BOWLING AVG", "TEAM ID", "COACH ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(t);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(goback)
                .addGap(2, 2, 2)
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(goback7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(rcid1)
                .addGap(27, 27, 27)
                .addComponent(rname, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rasc)
                .addGap(18, 18, 18)
                .addComponent(rdes)
                .addGap(18, 18, 18)
                .addComponent(enter, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(set, javax.swing.GroupLayout.PREFERRED_SIZE, 1238, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(jLabel2))
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1082, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(518, 518, 518)
                .addComponent(q5, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(goback))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1))
                    .addComponent(goback7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jLabel2)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(rcid1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(rname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(rasc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(rdes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(enter))
                .addGap(35, 35, 35)
                .addComponent(set, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
        }player a =new player();
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

    private void rcid1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rcid1ActionPerformed
        // TODO add your handling code here:
        int i=0;
    }//GEN-LAST:event_rcid1ActionPerformed

    private void rnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rnameActionPerformed
        // TODO add your handling code here:
        int i=0;
    }//GEN-LAST:event_rnameActionPerformed

    private void rascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rascActionPerformed
        // TODO add your handling code here:
        int i=0;
    }//GEN-LAST:event_rascActionPerformed

    private void rdesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdesActionPerformed
        // TODO add your handling code here:
        int i=0;
    }//GEN-LAST:event_rdesActionPerformed

    private void enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterActionPerformed
        // TODO add your handling code here:

        if(rcid1.isSelected()==true && rasc.isSelected()==true)
        {
            try{
                Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","NitishR","dbms");
                Statement st= con.createStatement();
                ResultSet rs=st.executeQuery("select * from player  order by pid desc");
                if(rs.next()==false)
                {
                    set.setText("NO RECORDS FOUND");
                }
                do{

                    DefaultTableModel model = (DefaultTableModel) t.getModel();
                    model.insertRow(1,new Object[]{rs.getString(1),rs.getString(2),rs.getFloat(3),rs.getFloat(4),rs.getInt(5),rs.getInt(6)});
                }while(rs.next());
            }
            catch(Exception e)
            {
                System.err.println(e);
            }
        }
        else if(rname.isSelected()==true && rasc.isSelected()==true){
            try{
                Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","NitishR","dbms");
                Statement st= con.createStatement();
                ResultSet rs=st.executeQuery("select * from player order by pname desc");
                if(rs.next()==false)
                {
                    set.setText("NO RECORDS FOUND");
                }
                do{

                    DefaultTableModel model = (DefaultTableModel) t.getModel();
                    model.insertRow(1,new Object[]{rs.getString(1),rs.getString(2),rs.getFloat(3),rs.getFloat(4),rs.getInt(5),rs.getInt(6)});
                }while(rs.next());
            }
            catch(Exception e)
            {
                System.err.println(e);
            }
        }
        else if(rcid1.isSelected()==true && rdes.isSelected()==true){
            try{
                Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","NitishR","dbms");
                Statement st= con.createStatement();
                ResultSet rs=st.executeQuery("select * from player order by pid ");
                if(rs.next()==false)
                {
                    set.setText("NO RECORDS FOUND");
                }
                do{

                    DefaultTableModel model = (DefaultTableModel) t.getModel();
                    model.insertRow(1,new Object[]{rs.getString(1),rs.getString(2),rs.getFloat(3),rs.getFloat(4),rs.getInt(5),rs.getInt(6)});
                }while(rs.next());
            }
            catch(Exception e)
            {
                System.err.println(e);
            }
        }
        else if(rname.isSelected()==true && rdes.isSelected()==true){
            try{
                Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","NitishR","dbms");
                Statement st= con.createStatement();
                ResultSet rs=st.executeQuery("select * from player order by pname ");
                if(rs.next()==false)
                {
                    set.setText("NO RECORDS FOUND");
                }
                do{

                    DefaultTableModel model = (DefaultTableModel) t.getModel();
                    model.insertRow(1,new Object[]{rs.getString(1),rs.getString(2),rs.getFloat(3),rs.getFloat(4),rs.getInt(5),rs.getInt(6)});
                }while(rs.next());
            }
            catch(Exception e)
            {
                System.err.println(e);
            }
        }
    }//GEN-LAST:event_enterActionPerformed

    private void q5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q5ActionPerformed
        // TODO add your handling code here:
        re a =new re();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_q5ActionPerformed

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
            java.util.logging.Logger.getLogger(re.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(re.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(re.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(re.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new re().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton enter;
    private javax.swing.JButton goback;
    private javax.swing.JButton goback7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton q5;
    private javax.swing.JRadioButton rasc;
    private javax.swing.JRadioButton rcid1;
    private javax.swing.JRadioButton rdes;
    private javax.swing.JRadioButton rname;
    private javax.swing.JLabel set;
    private javax.swing.JTable t;
    // End of variables declaration//GEN-END:variables
}