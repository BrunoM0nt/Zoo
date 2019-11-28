/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo.telas;

import java.awt.Color;
import java.awt.Cursor;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import zoo.usuarios.InicioProg;
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

        //Icone
        this.setIconImage(new ImageIcon(getClass().getResource("/zoo/Imagens/iCON.png")).getImage());

        //Background
        jButtonConfirmarCadastro.setBackground(new Color(0, 0, 0, 0));

        //Cursor
        jButtonConfirmarCadastro.setCursor(new Cursor(Cursor.HAND_CURSOR));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonConfirmarCadastro = new javax.swing.JButton();
        jPasswordFieldConfirmarSenha = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldCPF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldSobrenome = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonConfirmarCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zoo/Imagens/botao_confirmar_cadastro.png"))); // NOI18N
        jButtonConfirmarCadastro.setBorder(null);
        jButtonConfirmarCadastro.setOpaque(false);
        jButtonConfirmarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmarCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 70, 70));

        jPasswordFieldConfirmarSenha.setBackground(new java.awt.Color(204, 204, 204));
        jPasswordFieldConfirmarSenha.setForeground(new java.awt.Color(102, 102, 102));
        jPasswordFieldConfirmarSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jPasswordFieldConfirmarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 130, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Conf. Senha");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, -1, -1));

        jPasswordFieldSenha.setBackground(new java.awt.Color(204, 204, 204));
        jPasswordFieldSenha.setForeground(new java.awt.Color(102, 102, 102));
        jPasswordFieldSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordFieldSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordFieldSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 130, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Senha");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, -1));

        jTextFieldEmail.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldEmail.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 130, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Email");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, -1, -1));

        jTextFieldCPF.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldCPF.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldCPF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCPF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldCPFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldCPFFocusLost(evt);
            }
        });
        getContentPane().add(jTextFieldCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 130, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("CPF");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Sobrenome");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, -1));

        jTextFieldSobrenome.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldSobrenome.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldSobrenome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldSobrenome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldSobrenomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldSobrenomeFocusLost(evt);
            }
        });
        getContentPane().add(jTextFieldSobrenome, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 130, 30));

        jTextFieldNome.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldNome.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldNome.setToolTipText("");
        jTextFieldNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldNomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldNomeFocusLost(evt);
            }
        });
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 130, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Nome");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zoo/Imagens/tela_cadastro.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordFieldSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldSenhaActionPerformed

    }//GEN-LAST:event_jPasswordFieldSenhaActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed


    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jButtonConfirmarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarCadastroActionPerformed

        Usuarios usuario = new Usuarios();

        jButtonConfirmarCadastro.setCursor(new Cursor(Cursor.HAND_CURSOR));
        usuario.setNome(jTextFieldNome.getText());
        usuario.setSobrenome(jTextFieldSobrenome.getText());
        usuario.setCpf(jTextFieldCPF.getText());
        usuario.setEmail(jTextFieldEmail.getText());
        usuario.setSenha(jPasswordFieldSenha.getText());
        usuario.setConfirmaSenha(jPasswordFieldConfirmarSenha.getText());

        if (usuario.getNome().isEmpty() || usuario.getSobrenome().isEmpty() || usuario.getCpf().isEmpty() || usuario.getEmail().isEmpty() || usuario.getSenha().isEmpty() || usuario.getConfirmaSenha().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos Os Campos Devem Ser Preenchidos");

            if (usuario.getNome().isEmpty()) {
                jTextFieldNome.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red));
            }
            if (usuario.getSobrenome().isEmpty()) {
                jTextFieldSobrenome.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red));
            }
            if (usuario.getCpf().isEmpty()) {
                jTextFieldCPF.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red));
            }
            if (usuario.getEmail().isEmpty()) {
                jTextFieldEmail.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red));
            }
            if (usuario.getSenha().isEmpty()) {
                jPasswordFieldSenha.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red));
            }
            if (usuario.getConfirmaSenha().isEmpty()) {
                jPasswordFieldConfirmarSenha.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red));
            }
        } else {
            if (usuario.getSenha().equals(usuario.getConfirmaSenha())) {
                
                //Adição de um novo user
                usuario.setId(InicioProg.getUserLength() + 1);
                InicioProg.addUser(usuario);
                InicioProg.cadUs.setVisible(false);
                
            } else {
                JOptionPane.showMessageDialog(null, "Senhas nao coincidem!");
                jPasswordFieldSenha.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red));
                jPasswordFieldConfirmarSenha.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red));
                return;
            }
            jTextFieldNome.setText("");
            jTextFieldEmail.setText("");
            jTextFieldSobrenome.setText("");
            jTextFieldCPF.setText("");
            jPasswordFieldSenha.setText("");
            jPasswordFieldConfirmarSenha.setText("");
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
            InicioProg.login.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jButtonConfirmarCadastroActionPerformed

// placeholder dos campos de cadastro 

    private void jTextFieldNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldNomeFocusGained
        /*      if (jTextFieldNome.getText().equals("Nome")) {
         jTextFieldNome.setText("");
         jTextFieldNome.setForeground(Color.BLACK);
         }*/
    }//GEN-LAST:event_jTextFieldNomeFocusGained

    private void jTextFieldNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldNomeFocusLost
        /*    if (jTextFieldNome.getText().isEmpty()) {
         jTextFieldNome.setForeground(Color.GRAY);
         jTextFieldNome.setText("Nome");
         }*/
    }//GEN-LAST:event_jTextFieldNomeFocusLost

    private void jTextFieldSobrenomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldSobrenomeFocusGained
        /*  if (jTextFieldSobrenome.getText().equals("Sobrenome")) {
         jTextFieldSobrenome.setText("");
         jTextFieldSobrenome.setForeground(Color.BLACK);
         }*/
    }//GEN-LAST:event_jTextFieldSobrenomeFocusGained

    private void jTextFieldSobrenomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldSobrenomeFocusLost
        /*  if (jTextFieldSobrenome.getText().isEmpty()) {
         jTextFieldSobrenome.setForeground(Color.GRAY);
         jTextFieldSobrenome.setText("Sobrenome");
         }*/
    }//GEN-LAST:event_jTextFieldSobrenomeFocusLost

    private void jTextFieldCPFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldCPFFocusGained
        /*     if (jTextFieldCPF.getText().equals("Sobrenome")) {
         jTextFieldCPF.setText("");
         jTextFieldCPF.setForeground(Color.BLACK);
         }*/
    }//GEN-LAST:event_jTextFieldCPFFocusGained

    private void jTextFieldCPFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldCPFFocusLost
        /*    if (jTextFieldCPF.getText().isEmpty()) {
         jTextFieldCPF.setForeground(Color.GRAY);
         jTextFieldCPF.setText("Sobrenome");
         }*/
    }//GEN-LAST:event_jTextFieldCPFFocusLost

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField jPasswordFieldConfirmarSenha;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldCPF;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldSobrenome;
    // End of variables declaration//GEN-END:variables
}
