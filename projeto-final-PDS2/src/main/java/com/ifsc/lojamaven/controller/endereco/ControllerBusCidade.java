package com.ifsc.lojamaven.controller.endereco;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.table.DefaultTableModel;

import com.ifsc.lojamaven.service.endereco.CidadeService;
import com.ifsc.lojamaven.view.endereco.TelaBuscaCidade;

public class ControllerBusCidade implements ActionListener {

  TelaBuscaCidade telaBuscaCidade;

  public ControllerBusCidade(TelaBuscaCidade telaBuscaCidade) {
    this.telaBuscaCidade = telaBuscaCidade;

    telaBuscaCidade.getjButtonCarregar().addActionListener(this);
    telaBuscaCidade.getjButtonSair().addActionListener(this);

    DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaCidade.getjTable().getModel();

    CidadeService cService = new CidadeService();

    cService.buscar().forEach(cidadeAtual -> {
      tabela.addRow(new Object[]{
              cidadeAtual.getIdCidade(),
              cidadeAtual.getDescricao(),
              cidadeAtual.getUf()
      });
    });
  }

  @Override
  public void actionPerformed(ActionEvent event) {
    if (event.getSource() == this.telaBuscaCidade.getjButtonCarregar()) {
      ControllerCadCidade.codigo = (int) this.telaBuscaCidade.getjTable().getValueAt(
              this.telaBuscaCidade.getjTable().getSelectedRow(), 0
      );
      this.telaBuscaCidade.dispose();
    } else if (event.getSource() == this.telaBuscaCidade.getjButtonSair()) {
      this.telaBuscaCidade.dispose();
    }

  }
}  