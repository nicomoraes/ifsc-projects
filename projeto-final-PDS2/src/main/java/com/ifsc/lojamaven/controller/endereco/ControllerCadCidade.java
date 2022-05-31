package com.ifsc.lojamaven.controller.endereco;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JTextField;

import com.ifsc.lojamaven.model.bo.endereco.Cidade;
import com.ifsc.lojamaven.service.endereco.CidadeService;
import com.ifsc.lojamaven.view.endereco.TelaBuscaCidade;
import com.ifsc.lojamaven.view.endereco.TelaCadastroCidade;

public class ControllerCadCidade implements ActionListener {

  public static int codigo;
  TelaCadastroCidade telaCadCidade;

  public ControllerCadCidade(TelaCadastroCidade telaCadCidade) { // Passa a tela como parâmetro para o controller.

    this.telaCadCidade = telaCadCidade;

    // Funções que escutam ações dos botões.
    telaCadCidade.getjButtonNovo().addActionListener(this);
    telaCadCidade.getjButtonCancelar().addActionListener(this);
    telaCadCidade.getjButtonSalvar().addActionListener(this);
    telaCadCidade.getjButtonBuscar().addActionListener(this);
    telaCadCidade.getjButtonSair().addActionListener(this);

    telaCadCidade.getjTFId().addActionListener(this);
    telaCadCidade.getjTFDescricao().addActionListener(this);
    telaCadCidade.getjComboBoxUF().addActionListener(this);

    buttonState(true);
    inputState(false);
  }

  @Override // Quando disparar a ação aqui será executado o código do botão em questão.
  public void actionPerformed(ActionEvent event) {
    if (event.getSource() == telaCadCidade.getjButtonNovo()) {
      buttonState(false);
      inputState(true);
    } else if (event.getSource() == telaCadCidade.getjButtonCancelar()) {
      buttonState(true);
      inputState(false);
    } else if (event.getSource() == telaCadCidade.getjButtonSalvar()) {
      Cidade cidade = new Cidade();
      cidade.setDescricao(this.telaCadCidade.getjTFDescricao().getText());
      cidade.setUf(this.telaCadCidade.getjComboBoxUF().getSelectedItem().toString());
      CidadeService cService = new CidadeService();

      if (this.telaCadCidade.getjTFId().getText().trim().equalsIgnoreCase("")) {
        cService.salvar(cidade);
      } else {
        cidade.setIdCidade(Integer.parseInt(this.telaCadCidade.getjTFId().getText()));
        cService.atualizar(cidade);
      }
      buttonState(true);
      inputState(false);
    } else if (event.getSource() == telaCadCidade.getjButtonBuscar()) {
      codigo = 0;
      TelaBuscaCidade telaBusCidade = new TelaBuscaCidade(null, true);
      ControllerBusCidade controllerBusCidade = new ControllerBusCidade(telaBusCidade);
      telaBusCidade.setVisible(true);
      if (codigo != 0) {
        buttonState(false);
        inputState(true);

        Cidade cidade;
        CidadeService cService = new CidadeService();

        cidade = cService.buscar(codigo);

        this.telaCadCidade.getjTFId().setText(cidade.getIdCidade() + "");
        this.telaCadCidade.getjTFDescricao().setText(cidade.getDescricao());
        this.telaCadCidade.getjComboBoxUF().setSelectedItem(cidade.getUf());

        this.telaCadCidade.getjTFId().setEnabled(false);
      }
    } else if (event.getSource() == telaCadCidade.getjButtonSair()) {
      this.telaCadCidade.dispose();
    }
  }

  public void buttonState(boolean state) {
    telaCadCidade.getjButtonNovo().setEnabled(state);
    telaCadCidade.getjButtonCancelar().setEnabled(!state);
    telaCadCidade.getjButtonSalvar().setEnabled(!state);
    telaCadCidade.getjButtonBuscar().setEnabled(state);
    telaCadCidade.getjButtonSair().setEnabled(state);
  }

  public void inputState(boolean state) {
    Component[] componentes = this.telaCadCidade.getjPanelContainer().getComponents();

    for (Component componente : componentes) {
      if (componente instanceof JTextField) {
        ((JTextField) componente).setText("");
        componente.setEnabled(state);
      } else if (componente instanceof JComboBox) {
        ((JComboBox<?>) componente).setSelectedIndex(0);
        componente.setEnabled(state);
      }
    }
    this.telaCadCidade.getjTFId().setEnabled(false);
  }

}
