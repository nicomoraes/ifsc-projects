package com.ifsc.lojamaven.controller.pessoa;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFormattedTextField;
import javax.swing.JTextField;

import com.ifsc.lojamaven.controller.endereco.ControllerBusCep;
import com.ifsc.lojamaven.controller.endereco.ControllerCadCep;
import com.ifsc.lojamaven.model.bo.endereco.Cep;
import com.ifsc.lojamaven.model.bo.pessoa.Fornecedor;
import com.ifsc.lojamaven.service.endereco.CepService;
import com.ifsc.lojamaven.service.pessoa.FornecedorService;
import com.ifsc.lojamaven.view.endereco.TelaBuscaCep;
import com.ifsc.lojamaven.view.endereco.TelaCadastroCep;
import com.ifsc.lojamaven.view.pessoa.TelaBuscaFornecedor;
import com.ifsc.lojamaven.view.pessoa.TelaCadastroFoneFornecedor;
import com.ifsc.lojamaven.view.pessoa.TelaCadastroFornecedor;

public class ControllerCadFornecedor implements ActionListener {

  TelaCadastroFornecedor telaCadFornecedor;
  public static int codigo;

  public ControllerCadFornecedor(TelaCadastroFornecedor telaCadFornecedor) { // Passa a tela como parâmetro para o
    // controller.
    this.telaCadFornecedor = telaCadFornecedor;

    // Funções que escutam ações dos botões.
    telaCadFornecedor.getjButtonNovo().addActionListener(this);
    telaCadFornecedor.getjButtonCancelar().addActionListener(this);
    telaCadFornecedor.getjButtonSalvar().addActionListener(this);
    telaCadFornecedor.getjButtonBuscar().addActionListener(this);
    telaCadFornecedor.getjButtonSair().addActionListener(this);
    telaCadFornecedor.getjBtnAddCep().addActionListener(this);
    telaCadFornecedor.getjBtnBuscaCep().addActionListener(this);
    telaCadFornecedor.getjBtnAddContato().addActionListener(this);

    // Inputs
    telaCadFornecedor.getjTFId().addActionListener(this);
    telaCadFornecedor.getjTFRazaoSocial().addActionListener(this);
    telaCadFornecedor.getjTFNomeFantasia().addActionListener(this);
    telaCadFornecedor.getjTFEmail().addActionListener(this);
    telaCadFornecedor.getjTFCidade().addActionListener(this);
    telaCadFornecedor.getjTFBairro().addActionListener(this);
    telaCadFornecedor.getjTFComplemento().addActionListener(this);
    telaCadFornecedor.getjTFLogradouro().addActionListener(this);
    telaCadFornecedor.getjFTFCep().addActionListener(this);
    telaCadFornecedor.getjFTFCnpj().addActionListener(this);
    telaCadFornecedor.getjFTFInscEstadual().addActionListener(this);

    buttonState(true);
    inputState(false);
    this.telaCadFornecedor.getjBtnAddContato().setEnabled(false);
  }

