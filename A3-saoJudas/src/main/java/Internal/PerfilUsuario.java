package Internal;

import model.Usuario;

public class PerfilUsuario extends javax.swing.JInternalFrame {
    
    //private final Usuario usuarioLogado;

    public PerfilUsuario() {
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formularioDeUsuario = new javax.swing.JPanel();
        jLabelInformacaoUsuario2 = new javax.swing.JLabel();
        jLabelNomeCompleto2 = new javax.swing.JLabel();
        fieldNome = new javax.swing.JTextField();
        jLabelEmailUsario2 = new javax.swing.JLabel();
        fieldEmail = new javax.swing.JTextField();
        jLabelTelefone2 = new javax.swing.JLabel();
        fieldTelefone = new javax.swing.JTextField();
        fieldUsuario = new javax.swing.JTextField();
        jLabelUsuario2 = new javax.swing.JLabel();
        jLabelPassword2 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        jLabelComfirmePassword2 = new javax.swing.JLabel();
        passwordField1 = new javax.swing.JPasswordField();
        jButtonVoltar2 = new javax.swing.JButton();
        jButtonEnviar2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jLabelInformacaoUsuario2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabelInformacaoUsuario2.setText("Informações úsuario");

        jLabelNomeCompleto2.setText("Nome Completo");

        jLabelEmailUsario2.setText("E-mail");

        jLabelTelefone2.setText("Telefone");

        fieldTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldTelefoneActionPerformed(evt);
            }
        });

        jLabelUsuario2.setText("Úsuario");

        jLabelPassword2.setText("Senha");

        jLabelComfirmePassword2.setText("Confirme Senha");

        passwordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordField1ActionPerformed(evt);
            }
        });

        jButtonVoltar2.setText("Voltar");
        jButtonVoltar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltar2ActionPerformed(evt);
            }
        });

        jButtonEnviar2.setText("Salvar");
        jButtonEnviar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEnviar2MouseClicked(evt);
            }
        });
        jButtonEnviar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnviar2ActionPerformed(evt);
            }
        });

        jButton4.setText("Deletar");

        javax.swing.GroupLayout formularioDeUsuarioLayout = new javax.swing.GroupLayout(formularioDeUsuario);
        formularioDeUsuario.setLayout(formularioDeUsuarioLayout);
        formularioDeUsuarioLayout.setHorizontalGroup(
            formularioDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formularioDeUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formularioDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldNome, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fieldEmail)
                    .addComponent(fieldTelefone)
                    .addComponent(fieldUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                    .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                    .addComponent(passwordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                    .addGroup(formularioDeUsuarioLayout.createSequentialGroup()
                        .addGroup(formularioDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelInformacaoUsuario2)
                            .addComponent(jLabelNomeCompleto2)
                            .addComponent(jLabelEmailUsario2)
                            .addComponent(jLabelTelefone2)
                            .addComponent(jLabelUsuario2)
                            .addComponent(jLabelPassword2)
                            .addComponent(jLabelComfirmePassword2)
                            .addGroup(formularioDeUsuarioLayout.createSequentialGroup()
                                .addComponent(jButtonVoltar2)
                                .addGap(39, 39, 39)
                                .addComponent(jButton4)
                                .addGap(26, 26, 26)
                                .addComponent(jButtonEnviar2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        formularioDeUsuarioLayout.setVerticalGroup(
            formularioDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formularioDeUsuarioLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabelInformacaoUsuario2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNomeCompleto2)
                .addGap(0, 0, 0)
                .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelEmailUsario2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelTelefone2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelUsuario2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabelPassword2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelComfirmePassword2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(formularioDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVoltar2)
                    .addComponent(jButton4)
                    .addComponent(jButtonEnviar2))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(formularioDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(formularioDeUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldTelefoneActionPerformed

    }//GEN-LAST:event_fieldTelefoneActionPerformed

    private void passwordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordField1ActionPerformed

    private void jButtonVoltar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltar2ActionPerformed

    }//GEN-LAST:event_jButtonVoltar2ActionPerformed

    private void jButtonEnviar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEnviar2MouseClicked

    }//GEN-LAST:event_jButtonEnviar2MouseClicked

    private void jButtonEnviar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnviar2ActionPerformed

    }//GEN-LAST:event_jButtonEnviar2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fieldEmail;
    private javax.swing.JTextField fieldNome;
    private javax.swing.JTextField fieldTelefone;
    private javax.swing.JTextField fieldUsuario;
    private javax.swing.JPanel formularioDeUsuario;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonEnviar2;
    private javax.swing.JButton jButtonVoltar2;
    private javax.swing.JLabel jLabelComfirmePassword2;
    private javax.swing.JLabel jLabelEmailUsario2;
    private javax.swing.JLabel jLabelInformacaoUsuario2;
    private javax.swing.JLabel jLabelNomeCompleto2;
    private javax.swing.JLabel jLabelPassword2;
    private javax.swing.JLabel jLabelTelefone2;
    private javax.swing.JLabel jLabelUsuario2;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JPasswordField passwordField1;
    // End of variables declaration//GEN-END:variables
}
