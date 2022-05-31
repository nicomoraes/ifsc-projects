package com.ifsc.lojamaven.controller.endereco;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import com.ifsc.lojamaven.model.bo.endereco.Bairro;
import com.ifsc.lojamaven.service.endereco.BairroService;
import com.ifsc.lojamaven.view.endereco.TelaBuscaBairro;
import com.ifsc.lojamaven.view.endereco.TelaCadastroBairro;

public class ControllerCadBairro implements ActionListener {

  public static int codigo;
  TelaCadastroBairro telaCadBairro;

  public ControllerCadBairro(TelaCadastroBairro telaCadBairro) { // Passa a tela como parâmetro para o controller.

    this.telaCadBairro = telaCadBairro;

    // Funções que escutam ações dos botões.
    telaCadBairro.getjButtonNovo().addActionListener(this);
    telaCadBairro.getjButtonCancelar().addActionListener(this);
    telaCadBairro.getjButtonSalvar().addActionListener(this);
    telaCadBairro.getjButtonBuscar().addActionListener(this);
    telaCadBairro.getjButtonSair().addActionListener(this);

    telaCadBairro.getjTFId().addActionListener(this);
    telaCadBairro.getjTFDescricao().addActionListener(this);
    buttonState(true);
    inputState(false);
  }

  @Override // Quando disparar a ação aqui será executado o código do botão em questão.
  public void actionPerformed(ActionEvent event) {
    if (event.getSource() == telaCadBairro.getjButtonNovo()) {
      buttonState(false);
      inputState(true);
    } else if (event.getSource() == telaCadBairro.getjButtonCancelar()) {
      buttonState(true);
      inputState(false);
    } else if (event.getSource() == telaCadBairro.getjButtonSalvar()) {
      Bairro bairro = new Bairro();
      BairroService bService = new BairroService();
      bairro.setDescricao(this.telaCadBairro.getjTFDescricao().getText());

      if (this.telaCadBairro.getjTFId().getText().trim().equalsIgnoreCase("")) {
        bService.salvar(bairro);
      } else {
        bairro.setIdBairro(Integer.parseInt(this.telaCadBairro.getjTFId().getText()));
        bService.atualizar(bairro);
      }

      buttonState(true);
      inputState(false);
    } else if (event.getSource() == telaCadBairro.getjButtonBuscar()) {
      TelaBuscaBairro telaBusBairro = new TelaBuscaBairro(null, true);
      ControllerBusBairro controllerBusBairro = new ControllerBusBairro(telaBusBairro);
      telaBusBairro.setVisible(true);

      if (codigo != 0) {
        buttonState(false);
        inputState(true);

        Bairro bairro = new Bairro();
        BairroService bService = new BairroService();

        bairro = bService.buscar(codigo);

        this.telaCadBairro.getjTFId().setText(bairro.getIdBairro() + "");
        this.telaCadBairro.getjTFDescricao().setText(bairro.getDescricao());
        this.telaCadBairro.getjTFId().setEnabled(false);
      }
    } else if (event.getSource() == telaCadBairro.getjButtonSair()) {
      this.telaCadBairro.dispose();
    }
  }

  public void buttonState(boolean state) {
    telaCadBairro.getjButtonNovo().setEnabled(state);
    telaCadBairro.getjButtonCancelar().setEnabled(!state);
    telaCadBairro.getjButtonSalvar().setEnabled(!state);
    telaCadBairro.getjButtonBuscar().setEnabled(state);
    telaCadBairro.getjButtonSair().setEnabled(state);
  }

  public void inputState(boolean state) {
    Component[] componentes = this.telaCadBairro.getjPanelContainer().getComponents();

    for (Component componente : componentes) {
      if (componente instanceof JTextField) {
        ((JTextField) componente).setText("");
        componente.setEnabled(state);
      }
    }
    this.telaCadBairro.getjTFId().setEnabled(false);
  }
}
