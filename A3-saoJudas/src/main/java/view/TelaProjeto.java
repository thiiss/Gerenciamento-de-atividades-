package view;

import Controller.ProjetoController;
import Internal.CadastroProjeto;
import Internal.PerfielUsuarioInternal;
import java.sql.SQLException;
import model.Usuario;

/**
 *
 * @author diogo-pc
 */
public class TelaProjeto extends javax.swing.JFrame {

    
    private final Usuario usuarioLogado;
    private PerfielUsuarioInternal perfilUsuario;
    private CadastroProjeto cadastroProjeto;
    
    public TelaProjeto(Usuario usuarioLogado) throws SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
        this.usuarioLogado = usuarioLogado;
        this.perfilUsuario = new PerfielUsuarioInternal(usuarioLogado);
        this.cadastroProjeto = new CadastroProjeto(usuarioLogado);
        this.container.add(this.cadastroProjeto);
        this.container.add(this.perfilUsuario);
        
        ProjetoController projeto = new ProjetoController(usuarioLogado.getIdUsuario());
        
        for (String buscarProjeto : projeto.buscarProjetosByNome()) {
            jBoxProjetos.addItem(buscarProjeto);
        }
            
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new javax.swing.JPanel();
        labelProjeto = new javax.swing.JLabel();
        jBoxProjetos = new javax.swing.JComboBox<>();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuPerfil = new javax.swing.JMenu();
        Conta = new javax.swing.JMenuItem();
        jMenuProjeto = new javax.swing.JMenu();
        jMenuNovoProjeto = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelProjeto.setText("Projeto:");

        jBoxProjetos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBoxProjetosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelProjeto)
                    .addComponent(jBoxProjetos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 673, Short.MAX_VALUE))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addComponent(labelProjeto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBoxProjetos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 359, Short.MAX_VALUE))
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

        jMenuBar.add(jMenuProjeto);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContaActionPerformed
        this.perfilUsuario.setVisible(true);
    }//GEN-LAST:event_ContaActionPerformed

    private void jMenuNovoProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuNovoProjetoActionPerformed
      this.cadastroProjeto.setVisible(true);
    }//GEN-LAST:event_jMenuNovoProjetoActionPerformed

    private void jBoxProjetosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBoxProjetosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBoxProjetosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Conta;
    private javax.swing.JPanel container;
    private javax.swing.JComboBox<String> jBoxProjetos;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuNovoProjeto;
    private javax.swing.JMenu jMenuPerfil;
    private javax.swing.JMenu jMenuProjeto;
    private javax.swing.JLabel labelProjeto;
    // End of variables declaration//GEN-END:variables
}
