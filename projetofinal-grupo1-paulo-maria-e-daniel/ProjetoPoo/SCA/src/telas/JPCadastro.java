/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import bancodedados.Bancos;
import bancodedados.BaseUsuariosLocal;
import java.awt.Container;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author daniel
 */
public class JPCadastro extends javax.swing.JPanel {

    private JFPrincipal pai;
    private boolean preenchido[];

    /**
     * Creates new form JPCriacao
     */
    public JPCadastro(JFPrincipal p) {
        initComponents();
        this.preenchido = new boolean[3];
        this.pai = p;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLUsuário = new javax.swing.JLabel();
        jLSenha = new javax.swing.JLabel();
        jTFUsuario = new javax.swing.JTextField();
        jBCadastrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTFLogin = new javax.swing.JTextField();
        jLLogin = new javax.swing.JLabel();
        jTFSenha = new javax.swing.JTextField();

        jLUsuário.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLUsuário.setText("Usuário:");

        jLSenha.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLSenha.setText("Senha:");

        jTFUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFUsuarioKeyReleased(evt);
            }
        });

        jBCadastrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBCadastrar.setText("Cadastrar");
        jBCadastrar.setEnabled(false);
        jBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/if4.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jTFLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFLoginKeyReleased(evt);
            }
        });

        jLLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLLogin.setText("Login:");

        jTFSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFSenhaActionPerformed(evt);
            }
        });
        jTFSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFSenhaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLUsuário, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                            .addComponent(jLSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(jTFLogin)
                            .addComponent(jTFSenha)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBCadastrar)))
                .addGap(119, 119, 119))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLUsuário, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBCadastrar))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(124, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTFUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFUsuarioKeyReleased
        this.campoPreenchido(jTFUsuario.getText(), 0);
        this.ativaLogin();
    }//GEN-LAST:event_jTFUsuarioKeyReleased


    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed

        Bancos t = new BaseUsuariosLocal(this.jTFUsuario.getText(), this.jTFLogin.getText(), this.jTFSenha.getText());
        JOptionPane.showMessageDialog(this, "Usuário cadastrado",
                "Sucesso!",
                JOptionPane.WARNING_MESSAGE);
        t.modificar();
        pai.trocaPainel();
    }//GEN-LAST:event_jBCadastrarActionPerformed

    private void jTFLoginKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFLoginKeyReleased
        this.campoPreenchido(jTFLogin.getText(), 1);
        this.ativaLogin();
    }//GEN-LAST:event_jTFLoginKeyReleased

    private void jTFSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFSenhaKeyReleased
        // TODO add your handling code here:
        this.campoPreenchido(jTFSenha.getText(), 2);
        this.ativaLogin();
    }//GEN-LAST:event_jTFSenhaKeyReleased

    private void jTFSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFSenhaActionPerformed

    /**
     * método que libera o botão de cadastrar
     */
    public void ativaLogin() {
        int aux = 0;
        for (int i = 0; i < 3; i++) {
            if (this.preenchido[i] == true) {
                aux++;
            }
        }
        if (aux == 3) {
            jBCadastrar.setEnabled(true);
        }
    }

    /**
     * método que verifica o conteudo dos campos de texto
     *
     * @param texto = texto escrito
     * @param id = identificação do campo
     */
    private void campoPreenchido(String texto, int id) {
        this.preenchido[id] = texto.length() > 0;

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JLabel jLLogin;
    private javax.swing.JLabel jLSenha;
    private javax.swing.JLabel jLUsuário;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFLogin;
    private javax.swing.JTextField jTFSenha;
    private javax.swing.JTextField jTFUsuario;
    // End of variables declaration//GEN-END:variables
}
