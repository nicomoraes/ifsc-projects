package com.ifsc.lojamaven.controller.produto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.table.DefaultTableModel;

import com.ifsc.lojamaven.service.produto.MarcaService;
import com.ifsc.lojamaven.view.produto.TelaBuscaMarca;

public class ControllerBusMarca implements ActionListener {

  TelaBuscaMarca telaBuscaMarca;

  public ControllerBusMarca(TelaBuscaMarca telaBuscaMarca) {
    this.telaBuscaMarca = telaBuscaMarca;

    telaBuscaMarca.getjButtonCarregar().addActionListener(this);
    telaBuscaMarca.getjButtonSair().addActionListener(this);

    DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaMarca.getjTable().getModel();

    MarcaService mService = new MarcaService();

    mService.buscar().forEach(marcaAtual -> {
      tabela.addRow(new Object[]{
              marcaAtual.getIdMarca(),
              marcaAtual.getDescricao(),
      });
    });
  }

  @Override
  public void actionPerformed(ActionEvent event) {
    if (event.getSource() == this.telaBuscaMarca.getjButtonCarregar()) {
      ControllerCadMarca.codigo = (int) this.telaBuscaMarca.getjTable().getValueAt(
              this.telaBuscaMarca.getjTable().getSelectedRow(), 0
      );
      this.telaBuscaMarca.dispose();
    } else if (event.getSource() == this.telaBuscaMarca.getjButtonSair()) {
      this.telaBuscaMarca.dispose();
    }
  }
}  