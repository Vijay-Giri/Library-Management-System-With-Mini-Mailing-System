
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class seemail extends javax.swing.JFrame {
    Connection conn;
    ResultSet rs;
    PreparedStatement pst;
    public static String id;
    String ds;
    String r,s,c,rr,ss;

    /**
     * Creates new form seemail
     */
    public seemail() {
        super("See Mail");
        initComponents();
        conn=javaconnect.ConnecrDb();
        getFrom();
        
    }
    
    public String getID()
    {
        return id;
    }
    
    public void getFrom()
    {
        librarian sl = new librarian();
        String a = sl.getlname();
        jTextField1.setText(a);
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 3, true), "Sent/Recieved Mail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 18), new java.awt.Color(153, 0, 0))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 153), 2, true), "Mail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 14), new java.awt.Color(153, 0, 0))); // NOI18N

        jTable1.setBackground(new java.awt.Color(204, 255, 204));
        jTable1.setForeground(new java.awt.Color(255, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mail_ID", "From", "To", "Date", "Message"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jButton3.setBackground(new java.awt.Color(255, 255, 153));
        jButton3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(153, 51, 0));
        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true), "Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 14), new java.awt.Color(102, 102, 0))); // NOI18N

        jTextField1.setEditable(false);

        jButton1.setBackground(new java.awt.Color(255, 255, 153));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 51, 0));
        jButton1.setText("SEE SENT MAIL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Username");

        jButton2.setBackground(new java.awt.Color(255, 255, 153));
        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 51, 0));
        jButton2.setText("SEE RECEIVED MAIL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(186, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Mail_ID");

        jButton4.setBackground(new java.awt.Color(255, 255, 153));
        jButton4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(153, 51, 0));
        jButton4.setText("VIEW");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 255, 153));
        jButton5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(153, 51, 0));
        jButton5.setText("DELETE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(326, 326, 326)
                        .addComponent(jButton3)))
                .addGap(45, 45, 45)
                .addComponent(jButton4)
                .addGap(40, 40, 40)
                .addComponent(jButton5)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton4)
                        .addComponent(jButton5)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(767, 580));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        mail2 m = new mail2();
        m.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        try
        {
            String f=""+1;
            String a=jTextField1.getText();
            String sql="select Mail_ID,fromm,Date,Subject from mail where too = '"+a+"' and Reciever = '"+f+"'";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
            pst.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try
        {
            String f=""+1;
            String a=jTextField1.getText();
            String sql="select Mail_ID,too,Date,Subject from mail where fromm = '"+a+"' and Sender = '"+f+"'";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
            pst.close();
            
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        id=jTextField2.getText();
        ds=jTextField1.getText();
        String sql="select * from mail where Mail_ID='"+id+"'";
        try
        {
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next())
            {
                String g=""+1;
                String s=rs.getString("fromm");
                String r=rs.getString("too");
                String check=rs.getString("fromm");
                String check2=rs.getString("too");
                String d=rs.getString("Reciever");
                String dd=rs.getString("Sender");
                if((s.equals(ds) || r.equals(ds)))
                {
                    if(check.equals(jTextField1.getText()) && dd.equals(g))
                    {
                        rs.close();
                        pst.close();
                        setVisible(false);
                        viewmail2 c = new viewmail2();
                        c.setVisible(true);
                    }
                    else if(check2.equals(jTextField1.getText()) && d.equals(g))
                    {
                        rs.close();
                        pst.close();
                        setVisible(false);
                        viewmail2 c = new viewmail2();
                        c.setVisible(true);
                    }
                    else
                    {
                        rs.close();
                        pst.close();
                        JOptionPane.showMessageDialog(null, "Invalid Mail_ID");
                    }
                    
                }
                else
                {
                    rs.close();
                    pst.close();
                    JOptionPane.showMessageDialog(null, "invalid mail id");
                }
               
            }
            else
            {
                rs.close();
                pst.close();
                JOptionPane.showMessageDialog(null, "invalid mail id");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        finally
        {
            try
            {
                rs.close();
                pst.close();
            }
            catch(Exception e)
            {
            }
        }
        /*id=jTextField2.getText();
        ds=jTextField1.getText();
        String sql="select * from mail where Mail_ID='"+id+"'";
        try
        {
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next())
            {
                String s=rs.getString("fromm");
                String r=rs.getString("too");
                if(s.equals(ds) || r.equals(ds))
                {
                    rs.close();
                    pst.close();
                    setVisible(false);
                    viewmail2 c = new viewmail2();
                    c.setVisible(true);
                }
                else
                {
                    rs.close();
                    pst.close();
                    JOptionPane.showMessageDialog(null, "invalid mail id");
                }
                
            }
            else
            {
                rs.close();
                pst.close();
                JOptionPane.showMessageDialog(null, "invalid mail id");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        finally
        {
            try
            {
                rs.close();
                pst.close();
            }
            catch(Exception e)
            {
            }
        }
        */
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String g=""+0;
        String p=""+1;
        String sql="select * from mail where Mail_ID = ?";
        String sql2="update mail set Reciever = '"+g+"' where Mail_ID=?";
        String sql3="update mail set Sender = '"+g+"' where Mail_ID=?";
        try
        {
            pst=conn.prepareStatement(sql);
            pst.setString(1, jTextField2.getText());
            rs=pst.executeQuery();
            if(rs.next())
            {
                r=rs.getString("fromm");
                s=rs.getString("too");
                c=jTextField1.getText();
                rr=rs.getString("Reciever");
                ss=rs.getString("Sender");
                rs.close();
                pst.close();
            }
            if(r.equals(c) && ss.equals(p))
            {
                
                pst=conn.prepareStatement(sql3);
                pst.setString(1, jTextField2.getText());
                pst.execute();
                pst.close();
                JOptionPane.showMessageDialog(null, "Mail Deleted");
            }
            if(s.equals(c) && rr.equals(p))
            {
                
                pst=conn.prepareStatement(sql2);
                pst.setString(1, jTextField2.getText());
                pst.execute();
                pst.close();
                JOptionPane.showMessageDialog(null, "Mail Deleted");
            }
            if(!(r.equals(c) && ss.equals(p)) && !(s.equals(c) && rr.equals(p)))
            {
                JOptionPane.showMessageDialog(null, "Invaid Mail_ID");
            }
           rs.close();
           pst.close();
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Invalid Mail_ID");
        }
        finally
        {
            try
            {
                rs.close();
                pst.close();
            }
            catch(Exception e){}
        }
               
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(seemail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(seemail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(seemail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(seemail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new seemail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
