/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo.telas;

import java.awt.Color;
import static java.awt.Color.green;
import java.util.ArrayList;
import static javafx.scene.paint.Color.color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import zoo.usuarios.Usuarios;

/**
 *
 * @author Pc27sala06
 */
public class CadUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form CadUsuarios
     */
    public CadUsuarios() {
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

        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldSobrenome = new javax.swing.JTextField();
        jTextFieldCPF = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jButtonConfirmarCadastro = new javax.swing.JButton();
        jPasswordFieldConfirmarSenha = new javax.swing.JPasswordField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldNome.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldNome.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldNome.setText("Nome");
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 130, 30));

        jTextFieldSobrenome.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldSobrenome.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldSobrenome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldSobrenome.setText("Sobrenome");
        getContentPane().add(jTextFieldSobrenome, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 130, 30));

        jTextFieldCPF.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldCPF.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldCPF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCPF.setText("CPF");
        getContentPane().add(jTextFieldCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 130, 30));

        jTextFieldEmail.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldEmail.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldEmail.setText("Email");
        getContentPane().add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 130, 30));

        jButtonConfirmarCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zoo/Imagens/botao_confirmar_cadastro.png"))); // NOI18N
        jButtonConfirmarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmarCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, 70, 60));

        jPasswordFieldConfirmarSenha.setBackground(new java.awt.Color(204, 204, 204));
        jPasswordFieldConfirmarSenha.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(jPasswordFieldConfirmarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 320, 130, 30));

        jPasswordFieldSenha.setBackground(new java.awt.Color(204, 204, 204));
        jPasswordFieldSenha.setForeground(new java.awt.Color(102, 102, 102));
        jPasswordFieldSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordFieldSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 130, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zoo/Imagens/tela_cadastro.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConfirmarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarCadastroActionPerformed
        Usuarios usuario = new Usuarios();

        usuario.setNome(jTextFieldNome.getText());
        usuario.setSobrenome(jTextFieldSobrenome.getText());
        usuario.setCpf(jTextFieldCPF.getText());
        usuario.setEmail(jTextFieldEmail.getText());
        usuario.setSenha(jPasswordFieldSenha.getText());
        usuario.setConfirmaSenha(jPasswordFieldConfirmarSenha.getText());
        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");

        if (usuario.getNome().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O Nome deve Ser Preenchido");
            jTextFieldNome.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red));
            if (usuario.getSobrenome().isEmpty()) {
                JOptionPane.showMessageDialog(null, "O Sobreno deve Ser Preenchido");
                jTextFieldSobrenome.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red));

            }
            if (usuario.getCpf().isEmpty()) {
                JOptionPane.showMessageDialog(null, "O CPF deve Ser Preenchido");
                jTextFieldCPF.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red));

            }
            if (usuario.getEmail().isEmpty()) {
                JOptionPane.showMessageDialog(null, "O Email deve Ser Preenchido");
                jTextFieldEmail.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red));

            }
            if (usuario.getSenha().isEmpty()) {
                JOptionPane.showMessageDialog(null, "A Senha deve Ser Preenchido");
                jPasswordFieldSenha.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red));

            }
            if (usuario.getConfirmaSenha().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Confirmar senha deve Ser Preenchido");
                jPasswordFieldConfirmarSenha.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red));

            }
        } else {
            CadUsuarios CadUsu = new CadUsuarios();
            Login login = new Login();
            login.setVisible(true);
            CadUsu.setVisible(false);
            dispose();
        }
    }//GEN-LAST:event_jButtonConfirmarCadastroActionPerformed

    private void jPasswordFieldSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldSenhaActionPerformed

    }//GEN-LAST:event_jPasswordFieldSenhaActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed


    }//GEN-LAST:event_jTextFieldNomeActionPerformed

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
            java.util.logging.Logger.getLogger(CadUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConfirmarCadastro;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField jPasswordFieldConfirmarSenha;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldCPF;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldSobrenome;
    // End of variables declaration//GEN-END:variables
}
