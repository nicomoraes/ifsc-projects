package com.ifsc.lojamaven.controller.pessoa;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFormattedTextField;
import javax.swing.JTextField;

import com.ifsc.lojamaven.controller.endereco.ControllerBusCep;
import com.ifsc.lojamaven.controller.endereco.ControllerCadCep;
import com.ifsc.lojamaven.model.bo.endereco.Cep;
import com.ifsc.lojamaven.model.bo.pessoa.Vendedor;
import com.ifsc.lojamaven.service.endereco.CepService;
import com.ifsc.lojamaven.service.pessoa.VendedorService;
import com.ifsc.lojamaven.view.endereco.TelaBuscaCep;
import com.ifsc.lojamaven.view.endereco.TelaCadastroCep;
import com.ifsc.lojamaven.view.pessoa.TelaBuscaVendedor;
import com.ifsc.lojamaven.view.pessoa.TelaCadastroVendedor;

public class ControllerCadVendedor implements ActionListener {

  TelaCadastroVendedor telaCadVendedor;
  public static int codigo;

  public ControllerCadVendedor(TelaCadastroVendedor telaCadVendedor) { // Passa a tela como parâmetro para o
    // controller.
    this.telaCadVendedor = telaCadVendedor;

    // Funções que escutam ações dos botões.
    telaCadVendedor.getjButtonNovo().addActionListener(this);
    telaCadVendedor.getjButtonCancelar().addActionListener(this);
    telaCadVendedor.getjButtonSalvar().addActionListener(this);
    telaCadVendedor.getjButtonBuscar().addActionListener(this);
    telaCadVendedor.getjButtonSair().addActionListener(this);
    telaCadVendedor.getjBtnAddCep().addActionListener(this);
    telaCadVendedor.getjBtnBuscaCep().addActionListener(this);

    // Inputs
    telaCadVendedor.getjTFId().addActionListener(this);
    telaCadVendedor.getjTFNome().addActionListener(this);
    telaCadVendedor.getjTFEmail().addActionListener(this);
    telaCadVendedor.getjTFCidade().addActionListener(this);
    telaCadVendedor.getjTFBairro().addActionListener(this);
    telaCadVendedor.getjTFComplemento().addActionListener(this);
    telaCadVendedor.getjTFLogradouro().addActionListener(this);
    telaCadVendedor.getjTFComVenda().addActionListener(this);
    telaCadVendedor.getjTFComRecebida().addActionListener(this);
    telaCadVendedor.getjFTFCep().addActionListener(this);
    telaCadVendedor.getjFTFCpf().addActionListener(this);
    telaCadVendedor.getjFTFFone().addActionListener(this);

    buttonState(true);
    inputState(false);
  }

