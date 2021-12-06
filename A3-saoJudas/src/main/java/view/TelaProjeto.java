package view;

import Controller.ProjetoController;
import Internal.CadastroProjeto;
import Internal.CadastroRequisito;
import Internal.PerfielUsuarioInternal;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Usuario;

/**
 *
 * @author diogo-pc
 */
public class TelaProjeto extends javax.swing.JFrame {

    private final Usuario usuarioLogado;
    private PerfielUsuarioInternal perfilUsuario;
    private CadastroProjeto cadastroProjeto;
    private ProjetoController projeto;
    private CadastroRequisito cadastroRequisito;
    
    public TelaProjeto(Usuario usuarioLogado) throws SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
        this.usuarioLogado = usuarioLogado;
        this.perfilUsuario = new PerfielUsuarioInternal(usuarioLogado);
        this.cadastroProjeto = new CadastroProjeto(usuarioLogado);
        this.cadastroRequisito = new CadastroRequisito(usuarioLogado);
        
        
        this.conteudo.add(this.cadastroRequisito);
        this.conteudo.add(this.cadastroProjeto);
        this.conteudo.add(this.perfilUsuario);

        this.projeto = new ProjetoController(usuarioLogado.getIdUsuario());

        for (String buscarProjeto : this.projeto.buscarProjetosByNome()) {
            jBoxProjetos.addItem(buscarProjeto);
        }
               this.jScrollPane2.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        conteudo = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        conteiner = new javax.swing.JPanel();
        labelProjeto = new javax.swing.JLabel();
        jBoxProjetos = new javax.swing.JComboBox<>();
        fildTitulo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaText = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        dataCriacao = new javax.swing.JLabel();
        idLabelProjeto = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuPerfil = new javax.swing.JMenu();
        Conta = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuRequisito = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Requisito ", "Cadastro de Usuario", "2021-12-05", "Em andamento", null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nome", "Descrição", "Data Criação", "Estado", "Criado Por"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout conteudoLayout = new javax.swing.GroupLayout(conteudo);
        conteudo.setLayout(conteudoLayout);
        conteudoLayout.setHorizontalGroup(
            conteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conteudoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        conteudoLayout.setVerticalGroup(
            conteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conteudoLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 92, Short.MAX_VALUE))
        );

        labelProjeto.setText("Projeto:");

        jBoxProjetos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um Item" }));
        jBoxProjetos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBoxProjetosActionPerformed(evt);
            }
        });

        fildTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fildTituloActionPerformed(evt);
            }
        });

        areaText.setColumns(20);
        areaText.setRows(5);
        jScrollPane1.setViewportView(areaText);

        jButton2.setText("Salvar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Deletar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        dataCriacao.setText("Data Criação:");

        jButton1.setText("Novo Requisito");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout conteinerLayout = new javax.swing.GroupLayout(conteiner);
        conteiner.setLayout(conteinerLayout);
        conteinerLayout.setHorizontalGroup(
            conteinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conteinerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(conteinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(conteinerLayout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addGroup(conteinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, conteinerLayout.createSequentialGroup()
                            .addComponent(labelProjeto)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(idLabelProjeto))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, conteinerLayout.createSequentialGroup()
                            .addComponent(jBoxProjetos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(dataCriacao))
                        .addComponent(fildTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)))
                .addGap(0, 12, Short.MAX_VALUE))
        );
        conteinerLayout.setVerticalGroup(
            conteinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conteinerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(conteinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelProjeto)
                    .addComponent(idLabelProjeto))
                .addGap(18, 18, 18)
                .addGroup(conteinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBoxProjetos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataCriacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fildTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(conteinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        jMenuPerfil.setText("Perfil");

        Conta.setText("Editar Perfil");
        Conta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContaActionPerformed(evt);
            }
        });
        jMenuPerfil.add(Conta);

        jMenuItem2.setText("Voltar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenuPerfil.add(jMenuItem2);

        jMenuItem3.setText("Sair");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenuPerfil.add(jMenuItem3);

        jMenuBar.add(jMenuPerfil);

        jMenuRequisito.setText("Requisito");

        jMenuItem1.setText("Novo Requisoto");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuRequisito.add(jMenuItem1);

        jMenuBar.add(jMenuRequisito);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(conteiner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(conteudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(conteudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(conteiner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContaActionPerformed
        this.perfilUsuario.setVisible(true);
    }//GEN-LAST:event_ContaActionPerformed

    private void jBoxProjetosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBoxProjetosActionPerformed
        String conteudojBox = this.jBoxProjetos.getSelectedItem().toString();
                    this.jScrollPane2.setVisible(true);

        if (!conteudojBox.equals("Selecione um Item")) {
            this.projeto.setNomeProjeto(conteudojBox);

            try {
                String idNumbProjeto = projeto.buscarProjetos().get(0);
                String tituloProjeto = projeto.buscarProjetos().get(1);
                String descricaoProjeto = projeto.buscarProjetos().get(2);
                String dateProjeto = projeto.buscarProjetos().get(3);

                projeto.setIDProjeto(Integer.parseInt(idNumbProjeto));
                projeto.setNomeProjeto(tituloProjeto);
                projeto.setTextProjeto(descricaoProjeto);

                this.dataCriacao.setText("Data: " + dateProjeto);
                this.areaText.setText(descricaoProjeto);
                this.fildTitulo.setText(tituloProjeto);
                this.idLabelProjeto.setText(idNumbProjeto);

            } catch (SQLException ex) {
                Logger.getLogger(TelaProjeto.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_jBoxProjetosActionPerformed

    private void fildTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fildTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fildTituloActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String idNumbProjeto = this.idLabelProjeto.getText();
        String descricaoProjeto = this.areaText.getText();
        String tituloProjeto = this.fildTitulo.getText();

        try {
            projeto.setIDProjeto(Integer.parseInt(idNumbProjeto));
            projeto.setNomeProjeto(tituloProjeto);
            projeto.setTextProjeto(descricaoProjeto);
            projeto.updateProjeto();
        } catch (SQLException ex) {
            Logger.getLogger(TelaProjeto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            
            String idNumbProjeto = this.idLabelProjeto.getText();
            System.out.print(idNumbProjeto);
            projeto.setIDProjeto(Integer.parseInt(idNumbProjeto));
            projeto.deleteProjeto();
            this.dispose();
            TelaPrincipal telaPrincipal = new TelaPrincipal(usuarioLogado);
            telaPrincipal.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(TelaProjeto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cadastroRequisito.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.jScrollPane2.setVisible(false);
        
        cadastroRequisito.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
      this.dispose();
      
        try {
           TelaPrincipal tela = new TelaPrincipal(usuarioLogado);
            tela.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(TelaProjeto.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        this.dispose();
        System.exit(WIDTH);
    }//GEN-LAST:event_jMenuItem3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Conta;
    private javax.swing.JTextArea areaText;
    private javax.swing.JPanel conteiner;
    private javax.swing.JPanel conteudo;
    private javax.swing.JLabel dataCriacao;
    private javax.swing.JTextField fildTitulo;
    private javax.swing.JLabel idLabelProjeto;
    private javax.swing.JComboBox<String> jBoxProjetos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenu jMenuPerfil;
    private javax.swing.JMenu jMenuRequisito;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelProjeto;
    // End of variables declaration//GEN-END:variables
}
