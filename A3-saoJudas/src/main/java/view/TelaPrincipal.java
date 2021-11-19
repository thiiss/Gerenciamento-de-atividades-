package view;

import Internal.PerfilUsuario;
import model.Usuario;

public class TelaPrincipal extends javax.swing.JFrame {
    
    private final Usuario usuarioLogado;

    public TelaPrincipal(Usuario usuarioLogado) {       
        this.usuarioLogado = usuarioLogado;
        initComponents();
        this.setLocationRelativeTo(null);
        this.formularioDeUsuario.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        conteiner = new javax.swing.JPanel();
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
        senhaNova = new javax.swing.JPasswordField();
        jLabelComfirmePassword2 = new javax.swing.JLabel();
        confirmacaoSenhaNova = new javax.swing.JPasswordField();
        jButtonVoltar2 = new javax.swing.JButton();
        jButtonEnviar2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        senhaAntiga = new javax.swing.JPasswordField();
        menuLateral = new javax.swing.JPanel();
        ButaoPerfil = new javax.swing.JButton();
        ButaoProjeto = new javax.swing.JButton();
        ButaoSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jLabelPassword2.setText("Nova Senha");

        jLabelComfirmePassword2.setText("Confirme Senha");

        confirmacaoSenhaNova.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmacaoSenhaNovaActionPerformed(evt);
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
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setText("Senha Atual");

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
                    .addComponent(senhaNova, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                    .addComponent(confirmacaoSenhaNova, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
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
                                .addComponent(jButtonEnviar2))
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(senhaAntiga))
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
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaAntiga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jLabelPassword2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaNova, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelComfirmePassword2)
                .addGap(18, 18, 18)
                .addComponent(confirmacaoSenhaNova, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(formularioDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVoltar2)
                    .addComponent(jButton4)
                    .addComponent(jButtonEnviar2))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout conteinerLayout = new javax.swing.GroupLayout(conteiner);
        conteiner.setLayout(conteinerLayout);
        conteinerLayout.setHorizontalGroup(
            conteinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conteinerLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(formularioDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        conteinerLayout.setVerticalGroup(
            conteinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conteinerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(formularioDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        ButaoPerfil.setText("Perfil");
        ButaoPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButaoPerfilActionPerformed(evt);
            }
        });

        ButaoProjeto.setText("Projeto");

        ButaoSair.setText("Sair");
        ButaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButaoSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLateralLayout = new javax.swing.GroupLayout(menuLateral);
        menuLateral.setLayout(menuLateralLayout);
        menuLateralLayout.setHorizontalGroup(
            menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLateralLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ButaoPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButaoSair, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButaoProjeto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
                .addContainerGap())
        );
        menuLateralLayout.setVerticalGroup(
            menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLateralLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(ButaoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119)
                .addComponent(ButaoProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(ButaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menuLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(conteiner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(menuLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(conteiner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButaoPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButaoPerfilActionPerformed
        this.formularioDeUsuario.setVisible(true);
        this.fieldNome.setText(usuarioLogado.getNomeCompleto());
        this.fieldEmail.setText(usuarioLogado.getEmail());
        this.fieldTelefone.setText(usuarioLogado.getTelefone());
        this.fieldUsuario.setText(usuarioLogado.getUsuario());
        this.senhaAntiga.setText(usuarioLogado.getSenha());
    }//GEN-LAST:event_ButaoPerfilActionPerformed

    private void ButaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButaoSairActionPerformed
        
    }//GEN-LAST:event_ButaoSairActionPerformed

    private void jButtonEnviar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnviar2ActionPerformed
//        try {
//            Connection connection = new ConnectionFactory().obterConexao();
//            Usuario usuario = new Usuario();
//            usuario.porUsuario(this.usuarioTela);
//            usuario.setNomeCompleto(this.Teste.getText());
//            usuario.update();
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_jButtonEnviar2ActionPerformed

    private void jButtonEnviar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEnviar2MouseClicked

    }//GEN-LAST:event_jButtonEnviar2MouseClicked

    private void jButtonVoltar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltar2ActionPerformed
        this.formularioDeUsuario.setVisible(false);
    }//GEN-LAST:event_jButtonVoltar2ActionPerformed

    private void confirmacaoSenhaNovaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmacaoSenhaNovaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmacaoSenhaNovaActionPerformed

    private void fieldTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldTelefoneActionPerformed

    }//GEN-LAST:event_fieldTelefoneActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
 //        try {
//            Connection connection = new ConnectionFactory().obterConexao();
//            Usuario usuario = new Usuario();
//            usuario.porUsuario(this.usuarioTela);
//            usuario.delete();
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_jButton4ActionPerformed

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButaoPerfil;
    private javax.swing.JButton ButaoProjeto;
    private javax.swing.JButton ButaoSair;
    private javax.swing.JPasswordField confirmacaoSenhaNova;
    private javax.swing.JPanel conteiner;
    private javax.swing.JTextField fieldEmail;
    private javax.swing.JTextField fieldNome;
    private javax.swing.JTextField fieldTelefone;
    private javax.swing.JTextField fieldUsuario;
    private javax.swing.JPanel formularioDeUsuario;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonEnviar2;
    private javax.swing.JButton jButtonVoltar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelComfirmePassword2;
    private javax.swing.JLabel jLabelEmailUsario2;
    private javax.swing.JLabel jLabelInformacaoUsuario2;
    private javax.swing.JLabel jLabelNomeCompleto2;
    private javax.swing.JLabel jLabelPassword2;
    private javax.swing.JLabel jLabelTelefone2;
    private javax.swing.JLabel jLabelUsuario2;
    private javax.swing.JPanel menuLateral;
    private javax.swing.JPasswordField senhaAntiga;
    private javax.swing.JPasswordField senhaNova;
    // End of variables declaration//GEN-END:variables
}
