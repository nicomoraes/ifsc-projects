package com.ifsc.lojamaven.view.pessoa;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class TelaCadastroVendedor extends javax.swing.JFrame {


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jBtnAddCep;
  private javax.swing.JButton jBtnBuscaCep;
  private javax.swing.JButton jButtonBuscar;
  private javax.swing.JButton jButtonCancelar;
  private javax.swing.JButton jButtonNovo;
  private javax.swing.JButton jButtonSair;
  private javax.swing.JButton jButtonSalvar;
  private javax.swing.JFormattedTextField jFTFCep;
  private javax.swing.JFormattedTextField jFTFCpf;
  private javax.swing.JFormattedTextField jFTFFone;
  private javax.swing.JLabel jLabeCPF;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabelBairro;
  private javax.swing.JLabel jLabelCEP;
  private javax.swing.JLabel jLabelCidade;
  private javax.swing.JLabel jLabelComRecebida;
  private javax.swing.JLabel jLabelComVenda;
  private javax.swing.JLabel jLabelComplemento;
  private javax.swing.JLabel jLabelEmail;
  private javax.swing.JLabel jLabelEnd;
  private javax.swing.JLabel jLabelFone1;
  private javax.swing.JLabel jLabelID;
  private javax.swing.JLabel jLabelInfos;
  private javax.swing.JLabel jLabelInfosVenda;
  private javax.swing.JLabel jLabelNome;
  private javax.swing.JLabel jLabelTitulo;
  private javax.swing.JPanel jPTitulo;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanelBtnContainer;
  private javax.swing.JPanel jPanelContainer;
  private javax.swing.JSeparator jSeparator1;
  private javax.swing.JSeparator jSeparator2;
  private javax.swing.JTextField jTFBairro;
  private javax.swing.JTextField jTFCidade;
  private javax.swing.JTextField jTFComRecebida;
  private javax.swing.JTextField jTFComVenda;
  private javax.swing.JTextField jTFComplemento;
  private javax.swing.JTextField jTFEmail;
  private javax.swing.JTextField jTFId;
  private javax.swing.JTextField jTFLogradouro;
  private javax.swing.JTextField jTFNome;
  public TelaCadastroVendedor() {
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
      java.util.logging.Logger.getLogger(TelaCadastroVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(TelaCadastroVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(TelaCadastroVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(TelaCadastroVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(() -> {
      new TelaCadastroVendedor().setVisible(true);
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

  public JFormattedTextField getjFTFCpf() {
    return jFTFCpf;
  }

  public void setjFTFCpf(JFormattedTextField jFTFCpf) {
    this.jFTFCpf = jFTFCpf;
  }

  public JFormattedTextField getjFTFFone() {
    return jFTFFone;
  }

  public void setjFTFFone(JFormattedTextField jFTFFone) {
    this.jFTFFone = jFTFFone;
  }

  public JFormattedTextField getjFTFCep() {
    return jFTFCep;
  }

  public void setjFTFCep(JFormattedTextField jFTFCep) {
    this.jFTFCep = jFTFCep;
  }

  public JTextField getjTFBairro() {
    return jTFBairro;
  }

  public void setjTFBairro(JTextField jTFBairro) {
    this.jTFBairro = jTFBairro;
  }

  public JTextField getjTFCidade() {
    return jTFCidade;
  }

  public void setjTFCidade(JTextField jTFCidade) {
    this.jTFCidade = jTFCidade;
  }

  public JTextField getjTFComRecebida() {
    return jTFComRecebida;
  }

  public void setjTFComRecebida(JTextField jTFComRecebida) {
    this.jTFComRecebida = jTFComRecebida;
  }

  public JTextField getjTFComVenda() {
    return jTFComVenda;
  }

  public void setjTFComVenda(JTextField jTFComVenda) {
    this.jTFComVenda = jTFComVenda;
  }

  public JTextField getjTFComplemento() {
    return jTFComplemento;
  }

  public void setjTFComplemento(JTextField jTFComplemento) {
    this.jTFComplemento = jTFComplemento;
  }

  public JTextField getjTFEmail() {
    return jTFEmail;
  }

  public void setjTFEmail(JTextField jTFEmail) {
    this.jTFEmail = jTFEmail;
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

  public JTextField getjTFNome() {
    return jTFNome;
  }

  public void setjTFNome(JTextField jTFNome) {
    this.jTFNome = jTFNome;
  }

  public JPanel getjPanelContainer() {
    return jPanelContainer;
  }

  public JButton getjBtnAddCep() {
    return jBtnAddCep;
  }

  public JButton getjBtnBuscaCep() {
    return jBtnBuscaCep;
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
    jTFNome = new javax.swing.JTextField();
    jLabelNome = new javax.swing.JLabel();
    jLabelEmail = new javax.swing.JLabel();
    jTFEmail = new javax.swing.JTextField();
    jLabeCPF = new javax.swing.JLabel();
    jSeparator1 = new javax.swing.JSeparator();
    jLabelFone1 = new javax.swing.JLabel();
    jFTFFone = new javax.swing.JFormattedTextField();
    jSeparator2 = new javax.swing.JSeparator();
    jLabelCEP = new javax.swing.JLabel();
    jLabelCidade = new javax.swing.JLabel();
    jTFCidade = new javax.swing.JTextField();
    jLabelBairro = new javax.swing.JLabel();
    jTFBairro = new javax.swing.JTextField();
    jLabel6 = new javax.swing.JLabel();
    jTFLogradouro = new javax.swing.JTextField();
    jLabelComplemento = new javax.swing.JLabel();
    jTFComplemento = new javax.swing.JTextField();
    jLabelID = new javax.swing.JLabel();
    jTFId = new javax.swing.JTextField();
    jFTFCpf = new javax.swing.JFormattedTextField();
    jLabelComVenda = new javax.swing.JLabel();
    jTFComVenda = new javax.swing.JTextField();
    jLabelComRecebida = new javax.swing.JLabel();
    jTFComRecebida = new javax.swing.JTextField();
    jFTFCep = new javax.swing.JFormattedTextField();
    jBtnAddCep = new javax.swing.JButton();
    jBtnBuscaCep = new javax.swing.JButton();
    jLabelInfos = new javax.swing.JLabel();
    jLabelEnd = new javax.swing.JLabel();
    jLabelInfosVenda = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPTitulo.setBackground(new java.awt.Color(204, 204, 204));
    jPTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    jLabelTitulo.setFont(new java.awt.Font("Raleway", 1, 18)); // NOI18N
    jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabelTitulo.setText("Cadastro de Vendedor");

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

    jLabelNome.setFont(new java.awt.Font("Raleway", 1, 12)); // NOI18N
    jLabelNome.setText("*Nome");

    jLabelEmail.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
    jLabelEmail.setText("E-mail");

    jLabeCPF.setFont(new java.awt.Font("Raleway", 1, 12)); // NOI18N
    jLabeCPF.setText("*CPF");

    jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

    jLabelFone1.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
    jLabelFone1.setText("Telefone");

    try {
      jFTFFone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
    } catch (java.text.ParseException ex) {
      ex.printStackTrace();
    }

    jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

    jLabelCEP.setFont(new java.awt.Font("Raleway", 1, 12)); // NOI18N
    jLabelCEP.setText("*CEP");

    jLabelCidade.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
    jLabelCidade.setText("Cidade");

    jLabelBairro.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
    jLabelBairro.setText("Bairro");

    jLabel6.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
    jLabel6.setText("Logradouro (Rua, Av...)");

    jLabelComplemento.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
    jLabelComplemento.setText("Complemento");

    jLabelID.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
    jLabelID.setText("ID");

    try {
      jFTFCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
    } catch (java.text.ParseException ex) {
      ex.printStackTrace();
    }

    jLabelComVenda.setFont(new java.awt.Font("Raleway", 1, 12)); // NOI18N
    jLabelComVenda.setText("*(%) Comissão de Vendas");

    jLabelComRecebida.setFont(new java.awt.Font("Raleway", 1, 12)); // NOI18N
    jLabelComRecebida.setText("*(%) Comissão Recebida");

    try {
      jFTFCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
    } catch (java.text.ParseException ex) {
      ex.printStackTrace();
    }

    jBtnAddCep.setText("+");

    jBtnBuscaCep.setText("...");

    jLabelInfos.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
    jLabelInfos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabelInfos.setText("Informações Pessoais");

    jLabelEnd.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
    jLabelEnd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabelEnd.setText("Endereço");

    jLabelInfosVenda.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
    jLabelInfosVenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabelInfosVenda.setText("Informações de Venda");

    javax.swing.GroupLayout jPanelContainerLayout = new javax.swing.GroupLayout(jPanelContainer);
    jPanelContainer.setLayout(jPanelContainerLayout);
    jPanelContainerLayout.setHorizontalGroup(
            jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelContainerLayout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelEmail)
                                    .addComponent(jLabelNome)
                                    .addComponent(jTFNome)
                                    .addComponent(jTFEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(jTFId, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelID)
                                    .addComponent(jFTFFone, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(jLabelFone1)
                                    .addComponent(jLabeCPF)
                                    .addComponent(jFTFCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(jLabelInfos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(41, 41, 41)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelContainerLayout.createSequentialGroup()
                                            .addGap(29, 29, 29)
                                            .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabelComRecebida)
                                                    .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                            .addComponent(jTFComRecebida, javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jTFComVenda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jLabelComVenda))
                                            .addGap(34, 34, 34))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContainerLayout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabelInfosVenda)
                                            .addGap(35, 35, 35)))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanelContainerLayout.createSequentialGroup()
                                            .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabelCidade)
                                                    .addComponent(jTFCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(41, 41, 41)
                                            .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTFBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabelBairro)))
                                    .addComponent(jLabel6)
                                    .addComponent(jTFLogradouro)
                                    .addComponent(jLabelComplemento)
                                    .addComponent(jTFComplemento)
                                    .addComponent(jLabelCEP)
                                    .addGroup(jPanelContainerLayout.createSequentialGroup()
                                            .addComponent(jFTFCep, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jBtnBuscaCep, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jBtnAddCep, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabelEnd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addContainerGap(32, Short.MAX_VALUE))
    );
    jPanelContainerLayout.setVerticalGroup(
            jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelContainerLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelInfos)
                                    .addComponent(jLabelEnd)
                                    .addComponent(jLabelInfosVenda))
                            .addGap(24, 24, 24)
                            .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelContainerLayout.createSequentialGroup()
                                            .addComponent(jLabelCEP)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jFTFCep, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jBtnBuscaCep, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jBtnAddCep))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabelCidade)
                                                    .addComponent(jLabelBairro))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jTFCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTFBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTFLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabelComplemento)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTFComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelContainerLayout.createSequentialGroup()
                                            .addComponent(jLabelID)
                                            .addGap(5, 5, 5)
                                            .addComponent(jTFId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabelNome)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabeCPF)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jFTFCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabelEmail)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabelFone1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jFTFFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelContainerLayout.createSequentialGroup()
                                            .addGap(8, 8, 8)
                                            .addComponent(jLabelComVenda)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTFComVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabelComRecebida)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTFComRecebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanelContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanelBtnContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 864, Short.MAX_VALUE))
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
