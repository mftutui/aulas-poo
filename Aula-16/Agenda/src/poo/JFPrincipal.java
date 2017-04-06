/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class JFPrincipal extends javax.swing.JFrame {

    public ArrayList<Contato> contatos;
    

    /**
     * Creates new form JFPrincipal
     */
    public JFPrincipal() {
        initComponents();
        this.contatos = new ArrayList<Contato>();
        this.setLocationRelativeTo(null); //para deixar a janelinha no meio
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLNome = new javax.swing.JLabel();
        JTFNome = new javax.swing.JTextField();
        JLTelefone = new javax.swing.JLabel();
        JTFTelefone = new javax.swing.JTextField();
        JLEmail = new javax.swing.JLabel();
        JTFEmail = new javax.swing.JTextField();
        JBAnterior = new javax.swing.JButton();
        JBProximo = new javax.swing.JButton();
        JBPesquisar = new javax.swing.JButton();
        JBSalvar = new javax.swing.JButton();
        JBExcluir = new javax.swing.JButton();
        JBLimpar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JLNome.setText("Nome:");

        JTFNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JTFNomeKeyReleased(evt);
            }
        });

        JLTelefone.setText("Telefone:");

        JLEmail.setText("e-mail:");

        JBAnterior.setText("Anterior");
        JBAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAnteriorActionPerformed(evt);
            }
        });

        JBProximo.setText("Proximo");
        JBProximo.setMaximumSize(new java.awt.Dimension(92, 25));
        JBProximo.setMinimumSize(new java.awt.Dimension(92, 25));
        JBProximo.setPreferredSize(new java.awt.Dimension(92, 25));
        JBProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBProximoActionPerformed(evt);
            }
        });

        JBPesquisar.setText("Pesquisar");
        JBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBPesquisarActionPerformed(evt);
            }
        });

        JBSalvar.setText("Salvar");
        JBSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSalvarActionPerformed(evt);
            }
        });

        JBExcluir.setText("Excluir");
        JBExcluir.setEnabled(false);
        JBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBExcluirActionPerformed(evt);
            }
        });

        JBLimpar.setText("Limpar");
        JBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLNome)
                            .addComponent(JLTelefone)
                            .addComponent(JLEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(75, 75, 75))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(JBAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                    .addComponent(JBExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JBLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JBProximo, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JBPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JBSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(JTFNome)
                            .addComponent(JTFTelefone)
                            .addComponent(JTFEmail))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JLTelefone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JLEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBAnterior)
                    .addComponent(JBProximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBExcluir)
                    .addComponent(JBLimpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBPesquisar)
                    .addComponent(JBSalvar))
                .addGap(0, 39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBLimparActionPerformed
        JTFNome.setText("");
        JTFTelefone.setText("");
        JTFEmail.setText("");

    }//GEN-LAST:event_JBLimparActionPerformed

    private void JBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSalvarActionPerformed
        
        Contato d;
        
        if (index == -1) {
            Contato c = new Contato(JTFNome.getText(), JTFEmail.getText(), JTFTelefone.getText());
            contatos.add(c);
        } else {
            d = contatos.get(index);
            d.setNome(JTFNome.getText());
            d.setEmail(JTFEmail.getText());
            d.setTelefone(JTFTelefone.getText());
           // contatos.set(index, d);
        }
    }//GEN-LAST:event_JBSalvarActionPerformed

    private void JBProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBProximoActionPerformed

        if (index > contatos.size()) {
            index = -1;
        }
        index++;
        Contato d;
        d = contatos.get(index);

        JTFNome.setText(d.getNome());
        JTFTelefone.setText(d.getTelefone());
        JTFEmail.setText(d.getEmail());


    }//GEN-LAST:event_JBProximoActionPerformed

    private void JBAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAnteriorActionPerformed
        if (index == 0 || index == -1) {
            index = contatos.size();
        }
        index--;
        Contato d;
        d = contatos.get(index);

        JTFNome.setText(d.getNome());
        JTFTelefone.setText(d.getTelefone());
        JTFEmail.setText(d.getEmail());

    }//GEN-LAST:event_JBAnteriorActionPerformed

    private void JBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBExcluirActionPerformed
        if ((index >= 0) && (index < contatos.size())) {
            contatos.remove(index);
            JTFNome.setText("");
            JTFEmail.setText("");
            JTFTelefone.setText("");
        }


    }//GEN-LAST:event_JBExcluirActionPerformed


    private void JBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPesquisarActionPerformed
        JDPesquisar dialog = new JDPesquisar(this, true);
        dialog.setVisible(true);
    }//GEN-LAST:event_JBPesquisarActionPerformed

    //private void ativaCampos (boolean b){

    private void JTFNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFNomeKeyReleased
        // TODO add your handling code here:
        if (JTFNome.getText().length() > 0) {
            JBSalvar.setEnabled(true);
        } else {
            JBSalvar.setEnabled(false);
        }
    }//GEN-LAST:event_JTFNomeKeyReleased

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
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPrincipal().setVisible(true);
            }
        });
    }
    private int index = -1;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAnterior;
    private javax.swing.JButton JBExcluir;
    private javax.swing.JButton JBLimpar;
    private javax.swing.JButton JBPesquisar;
    private javax.swing.JButton JBProximo;
    private javax.swing.JButton JBSalvar;
    private javax.swing.JLabel JLEmail;
    private javax.swing.JLabel JLNome;
    private javax.swing.JLabel JLTelefone;
    private javax.swing.JTextField JTFEmail;
    private javax.swing.JTextField JTFNome;
    private javax.swing.JTextField JTFTelefone;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
