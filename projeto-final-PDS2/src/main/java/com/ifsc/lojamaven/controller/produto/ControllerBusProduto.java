package com.ifsc.lojamaven.controller.produto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.table.DefaultTableModel;

import com.ifsc.lojamaven.service.produto.ProdutoService;
import com.ifsc.lojamaven.view.produto.TelaBuscaProduto;

public class ControllerBusProduto implements ActionListener {

  TelaBuscaProduto telaBuscaProduto;

  public ControllerBusProduto(TelaBuscaProduto telaBuscaProduto) {
    this.telaBuscaProduto = telaBuscaProduto;

    telaBuscaProduto.getjButtonCarregar().addActionListener(this);
    telaBuscaProduto.getjButtonSair().addActionListener(this);

    DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaProduto.getjTable().getModel();

    ProdutoService pService = new ProdutoService();

    pService.buscar().forEach(produtoAtual -> {
      tabela.addRow(new Object[]{
              produtoAtual.getIdProduto(),
              produtoAtual.getDescricao(),
              produtoAtual.getTipoProduto(),
              produtoAtual.getMarca(),
              produtoAtual.getTamanho(),
              produtoAtual.getValProduto(),
      });
    });
  }

  @Override
  public void actionPerformed(ActionEvent event) {
    if (event.getSource() == this.telaBuscaProduto.getjButtonCarregar()) {
      ControllerCadProduto.codigo = (int) this.telaBuscaProduto.getjTable().getValueAt(
              this.telaBuscaProduto.getjTable().getSelectedRow(), 0
      );
      this.telaBuscaProduto.dispose();
    } else if (event.getSource() == this.telaBuscaProduto.getjButtonSair()) {
      this.telaBuscaProduto.dispose();
    }

  }
}  