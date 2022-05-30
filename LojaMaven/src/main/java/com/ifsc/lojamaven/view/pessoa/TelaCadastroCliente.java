package com.ifsc.lojamaven.view.pessoa;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaCadastroCliente extends javax.swing.JFrame {

    public TelaCadastroCliente() {
        initComponents();
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

  public JFormattedTextField getjFTFDtNasc() {
    return jFTFDtNasc;
  }

  public void setjFTFDtNasc(JFormattedTextField jFTFDtNasc) {
    this.jFTFDtNasc = jFTFDtNasc;
  }

  public JFormattedTextField getjFTFFone1() {
    return jFTFFone1;
  }

  public void setjFTFFone1(JFormattedTextField jFTFFone1) {
    this.jFTFFone1 = jFTFFone1;
  }

  public JFormattedTextField getjFTFRg() {
    return jFTFRg;
  }

  public void setjFTFRg(JFormattedTextField jFTFRg) {
    this.jFTFRg = jFTFRg;
  }

  public JFormattedTextField getjFTFCep() {
    return jFTFCep;
  }

  public void setjFTFCep(JFormattedTextField jFormattedTextField1) {
    this.jFTFCep = jFormattedTextField1;
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

  public void setjBtnAddCep(JButton jBtnAddCep) {
    this.jBtnAddCep = jBtnAddCep;
  }

  public JButton getjBtnBuscaCep() {
    return jBtnBuscaCep;
  }

  public void setjBtnBuscaCep(JButton jBtnBuscaCep) {
    this.jBtnBuscaCep = jBtnBuscaCep;
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
        jLabelRG = new javax.swing.JLabel();
        jLabeCPF = new javax.swing.JLabel();
        jFTFDtNasc = new javax.swing.JFormattedTextField();
        jLabelDtNasc = new javax.swing.JLabel();
        jLabelFone1 = new javax.swing.JLabel();
        jFTFFone1 = new javax.swing.JFormattedTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabelCEP = new javax.swing.JLabel();
        jLabelCidade = new javax.swing.JLabel();
        jTFCidade = new javax.swing.JTextField();
        jFTFCep = new javax.swing.JFormattedTextField();
        jLabelBairro = new javax.swing.JLabel();
        jTFBairro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTFLogradouro = new javax.swing.JTextField();
        jLabelComplemento = new javax.swing.JLabel();
        jTFComplemento = new javax.swing.JTextField();
        jLabelID = new javax.swing.JLabel();
        jTFId = new javax.swing.JTextField();
        jFTFCpf = new javax.swing.JFormattedTextField();
        jFTFRg = new javax.swing.JFormattedTextField();
        jBtnBuscaCep = new javax.swing.JButton();
        jBtnAddCep = new javax.swing.JButton();
        jLabelInfos = new javax.swing.JLabel();
        jLabelEnd = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPTitulo.setBackground(new java.awt.Color(204, 204, 204));
        jPTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelTitulo.setFont(new java.awt.Font("Raleway", 0, 18)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Cadastro de Clientes");

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

        jTFNome.setFont(new java.awt.Font("Raleway", 0, 11)); // NOI18N

        jLabelNome.setFont(new java.awt.Font("Raleway", 1, 12)); // NOI18N
        jLabelNome.setText("*Nome");

        jLabelEmail.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        jLabelEmail.setText("E-mail");

        jTFEmail.setFont(new java.awt.Font("Raleway", 0, 11)); // NOI18N

        jLabelRG.setFont(new java.awt.Font("Raleway", 1, 12)); // NOI18N
        jLabelRG.setText("*R.G");

        jLabeCPF.setFont(new java.awt.Font("Raleway", 1, 12)); // NOI18N
        jLabeCPF.setText("*CPF");

        try {
            jFTFDtNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTFDtNasc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFTFDtNasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFTFDtNascActionPerformed(evt);
            }
        });

        jLabelDtNasc.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        jLabelDtNasc.setText("Data de Nascimento");

        jLabelFone1.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        jLabelFone1.setText("Telefone");

        try {
            jFTFFone1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTFFone1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFTFFone1ActionPerformed(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabelCEP.setFont(new java.awt.Font("Raleway", 1, 12)); // NOI18N
        jLabelCEP.setText("*CEP");

        jLabelCidade.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        jLabelCidade.setText("Cidade");

        jTFCidade.setFont(new java.awt.Font("Raleway", 0, 11)); // NOI18N

        try {
            jFTFCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabelBairro.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        jLabelBairro.setText("Bairro");

        jTFBairro.setFont(new java.awt.Font("Raleway", 0, 11)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        jLabel6.setText("Logradouro (Rua, Av...)");

        jTFLogradouro.setFont(new java.awt.Font("Raleway", 0, 11)); // NOI18N

        jLabelComplemento.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        jLabelComplemento.setText("Complemento");

        jTFComplemento.setFont(new java.awt.Font("Raleway", 0, 11)); // NOI18N

        jLabelID.setFont(new java.awt.Font("Raleway", 0, 12)); // NOI18N
        jLabelID.setText("ID");

        try {
            jFTFCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTFCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFTFCpfActionPerformed(evt);
            }
        });

        try {
            jFTFRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jBtnBuscaCep.setText("...");

        jBtnAddCep.setText("+");

        jLabelInfos.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        jLabelInfos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelInfos.setText("Informações Pessoais");

        jLabelEnd.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
        jLabelEnd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEnd.setText("Endereço");

        javax.swing.GroupLayout jPanelContainerLayout = new javax.swing.GroupLayout(jPanelContainer);
        jPanelContainer.setLayout(jPanelContainerLayout);
        jPanelContainerLayout.setHorizontalGroup(
            jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContainerLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelInfos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelID)
                    .addGroup(jPanelContainerLayout.createSequentialGroup()
                        .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabelEmail)
                                .addComponent(jLabelNome)
                                .addComponent(jTFNome)
                                .addComponent(jTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTFId, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jFTFFone1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelFone1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabeCPF)
                            .addComponent(jLabelRG)
                            .addComponent(jFTFRg)
                            .addComponent(jFTFCpf)
                            .addComponent(jFTFDtNasc)
                            .addComponent(jLabelDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelContainerLayout.createSequentialGroup()
                        .addComponent(jLabelEnd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(34, 34, 34))
                    .addGroup(jPanelContainerLayout.createSequentialGroup()
                        .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelContainerLayout.createSequentialGroup()
                                .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanelContainerLayout.createSequentialGroup()
                                        .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelCidade)
                                            .addComponent(jTFCidade))
                                        .addGap(31, 31, 31))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelContainerLayout.createSequentialGroup()
                                        .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelContainerLayout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addComponent(jLabel6))
                                            .addComponent(jFTFCep, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelBairro)
                                    .addGroup(jPanelContainerLayout.createSequentialGroup()
                                        .addComponent(jBtnBuscaCep, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBtnAddCep, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanelContainerLayout.createSequentialGroup()
                                .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelComplemento)
                                    .addComponent(jLabelCEP))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTFLogradouro, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTFComplemento))
                        .addContainerGap())))
        );
        jPanelContainerLayout.setVerticalGroup(
            jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContainerLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelInfos)
                    .addComponent(jLabelEnd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelContainerLayout.createSequentialGroup()
                        .addComponent(jLabelCEP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFTFCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnBuscaCep)
                            .addComponent(jBtnAddCep))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContainerLayout.createSequentialGroup()
                                .addComponent(jLabelCidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelContainerLayout.createSequentialGroup()
                                .addComponent(jLabelBairro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(13, 13, 13)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabelComplemento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelContainerLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelContainerLayout.createSequentialGroup()
                                .addComponent(jLabelRG)
                                .addGap(11, 11, 11)
                                .addComponent(jFTFRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabeCPF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFTFCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelDtNasc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFTFDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelContainerLayout.createSequentialGroup()
                                .addComponent(jLabelID)
                                .addGap(5, 5, 5)
                                .addComponent(jTFId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelEmail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelFone1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFTFFone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelBtnContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 803, Short.MAX_VALUE)
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFTFFone1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFTFFone1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFTFFone1ActionPerformed

    private void jFTFCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFTFCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFTFCpfActionPerformed

    private void jFTFDtNascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFTFDtNascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFTFDtNascActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaCadastroCliente().setVisible(true);
        });
    }

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
    private javax.swing.JFormattedTextField jFTFDtNasc;
    private javax.swing.JFormattedTextField jFTFFone1;
    private javax.swing.JFormattedTextField jFTFRg;
    private javax.swing.JLabel jLabeCPF;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCEP;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelComplemento;
    private javax.swing.JLabel jLabelDtNasc;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEnd;
    private javax.swing.JLabel jLabelFone1;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelInfos;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelRG;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelBtnContainer;
    private javax.swing.JPanel jPanelContainer;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTFBairro;
    private javax.swing.JTextField jTFCidade;
    private javax.swing.JTextField jTFComplemento;
    private javax.swing.JTextField jTFEmail;
    private javax.swing.JTextField jTFId;
    private javax.swing.JTextField jTFLogradouro;
    private javax.swing.JTextField jTFNome;
    // End of variables declaration//GEN-END:variables
}
