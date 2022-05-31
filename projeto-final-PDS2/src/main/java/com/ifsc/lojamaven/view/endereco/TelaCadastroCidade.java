package com.ifsc.lojamaven.view.endereco;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class TelaCadastroCidade extends javax.swing.JFrame {


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButtonBuscar;
  private javax.swing.JButton jButtonCancelar;
  private javax.swing.JButton jButtonNovo;
  private javax.swing.JButton jButtonSair;
  private javax.swing.JButton jButtonSalvar;
  private javax.swing.JComboBox<String> jComboBox1;
  private javax.swing.JComboBox<String> jComboBoxUF;
  private javax.swing.JLabel jLabelDescricao;
  private javax.swing.JLabel jLabelID;
  private javax.swing.JLabel jLabelTitulo;
  private javax.swing.JLabel jLabelUF;
  private javax.swing.JPanel jPTitulo;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanelBtnContainer;
  private javax.swing.JPanel jPanelContainer;
  private javax.swing.JTextField jTFDescricao;
  private javax.swing.JTextField jTFId;


  public TelaCadastroCidade() {
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
      java.util.logging.Logger.getLogger(TelaCadastroCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(TelaCadastroCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(TelaCadastroCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(TelaCadastroCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new TelaCadastroCidade().setVisible(true);
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

  public JTextField getjTFDescricao() {
    return jTFDescricao;
  }

  public void setjTFDescricao(JTextField jTFDescricao) {
    this.jTFDescricao = jTFDescricao;
  }

  public JTextField getjTFId() {
    return jTFId;
  }

  public void setjTFId(JTextField jTFId) {
    this.jTFId = jTFId;
  }

  public JComboBox<String> getjComboBoxUF() {
    return jComboBoxUF;
  }

  public void setjComboBoxUF(JComboBox<String> jComboBoxUF) {
    this.jComboBoxUF = jComboBoxUF;
  }

  public JPanel getjPanelContainer() {
    return jPanelContainer;
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jComboBox1 = new javax.swing.JComboBox<>();
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
    jTFDescricao = new javax.swing.JTextField();
    jLabelDescricao = new javax.swing.JLabel();
    jLabelID = new javax.swing.JLabel();
    jTFId = new javax.swing.JTextField();
    jLabelUF = new javax.swing.JLabel();
    jComboBoxUF = new javax.swing.JComboBox<>();

    jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Item 1", "Item 2", "Item 3", "Item 4"}));

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPTitulo.setBackground(new java.awt.Color(204, 204, 204));
    jPTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    jLabelTitulo.setFont(new java.awt.Font("Raleway", 1, 18)); // NOI18N
    jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabelTitulo.setText("Cadastro de Cidades");

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

    jTFDescricao.setFont(new java.awt.Font("Raleway", 0, 11)); // NOI18N

    jLabelDescricao.setFont(new java.awt.Font("Raleway", 1, 14)); // NOI18N
    jLabelDescricao.setText("*Descrição");

    jLabelID.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
    jLabelID.setText("ID");

    jTFId.setFont(new java.awt.Font("Raleway", 0, 11)); // NOI18N

    jLabelUF.setFont(new java.awt.Font("Raleway", 1, 14)); // NOI18N
    jLabelUF.setText("*UF");

    jComboBoxUF.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
    jComboBoxUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"}));

    javax.swing.GroupLayout jPanelContainerLayout = new javax.swing.GroupLayout(jPanelContainer);
    jPanelContainer.setLayout(jPanelContainerLayout);
    jPanelContainerLayout.setHorizontalGroup(
            jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContainerLayout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelUF)
                                    .addComponent(jLabelID)
                                    .addComponent(jTFDescricao)
                                    .addComponent(jTFId)
                                    .addComponent(jLabelDescricao)
                                    .addComponent(jComboBoxUF, 0, 150, Short.MAX_VALUE))
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanelContainerLayout.setVerticalGroup(
            jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelContainerLayout.createSequentialGroup()
                            .addContainerGap(34, Short.MAX_VALUE)
                            .addComponent(jLabelID)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTFId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabelDescricao)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTFDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabelUF)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBoxUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(33, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jPanelBtnContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 4, Short.MAX_VALUE))
                                    .addComponent(jPanelContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
