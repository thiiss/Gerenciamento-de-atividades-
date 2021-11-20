package view;

import Internal.PerfielUsuarioInternal;
import model.Usuario;

public class TelaPrincipal extends javax.swing.JFrame {
    
    private final Usuario usuarioLogado;
    private final PerfielUsuarioInternal perfilUsuario; 
   
    public TelaPrincipal(Usuario usuarioLogado) {       
        this.usuarioLogado = usuarioLogado;
        this.perfilUsuario = new PerfielUsuarioInternal(usuarioLogado);
        initComponents();
        this.setLocationRelativeTo(null);
        this.conteiner.add(this.perfilUsuario);

        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuLateral = new javax.swing.JPanel();
        ButaoProjeto = new javax.swing.JButton();
        ButaoSair = new javax.swing.JButton();
        ButaoPerfil = new javax.swing.JButton();
        conteiner = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ButaoProjeto.setText("Projeto");
        ButaoProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButaoProjetoActionPerformed(evt);
            }
        });

        ButaoSair.setText("Sair");
        ButaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButaoSairActionPerformed(evt);
            }
        });

        ButaoPerfil.setText("Perfil");
        ButaoPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButaoPerfilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLateralLayout = new javax.swing.GroupLayout(menuLateral);
        menuLateral.setLayout(menuLateralLayout);
        menuLateralLayout.setHorizontalGroup(
            menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ButaoSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButaoProjeto, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButaoPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addContainerGap())
        );
        menuLateralLayout.setVerticalGroup(
            menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLateralLayout.createSequentialGroup()
                .addGroup(menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(menuLateralLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ButaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, menuLateralLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButaoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButaoProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10))
        );

        conteiner.setName(""); // NOI18N
        conteiner.setPreferredSize(new java.awt.Dimension(400, 600));

        javax.swing.GroupLayout conteinerLayout = new javax.swing.GroupLayout(conteiner);
        conteiner.setLayout(conteinerLayout);
        conteinerLayout.setHorizontalGroup(
            conteinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        conteinerLayout.setVerticalGroup(
            conteinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(201, Short.MAX_VALUE)
                .addComponent(menuLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(conteiner, javax.swing.GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(conteiner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menuLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButaoPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButaoPerfilActionPerformed
              
        perfilUsuario.setVisible(true);    

    }//GEN-LAST:event_ButaoPerfilActionPerformed

    private void ButaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButaoSairActionPerformed
        
    }//GEN-LAST:event_ButaoSairActionPerformed

    private void ButaoProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButaoProjetoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButaoProjetoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButaoPerfil;
    private javax.swing.JButton ButaoProjeto;
    private javax.swing.JButton ButaoSair;
    private javax.swing.JPanel conteiner;
    private javax.swing.JPanel menuLateral;
    // End of variables declaration//GEN-END:variables
}
