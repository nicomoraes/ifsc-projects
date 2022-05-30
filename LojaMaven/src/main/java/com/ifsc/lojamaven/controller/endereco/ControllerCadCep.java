package com.ifsc.lojamaven.controller.endereco;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JTextField;

import com.ifsc.lojamaven.model.bo.endereco.Bairro;
import com.ifsc.lojamaven.model.bo.endereco.Cep;
import com.ifsc.lojamaven.model.bo.endereco.Cidade;
import com.ifsc.lojamaven.service.endereco.BairroService;
import com.ifsc.lojamaven.service.endereco.CepService;
import com.ifsc.lojamaven.service.endereco.CidadeService;
import com.ifsc.lojamaven.view.endereco.TelaBuscaCep;
import com.ifsc.lojamaven.view.endereco.TelaCadastroCep;

public class ControllerCadCep implements ActionListener {

  public static int codigo;
  TelaCadastroCep telaCadCep;

  public ControllerCadCep(TelaCadastroCep telaCadCep) { // Passa a tela como parâmetro para o controller.

    this.telaCadCep = telaCadCep;

    // Funções que escutam ações dos botões.
    telaCadCep.getjButtonNovo().addActionListener(this);
    telaCadCep.getjButtonCancelar().addActionListener(this);
    telaCadCep.getjButtonSalvar().addActionListener(this);
    telaCadCep.getjButtonBuscar().addActionListener(this);
    telaCadCep.getjButtonSair().addActionListener(this);

    // Inputs
    telaCadCep.getjTFId().addActionListener(this);
    telaCadCep.getjTFLogradouro().addActionListener(this);
    telaCadCep.getjFTFCep().addActionListener(this);
    telaCadCep.getjComboBoxBairro().addActionListener(this);
    telaCadCep.getjComboBoxCidade().addActionListener(this);

    fillComboBox();
    buttonState(true);
    inputState(false);
  }

  @Override // Quando disparar a ação aqui será executado o código do botão em questão.
  public void actionPerformed(ActionEvent event) {
    if (event.getSource() == telaCadCep.getjButtonNovo()) {
      buttonState(false);
      inputState(true);
    } else if (event.getSource() == telaCadCep.getjButtonCancelar()) {
      buttonState(true);
      inputState(false);
    } else if (event.getSource() == telaCadCep.getjButtonSalvar()) {
      Cep cep = new Cep();
      CepService cepService = new CepService();
      Cidade cidade;
      CidadeService cService = new CidadeService();
      Bairro bairro;
      BairroService bService = new BairroService();

      cep.setCep(this.telaCadCep.getjFTFCep().getText());
      cep.setLogradouro(this.telaCadCep.getjTFLogradouro().getText());

      cidade = cService.buscar(this.telaCadCep.getjComboBoxCidade().getSelectedItem().toString());
      cep.setCidade(cidade);

      bairro = bService.buscar(this.telaCadCep.getjComboBoxBairro().getSelectedItem().toString());
      cep.setBairro(bairro);

      if (this.telaCadCep.getjTFId().getText().trim().equalsIgnoreCase("")) {
        cepService.salvar(cep);
      } else {
        cep.setIdCep(Integer.parseInt(this.telaCadCep.getjTFId().getText()));
        cepService.atualizar(cep);
      }
      buttonState(true);
      inputState(false);
    } else if (event.getSource() == telaCadCep.getjButtonBuscar()) {
      codigo = 0;
      TelaBuscaCep telaBusCep = new TelaBuscaCep(null, true);
      ControllerBusCep controllerBusCep = new ControllerBusCep(telaBusCep);
      telaBusCep.setVisible(true);
      if (codigo != 0) {
        buttonState(false);
        inputState(true);

        Cep cep;
        CepService cService = new CepService();
        cep = cService.buscar(codigo);

        this.telaCadCep.getjTFId().setText(cep.getIdCep() + "");
        this.telaCadCep.getjFTFCep().setText(cep.getCep());
        this.telaCadCep.getjTFLogradouro().setText(cep.getLogradouro());
        this.telaCadCep.getjComboBoxCidade().setSelectedItem(cep.getCidade().getDescricao());
        this.telaCadCep.getjComboBoxBairro().setSelectedItem(cep.getBairro().getDescricao());

        this.telaCadCep.getjTFId().setEnabled(false);
      }
    } else if (event.getSource() == telaCadCep.getjButtonSair()) {
      this.telaCadCep.dispose();
    }
  }

  public void buttonState(boolean state) {
    telaCadCep.getjButtonNovo().setEnabled(state);
    telaCadCep.getjButtonCancelar().setEnabled(!state);
    telaCadCep.getjButtonSalvar().setEnabled(!state);
    telaCadCep.getjButtonBuscar().setEnabled(state);
    telaCadCep.getjButtonSair().setEnabled(state);
  }

  public void inputState(boolean state) {

    Component[] componentes = this.telaCadCep.getjPanelContainer().getComponents();

    for (Component componente : componentes) {
      if (componente instanceof JTextField) {
        ((JTextField) componente).setText("");
        componente.setEnabled(state);
      } else if (componente instanceof JComboBox) {
        ((JComboBox<?>) componente).setSelectedIndex(0);
        componente.setEnabled(state);
      }
    }
    this.telaCadCep.getjTFId().setEnabled(false);
  }

  public void fillComboBox() {
    CidadeService cService = new CidadeService();
    BairroService bService = new BairroService();

    cService.buscar().forEach(
            cidadeAtual -> this.telaCadCep.getjComboBoxCidade().addItem(cidadeAtual.getDescricao())
    );
    bService.buscar().forEach(
            bairroAtual -> this.telaCadCep.getjComboBoxBairro().addItem(bairroAtual.getDescricao())
    );
  }
}
