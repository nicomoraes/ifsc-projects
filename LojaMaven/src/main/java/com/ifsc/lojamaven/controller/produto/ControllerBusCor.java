package com.ifsc.lojamaven.controller.produto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.table.DefaultTableModel;

import com.ifsc.lojamaven.service.produto.CorService;
import com.ifsc.lojamaven.view.produto.TelaBuscaCor;

public class ControllerBusCor implements ActionListener {

  TelaBuscaCor telaBuscaCor;

  public ControllerBusCor(TelaBuscaCor telaBuscaCor) {
    this.telaBuscaCor = telaBuscaCor;

    telaBuscaCor.getjButtonCarregar().addActionListener(this);
    telaBuscaCor.getjButtonSair().addActionListener(this);

    DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaCor.getjTable().getModel();

    CorService cService = new CorService();

    cService.buscar().forEach(corAtual -> {
      tabela.addRow(new Object[]{
              corAtual.getIdCor(),
              corAtual.getDescricao(),
      });
    });
  }

  @Override
  public void actionPerformed(ActionEvent event) {
    if (event.getSource() == this.telaBuscaCor.getjButtonCarregar()) {
      ControllerCadCor.codigo = (int) this.telaBuscaCor.getjTable().getValueAt(
              this.telaBuscaCor.getjTable().getSelectedRow(), 0
      );
      this.telaBuscaCor.dispose();
    } else if (event.getSource() == this.telaBuscaCor.getjButtonSair()) {
      this.telaBuscaCor.dispose();
    }

  }
}  