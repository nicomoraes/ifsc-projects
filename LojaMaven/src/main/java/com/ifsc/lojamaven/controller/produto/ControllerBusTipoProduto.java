package com.ifsc.lojamaven.controller.produto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.table.DefaultTableModel;

import com.ifsc.lojamaven.service.produto.TipoProdutoService;
import com.ifsc.lojamaven.view.produto.TelaBuscaTipoProd;

public class ControllerBusTipoProduto implements ActionListener {

  TelaBuscaTipoProd telaBuscaTipoProduto;

  public ControllerBusTipoProduto(TelaBuscaTipoProd telaBuscaTipoProduto) {
    this.telaBuscaTipoProduto = telaBuscaTipoProduto;

    telaBuscaTipoProduto.getjButtonCarregar().addActionListener(this);
    telaBuscaTipoProduto.getjButtonSair().addActionListener(this);

    DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaTipoProduto.getjTable().getModel();

    TipoProdutoService tService = new TipoProdutoService();

    tService.buscar().forEach(tamanhoAtual -> {
      tabela.addRow(new Object[]{
              tamanhoAtual.getIdTipoProduto(),
              tamanhoAtual.getDescricao(),
      });
    });
  }

  @Override
  public void actionPerformed(ActionEvent event) {
    if (event.getSource() == this.telaBuscaTipoProduto.getjButtonCarregar()) {
      ControllerCadTipoProduto.codigo = (int) this.telaBuscaTipoProduto.getjTable().getValueAt(
              this.telaBuscaTipoProduto.getjTable().getSelectedRow(), 0
      );
      this.telaBuscaTipoProduto.dispose();
    } else if (event.getSource() == this.telaBuscaTipoProduto.getjButtonSair()) {
      this.telaBuscaTipoProduto.dispose();
    }

  }
}