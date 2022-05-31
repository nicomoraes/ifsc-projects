package com.ifsc.lojamaven.controller.produto;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import com.ifsc.lojamaven.model.bo.produto.Marca;
import com.ifsc.lojamaven.service.produto.MarcaService;
import com.ifsc.lojamaven.view.produto.TelaBuscaMarca;
import com.ifsc.lojamaven.view.produto.TelaCadastroMarca;

public class ControllerCadMarca implements ActionListener {

  public static int codigo;
  TelaCadastroMarca telaCadMarca;

  public ControllerCadMarca(TelaCadastroMarca telaCadMarca) { // Passa a tela como parâmetro para o controller.
    this.telaCadMarca = telaCadMarca;

    // Funções que escutam ações dos botões.
    telaCadMarca.getjButtonNovo().addActionListener(this);
    telaCadMarca.getjButtonCancelar().addActionListener(this);
    telaCadMarca.getjButtonSalvar().addActionListener(this);
    telaCadMarca.getjButtonBuscar().addActionListener(this);
    telaCadMarca.getjButtonSair().addActionListener(this);

    // Inputs
    telaCadMarca.getjTFId().addActionListener(this);
    telaCadMarca.getjTFDescricao().addActionListener(this);

    buttonState(true);
    inputState(false);
  }

  @Override // Quando disparar a ação aqui será executado o código do botão em questão.
  public void actionPerformed(ActionEvent event) {
    if (event.getSource() == telaCadMarca.getjButtonNovo()) {
      buttonState(false);
      inputState(true);
    } else if (event.getSource() == telaCadMarca.getjButtonCancelar()) {
      buttonState(true);
      inputState(false);
    } else if (event.getSource() == telaCadMarca.getjButtonSalvar()) {
      Marca marca = new Marca();
      MarcaService tService = new MarcaService();
      marca.setDescricao(this.telaCadMarca.getjTFDescricao().getText());

      if (this.telaCadMarca.getjTFId().getText().trim().equalsIgnoreCase("")) {
        tService.salvar(marca);
      } else {
        marca.setIdMarca(Integer.parseInt(this.telaCadMarca.getjTFId().getText()));
        tService.atualizar(marca);
      }

      buttonState(true);
      inputState(false);
    } else if (event.getSource() == telaCadMarca.getjButtonBuscar()) {
      TelaBuscaMarca telaBusMarca = new TelaBuscaMarca(null, true);
      ControllerBusMarca controllerBusMarca = new ControllerBusMarca(telaBusMarca);
      telaBusMarca.setVisible(true);

      if (codigo != 0) {
        buttonState(false);
        inputState(true);

        Marca cor = new Marca();
        MarcaService tService = new MarcaService();

        cor = tService.buscar(codigo);

        this.telaCadMarca.getjTFId().setText(cor.getIdMarca() + "");
        this.telaCadMarca.getjTFDescricao().setText(cor.getDescricao());
        this.telaCadMarca.getjTFId().setEnabled(false);
      }
    } else if (event.getSource() == telaCadMarca.getjButtonSair()) {
      this.telaCadMarca.dispose();
    }
  }

  public void buttonState(boolean state) {
    telaCadMarca.getjButtonNovo().setEnabled(state);
    telaCadMarca.getjButtonCancelar().setEnabled(!state);
    telaCadMarca.getjButtonSalvar().setEnabled(!state);
    telaCadMarca.getjButtonBuscar().setEnabled(state);
    telaCadMarca.getjButtonSair().setEnabled(state);
  }

  public void inputState(boolean state) {

    Component[] componentes = this.telaCadMarca.getjPanelContainer().getComponents();

    for (Component componente : componentes) {
      if (componente instanceof JTextField) {
        ((JTextField) componente).setText("");
        componente.setEnabled(state);
      }
    }
    this.telaCadMarca.getjTFId().setEnabled(false);
  }

}
