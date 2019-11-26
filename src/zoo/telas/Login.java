/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo.telas;

import java.awt.Color;
import java.awt.Cursor;

/**
 *
 * @author Bruno
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Login() {
        initComponents();
        jButtonEntrar.setBackground(new Color (0,0,0,0));
        
        jLabelCriarConta.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        jButtonEntrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButtonEntrar = new javax.swing.JButton();
        jLabelCriarConta = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabelM = new javax.swing.JLabel();
        campo_email = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(102, 102, 102));
        jCheckBox1.setText("Lembrar de Mim");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 120, 30));

        jButtonEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zoo/Imagens/botao_login.png"))); // NOI18N
        jButtonEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEntrarMouseClicked(evt);
            }
        });
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 70, 70));

        jLabelCriarConta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCriarConta.setForeground(new java.awt.Color(51, 51, 51));
        jLabelCriarConta.setText("Criar Conta");
        jLabelCriarConta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCriarContaMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelCriarConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 80, 20));

        jPasswordField1.setBackground(new java.awt.Color(204, 204, 204));
        jPasswordField1.setForeground(new java.awt.Color(102, 102, 102));
        jPasswordField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 110, 30));

        jLabelM.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelM.setForeground(new java.awt.Color(102, 102, 102));
        jLabelM.setText("Email");
        getContentPane().add(jLabelM, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, -1, -1));

        campo_email.setBackground(new java.awt.Color(204, 204, 204));
        campo_email.setForeground(new java.awt.Color(102, 102, 102));
        campo_email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campo_email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campo_emailMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo_emailMousePressed(evt);
            }
        });
        campo_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_emailActionPerformed(evt);
            }
        });
        getContentPane().add(campo_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 110, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Senha");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zoo/Imagens/tela_login.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campo_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_emailActionPerformed
        
    }//GEN-LAST:event_campo_emailActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void campo_emailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo_emailMouseClicked

    }//GEN-LAST:event_campo_emailMouseClicked

    private void campo_emailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo_emailMousePressed

    }//GEN-LAST:event_campo_emailMousePressed

    private void jLabelCriarContaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCriarContaMouseClicked
        
        CadUsuarios CadUsu = new CadUsuarios();
        Login login = new Login();
        login.setVisible(false);
        CadUsu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabelCriarContaMouseClicked

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
        
        principal princ = new principal();
        Login login = new Login();
        
        princ.setVisible(true);
        login.setVisible(false);
        
        dispose();
        

    }//GEN-LAST:event_jButtonEntrarActionPerformed

    private void jButtonEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEntrarMouseClicked

    }//GEN-LAST:event_jButtonEntrarMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campo_email;
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelCriarConta;
    private javax.swing.JLabel jLabelM;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    // End of variables declaration//GEN-END:variables
}
