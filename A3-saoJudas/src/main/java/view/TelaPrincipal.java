package view;

import Controller.ProjetoController;
import Internal.CadastroProjeto;
import Internal.PerfielUsuarioInternal;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Usuario;

public class TelaPrincipal extends javax.swing.JFrame {

    private final Usuario usuarioLogado;
    private PerfielUsuarioInternal perfilUsuario;
    private CadastroProjeto cadastroProjeto;

    public TelaPrincipal(Usuario usuarioLogado) throws SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
        this.usuarioLogado = usuarioLogado;
        this.perfilUsuario = new PerfielUsuarioInternal(usuarioLogado);
        this.cadastroProjeto = new CadastroProjeto(usuarioLogado);
        this.conteiner.add(this.cadastroProjeto);
        this.conteiner.add(this.perfilUsuario);
      

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuLateral = new javax.swing.JPanel();
        ButaoSair = new javax.swing.JButton();
        botaoProjeto = new javax.swing.JButton();
        conteiner = new javax.swing.JPanel();
        labelBemVindo = new javax.swing.JLabel();
        conteinerProjetos = new javax.swing.JPanel();
        labelUltimoProjetos = new javax.swing.JLabel();
        conteinerProjeto = new javax.swing.JPanel();
        labelDataCriacao = new javax.swing.JLabel();
        dataCriacaoProjeto = new javax.swing.JLabel();
        labelProjeto = new javax.swing.JLabel();
        nomeProjeto = new javax.swing.JLabel();
        labelConteudo = new javax.swing.JLabel();
        previaConteudo = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuPerfil = new javax.swing.JMenu();
        Conta = new javax.swing.JMenuItem();
        jMenuProjeto = new javax.swing.JMenu();
        jMenuNovoProjeto = new javax.swing.JMenuItem();
        jMenuMeuProjeto = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ButaoSair.setText("Sair");
        ButaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButaoSairActionPerformed(evt);
            }
        });

        botaoProjeto.setText("Projetos");
        botaoProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProjetoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLateralLayout = new javax.swing.GroupLayout(menuLateral);
        menuLateral.setLayout(menuLateralLayout);
        menuLateralLayout.setHorizontalGroup(
            menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLateralLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(ButaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 278, Short.MAX_VALUE))
        );
        menuLateralLayout.setVerticalGroup(
            menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLateralLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        conteiner.setName(""); // NOI18N
        conteiner.setPreferredSize(new java.awt.Dimension(400, 600));

        labelBemVindo.setText("Bem vindo!");

        labelUltimoProjetos.setText("Ultimos Projetos");

        labelDataCriacao.setText("Criação:");

        dataCriacaoProjeto.setText("dataCriacao");

        labelProjeto.setText("Projeto:");

        nomeProjeto.setText("nomProjeto");

        labelConteudo.setText("Conteudo:");

        previaConteudo.setText("Conteudo");

        javax.swing.GroupLayout conteinerProjetoLayout = new javax.swing.GroupLayout(conteinerProjeto);
        conteinerProjeto.setLayout(conteinerProjetoLayout);
        conteinerProjetoLayout.setHorizontalGroup(
            conteinerProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conteinerProjetoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(conteinerProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelProjeto)
                    .addComponent(labelConteudo)
                    .addComponent(labelDataCriacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(conteinerProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeProjeto)
                    .addComponent(previaConteudo)
                    .addComponent(dataCriacaoProjeto))
                .addContainerGap())
        );
        conteinerProjetoLayout.setVerticalGroup(
            conteinerProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conteinerProjetoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(conteinerProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(conteinerProjetoLayout.createSequentialGroup()
                        .addComponent(nomeProjeto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(previaConteudo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataCriacaoProjeto))
                    .addGroup(conteinerProjetoLayout.createSequentialGroup()
                        .addComponent(labelProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelConteudo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelDataCriacao)))
                .addContainerGap())
        );

        javax.swing.GroupLayout conteinerProjetosLayout = new javax.swing.GroupLayout(conteinerProjetos);
        conteinerProjetos.setLayout(conteinerProjetosLayout);
        conteinerProjetosLayout.setHorizontalGroup(
            conteinerProjetosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conteinerProjetosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(conteinerProjetosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelUltimoProjetos)
                    .addComponent(conteinerProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        conteinerProjetosLayout.setVerticalGroup(
            conteinerProjetosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conteinerProjetosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelUltimoProjetos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(conteinerProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout conteinerLayout = new javax.swing.GroupLayout(conteiner);
        conteiner.setLayout(conteinerLayout);
        conteinerLayout.setHorizontalGroup(
            conteinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conteinerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(conteinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelBemVindo)
                    .addComponent(conteinerProjetos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(468, Short.MAX_VALUE))
        );
        conteinerLayout.setVerticalGroup(
            conteinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conteinerLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(labelBemVindo)
                .addGap(30, 30, 30)
                .addComponent(conteinerProjetos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(360, Short.MAX_VALUE))
        );

        jMenuPerfil.setText("Perfil");

        Conta.setText("Editar Perfil");
        Conta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContaActionPerformed(evt);
            }
        });
        jMenuPerfil.add(Conta);

        jMenuBar.add(jMenuPerfil);

        jMenuProjeto.setText("Projeto");

        jMenuNovoProjeto.setText("Novo Projeto");
        jMenuNovoProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuNovoProjetoActionPerformed(evt);
            }
        });
        jMenuProjeto.add(jMenuNovoProjeto);

        jMenuMeuProjeto.setText("Meus Projetos");
        jMenuMeuProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuMeuProjetoActionPerformed(evt);
            }
        });
        jMenuProjeto.add(jMenuMeuProjeto);

        jMenuBar.add(jMenuProjeto);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(conteiner, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(menuLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(conteiner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menuLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButaoSairActionPerformed
        System.exit(NORMAL);
        this.dispose();
    }//GEN-LAST:event_ButaoSairActionPerformed

    private void botaoProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProjetoActionPerformed
        this.perfilUsuario.setVisible(true);
    }//GEN-LAST:event_botaoProjetoActionPerformed

    private void ContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContaActionPerformed
        this.perfilUsuario.setVisible(true);
    }//GEN-LAST:event_ContaActionPerformed

    private void jMenuNovoProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuNovoProjetoActionPerformed
        this.cadastroProjeto.setVisible(true);
    }//GEN-LAST:event_jMenuNovoProjetoActionPerformed

    private void jMenuMeuProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuMeuProjetoActionPerformed
        try {
            TelaProjeto telaProjeto = new TelaProjeto(usuarioLogado);
            telaProjeto.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuMeuProjetoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButaoSair;
    private javax.swing.JMenuItem Conta;
    private javax.swing.JButton botaoProjeto;
    private javax.swing.JPanel conteiner;
    private javax.swing.JPanel conteinerProjeto;
    private javax.swing.JPanel conteinerProjetos;
    private javax.swing.JLabel dataCriacaoProjeto;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuMeuProjeto;
    private javax.swing.JMenuItem jMenuNovoProjeto;
    private javax.swing.JMenu jMenuPerfil;
    private javax.swing.JMenu jMenuProjeto;
    private javax.swing.JLabel labelBemVindo;
    private javax.swing.JLabel labelConteudo;
    private javax.swing.JLabel labelDataCriacao;
    private javax.swing.JLabel labelProjeto;
    private javax.swing.JLabel labelUltimoProjetos;
    private javax.swing.JPanel menuLateral;
    private javax.swing.JLabel nomeProjeto;
    private javax.swing.JLabel previaConteudo;
    // End of variables declaration//GEN-END:variables
}
