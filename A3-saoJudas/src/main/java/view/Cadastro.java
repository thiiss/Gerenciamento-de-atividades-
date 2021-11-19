/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Controller.CadastroController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author diogo
 */
public class Cadastro extends javax.swing.JFrame {

      /**
     * Creates new form CadastroU
     */
    public Cadastro() {
        initComponents();
        this.setLocationRelativeTo(null);
        JTextFieldNomeCompletoForm.setDocument(new Documento(50));
        JTextFieldEmailForm.setDocument(new Documento(30));
        JTextFieldTelefoneForm.setDocument(new Documento(11));
        JTextFieldUsuario.setDocument(new Documento(10));
        jPassword.setDocument(new Documento(10));
        jPasswordConfirme.setDocument(new Documento(10));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabeCadastroUsuario = new javax.swing.JLabel();
        jLabelInformacaoUsuario = new javax.swing.JLabel();
        jLabelNomeCompleto = new javax.swing.JLabel();
        JTextFieldNomeCompletoForm = new javax.swing.JTextField();
        jLabelEmailUsario = new javax.swing.JLabel();
        JTextFieldEmailForm = new javax.swing.JTextField();
        jLabelTelefone = new javax.swing.JLabel();
        JTextFieldTelefoneForm = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        JTextFieldUsuario = new javax.swing.JTextField();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jPassword = new javax.swing.JPasswordField();
        jLabelComfirmePassword = new javax.swing.JLabel();
        jPasswordConfirme = new javax.swing.JPasswordField();
        jButtonVoltar = new javax.swing.JButton();
        jButtonEnviar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabeCadastroUsuario.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabeCadastroUsuario.setText("Cadastro Úsuario");

        jLabelInformacaoUsuario.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabelInformacaoUsuario.setText("Informações úsuario");

        jLabelNomeCompleto.setText("Nome Completo");

        jLabelEmailUsario.setText("E-mail");

        jLabelTelefone.setText("Telefone");

        JTextFieldTelefoneForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldTelefoneFormActionPerformed(evt);
            }
        });

        jLabelUsuario.setText("Úsuario");

        jLabelPassword.setText("Senha");

        jLabelComfirmePassword.setText("Confirme Senha");

        jPasswordConfirme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordConfirmeActionPerformed(evt);
            }
        });

        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jButtonEnviar.setText("Enviar");
        jButtonEnviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEnviarMouseClicked(evt);
            }
        });
        jButtonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelInformacaoUsuario)
                            .addComponent(jLabelNomeCompleto)
                            .addComponent(jLabeCadastroUsuario))
                        .addGap(0, 76, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonEnviar)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelEmailUsario)
                                .addComponent(jLabelTelefone)
                                .addComponent(jLabelUsuario)
                                .addComponent(jLabelPassword)
                                .addComponent(jLabelComfirmePassword))
                            .addGap(0, 133, Short.MAX_VALUE))
                        .addComponent(JTextFieldTelefoneForm)
                        .addComponent(JTextFieldEmailForm)
                        .addComponent(JTextFieldNomeCompletoForm)
                        .addComponent(JTextFieldUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                        .addComponent(jPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                        .addComponent(jPasswordConfirme, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabeCadastroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabelInformacaoUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNomeCompleto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 326, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEnviar)
                    .addComponent(jButtonVoltar))
                .addGap(41, 41, 41))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(112, 112, 112)
                    .addComponent(JTextFieldNomeCompletoForm, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabelEmailUsario)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(JTextFieldEmailForm, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabelTelefone)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(JTextFieldTelefoneForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabelUsuario)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(JTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabelPassword)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabelComfirmePassword)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPasswordConfirme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(89, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTextFieldTelefoneFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldTelefoneFormActionPerformed
        
    }//GEN-LAST:event_JTextFieldTelefoneFormActionPerformed

    private void jPasswordConfirmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordConfirmeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordConfirmeActionPerformed

    private void jButtonEnviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEnviarMouseClicked
        
    }//GEN-LAST:event_jButtonEnviarMouseClicked

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        Login telalogin = new Login();
        telalogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnviarActionPerformed
        String nomeCompleto = this.getJTextFieldNomeCompletoForm().getText();
        String email = this.getJTextFieldEmailForm().getText();
        String telefone = this.getJTextFieldTelefoneForm().getText();
        String usuario = this.getJTextFieldUsuario().getText();
        String senha = this.getjPassword().getText();
        String confirmarsenha = this.getjPasswordConfirme().getText();
    
        if(senha.equals (confirmarsenha)){
            CadastroController cadastroUsuario = new CadastroController(nomeCompleto,email,telefone, usuario, senha);
        try {
            cadastroUsuario.cadastrarUsuario();
        } catch (SQLException ex) {
            Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
        }else{
               JOptionPane.showMessageDialog(null, "senhas não conferem"); 
        }
    }//GEN-LAST:event_jButtonEnviarActionPerformed

    public JTextField getJTextFieldEmailForm() {
        return JTextFieldEmailForm;
    }

    public void setJTextFieldEmailForm(JTextField JTextFieldEmailForm) {
        this.JTextFieldEmailForm = JTextFieldEmailForm;
    }

    public JTextField getJTextFieldNomeCompletoForm() {
        return JTextFieldNomeCompletoForm;
    }

    public void setJTextFieldNomeCompletoForm(JTextField JTextFieldNomeCompletoForm) {
        this.JTextFieldNomeCompletoForm = JTextFieldNomeCompletoForm;
    }

    public JTextField getJTextFieldTelefoneForm() {
        return JTextFieldTelefoneForm;
    }

    public void setJTextFieldTelefoneForm(JTextField JTextFieldTelefoneForm) {
        this.JTextFieldTelefoneForm = JTextFieldTelefoneForm;
    }

    public JTextField getJTextFieldUsuario() {
        return JTextFieldUsuario;
    }

    public void setJTextFieldUsuario(JTextField JTextFieldUsuario) {
        this.JTextFieldUsuario = JTextFieldUsuario;
    }

    public JPasswordField getjPassword() {
        return jPassword;
    }

    public void setjPassword(JPasswordField jPassword) {
        this.jPassword = jPassword;
    }

    public JPasswordField getjPasswordConfirme() {
        return jPasswordConfirme;
    }

    public void setjPasswordConfirme(JPasswordField jPasswordConfirme) {
        this.jPasswordConfirme = jPasswordConfirme;
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTextFieldEmailForm;
    private javax.swing.JTextField JTextFieldNomeCompletoForm;
    private javax.swing.JTextField JTextFieldTelefoneForm;
    private javax.swing.JTextField JTextFieldUsuario;
    private javax.swing.JButton jButtonEnviar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabeCadastroUsuario;
    private javax.swing.JLabel jLabelComfirmePassword;
    private javax.swing.JLabel jLabelEmailUsario;
    private javax.swing.JLabel jLabelInformacaoUsuario;
    private javax.swing.JLabel jLabelNomeCompleto;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JPasswordField jPasswordConfirme;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

}

class Documento extends PlainDocument{
    
        int tam = 0;
    public Documento(int a){
        this.tam = a;
    }
    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
      int tamanho = this.getLength() + str.length();
      if(tamanho <= tam){
        super.insertString(offs, str, a);
      }else{
        super.insertString(offs, str.replaceAll("[aA0-zZ9]",""), a);
      }
    }
    
    
}