  @Override // Quando disparar a ação aqui será executado o código do botão em questão.
  public void actionPerformed(ActionEvent event) {
    if (event.getSource() == telaCadFornecedor.getjButtonNovo()) {
      buttonState(false);
      inputState(true);

    } else if (event.getSource() == telaCadFornecedor.getjButtonCancelar()) {
      buttonState(true);
      inputState(false);
      this.telaCadFornecedor.getjBtnAddContato().setEnabled(false);

    } else if (event.getSource() == telaCadFornecedor.getjButtonSalvar()) {
      Fornecedor fornecedor = new Fornecedor();
      FornecedorService fService = new FornecedorService();
      Cep cep = new Cep();
      CepService cepService = new CepService();

      fornecedor.setNome(this.telaCadFornecedor.getjTFNomeFantasia().getText());
      fornecedor.setRazaoSocial(this.telaCadFornecedor.getjTFRazaoSocial().getText());
      fornecedor.setCnpj(this.telaCadFornecedor.getjFTFCnpj().getText());
      fornecedor.setInscEstadual(this.telaCadFornecedor.getjFTFInscEstadual().getText());
      fornecedor.setEmail(this.telaCadFornecedor.getjTFEmail().getText());
      fornecedor.setComplementoEnd(this.telaCadFornecedor.getjTFComplemento().getText());

      cep = cepService.buscar(this.telaCadFornecedor.getjFTFCep().getText());
      fornecedor.setEnderecoCep(cep);

      if (this.telaCadFornecedor.getjTFId().getText().trim().equalsIgnoreCase("")) {
        fService.salvar(fornecedor);
      } else {
        fornecedor.setIdFornecedor(Integer.parseInt(this.telaCadFornecedor.getjTFId().getText()));
        fService.atualizar(fornecedor);
      }
      buttonState(true);
      inputState(false);

    } else if (event.getSource() == telaCadFornecedor.getjButtonBuscar()) {
      codigo = 0;
      TelaBuscaFornecedor telaBusFornecedor = new TelaBuscaFornecedor(null, true);
      ControllerBusFornecedor controllerBusFornecedor = new ControllerBusFornecedor(telaBusFornecedor);
      telaBusFornecedor.setVisible(true);
      if (codigo != 0) {
        buttonState(false);
        inputState(true);
        Fornecedor fornecedor = new Fornecedor();
        FornecedorService fService = new FornecedorService();
        Cep cep = new Cep();
        CepService cepService = new CepService();

        fornecedor = fService.buscar(codigo);
        cep = cepService.buscar(fornecedor.getEnderecoCep().getIdCep());

        this.telaCadFornecedor.getjTFId().setText(fornecedor.getIdFornecedor() + "");
        this.telaCadFornecedor.getjTFNomeFantasia().setText(fornecedor.getNome());
        this.telaCadFornecedor.getjTFRazaoSocial().setText(fornecedor.getRazaoSocial());
        this.telaCadFornecedor.getjFTFCnpj().setText(fornecedor.getCnpj());
        this.telaCadFornecedor.getjFTFInscEstadual().setText(fornecedor.getInscEstadual());
        this.telaCadFornecedor.getjTFEmail().setText(fornecedor.getEmail());
        this.telaCadFornecedor.getjTFComplemento().setText(fornecedor.getComplementoEnd());
        this.telaCadFornecedor.getjFTFCep().setText(fornecedor.getEnderecoCep().getCep());
        this.telaCadFornecedor.getjTFBairro().setText(cep.getBairro().getDescricao());
        this.telaCadFornecedor.getjTFCidade().setText(cep.getCidade().getDescricao());
        this.telaCadFornecedor.getjTFLogradouro().setText(cep.getLogradouro());

        this.telaCadFornecedor.getjBtnAddContato().setEnabled(true);
      }

    } else if (event.getSource() == telaCadFornecedor.getjButtonSair()) {
      this.telaCadFornecedor.dispose();

    } else if (event.getSource() == telaCadFornecedor.getjBtnBuscaCep()) {
      codigo = 0;
      TelaBuscaCep telaBusCep = new TelaBuscaCep(null, true);
      ControllerBusCep controllerBusCep = new ControllerBusCep(telaBusCep);
      telaBusCep.setVisible(true);

      if (codigo != 0) {
        Cep cep = new Cep();
        CepService cepService = new CepService();

        cep = cepService.buscar(codigo);

        this.telaCadFornecedor.getjFTFCep().setText(cep.getCep());
        this.telaCadFornecedor.getjTFBairro().setText(cep.getBairro().getDescricao());
        this.telaCadFornecedor.getjTFCidade().setText(cep.getCidade().getDescricao());
        this.telaCadFornecedor.getjTFLogradouro().setText(cep.getLogradouro());
      }
    } else if (event.getSource() == telaCadFornecedor.getjBtnAddCep()) {
      TelaCadastroCep telaCadCep = new TelaCadastroCep();
      ControllerCadCep controllerCadCep = new ControllerCadCep(telaCadCep);
      telaCadCep.setVisible(true);
    } else if (event.getSource() == telaCadFornecedor.getjBtnAddContato()) {
      TelaCadastroFoneFornecedor telaCadFone = new TelaCadastroFoneFornecedor();
      ControllerCadFoneFornecedor controllerCadFone = new ControllerCadFoneFornecedor(
              telaCadFone, Integer.parseInt(this.telaCadFornecedor.getjTFId().getText())
      );
      telaCadFone.setVisible(true);
    }
  }

  public void buttonState(boolean state) {
    telaCadFornecedor.getjButtonNovo().setEnabled(state);
    telaCadFornecedor.getjButtonCancelar().setEnabled(!state);
    telaCadFornecedor.getjButtonSalvar().setEnabled(!state);
    telaCadFornecedor.getjButtonBuscar().setEnabled(state);
    telaCadFornecedor.getjButtonSair().setEnabled(state);
    telaCadFornecedor.getjBtnAddCep().setEnabled(!state);
    telaCadFornecedor.getjBtnBuscaCep().setEnabled(!state);
  }

  public void inputState(boolean state) {

    Component[] componentes = this.telaCadFornecedor.getjPanelContainer().getComponents();

    for (Component componente : componentes) {
      if (componente instanceof JTextField) {
        ((JTextField) componente).setText("");
        componente.setEnabled(state);
      } else if (componente instanceof JFormattedTextField) {
        ((JFormattedTextField) componente).setText("");
        componente.setEnabled(state);
      }
    }
    this.telaCadFornecedor.getjTFId().setEnabled(false);
  }
}
