package com.ifsc.lojamaven.controller.produto;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import com.ifsc.lojamaven.model.bo.produto.TipoProduto;
import com.ifsc.lojamaven.service.produto.TipoProdutoService;
import com.ifsc.lojamaven.view.produto.TelaBuscaTipoProd;
import com.ifsc.lojamaven.view.produto.TelaCadastroTipoProduto;

public class ControllerCadTipoProduto implements ActionListener {

  public static int codigo;
  TelaCadastroTipoProduto telaCadTipoProduto;

  public ControllerCadTipoProduto(TelaCadastroTipoProduto telaCadTipoProduto) { // Passa a tela como parâmetro para o
    // controller.
    this.telaCadTipoProduto = telaCadTipoProduto;

    // Funções que escutam ações dos botões.
    telaCadTipoProduto.getjButtonNovo().addActionListener(this);
    telaCadTipoProduto.getjButtonCancelar().addActionListener(this);
    telaCadTipoProduto.getjButtonSalvar().addActionListener(this);
    telaCadTipoProduto.getjButtonBuscar().addActionListener(this);
    telaCadTipoProduto.getjButtonSair().addActionListener(this);

    // Inputs
    telaCadTipoProduto.getjTFId().addActionListener(this);
    telaCadTipoProduto.getjTFDescricao().addActionListener(this);

    buttonState(true);
    inputState(false);
  }

  @Override // Quando disparar a ação aqui será executado o código do botão em questão.
  public void actionPerformed(ActionEvent event) {
    if (event.getSource() == telaCadTipoProduto.getjButtonNovo()) {
      buttonState(false);
      inputState(true);
    } else if (event.getSource() == telaCadTipoProduto.getjButtonCancelar()) {
      buttonState(true);
      inputState(false);
    } else if (event.getSource() == telaCadTipoProduto.getjButtonSalvar()) {
      TipoProduto tipoProd = new TipoProduto();
      TipoProdutoService tService = new TipoProdutoService();
      tipoProd.setDescricao(this.telaCadTipoProduto.getjTFDescricao().getText());

      if (this.telaCadTipoProduto.getjTFId().getText().trim().equalsIgnoreCase("")) {
        tService.salvar(tipoProd);
      } else {
        tipoProd.setIdTipoProduto(Integer.parseInt(this.telaCadTipoProduto.getjTFId().getText()));
        tService.atualizar(tipoProd);
      }

      buttonState(true);
      inputState(false);
    } else if (event.getSource() == telaCadTipoProduto.getjButtonBuscar()) {
      TelaBuscaTipoProd telaBusTipoProduto = new TelaBuscaTipoProd(null, true);
      ControllerBusTipoProduto controllerBusTipoProduto = new ControllerBusTipoProduto(telaBusTipoProduto);
      telaBusTipoProduto.setVisible(true);

      if (codigo != 0) {
        buttonState(false);
        inputState(true);

        TipoProduto tipoProd = new TipoProduto();
        TipoProdutoService tService = new TipoProdutoService();

        tipoProd = tService.buscar(codigo);

        this.telaCadTipoProduto.getjTFId().setText(tipoProd.getIdTipoProduto() + "");
        this.telaCadTipoProduto.getjTFDescricao().setText(tipoProd.getDescricao());
        this.telaCadTipoProduto.getjTFId().setEnabled(false);
      }
    } else if (event.getSource() == telaCadTipoProduto.getjButtonSair()) {
      this.telaCadTipoProduto.dispose();
    }
  }

  public void buttonState(boolean state) {
    telaCadTipoProduto.getjButtonNovo().setEnabled(state);
    telaCadTipoProduto.getjButtonCancelar().setEnabled(!state);
    telaCadTipoProduto.getjButtonSalvar().setEnabled(!state);
    telaCadTipoProduto.getjButtonBuscar().setEnabled(state);
    telaCadTipoProduto.getjButtonSair().setEnabled(state);
  }

  public void inputState(boolean state) {

    Component[] componentes = this.telaCadTipoProduto.getjPanelContainer().getComponents();

    for (Component componente : componentes) {
      if (componente instanceof JTextField) {
        ((JTextField) componente).setText("");
        componente.setEnabled(state);
      }
    }
    this.telaCadTipoProduto.getjTFId().setEnabled(false);
  }
}
