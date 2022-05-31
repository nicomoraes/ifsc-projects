package com.ifsc.lojamaven.controller.produto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.table.DefaultTableModel;

import com.ifsc.lojamaven.service.produto.CaractProdService;
import com.ifsc.lojamaven.view.produto.TelaBuscaCaractProd;

public class ControllerBusCaractProd implements ActionListener {

  TelaBuscaCaractProd telaBuscaCaractProd;

  public ControllerBusCaractProd(TelaBuscaCaractProd telaBuscaCaractProd) {
    this.telaBuscaCaractProd = telaBuscaCaractProd;

    telaBuscaCaractProd.getjButtonCarregar().addActionListener(this);
    telaBuscaCaractProd.getjButtonSair().addActionListener(this);

    DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaCaractProd.getjTable().getModel();

    CaractProdService cpService = new CaractProdService();

    cpService.buscar().forEach(produtoAtual -> {
      tabela.addRow(new Object[]{
              produtoAtual.getIdCaracteristicaProduto(),
              produtoAtual.getProduto().getDescricao(),
              produtoAtual.getCor().getDescricao(),
              produtoAtual.getTamanhoProduto(),
              produtoAtual.getQtdEstoque(),
      });
    });
  }

  @Override
  public void actionPerformed(ActionEvent event) {
    if (event.getSource() == this.telaBuscaCaractProd.getjButtonCarregar()) {
      ControllerCadCaractProd.codigo = (int) this.telaBuscaCaractProd.getjTable().getValueAt(
              this.telaBuscaCaractProd.getjTable().getSelectedRow(), 0
      );
      this.telaBuscaCaractProd.dispose();
    } else if (event.getSource() == this.telaBuscaCaractProd.getjButtonSair()) {
      this.telaBuscaCaractProd.dispose();
    }

  }
}  