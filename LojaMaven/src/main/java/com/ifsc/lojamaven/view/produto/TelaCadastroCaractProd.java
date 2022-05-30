package com.ifsc.lojamaven.view.produto;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class TelaCadastroCaractProd extends javax.swing.JFrame {


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButtonBuscar;
  private javax.swing.JButton jButtonCancelar;
  private javax.swing.JButton jButtonNovo;
  private javax.swing.JButton jButtonSair;
  private javax.swing.JButton jButtonSalvar;
  private javax.swing.JComboBox<String> jComboBoxCor;
  private javax.swing.JComboBox<String> jComboBoxProd;
  private javax.swing.JLabel jLabeProduto;
  private javax.swing.JLabel jLabelCodBarras;
  private javax.swing.JLabel jLabelCor;
  private javax.swing.JLabel jLabelID;
  private javax.swing.JLabel jLabelQuantEstoque;
  private javax.swing.JLabel jLabelTamanho;
  private javax.swing.JLabel jLabelTitulo;
  private javax.swing.JPanel jPTitulo;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanelBtnContainer;
  private javax.swing.JPanel jPanelContainer;
  private javax.swing.JTextField jTFBarraProduto;
  private javax.swing.JTextField jTFId;
  private javax.swing.JTextField jTFQuantEstoque;
  private javax.swing.JTextField jTFTamanho;

  public TelaCadastroCaractProd() {
    initComponents();
  }

  public static void main(String[] args) {
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
      java.util.logging.Logger.getLogger(TelaCadastroCaractProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(TelaCadastroCaractProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(TelaCadastroCaractProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(TelaCadastroCaractProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new TelaCadastroCaractProd().setVisible(true);
      }
    });
  }

  public JButton getjButtonBuscar() {
    return jButtonBuscar;
  }

  public void setjButtonBuscar(JButton jButtonBuscar) {
    this.jButtonBuscar = jButtonBuscar;
  }

  public JButton getjButtonCancelar() {
    return jButtonCancelar;
  }

  public void setjButtonCancelar(JButton jButtonCancelar) {
    this.jButtonCancelar = jButtonCancelar;
  }

  public JButton getjButtonNovo() {
    return jButtonNovo;
  }

  public void setjButtonNovo(JButton jButtonNovo) {
    this.jButtonNovo = jButtonNovo;
  }

  public JButton getjButtonSair() {
    return jButtonSair;
  }

  public void setjButtonSair(JButton jButtonSair) {
    this.jButtonSair = jButtonSair;
  }

  public JButton getjButtonSalvar() {
    return jButtonSalvar;
  }

  public void setjButtonSalvar(JButton jButtonSalvar) {
    this.jButtonSalvar = jButtonSalvar;
  }

  public JComboBox<String> getjComboBoxCor() {
    return jComboBoxCor;
  }

  public void setjComboBoxCor(JComboBox<String> jComboBoxCor) {
    this.jComboBoxCor = jComboBoxCor;
  }

  public JTextField getjTFTamanho() {
    return jTFTamanho;
  }

  public void setjTFTamanho(JTextField jTFTamanho) {
    this.jTFTamanho = jTFTamanho;
  }

  public JTextField getjTFBarraProduto() {
    return jTFBarraProduto;
  }

  public void setjTFBarraProduto(JTextField jTFBarraProduto) {
    this.jTFBarraProduto = jTFBarraProduto;
  }

  public JComboBox<String> getjComboBoxProd() {
    return jComboBoxProd;
  }

  public void setjComboBoxProd(JComboBox<String> jComboBoxProd) {
    this.jComboBoxProd = jComboBoxProd;
  }

  public JTextField getjTFId() {
    return jTFId;
  }

  public void setjTFId(JTextField jTFId) {
    this.jTFId = jTFId;
  }

  public JTextField getjTFQuantEstoque() {
    return jTFQuantEstoque;
  }

  public void setjTFQuantEstoque(JTextField jTFQuantEstoque) {
    this.jTFQuantEstoque = jTFQuantEstoque;
  }

  public JPanel getjPanelContainer() {
    return jPanelContainer;
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPTitulo = new javax.swing.JPanel();
    jLabelTitulo = new javax.swing.JLabel();
    jPanel1 = new javax.swing.JPanel();
    jPanelBtnContainer = new javax.swing.JPanel();
    jButtonNovo = new javax.swing.JButton();
    jButtonCancelar = new javax.swing.JButton();
    jButtonSalvar = new javax.swing.JButton();
    jButtonBuscar = new javax.swing.JButton();
    jButtonSair = new javax.swing.JButton();
    jPanelContainer = new javax.swing.JPanel();
    jLabeProduto = new javax.swing.JLabel();
    jLabelQuantEstoque = new javax.swing.JLabel();
    jTFQuantEstoque = new javax.swing.JTextField();
    jLabelCor = new javax.swing.JLabel();
    jLabelTamanho = new javax.swing.JLabel();
    jLabelID = new javax.swing.JLabel();
    jTFId = new javax.swing.JTextField();
    jComboBoxCor = new javax.swing.JComboBox<>();
    jLabelCodBarras = new javax.swing.JLabel();
    jComboBoxProd = new javax.swing.JComboBox<>();
    jTFTamanho = new javax.swing.JTextField();
    jTFBarraProduto = new javax.swing.JTextField();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPTitulo.setBackground(new java.awt.Color(204, 204, 204));
    jPTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPTitulo.setFont(new java.awt.Font("Raleway", 0, 11)); // NOI18N

    jLabelTitulo.setFont(new java.awt.Font("Raleway", 1, 18)); // NOI18N
    jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabelTitulo.setText("Cadastro de Caracteristicas de Produto");

    javax.swing.GroupLayout jPTituloLayout = new javax.swing.GroupLayout(jPTitulo);
    jPTitulo.setLayout(jPTituloLayout);
    jPTituloLayout.setHorizontalGroup(
            jPTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPTituloLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addContainerGap())
    );
    jPTituloLayout.setVerticalGroup(
            jPTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPTituloLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                            .addContainerGap())
    );

    jPanel1.setFont(new java.awt.Font("Raleway", 0, 11)); // NOI18N

    jPanelBtnContainer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    jButtonNovo.setText("Novo");
    jPanelBtnContainer.add(jButtonNovo);

    jButtonCancelar.setText("Cancelar");
    jPanelBtnContainer.add(jButtonCancelar);

    jButtonSalvar.setText("Salvar");
    jPanelBtnContainer.add(jButtonSalvar);

    jButtonBuscar.setText("Buscar");
    jPanelBtnContainer.add(jButtonBuscar);

    jButtonSair.setText("Sair");
    jPanelBtnContainer.add(jButtonSair);

    jPanelContainer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    jLabeProduto.setFont(new java.awt.Font("Raleway", 1, 12)); // NOI18N
    jLabeProduto.setText("*Produto");

    jLabelQuantEstoque.setFont(new java.awt.Font("Raleway", 1, 12)); // NOI18N
    jLabelQuantEstoque.setText("*Quant. no Estoque");

    jTFQuantEstoque.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

    jLabelCor.setFont(new java.awt.Font("Raleway", 1, 12)); // NOI18N
    jLabelCor.setText("*Cor");

    jLabelTamanho.setFont(new java.awt.Font("Raleway", 1, 12)); // NOI18N
    jLabelTamanho.setText("*Tamanho");

    jLabelID.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
    jLabelID.setText("ID");

    jTFId.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

    jComboBoxCor.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

    jLabelCodBarras.setFont(new java.awt.Font("Raleway", 1, 12)); // NOI18N
    jLabelCodBarras.setText("*Código de Barras");

    jComboBoxProd.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

    jTFTamanho.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

    jTFBarraProduto.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

    javax.swing.GroupLayout jPanelContainerLayout = new javax.swing.GroupLayout(jPanelContainer);
    jPanelContainer.setLayout(jPanelContainerLayout);
    jPanelContainerLayout.setHorizontalGroup(
            jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContainerLayout.createSequentialGroup()
                            .addGap(71, 71, 71)
                            .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelContainerLayout.createSequentialGroup()
                                            .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabelTamanho)
                                                    .addComponent(jTFTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTFId, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabelID))
                                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanelContainerLayout.createSequentialGroup()
                                            .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabeProduto)
                                                    .addComponent(jComboBoxProd, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabelCor)
                                                    .addComponent(jComboBoxCor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                                            .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabelQuantEstoque)
                                                    .addComponent(jTFQuantEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabelCodBarras)
                                                    .addComponent(jTFBarraProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(57, 57, 57))))
    );
    jPanelContainerLayout.setVerticalGroup(
            jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelContainerLayout.createSequentialGroup()
                            .addGap(48, 48, 48)
                            .addComponent(jLabelID)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTFId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContainerLayout.createSequentialGroup()
                                            .addComponent(jLabeProduto)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(jPanelContainerLayout.createSequentialGroup()
                                            .addComponent(jLabelCodBarras)
                                            .addGap(2, 2, 2)))
                            .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelContainerLayout.createSequentialGroup()
                                            .addComponent(jComboBoxProd, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabelCor)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jComboBoxCor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabelTamanho)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTFTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelContainerLayout.createSequentialGroup()
                                            .addComponent(jTFBarraProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanelContainerLayout.createSequentialGroup()
                                                            .addGap(19, 19, 19)
                                                            .addComponent(jTFQuantEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jLabelQuantEstoque))))
                            .addContainerGap(46, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanelContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanelBtnContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jPanelContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jPanelBtnContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(9, 9, 9))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jPTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addContainerGap())
    );
    layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jPTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents
  // End of variables declaration//GEN-END:variables
}
