package com.ifsc.lojamaven.controller.produto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.table.DefaultTableModel;

import com.ifsc.lojamaven.service.produto.TamanhoService;
import com.ifsc.lojamaven.view.produto.TelaBuscaTamanho;

public class ControllerBusTamanho implements ActionListener {

  TelaBuscaTamanho telaBuscaTamanho;

  public ControllerBusTamanho(TelaBuscaTamanho telaBuscaTamanho) {
    this.telaBuscaTamanho = telaBuscaTamanho;

    telaBuscaTamanho.getjButtonCarregar().addActionListener(this);
    telaBuscaTamanho.getjButtonSair().addActionListener(this);

    DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaTamanho.getjTable().getModel();

    TamanhoService tService = new TamanhoService();

    tService.buscar().forEach(tamanhoAtual -> {
      tabela.addRow(new Object[]{
              tamanhoAtual.getIdTamanho(),
              tamanhoAtual.getDescricao(),
      });
    });
  }

  @Override
  public void actionPerformed(ActionEvent event) {
    if (event.getSource() == this.telaBuscaTamanho.getjButtonCarregar()) {
      ControllerCadTamanho.codigo = (int) this.telaBuscaTamanho.getjTable().getValueAt(
              this.telaBuscaTamanho.getjTable().getSelectedRow(), 0
      );
      this.telaBuscaTamanho.dispose();
    } else if (event.getSource() == this.telaBuscaTamanho.getjButtonSair()) {
      this.telaBuscaTamanho.dispose();
    }

  }
}  