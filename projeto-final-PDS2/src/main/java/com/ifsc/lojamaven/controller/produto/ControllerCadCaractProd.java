package com.ifsc.lojamaven.controller.produto;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;

import com.ifsc.lojamaven.model.bo.produto.CaractProd;
import com.ifsc.lojamaven.model.bo.produto.Cor;
import com.ifsc.lojamaven.model.bo.produto.Produto;
import com.ifsc.lojamaven.service.produto.CaractProdService;
import com.ifsc.lojamaven.service.produto.CorService;
import com.ifsc.lojamaven.service.produto.ProdutoService;
import com.ifsc.lojamaven.view.produto.TelaBuscaCaractProd;
import com.ifsc.lojamaven.view.produto.TelaCadastroCaractProd;

public class ControllerCadCaractProd implements ActionListener {

  public static int codigo;
  TelaCadastroCaractProd telaCadCaractProd;

  public ControllerCadCaractProd(TelaCadastroCaractProd telaCadCaractProd) { // Passa a tela como parâmetro para o
    // controller.
    this.telaCadCaractProd = telaCadCaractProd;

    // Funções que escutam ações dos botões.
    telaCadCaractProd.getjButtonNovo().addActionListener(this);
    telaCadCaractProd.getjButtonCancelar().addActionListener(this);
    telaCadCaractProd.getjButtonSalvar().addActionListener(this);
    telaCadCaractProd.getjButtonBuscar().addActionListener(this);
    telaCadCaractProd.getjButtonSair().addActionListener(this);

    // Inputs
    telaCadCaractProd.getjTFId().addActionListener(this);
    telaCadCaractProd.getjComboBoxProd().addActionListener(this);
    telaCadCaractProd.getjTFQuantEstoque().addActionListener(this);
    telaCadCaractProd.getjTFBarraProduto().addActionListener(this);
    telaCadCaractProd.getjComboBoxCor().addActionListener(this);
    telaCadCaractProd.getjTFTamanho().addActionListener(this);

    fillComboBox();
    buttonState(true);
    inputState(false);

  }

  @Override // Quando disparar a ação aqui será executado o código do botão em questão.
  public void actionPerformed(ActionEvent event) {
    if (event.getSource() == telaCadCaractProd.getjButtonNovo()) {
      buttonState(false);
      inputState(true);
    } else if (event.getSource() == telaCadCaractProd.getjButtonCancelar()) {
      buttonState(true);
      inputState(false);
    } else if (event.getSource() == telaCadCaractProd.getjButtonSalvar()) {
      CaractProd caractProd = new CaractProd();
      CaractProdService caractProdService = new CaractProdService();
      Produto produto = new Produto();
      ProdutoService pService = new ProdutoService();
      Cor cor = new Cor();
      CorService cService = new CorService();

      caractProd.setTamanhoProduto(this.telaCadCaractProd.getjTFTamanho().getText());
      caractProd.setBarraProduto(this.telaCadCaractProd.getjTFBarraProduto().getText());
      caractProd.setQtdEstoque(Float.parseFloat(this.telaCadCaractProd.getjTFQuantEstoque().getText()));

      produto = pService.buscar(this.telaCadCaractProd.getjComboBoxProd().getSelectedItem().toString());
      caractProd.setProduto(produto);

      cor = cService.buscar(this.telaCadCaractProd.getjComboBoxCor().getSelectedItem().toString());
      caractProd.setCor(cor);

      if (this.telaCadCaractProd.getjTFId().getText().trim().equalsIgnoreCase("")) {
        caractProdService.salvar(caractProd);
      } else {
        caractProd.setIdCaracteristicaProduto(Integer.parseInt(this.telaCadCaractProd.getjTFId().getText()));
        caractProdService.atualizar(caractProd);
      }

      buttonState(true);
      inputState(false);
    } else if (event.getSource() == telaCadCaractProd.getjButtonBuscar()) {
      codigo = 0;
      TelaBuscaCaractProd telaBusCaractProd = new TelaBuscaCaractProd(null, true);
      ControllerBusCaractProd controllerBusProduto = new ControllerBusCaractProd(telaBusCaractProd);
      telaBusCaractProd.setVisible(true);
      if (codigo != 0) {
        buttonState(false);
        inputState(true);

        CaractProd caractProd = new CaractProd();
        CaractProdService caractProdService = new CaractProdService();
        caractProd = caractProdService.buscar(codigo);

        this.telaCadCaractProd.getjTFId().setText(caractProd.getIdCaracteristicaProduto() + "");
        this.telaCadCaractProd.getjTFTamanho().setText(caractProd.getTamanhoProduto());
        this.telaCadCaractProd.getjTFBarraProduto().setText(caractProd.getBarraProduto());
        this.telaCadCaractProd.getjTFQuantEstoque().setText(String.valueOf(caractProd.getQtdEstoque()));
        this.telaCadCaractProd.getjComboBoxProd().setSelectedItem(caractProd.getProduto().getDescricao());
        this.telaCadCaractProd.getjComboBoxCor().setSelectedItem(caractProd.getCor().getDescricao());

        this.telaCadCaractProd.getjTFId().setEnabled(false);
      }
    } else if (event.getSource() == telaCadCaractProd.getjButtonSair()) {
      this.telaCadCaractProd.dispose();
    }
  }

  public void buttonState(boolean state) {
    telaCadCaractProd.getjButtonNovo().setEnabled(state);
    telaCadCaractProd.getjButtonCancelar().setEnabled(!state);
    telaCadCaractProd.getjButtonSalvar().setEnabled(!state);
    telaCadCaractProd.getjButtonBuscar().setEnabled(state);
    telaCadCaractProd.getjButtonSair().setEnabled(state);
  }

  public void inputState(boolean state) {

    Component[] componentes = this.telaCadCaractProd.getjPanelContainer().getComponents();

    for (Component componente : componentes) {
      if (componente instanceof JTextField) {
        ((JTextField) componente).setText("");
        componente.setEnabled(state);
      } else if (componente instanceof JFormattedTextField) {
        ((JFormattedTextField) componente).setText("");
        componente.setEnabled(state);
      } else if (componente instanceof JComboBox) {
        ((JComboBox) componente).setSelectedIndex(0);
        componente.setEnabled(state);
      }
    }
    this.telaCadCaractProd.getjTFId().setEnabled(false);
  }

  public void fillComboBox() {
    ProdutoService pService = new ProdutoService();
    CorService cService = new CorService();

    pService.buscar().forEach(produto -> {
      this.telaCadCaractProd.getjComboBoxProd().addItem(produto.getDescricao());
    });
    cService.buscar().forEach(corAtual -> {
      this.telaCadCaractProd.getjComboBoxCor().addItem(corAtual.getDescricao());
    });
  }

}
