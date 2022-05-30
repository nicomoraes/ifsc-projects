package com.ifsc.lojamaven.view;

import com.ifsc.lojamaven.controller.endereco.ControllerCadBairro;
import com.ifsc.lojamaven.controller.endereco.ControllerCadCep;
import com.ifsc.lojamaven.controller.endereco.ControllerCadCidade;
import com.ifsc.lojamaven.controller.pessoa.ControllerCadCliente;
import com.ifsc.lojamaven.controller.pessoa.ControllerCadFornecedor;
import com.ifsc.lojamaven.controller.pessoa.ControllerCadVendedor;
import com.ifsc.lojamaven.controller.produto.ControllerCadCaractProd;
import com.ifsc.lojamaven.controller.produto.ControllerCadCor;
import com.ifsc.lojamaven.controller.produto.ControllerCadMarca;
import com.ifsc.lojamaven.controller.produto.ControllerCadProduto;
import com.ifsc.lojamaven.controller.produto.ControllerCadTamanho;
import com.ifsc.lojamaven.controller.produto.ControllerCadTipoProduto;
import com.ifsc.lojamaven.controller.transacao.ControllerCadVenda;
import com.ifsc.lojamaven.view.endereco.TelaCadastroBairro;
import com.ifsc.lojamaven.view.endereco.TelaCadastroCep;
import com.ifsc.lojamaven.view.endereco.TelaCadastroCidade;
import com.ifsc.lojamaven.view.pessoa.TelaCadastroCliente;
import com.ifsc.lojamaven.view.pessoa.TelaCadastroFornecedor;
import com.ifsc.lojamaven.view.pessoa.TelaCadastroVendedor;
import com.ifsc.lojamaven.view.produto.TelaCadastroCaractProd;
import com.ifsc.lojamaven.view.produto.TelaCadastroCor;
import com.ifsc.lojamaven.view.produto.TelaCadastroMarca;
import com.ifsc.lojamaven.view.produto.TelaCadastroProduto;
import com.ifsc.lojamaven.view.produto.TelaCadastroTamanho;
import com.ifsc.lojamaven.view.produto.TelaCadastroTipoProduto;
import com.ifsc.lojamaven.view.transacao.TelaCadastroVenda;

public class MenuPrincipal extends javax.swing.JFrame {

   
    public MenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadEnd = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMIBairro = new javax.swing.JMenuItem();
        jMICep = new javax.swing.JMenuItem();
        jMICidade = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMICliente = new javax.swing.JMenuItem();
        jMIFornecedor = new javax.swing.JMenuItem();
        jMIVendedor = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMIProduto = new javax.swing.JMenuItem();
        jMIMarcas = new javax.swing.JMenuItem();
        jMITamanhos = new javax.swing.JMenuItem();
        jMITipoProduto = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMICaractProd = new javax.swing.JMenuItem();
        jMICor = new javax.swing.JMenuItem();
        jMIVendas = new javax.swing.JMenu();
        jMIVenda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuCadEnd.setText("Cadastros");

        jMenu7.setText("Endereços");

