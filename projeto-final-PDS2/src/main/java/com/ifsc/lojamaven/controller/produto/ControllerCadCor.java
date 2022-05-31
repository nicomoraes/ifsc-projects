package com.ifsc.lojamaven.controller.produto;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import com.ifsc.lojamaven.model.bo.produto.Cor;
import com.ifsc.lojamaven.service.produto.CorService;
import com.ifsc.lojamaven.view.produto.TelaBuscaCor;
import com.ifsc.lojamaven.view.produto.TelaCadastroCor;

public class ControllerCadCor implements ActionListener {

  public static int codigo;
  TelaCadastroCor telaCadCor;

  public ControllerCadCor(TelaCadastroCor telaCadCor) { // Passa a tela como parâmetro para o controller.
    this.telaCadCor = telaCadCor;

    // Funções que escutam ações dos botões.
    telaCadCor.getjButtonNovo().addActionListener(this);
    telaCadCor.getjButtonCancelar().addActionListener(this);
    telaCadCor.getjButtonSalvar().addActionListener(this);
    telaCadCor.getjButtonBuscar().addActionListener(this);
    telaCadCor.getjButtonSair().addActionListener(this);

    // Inputs
    telaCadCor.getjTFId().addActionListener(this);
    telaCadCor.getjTFDescricao().addActionListener(this);

    buttonState(true);
    inputState(false);
  }

  @Override // Quando disparar a ação aqui será executado o código do botão em questão.
  public void actionPerformed(ActionEvent event) {
    if (event.getSource() == telaCadCor.getjButtonNovo()) {
      buttonState(false);
      inputState(true);
    } else if (event.getSource() == telaCadCor.getjButtonCancelar()) {
      buttonState(true);
      inputState(false);
    } else if (event.getSource() == telaCadCor.getjButtonSalvar()) {
      Cor cor = new Cor();
      CorService corService = new CorService();
      cor.setDescricao(this.telaCadCor.getjTFDescricao().getText());

      if (this.telaCadCor.getjTFId().getText().trim().equalsIgnoreCase("")) {
        corService.salvar(cor);
      } else {
        cor.setIdCor(Integer.parseInt(this.telaCadCor.getjTFId().getText()));
        corService.atualizar(cor);
      }

      buttonState(true);
      inputState(false);
    } else if (event.getSource() == telaCadCor.getjButtonBuscar()) {
      TelaBuscaCor telaBusCor = new TelaBuscaCor(null, true);
      ControllerBusCor controllerBusCor = new ControllerBusCor(telaBusCor);
      telaBusCor.setVisible(true);

      if (codigo != 0) {
        buttonState(false);
        inputState(true);

        Cor cor = new Cor();
        CorService corService = new CorService();

        cor = corService.buscar(codigo);

        this.telaCadCor.getjTFId().setText(cor.getIdCor() + "");
        this.telaCadCor.getjTFDescricao().setText(cor.getDescricao());
        this.telaCadCor.getjTFId().setEnabled(false);
      }
    } else if (event.getSource() == telaCadCor.getjButtonSair()) {
      this.telaCadCor.dispose();
    }
  }

  public void buttonState(boolean state) {
    telaCadCor.getjButtonNovo().setEnabled(state);
    telaCadCor.getjButtonCancelar().setEnabled(!state);
    telaCadCor.getjButtonSalvar().setEnabled(!state);
    telaCadCor.getjButtonBuscar().setEnabled(state);
    telaCadCor.getjButtonSair().setEnabled(state);
  }

  public void inputState(boolean state) {

    Component[] componentes = this.telaCadCor.getjPanelContainer().getComponents();

    for (Component componente : componentes) {
      if (componente instanceof JTextField) {
        ((JTextField) componente).setText("");
        componente.setEnabled(state);
      }
    }
    this.telaCadCor.getjTFId().setEnabled(false);
  }

}
