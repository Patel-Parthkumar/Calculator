/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

/**
 *
 * @author PARTH PATEL
 */
public class loginform extends javax.swing.JFrame {

    /**
     * Creates new form loginform
     */
    public loginform() {
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

        msgAlert = new javax.swing.JDialog();
        msgLabel = new javax.swing.JLabel();
        BackBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        upass = new javax.swing.JPasswordField();
        sbmtBtn = new javax.swing.JButton();
        rstBtn = new javax.swing.JButton();
        rstBtn1 = new javax.swing.JButton();
        rstBtn2 = new javax.swing.JButton();

        BackBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BackBtn.setText("Back to Login");

        javax.swing.GroupLayout msgAlertLayout = new javax.swing.GroupLayout(msgAlert.getContentPane());
        msgAlert.getContentPane().setLayout(msgAlertLayout);
        msgAlertLayout.setHorizontalGroup(
            msgAlertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(msgAlertLayout.createSequentialGroup()
                .addGroup(msgAlertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(msgAlertLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(msgLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(msgAlertLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 96, Short.MAX_VALUE)))
                .addContainerGap())
        );
        msgAlertLayout.setVerticalGroup(
            msgAlertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(msgAlertLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(msgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(BackBtn)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Form");
        setIconImage(new ImageIcon("D://parth.jpg").getImage());

        jLabel1.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("      LOGIN FORM");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Username :-");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Password :-");

        uname.setForeground(new java.awt.Color(255, 0, 0));

        upass.setForeground(new java.awt.Color(255, 0, 0));
        upass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upassActionPerformed(evt);
            }
        });

        sbmtBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        sbmtBtn.setForeground(new java.awt.Color(0, 0, 204));
        sbmtBtn.setText("Submit");
        sbmtBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbmtBtnActionPerformed(evt);
            }
        });

        rstBtn.setBackground(new java.awt.Color(0, 255, 153));
        rstBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rstBtn.setForeground(new java.awt.Color(0, 0, 204));
        rstBtn.setText("Reset");
        rstBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rstBtnActionPerformed(evt);
            }
        });

        rstBtn1.setBackground(new java.awt.Color(0, 255, 153));
        rstBtn1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rstBtn1.setForeground(new java.awt.Color(0, 0, 204));
        rstBtn1.setText("Exit");
        rstBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rstBtn1ActionPerformed(evt);
            }
        });

        rstBtn2.setBackground(new java.awt.Color(204, 0, 153));
        rstBtn2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rstBtn2.setForeground(new java.awt.Color(0, 0, 204));
        rstBtn2.setText("About");
        rstBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rstBtn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sbmtBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rstBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rstBtn2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rstBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 38, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(uname)
                            .addComponent(upass, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(uname, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(upass, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sbmtBtn)
                    .addComponent(rstBtn)
                    .addComponent(rstBtn1)
                    .addComponent(rstBtn2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(366, 221));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sbmtBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbmtBtnActionPerformed
        // TODO add your handling code here:
        String password= new String(upass.getPassword());
        String username=uname.getText();
        if(password.equals("admin") && username.equals("Admin")){
            
        calculator_ ob=new calculator_();
        ob.setVisible(true);
        this.setVisible(false);}
        else{
           JOptionPane.showMessageDialog(this,"You entered invalid username or password!! Try again");
                   }
        
    }//GEN-LAST:event_sbmtBtnActionPerformed

    private void rstBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rstBtnActionPerformed
        // TODO add your handling code here:
        uname.setText("");
        upass.setText("");
    }//GEN-LAST:event_rstBtnActionPerformed

    private void upassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upassActionPerformed
   
    }//GEN-LAST:event_upassActionPerformed

    private void rstBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rstBtn1ActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_rstBtn1ActionPerformed

    private void rstBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rstBtn2ActionPerformed
       about_ ob=new about_();
        ob.setVisible(true); 
         this.setVisible(false);  // TODO add your handling code here:
    }//GEN-LAST:event_rstBtn2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new loginform().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JDialog msgAlert;
    private javax.swing.JLabel msgLabel;
    private javax.swing.JButton rstBtn;
    private javax.swing.JButton rstBtn1;
    private javax.swing.JButton rstBtn2;
    private javax.swing.JButton sbmtBtn;
    private javax.swing.JTextField uname;
    private javax.swing.JPasswordField upass;
    // End of variables declaration//GEN-END:variables
}
