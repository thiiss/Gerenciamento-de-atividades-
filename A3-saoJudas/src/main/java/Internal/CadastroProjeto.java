/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Internal;

import Controller.ProjetoController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Usuario;

/**
 *
 * @author diogo-pc
 */
public class CadastroProjeto extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastroProjeto
     */
    private Usuario usuarioLogado;
    
    public CadastroProjeto(Usuario usuarioLogado) {
        initComponents();
        this.usuarioLogado = usuarioLogado;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formularioDeProjeto = new javax.swing.JPanel();
        labelCadastroDeProjeto = new javax.swing.JLabel();
        labelNomProjeto = new javax.swing.JLabel();
        fieldNomeProjeto = new javax.swing.JTextField();
        buttonVoltar = new javax.swing.JButton();
        buttounSalvar = new javax.swing.JButton();
        buttonLimpar = new javax.swing.JButton();
        descricaoLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textoCadastroProjeto = new javax.swing.JTextArea();

        labelCadastroDeProjeto.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        labelCadastroDeProjeto.setText("Cadastro de Projeto");

        labelNomProjeto.setText("Nome Projeto");

        buttonVoltar.setText("Voltar");
        buttonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarActionPerformed(evt);
            }
        });

        buttounSalvar.setText("Salvar");
        buttounSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttounSalvarMouseClicked(evt);
            }
        });
        buttounSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttounSalvarActionPerformed(evt);
            }
        });

        buttonLimpar.setText("Limpar");
        buttonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLimparActionPerformed(evt);
            }
        });

        descricaoLabel.setText("Descrição");

        textoCadastroProjeto.setColumns(20);
        textoCadastroProjeto.setRows(5);
        jScrollPane1.setViewportView(textoCadastroProjeto);

        javax.swing.GroupLayout formularioDeProjetoLayout = new javax.swing.GroupLayout(formularioDeProjeto);
        formularioDeProjeto.setLayout(formularioDeProjetoLayout);
        formularioDeProjetoLayout.setHorizontalGroup(
            formularioDeProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formularioDeProjetoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(formularioDeProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(formularioDeProjetoLayout.createSequentialGroup()
                        .addComponent(buttonVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonLimpar)
                        .addGap(39, 39, 39)
                        .addComponent(buttounSalvar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                    .addComponent(fieldNomeProjeto)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, formularioDeProjetoLayout.createSequentialGroup()
                        .addGroup(formularioDeProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descricaoLabel)
                            .addComponent(labelCadastroDeProjeto)
                            .addComponent(labelNomProjeto))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(25, 25, 25))
        );
        formularioDeProjetoLayout.setVerticalGroup(
            formularioDeProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formularioDeProjetoLayout.createSequentialGroup()
                .addComponent(labelCadastroDeProjeto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNomProjeto)
                .addGap(18, 18, 18)
                .addComponent(fieldNomeProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(descricaoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formularioDeProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonVoltar)
                    .addComponent(buttounSalvar)
                    .addComponent(buttonLimpar))
                .addGap(0, 25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(formularioDeProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(formularioDeProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttounSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttounSalvarActionPerformed
       ProjetoController projeto = new ProjetoController( this.textoCadastroProjeto.getText(),this.fieldNomeProjeto.getText(), usuarioLogado.getIdUsuario());
        try {
            projeto.salvarProjeto();
        } catch (SQLException ex) {
            Logger.getLogger(CadastroProjeto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttounSalvarActionPerformed

    private void buttounSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttounSalvarMouseClicked

    }//GEN-LAST:event_buttounSalvarMouseClicked

    private void buttonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonVoltarActionPerformed

    private void buttonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLimparActionPerformed
        this.fieldNomeProjeto.setText("");
        this.textoCadastroProjeto.setText("");
    }//GEN-LAST:event_buttonLimparActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLimpar;
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JButton buttounSalvar;
    private javax.swing.JLabel descricaoLabel;
    private javax.swing.JTextField fieldNomeProjeto;
    private javax.swing.JPanel formularioDeProjeto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCadastroDeProjeto;
    private javax.swing.JLabel labelNomProjeto;
    private javax.swing.JTextArea textoCadastroProjeto;
    // End of variables declaration//GEN-END:variables
}