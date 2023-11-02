/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.prontuario.view;

import br.com.ifba.infrastructure.service.IFacade;
import br.com.ifba.prontuario.model.Prontuario;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import br.com.ifba.prontuario.view.ListaProntuariosArquivados;
import br.com.ifba.prontuario.view.ProntuarioView;
import br.com.ifba.prontuario.view.EditarProntuario;

/**
 *
 * @author wesley
 */
@Component
public class ListaProntuarios extends javax.swing.JFrame {

    @Autowired
    private IFacade facade;
    private List<Prontuario> prontuarios;
    @Autowired
    private ListaProntuariosArquivados listaArquiv;
    @Autowired
    private ProntuarioView prontuarioView;
    @Autowired
    private EditarProntuario editarPront;
    
    public ListaProntuarios() {
        initComponents();
        super.setLocationRelativeTo(null);
    }

    // Método que realiza a atualização dos dados na tabela.
    @PostConstruct
    public void atualizaTabela() {
        try {
            this.prontuarios = this.facade.getAllProntuarios();
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, error,
                    "Erro ao buscar prontuarios!", JOptionPane.ERROR_MESSAGE);
            return;
        }

        DefaultTableModel tabelaDados = (DefaultTableModel) ListaProntuarios.this.jTable2.getModel();
        tabelaDados.setNumRows(0);

        for (Prontuario prontuario : prontuarios) {
            tabelaDados.addRow(new Object[]{prontuario.getId(), prontuario.getAtivo(),
                prontuario.getDescricao()});
        }

    }

    public void updateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);
        atualizaTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnArquivar = new javax.swing.JButton();
        btnAreuivados = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnNovo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Todos os Prontuarios:");

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnArquivar.setText("Arquivar");
        btnArquivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArquivarActionPerformed(evt);
            }
        });

        btnAreuivados.setText("Arquivados");
        btnAreuivados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAreuivadosActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Ativo", "Descrição"
            }
        ));
        jScrollPane2.setViewportView(jTable2);
        jTable2.getAccessibleContext().setAccessibleParent(jTable2);

        btnNovo.setText("NOVO");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        jButton1.setText("ATUALIZAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEditar)
                    .addComponent(btnArquivar)
                    .addComponent(btnAreuivados)
                    .addComponent(btnNovo)
                    .addComponent(jButton1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovo)
                        .addGap(20, 20, 20)
                        .addComponent(btnEditar)
                        .addGap(31, 31, 31)
                        .addComponent(btnArquivar)
                        .addGap(29, 29, 29)
                        .addComponent(btnAreuivados)
                        .addGap(31, 31, 31)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnArquivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArquivarActionPerformed

        int index = jTable2.getSelectedRow();
        if (index != -1) {
            long id = (long) jTable2.getValueAt(index, 0);
            Prontuario selecionado = facade.findProntuarioById(id);
            this.facade.arquivarProntuario(selecionado);
            updateTable();
        } else {
            JOptionPane.showMessageDialog(this, "Nehum prontuario selecionada", "Erro", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnArquivarActionPerformed

    private void btnAreuivadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAreuivadosActionPerformed
        this.listaArquiv.setVisible(true);    }//GEN-LAST:event_btnAreuivadosActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        this.prontuarioView.setVisible(true);    }//GEN-LAST:event_btnNovoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        updateTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int index = jTable2.getSelectedRow();
        long id = (long) jTable2.getValueAt(index, 0);
        Prontuario selecionado = facade.findProntuarioById(id);
        this.editarPront.SetProntuario(selecionado);
        this.editarPront.setVisible(true);
    }//GEN-LAST:event_btnEditarActionPerformed

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
            java.util.logging.Logger.getLogger(ListaProntuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaProntuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaProntuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaProntuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaProntuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAreuivados;
    private javax.swing.JButton btnArquivar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
