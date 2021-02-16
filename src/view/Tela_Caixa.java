/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import static java.lang.String.valueOf;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Edgar
 */
public class Tela_Caixa extends javax.swing.JInternalFrame {
    private static double total = 0;
    /**
     * Creates new form Tela_Caixa
     */
    public Tela_Caixa() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane6 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        PainelNotaFiscal = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tabelaNota = new javax.swing.JTable();
        PainelCaixa = new javax.swing.JPanel();
        produto = new javax.swing.JLabel();
        quantidade = new javax.swing.JLabel();
        preco = new javax.swing.JLabel();
        cmboxProduto = new javax.swing.JComboBox<>();
        txtQuantidade = new javax.swing.JTextField();
        txtPreco = new javax.swing.JFormattedTextField();
        btnInserir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtValorTotal = new javax.swing.JFormattedTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(jTable1);

        setClosable(true);
        setIconifiable(true);

        PainelNotaFiscal.setBorder(javax.swing.BorderFactory.createTitledBorder("Nota Fiscal"));

        tabelaNota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Preço do item", "Quantidade", "Preço total"
            }
        ));
        tabelaNota.setEnabled(false);
        jScrollPane7.setViewportView(tabelaNota);

        javax.swing.GroupLayout PainelNotaFiscalLayout = new javax.swing.GroupLayout(PainelNotaFiscal);
        PainelNotaFiscal.setLayout(PainelNotaFiscalLayout);
        PainelNotaFiscalLayout.setHorizontalGroup(
            PainelNotaFiscalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelNotaFiscalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7)
                .addContainerGap())
        );
        PainelNotaFiscalLayout.setVerticalGroup(
            PainelNotaFiscalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelNotaFiscalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))
        );

        PainelCaixa.setBorder(javax.swing.BorderFactory.createTitledBorder("Caixa"));

        produto.setText("PRODUTO");

        quantidade.setText("QUANTIDADE");

        preco.setText("PREÇO");

        cmboxProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pão Francês", "Pão Doce", "Rosquinha", "Bolo", "Salgados" }));
        cmboxProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmboxProdutoActionPerformed(evt);
            }
        });

        txtPreco.setEditable(false);

        btnInserir.setText("Inserir Produto");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelCaixaLayout = new javax.swing.GroupLayout(PainelCaixa);
        PainelCaixa.setLayout(PainelCaixaLayout);
        PainelCaixaLayout.setHorizontalGroup(
            PainelCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCaixaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInserir)
                    .addGroup(PainelCaixaLayout.createSequentialGroup()
                        .addGroup(PainelCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelCaixaLayout.createSequentialGroup()
                                .addComponent(cmboxProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(171, 171, 171)
                                .addGroup(PainelCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(produto, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(141, 141, 141)
                        .addGroup(PainelCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(preco, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        PainelCaixaLayout.setVerticalGroup(
            PainelCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelCaixaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(produto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantidade)
                    .addComponent(preco))
                .addGap(1, 1, 1)
                .addGroup(PainelCaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmboxProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnInserir)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("VALOR TOTAL");

        txtValorTotal.setEditable(false);
        txtValorTotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PainelNotaFiscal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PainelCaixa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(223, 223, 223))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PainelCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelNotaFiscal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtValorTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                        .addGap(7, 7, 7)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        
        double soma = Double.parseDouble(txtQuantidade.getText()) * Double.parseDouble(txtPreco.getText());
        
        DefaultTableModel dtmprodutos = (DefaultTableModel) tabelaNota.getModel();
        Object[] valores = {cmboxProduto.getSelectedItem().toString(), txtPreco.getText(), txtQuantidade.getText(), soma};
        
        dtmprodutos.addRow(valores);
        //total = 0;
        total = total + soma;
        txtValorTotal.setText(valueOf(total));  
    }//GEN-LAST:event_btnInserirActionPerformed

    private void cmboxProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmboxProdutoActionPerformed
        String valores[] = {"0.50", "0.75", "1.00", "2.50", "3.00"}; 
        txtPreco.setText(valores[cmboxProduto.getSelectedIndex()]);           
    }//GEN-LAST:event_cmboxProdutoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelCaixa;
    private javax.swing.JPanel PainelNotaFiscal;
    private javax.swing.JButton btnInserir;
    private javax.swing.JComboBox<String> cmboxProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel preco;
    private javax.swing.JLabel produto;
    private javax.swing.JLabel quantidade;
    private javax.swing.JTable tabelaNota;
    private javax.swing.JFormattedTextField txtPreco;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JFormattedTextField txtValorTotal;
    // End of variables declaration//GEN-END:variables
}