  @Override // Quando disparar a ação aqui será executado o código do botão em questão.
  public void actionPerformed(ActionEvent event) {
    if (event.getSource() == telaCadVendedor.getjButtonNovo()) {
      buttonState(false);
      inputState(true);
    } else if (event.getSource() == telaCadVendedor.getjButtonCancelar()) {
      buttonState(true);
      inputState(false);
    } else if (event.getSource() == telaCadVendedor.getjButtonSalvar()) {
      Vendedor fornecedor = new Vendedor();
      VendedorService fService = new VendedorService();
      Cep cep = new Cep();
      CepService cepService = new CepService();

      fornecedor.setNome(this.telaCadVendedor.getjTFNome().getText());
      fornecedor.setCpf(this.telaCadVendedor.getjFTFCpf().getText());
      fornecedor.setEmail(this.telaCadVendedor.getjTFEmail().getText());
      fornecedor.setFone(this.telaCadVendedor.getjFTFFone().getText());
      fornecedor.setPercentComissaoVenda(Float.parseFloat(this.telaCadVendedor.getjTFComVenda().getText()));
      fornecedor.setPercentComissaoRecebto(Float.parseFloat(this.telaCadVendedor.getjTFComRecebida().getText()));
      fornecedor.setComplementoEnd(this.telaCadVendedor.getjTFComplemento().getText());

      cep = cepService.buscar(this.telaCadVendedor.getjFTFCep().getText());
      fornecedor.setEnderecoCep(cep);

      if (this.telaCadVendedor.getjTFId().getText().trim().equalsIgnoreCase("")) {
        fService.salvar(fornecedor);
      } else {
        fornecedor.setIdVendedor(Integer.parseInt(this.telaCadVendedor.getjTFId().getText()));
        fService.atualizar(fornecedor);
      }
      buttonState(true);
      inputState(false);
    } else if (event.getSource() == telaCadVendedor.getjButtonBuscar()) {
      codigo = 0;
      TelaBuscaVendedor telaBusVendedor = new TelaBuscaVendedor(null, true);
      ControllerBusVendedor controllerBusVendedor = new ControllerBusVendedor(telaBusVendedor);
      telaBusVendedor.setVisible(true);

      if (codigo != 0) {
        buttonState(false);
        inputState(true);

        Vendedor vendedor = new Vendedor();
        VendedorService cService = new VendedorService();
        Cep cep = new Cep();
        CepService cepService = new CepService();

        vendedor = cService.buscar(codigo);
        cep = cepService.buscar(vendedor.getEnderecoCep().getIdCep());

        this.telaCadVendedor.getjTFId().setText(vendedor.getIdVendedor() + "");
        this.telaCadVendedor.getjTFNome().setText(vendedor.getNome());
        this.telaCadVendedor.getjFTFCpf().setText(vendedor.getCpf());
        this.telaCadVendedor.getjTFEmail().setText(vendedor.getEmail());
        this.telaCadVendedor.getjFTFFone().setText(vendedor.getFone());
        this.telaCadVendedor.getjTFComVenda().setText(Float.toString(vendedor.getPercentComissaoVenda()));
        this.telaCadVendedor.getjTFComRecebida().setText(Float.toString(vendedor.getPercentComissaoRecebto()));
        this.telaCadVendedor.getjTFComplemento().setText(vendedor.getComplementoEnd());
        this.telaCadVendedor.getjFTFCep().setText(vendedor.getEnderecoCep().getCep());
        this.telaCadVendedor.getjTFBairro().setText(cep.getBairro().getDescricao());
        this.telaCadVendedor.getjTFCidade().setText(cep.getCidade().getDescricao());
        this.telaCadVendedor.getjTFLogradouro().setText(cep.getLogradouro());

        this.telaCadVendedor.getjTFId().setEnabled(false);
      }
    } else if (event.getSource() == telaCadVendedor.getjButtonSair()) {
      this.telaCadVendedor.dispose();
    } else if (event.getSource() == telaCadVendedor.getjBtnBuscaCep()) {
      codigo = 0;
      TelaBuscaCep telaBusCep = new TelaBuscaCep(null, true);
      ControllerBusCep controllerBusCep = new ControllerBusCep(telaBusCep);
      telaBusCep.setVisible(true);
      if (codigo != 0) {
        Cep cep = new Cep();
        CepService cepService = new CepService();

        cep = cepService.buscar(codigo);

        this.telaCadVendedor.getjFTFCep().setText(cep.getCep());
        this.telaCadVendedor.getjTFBairro().setText(cep.getBairro().getDescricao());
        this.telaCadVendedor.getjTFCidade().setText(cep.getCidade().getDescricao());
        this.telaCadVendedor.getjTFLogradouro().setText(cep.getLogradouro());
      }
    } else if (event.getSource() == telaCadVendedor.getjBtnAddCep()) {
      TelaCadastroCep telaCadCep = new TelaCadastroCep();
      ControllerCadCep controllerCadCep = new ControllerCadCep(telaCadCep);
      telaCadCep.setVisible(true);
    }
  }

  public void buttonState(boolean state) {
    telaCadVendedor.getjButtonNovo().setEnabled(state);
    telaCadVendedor.getjButtonCancelar().setEnabled(!state);
    telaCadVendedor.getjButtonSalvar().setEnabled(!state);
    telaCadVendedor.getjButtonBuscar().setEnabled(state);
    telaCadVendedor.getjButtonSair().setEnabled(state);
    telaCadVendedor.getjBtnAddCep().setEnabled(!state);
    telaCadVendedor.getjBtnBuscaCep().setEnabled(!state);
  }

  public void inputState(boolean state) {
    Component[] componentes = this.telaCadVendedor.getjPanelContainer().getComponents();

    for (Component componente : componentes) {
      if (componente instanceof JTextField) {
        ((JTextField) componente).setText("");
        componente.setEnabled(state);
      } else if (componente instanceof JFormattedTextField) {
        ((JFormattedTextField) componente).setText("");
        componente.setEnabled(state);
      }
    }
    this.telaCadVendedor.getjTFId().setEnabled(false);
  }

}
