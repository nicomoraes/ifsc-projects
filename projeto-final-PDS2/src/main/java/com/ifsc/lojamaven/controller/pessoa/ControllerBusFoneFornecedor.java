package com.ifsc.lojamaven.controller.pessoa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.table.DefaultTableModel;

import com.ifsc.lojamaven.service.pessoa.FoneFornecedorService;

import com.ifsc.lojamaven.view.pessoa.TelaBuscaFoneFornecedor;

public class ControllerBusFoneFornecedor implements ActionListener {

  TelaBuscaFoneFornecedor telaBuscaFoneFornecedor;

  public ControllerBusFoneFornecedor(TelaBuscaFoneFornecedor telaBusFoneFornecedor, int cdgFornecedor) {
    this.telaBuscaFoneFornecedor = telaBusFoneFornecedor;

    telaBusFoneFornecedor.getjButtonCarregar().addActionListener(this);
    telaBusFoneFornecedor.getjButtonSair().addActionListener(this);

    DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaFoneFornecedor.getjTable().getModel();

    FoneFornecedorService foneService = new FoneFornecedorService();

    foneService.buscarPorFornecedor(cdgFornecedor).forEach(contatoAtual ->
            tabela.addRow(new Object[]{
                    contatoAtual.getIdFone(),
                    contatoAtual.getFornecedor().getIdFornecedor(),
                    contatoAtual.getDescricao()
            })
    );
  }

  @Override
  public void actionPerformed(ActionEvent event) {
    if (event.getSource() == this.telaBuscaFoneFornecedor.getjButtonCarregar()) {
      ControllerCadFoneFornecedor.idFone = (int) this.telaBuscaFoneFornecedor.getjTable().getValueAt(
              this.telaBuscaFoneFornecedor.getjTable().getSelectedRow(), 0
      );
      this.telaBuscaFoneFornecedor.dispose();
    } else if (event.getSource() == this.telaBuscaFoneFornecedor.getjButtonSair()) {
      this.telaBuscaFoneFornecedor.dispose();
    }
  }
}  