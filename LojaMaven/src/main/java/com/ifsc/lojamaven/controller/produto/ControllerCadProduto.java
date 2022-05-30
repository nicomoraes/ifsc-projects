package com.ifsc.lojamaven.controller.produto;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;

import com.ifsc.lojamaven.model.bo.produto.Marca;
import com.ifsc.lojamaven.model.bo.produto.Produto;
import com.ifsc.lojamaven.model.bo.produto.Tamanho;
import com.ifsc.lojamaven.model.bo.produto.TipoProduto;
import com.ifsc.lojamaven.service.produto.MarcaService;
import com.ifsc.lojamaven.service.produto.ProdutoService;
import com.ifsc.lojamaven.service.produto.TamanhoService;
import com.ifsc.lojamaven.service.produto.TipoProdutoService;
import com.ifsc.lojamaven.view.produto.TelaBuscaProduto;
import com.ifsc.lojamaven.view.produto.TelaCadastroProduto;

public class ControllerCadProduto implements ActionListener {

  public static int codigo;
  TelaCadastroProduto telaCadProduto;

  public ControllerCadProduto(TelaCadastroProduto telaCadProduto) { // Passa a tela como parâmetro para o controller.
    this.telaCadProduto = telaCadProduto;

    // Funções que escutam ações dos botões.
    telaCadProduto.getjButtonNovo().addActionListener(this);
    telaCadProduto.getjButtonCancelar().addActionListener(this);
    telaCadProduto.getjButtonSalvar().addActionListener(this);
    telaCadProduto.getjButtonBuscar().addActionListener(this);
    telaCadProduto.getjButtonSair().addActionListener(this);

    // Inputs
    telaCadProduto.getjTFId().addActionListener(this);
    telaCadProduto.getjTFDescricao().addActionListener(this);
    telaCadProduto.getjTFValor().addActionListener(this);
    telaCadProduto.getjComboBoxMarca().addActionListener(this);
    telaCadProduto.getjComboBoxTamanho().addActionListener(this);
    telaCadProduto.getjComboBoxTipoProduto().addActionListener(this);

    fillComboBox();
    buttonState(true);
    inputState(false);
  }

  @Override // Quando disparar a ação aqui será executado o código do botão em questão.
  public void actionPerformed(ActionEvent event) {
    if (event.getSource() == telaCadProduto.getjButtonNovo()) {
      buttonState(false);
      inputState(true);
    } else if (event.getSource() == telaCadProduto.getjButtonCancelar()) {
      buttonState(true);
      inputState(false);
    } else if (event.getSource() == telaCadProduto.getjButtonSalvar()) {
      Produto produto = new Produto();
      ProdutoService produtoService = new ProdutoService();
      Marca marca = new Marca();
      MarcaService cService = new MarcaService();
      Tamanho tamanho = new Tamanho();
      TamanhoService tamService = new TamanhoService();
      TipoProduto tipoProduto = new TipoProduto();
      TipoProdutoService tipoService = new TipoProdutoService();

      produto.setDescricao(this.telaCadProduto.getjTFDescricao().getText());
      produto.setValProduto(Float.parseFloat(this.telaCadProduto.getjTFValor().getText()));

      marca = cService.buscar(this.telaCadProduto.getjComboBoxMarca().getSelectedItem().toString());
      produto.setMarca(marca);

      tamanho = tamService.buscar(this.telaCadProduto.getjComboBoxTamanho().getSelectedItem().toString());
      produto.setTamanho(tamanho);

      tipoProduto = tipoService.buscar(this.telaCadProduto.getjComboBoxTipoProduto().getSelectedItem().toString());
      produto.setTipoProduto(tipoProduto);

      if (this.telaCadProduto.getjTFId().getText().trim().equalsIgnoreCase("")) {
        produtoService.salvar(produto);
      } else {
        produto.setIdProduto(Integer.parseInt(this.telaCadProduto.getjTFId().getText()));
        produtoService.atualizar(produto);
      }
      buttonState(true);
      inputState(false);
    } else if (event.getSource() == telaCadProduto.getjButtonBuscar()) {
      codigo = 0;
      TelaBuscaProduto telaBusProduto = new TelaBuscaProduto(null, true);
      ControllerBusProduto controllerBusProduto = new ControllerBusProduto(telaBusProduto);
      telaBusProduto.setVisible(true);
      if (codigo != 0) {
        buttonState(false);
        inputState(true);

        Produto produto = new Produto();
        ProdutoService pService = new ProdutoService();
        produto = pService.buscar(codigo);

        this.telaCadProduto.getjTFId().setText(produto.getIdProduto() + "");
        this.telaCadProduto.getjTFDescricao().setText(produto.getDescricao());
        this.telaCadProduto.getjTFValor().setText(String.valueOf(produto.getValProduto()));
        this.telaCadProduto.getjComboBoxMarca().setSelectedItem(produto.getMarca().getDescricao());
        this.telaCadProduto.getjComboBoxTamanho().setSelectedItem(produto.getTamanho().getDescricao());
        this.telaCadProduto.getjComboBoxTipoProduto().setSelectedItem(produto.getTipoProduto().getDescricao());

        this.telaCadProduto.getjTFId().setEnabled(false);
      }
    } else if (event.getSource() == telaCadProduto.getjButtonSair()) {
      this.telaCadProduto.dispose();
    }
  }

  public void buttonState(boolean state) {
    telaCadProduto.getjButtonNovo().setEnabled(state);
    telaCadProduto.getjButtonCancelar().setEnabled(!state);
    telaCadProduto.getjButtonSalvar().setEnabled(!state);
    telaCadProduto.getjButtonBuscar().setEnabled(state);
    telaCadProduto.getjButtonSair().setEnabled(state);
  }

  public void inputState(boolean state) {

    Component[] componentes = this.telaCadProduto.getjPanelContainer().getComponents();

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
    this.telaCadProduto.getjTFId().setEnabled(false);
  }

  public void fillComboBox() {
    MarcaService mService = new MarcaService();
    TamanhoService tamService = new TamanhoService();
    TipoProdutoService tipoProdutorodService = new TipoProdutoService();

    mService.buscar().forEach(marcaAtual -> {
      this.telaCadProduto.getjComboBoxMarca().addItem(marcaAtual.getDescricao());
    });
    tamService.buscar().forEach(tamanhoAtual -> {
      this.telaCadProduto.getjComboBoxTamanho().addItem(tamanhoAtual.getDescricao());
    });
    tipoProdutorodService.buscar().forEach(tipoAtual -> {
      this.telaCadProduto.getjComboBoxTipoProduto().addItem(tipoAtual.getDescricao());
    });
  }

}
