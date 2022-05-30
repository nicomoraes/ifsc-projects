package com.ifsc.lojamaven.view.endereco;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class TelaCadastroCep extends javax.swing.JFrame {


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButtonBuscar;
  private javax.swing.JButton jButtonCancelar;
  private javax.swing.JButton jButtonNovo;
  private javax.swing.JButton jButtonSair;
  private javax.swing.JButton jButtonSalvar;
  private javax.swing.JComboBox<String> jComboBoxBairro;
  private javax.swing.JComboBox<String> jComboBoxCidade;
  private javax.swing.JFormattedTextField jFTFCep;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabelBairro;
  private javax.swing.JLabel jLabelCEP;
  private javax.swing.JLabel jLabelCidade;
  private javax.swing.JLabel jLabelID;
  private javax.swing.JLabel jLabelTitulo;
  private javax.swing.JPanel jPTitulo;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanelBtnContainer;
  private javax.swing.JPanel jPanelContainer;
  private javax.swing.JTextField jTFId;
  private javax.swing.JTextField jTFLogradouro;

  public TelaCadastroCep() {
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
      java.util.logging.Logger.getLogger(TelaCadastroCep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(TelaCadastroCep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(TelaCadastroCep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(TelaCadastroCep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        new TelaCadastroCep().setVisible(true);
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

  public JComboBox<String> getjComboBoxBairro() {
    return jComboBoxBairro;
  }

  public void setjComboBoxBairro(JComboBox<String> jComboBoxBairro) {
    this.jComboBoxBairro = jComboBoxBairro;
  }

  public JComboBox<String> getjComboBoxCidade() {
    return jComboBoxCidade;
  }

  public void setjComboBoxCidade(JComboBox<String> jComboBoxCidade) {
    this.jComboBoxCidade = jComboBoxCidade;
  }

  public JFormattedTextField getjFTFCep() {
    return jFTFCep;
  }

  public void setjFTFCep(JFormattedTextField jFTFCep) {
    this.jFTFCep = jFTFCep;
  }

  public JTextField getjTFId() {
    return jTFId;
  }

  public void setjTFId(JTextField jTFId) {
    this.jTFId = jTFId;
  }

  public JTextField getjTFLogradouro() {
    return jTFLogradouro;
  }

  public void setjTFLogradouro(JTextField jTFLogradouro) {
    this.jTFLogradouro = jTFLogradouro;
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
    jLabelCEP = new javax.swing.JLabel();
    jLabelCidade = new javax.swing.JLabel();
    jFTFCep = new javax.swing.JFormattedTextField();
    jLabelBairro = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jTFLogradouro = new javax.swing.JTextField();
    jLabelID = new javax.swing.JLabel();
    jTFId = new javax.swing.JTextField();
    jComboBoxCidade = new javax.swing.JComboBox<>();
    jComboBoxBairro = new javax.swing.JComboBox<>();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPTitulo.setBackground(new java.awt.Color(204, 204, 204));
    jPTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    jLabelTitulo.setFont(new java.awt.Font("Raleway", 1, 18)); // NOI18N
    jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabelTitulo.setText("Cadastro de Endereços");

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

    jLabelCEP.setFont(new java.awt.Font("Raleway", 1, 14)); // NOI18N
    jLabelCEP.setText("*CEP");

    jLabelCidade.setFont(new java.awt.Font("Raleway", 1, 14)); // NOI18N
    jLabelCidade.setText("*Cidade");

    try {
      jFTFCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
    } catch (java.text.ParseException ex) {
      ex.printStackTrace();
    }
    jFTFCep.setFont(new java.awt.Font("Raleway", 0, 11)); // NOI18N

    jLabelBairro.setFont(new java.awt.Font("Raleway", 1, 14)); // NOI18N
    jLabelBairro.setText("*Bairro");

    jLabel6.setFont(new java.awt.Font("Raleway", 1, 14)); // NOI18N
    jLabel6.setText("*Logradouro (Rua, Av...)");

    jTFLogradouro.setFont(new java.awt.Font("Raleway", 0, 11)); // NOI18N

    jLabelID.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
    jLabelID.setText("ID");

    jComboBoxCidade.setFont(new java.awt.Font("Raleway", 0, 11)); // NOI18N

    jComboBoxBairro.setFont(new java.awt.Font("Raleway", 0, 11)); // NOI18N

    javax.swing.GroupLayout jPanelContainerLayout = new javax.swing.GroupLayout(jPanelContainer);
    jPanelContainer.setLayout(jPanelContainerLayout);
    jPanelContainerLayout.setHorizontalGroup(
            jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContainerLayout.createSequentialGroup()
                            .addContainerGap(48, Short.MAX_VALUE)
                            .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFId, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelID)
                                    .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTFLogradouro)
                                            .addGroup(jPanelContainerLayout.createSequentialGroup()
                                                    .addComponent(jLabel6)
                                                    .addGap(122, 122, 122))
                                            .addGroup(jPanelContainerLayout.createSequentialGroup()
                                                    .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabelCidade)
                                                            .addComponent(jFTFCep, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jComboBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(41, 41, 41)
                                                    .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabelBairro)
                                                            .addComponent(jComboBoxBairro, 0, 150, Short.MAX_VALUE))))
                                    .addComponent(jLabelCEP))
                            .addGap(38, 38, 38))
    );
    jPanelContainerLayout.setVerticalGroup(
            jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContainerLayout.createSequentialGroup()
                            .addContainerGap(32, Short.MAX_VALUE)
                            .addComponent(jLabelID)
                            .addGap(5, 5, 5)
                            .addComponent(jTFId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(23, 23, 23)
                            .addComponent(jLabelCEP)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jFTFCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelCidade)
                                    .addComponent(jLabelBairro))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTFLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(32, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanelContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanelBtnContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE))
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
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents
  // End of variables declaration//GEN-END:variables
}
