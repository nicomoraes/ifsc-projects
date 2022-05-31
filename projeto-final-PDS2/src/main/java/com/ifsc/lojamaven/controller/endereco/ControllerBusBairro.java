package com.ifsc.lojamaven.controller.endereco;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.table.DefaultTableModel;

import com.ifsc.lojamaven.service.endereco.BairroService;
import com.ifsc.lojamaven.view.endereco.TelaBuscaBairro;

public class ControllerBusBairro implements ActionListener {

  TelaBuscaBairro telaBuscaBairro;

  public ControllerBusBairro(TelaBuscaBairro telaBuscaBairro) {
    this.telaBuscaBairro = telaBuscaBairro;

    telaBuscaBairro.getjButtonCarregar().addActionListener(this);
    telaBuscaBairro.getjButtonSair().addActionListener(this);

    DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaBairro.getjTable().getModel();

    BairroService cService = new BairroService();

    cService.buscar().forEach(bairroAtual -> {
      tabela.addRow(new Object[]{
              bairroAtual.getIdBairro(),
              bairroAtual.getDescricao(),
      });
    });
  }

  @Override
  public void actionPerformed(ActionEvent event) {
    if (event.getSource() == this.telaBuscaBairro.getjButtonCarregar()) {
      ControllerCadBairro.codigo = (int) this.telaBuscaBairro.getjTable().getValueAt(
              this.telaBuscaBairro.getjTable().getSelectedRow(), 0
      );
      this.telaBuscaBairro.dispose();
    } else if (event.getSource() == this.telaBuscaBairro.getjButtonSair()) {
      this.telaBuscaBairro.dispose();
    }

  }
}  