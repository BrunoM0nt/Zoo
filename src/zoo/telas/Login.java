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
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import zoo.usuarios.*;
import static zoo.usuarios.InicioProg.listUsers;

/**
 *
 * @author Bruno
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    //ADMindex
    int lastSelectedIndex = -1;
    
    public Login() {
        initComponents();

        //Icone
        this.setIconImage(new ImageIcon(getClass().getResource("/zoo/Imagens/iCON.png")).getImage());

        //Background
        jButtonEntrar.setBackground(new Color(0, 0, 0, 0));

        //Cursor
        jLabelCriarConta.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jButtonEntrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        //ADM
        painelUser.setVisible(false);
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
        jButtonEntrar = new javax.swing.JButton();
        loginSenha = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        campo_email = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabelCriarConta = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        painelUser = new javax.swing.JPanel();
        scrollPainel = new javax.swing.JScrollPane();
        jList = new javax.swing.JList();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        login_ADM_Senha = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        login_ADM_Cpf = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        login_ADM_Email = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        login_ADM_Id = new javax.swing.JLabel();
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

        jButtonEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zoo/Imagens/botao_login.png"))); // NOI18N
        jButtonEntrar.setBorder(null);
        jButtonEntrar.setOpaque(false);
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

        loginSenha.setBackground(new java.awt.Color(204, 204, 204));
        loginSenha.setForeground(new java.awt.Color(102, 102, 102));
        loginSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        loginSenha.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.lightGray));
        loginSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                loginSenhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                loginSenhaFocusLost(evt);
            }
        });
        getContentPane().add(loginSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 110, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Senha");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, -1, -1));

        campo_email.setBackground(new java.awt.Color(204, 204, 204));
        campo_email.setForeground(new java.awt.Color(102, 102, 102));
        campo_email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campo_email.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.lightGray));
        campo_email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campo_emailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campo_emailFocusLost(evt);
            }
        });
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

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Email");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, -1, -1));

        jLabelCriarConta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCriarConta.setText("Criar Conta");
        jLabelCriarConta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCriarContaMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelCriarConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 80, 20));

        jToggleButton1.setText("Total de contas criadas! ADM_OPTION");
        jToggleButton1.setToolTipText("Necessario o TOKEN");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 320, -1));

        jList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "A" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jList.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jListFocusGained(evt);
            }
        });
        jList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListMouseClicked(evt);
            }
        });
        jList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListValueChanged(evt);
            }
        });
        scrollPainel.setViewportView(jList);

        jLabel7.setText("NOME");

        jLabel4.setText("Senha:");

        jLabel6.setText("CPF:");

        jLabel8.setText("Email:");

        jLabel9.setText("ID");

        javax.swing.GroupLayout painelUserLayout = new javax.swing.GroupLayout(painelUser);
        painelUser.setLayout(painelUserLayout);
        painelUserLayout.setHorizontalGroup(
            painelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelUserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPainel, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(login_ADM_Senha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(login_ADM_Cpf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(login_ADM_Email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(login_ADM_Id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelUserLayout.createSequentialGroup()
                        .addGroup(painelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelUserLayout.setVerticalGroup(
            painelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelUserLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollPainel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(5, 5, 5)
                .addComponent(login_ADM_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(login_ADM_Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(login_ADM_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(login_ADM_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );

        getContentPane().add(painelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 210, 370));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zoo/Imagens/tela_login.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campo_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_emailActionPerformed

    }//GEN-LAST:event_campo_emailActionPerformed

    private void campo_emailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo_emailMouseClicked

    }//GEN-LAST:event_campo_emailMouseClicked

    private void campo_emailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo_emailMousePressed

    }//GEN-LAST:event_campo_emailMousePressed

    private void jLabelCriarContaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCriarContaMouseClicked
        InicioProg.login.setVisible(false);
        InicioProg.cadUs.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabelCriarContaMouseClicked

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
        int aux, auxEmail = -1, auxSenha = -1, IdConnected;
        
        if (loginSenha.getText().equals("") || campo_email.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos");
            if (loginSenha.getText().equals("")) {
                loginSenha.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red));

            }
            if (campo_email.getText().equals("")) {
                
                campo_email.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red));
                
            }
            
        } else {
            for(aux = 0; aux < InicioProg.getUserLength(); aux++){
                if(campo_email.getText().equals(InicioProg.getUserEmail(aux))){
                    auxEmail = aux;
                }
                if(loginSenha.getText().equals(InicioProg.getUserSenha(aux))){
                    auxSenha = aux;
                }
        } 
            if(auxEmail != -1 && auxSenha != -1 && auxEmail == auxSenha){
                InicioProg.login.setVisible(false);
                IdConnected = auxEmail;
                InicioProg.setConnectedUser(IdConnected);
                InicioProg.principal.openWindow();
                dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Senha ou E-mail Incorreto!");
            }
            
        }

    }//GEN-LAST:event_jButtonEntrarActionPerformed

    private void jButtonEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEntrarMouseClicked

    }//GEN-LAST:event_jButtonEntrarMouseClicked

    private void campo_emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campo_emailFocusGained
 campo_email.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.LIGHT_GRAY));
    
    }//GEN-LAST:event_campo_emailFocusGained

    private void campo_emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campo_emailFocusLost

    
    }//GEN-LAST:event_campo_emailFocusLost

    private void loginSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginSenhaFocusGained
loginSenha.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.LIGHT_GRAY));
    }//GEN-LAST:event_loginSenhaFocusGained

    private void loginSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginSenhaFocusLost

    }//GEN-LAST:event_loginSenhaFocusLost

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        String TOKEN;        
        TOKEN = JOptionPane.showInputDialog("Digite o TOKEN:");
        if(TOKEN.equals("token")){
            try{
                
                jList.setListData(listUsers);
                scrollPainel.setViewportView(jList);
                painelUser.setVisible(true);                
            }catch (Exception e){
                
                JOptionPane.showMessageDialog(null, "Erro!");        
                
            }
        }else{
            
            JOptionPane.showMessageDialog(null, "Token Incorreto!\nContate o ADM"); 
            
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed
    
    
    private void jListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListValueChanged
        //JOptionPane.showMessageDialog(null, evt);
    }//GEN-LAST:event_jListValueChanged

    private void jListFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jListFocusGained
   
    }//GEN-LAST:event_jListFocusGained

    private void jListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListMouseClicked
               if(lastSelectedIndex != jList.getSelectedIndex()){
            try{
                lastSelectedIndex = jList.getSelectedIndex();
                login_ADM_Senha.setText(InicioProg.getUserSenha(lastSelectedIndex));
                login_ADM_Email.setText(InicioProg.getUserEmail(lastSelectedIndex));
                login_ADM_Cpf.setText(InicioProg.getUserCpf(lastSelectedIndex));
                login_ADM_Id.setText(Integer.toString(InicioProg.getUserId(lastSelectedIndex)));
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            
        }
         
    }//GEN-LAST:event_jListMouseClicked

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
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCriarConta;
    private javax.swing.JList jList;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JPasswordField loginSenha;
    private javax.swing.JLabel login_ADM_Cpf;
    private javax.swing.JLabel login_ADM_Email;
    private javax.swing.JLabel login_ADM_Id;
    private javax.swing.JLabel login_ADM_Senha;
    private javax.swing.JPanel painelUser;
    private javax.swing.JScrollPane scrollPainel;
    // End of variables declaration//GEN-END:variables
}