        jMIBairro.setText("Bairros");
        jMIBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIBairroActionPerformed(evt);
            }
        });
        jMenu7.add(jMIBairro);

        jMICep.setText("CEP");
        jMICep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICepActionPerformed(evt);
            }
        });
        jMenu7.add(jMICep);

        jMICidade.setText("Cidades");
        jMICidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICidadeActionPerformed(evt);
            }
        });
        jMenu7.add(jMICidade);

        menuCadEnd.add(jMenu7);

        jMenu1.setText("Pessoas");

        jMICliente.setText("Cliente");
        jMICliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIClienteActionPerformed(evt);
            }
        });
        jMenu1.add(jMICliente);

        jMIFornecedor.setText("Fornecedor");
        jMIFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIFornecedorActionPerformed(evt);
            }
        });
        jMenu1.add(jMIFornecedor);

        jMIVendedor.setText("Vendedor");
        jMIVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIVendedorActionPerformed(evt);
            }
        });
        jMenu1.add(jMIVendedor);

        menuCadEnd.add(jMenu1);

        jMenu8.setText("Produtos");

        jMIProduto.setText("Produto");
        jMIProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIProdutoActionPerformed(evt);
            }
        });
        jMenu8.add(jMIProduto);

        jMIMarcas.setText("Marcas");
        jMIMarcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIMarcasActionPerformed(evt);
            }
        });
        jMenu8.add(jMIMarcas);

        jMITamanhos.setText("Tamanhos");
        jMITamanhos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMITamanhosActionPerformed(evt);
            }
        });
        jMenu8.add(jMITamanhos);

        jMITipoProduto.setText("Tipos de Produto");
        jMITipoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMITipoProdutoActionPerformed(evt);
            }
        });
        jMenu8.add(jMITipoProduto);

        jMenu9.setText("Características");

        jMICaractProd.setText("Característica de Produto");
        jMICaractProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICaractProdActionPerformed(evt);
            }
        });
        jMenu9.add(jMICaractProd);

        jMICor.setText("Cores");
        jMICor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICorActionPerformed(evt);
            }
        });
        jMenu9.add(jMICor);

        jMenu8.add(jMenu9);

        menuCadEnd.add(jMenu8);

        jMenuBar1.add(menuCadEnd);

        jMIVendas.setText("Movimentos");

        jMIVenda.setText("Venda");
        jMIVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIVendaActionPerformed(evt);
            }
        });
        jMIVendas.add(jMIVenda);

        jMenuBar1.add(jMIVendas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMIBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIBairroActionPerformed

        TelaCadastroBairro telaCadBairro = new TelaCadastroBairro();
        ControllerCadBairro controllerCadBairro = new ControllerCadBairro(telaCadBairro);
        telaCadBairro.setVisible(true);
    }//GEN-LAST:event_jMIBairroActionPerformed

    private void jMICepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICepActionPerformed
        TelaCadastroCep telaCadCep = new TelaCadastroCep();
        ControllerCadCep controllerCadCep = new ControllerCadCep(telaCadCep);
        telaCadCep.setVisible(true);
    }//GEN-LAST:event_jMICepActionPerformed

    private void jMICidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICidadeActionPerformed
        TelaCadastroCidade telaCadCidade = new TelaCadastroCidade();
        ControllerCadCidade controllerCadCidade = new ControllerCadCidade(telaCadCidade);
        telaCadCidade.setVisible(true);
    }//GEN-LAST:event_jMICidadeActionPerformed

    private void jMIClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIClienteActionPerformed
        TelaCadastroCliente telaCadCliente = new TelaCadastroCliente();
        ControllerCadCliente controllerCadCliente = new ControllerCadCliente(telaCadCliente);
        telaCadCliente.setVisible(true);
    }//GEN-LAST:event_jMIClienteActionPerformed

    private void jMIFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIFornecedorActionPerformed
        TelaCadastroFornecedor telaCadFornecedor = new TelaCadastroFornecedor();
        ControllerCadFornecedor controllerCadFornecedor = new ControllerCadFornecedor(telaCadFornecedor);
        telaCadFornecedor.setVisible(true);
    }//GEN-LAST:event_jMIFornecedorActionPerformed

    private void jMIVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIVendedorActionPerformed
        TelaCadastroVendedor telaCadVendedor = new TelaCadastroVendedor();
        ControllerCadVendedor controllerCadVendedor = new ControllerCadVendedor(telaCadVendedor);
        telaCadVendedor.setVisible(true);
    }//GEN-LAST:event_jMIVendedorActionPerformed

    private void jMIProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIProdutoActionPerformed
        TelaCadastroProduto telaCadProduto = new TelaCadastroProduto();
        ControllerCadProduto controllerCadProduto = new ControllerCadProduto(telaCadProduto);
        telaCadProduto.setVisible(true);
    }//GEN-LAST:event_jMIProdutoActionPerformed

    private void jMIMarcasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIMarcasActionPerformed
        TelaCadastroMarca telaCadMarca = new TelaCadastroMarca();
        ControllerCadMarca controllerCadMarca = new ControllerCadMarca(telaCadMarca);
        telaCadMarca.setVisible(true);
    }//GEN-LAST:event_jMIMarcasActionPerformed

    private void jMITamanhosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMITamanhosActionPerformed
        TelaCadastroTamanho telaCadTamanho = new TelaCadastroTamanho();
        ControllerCadTamanho controllerCadTamanho = new ControllerCadTamanho(telaCadTamanho);
        telaCadTamanho.setVisible(true);
    }//GEN-LAST:event_jMITamanhosActionPerformed

    private void jMITipoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMITipoProdutoActionPerformed
        TelaCadastroTipoProduto telaCadTipoProduto = new TelaCadastroTipoProduto();
        ControllerCadTipoProduto controllerCadTipoProduto = new ControllerCadTipoProduto(telaCadTipoProduto);
        telaCadTipoProduto.setVisible(true);
    }//GEN-LAST:event_jMITipoProdutoActionPerformed

    private void jMICaractProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICaractProdActionPerformed
        TelaCadastroCaractProd telaCadCaractProd = new TelaCadastroCaractProd();
        ControllerCadCaractProd controllerCadCaractProd = new ControllerCadCaractProd(telaCadCaractProd);
        telaCadCaractProd.setVisible(true);
    }//GEN-LAST:event_jMICaractProdActionPerformed

    private void jMICorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICorActionPerformed
        TelaCadastroCor telaCadCor = new TelaCadastroCor();
        ControllerCadCor controllerCadCor = new ControllerCadCor(telaCadCor);
        telaCadCor.setVisible(true);
    }//GEN-LAST:event_jMICorActionPerformed

    private void jMIVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIVendaActionPerformed
        TelaCadastroVenda telaCadVenda = new TelaCadastroVenda(null, true);
        ControllerCadVenda controllerCadVenda = new ControllerCadVenda(telaCadVenda);
        telaCadVenda.setVisible(true);
    }//GEN-LAST:event_jMIVendaActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jMIBairro;
    private javax.swing.JMenuItem jMICaractProd;
    private javax.swing.JMenuItem jMICep;
    private javax.swing.JMenuItem jMICidade;
    private javax.swing.JMenuItem jMICliente;
    private javax.swing.JMenuItem jMICor;
    private javax.swing.JMenuItem jMIFornecedor;
    private javax.swing.JMenuItem jMIMarcas;
    private javax.swing.JMenuItem jMIProduto;
    private javax.swing.JMenuItem jMITamanhos;
    private javax.swing.JMenuItem jMITipoProduto;
    private javax.swing.JMenuItem jMIVenda;
    private javax.swing.JMenu jMIVendas;
    private javax.swing.JMenuItem jMIVendedor;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuCadEnd;
    // End of variables declaration//GEN-END:variables
}
