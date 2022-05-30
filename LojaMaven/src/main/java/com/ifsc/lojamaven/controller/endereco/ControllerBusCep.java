package com.ifsc.lojamaven.controller.endereco;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.table.DefaultTableModel;

import com.ifsc.lojamaven.controller.pessoa.ControllerCadCliente;
import com.ifsc.lojamaven.controller.pessoa.ControllerCadFornecedor;
import com.ifsc.lojamaven.controller.pessoa.ControllerCadVendedor;
import com.ifsc.lojamaven.service.endereco.CepService;
import com.ifsc.lojamaven.view.endereco.TelaBuscaCep;

public class ControllerBusCep implements ActionListener {

  TelaBuscaCep telaBuscaCep;

  public ControllerBusCep(TelaBuscaCep telaBuscaCep) {
    this.telaBuscaCep = telaBuscaCep;

    telaBuscaCep.getjButtonCarregar().addActionListener(this);
    telaBuscaCep.getjButtonSair().addActionListener(this);

    DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaCep.getjTable().getModel();

    CepService cepService = new CepService();

    cepService.buscar().forEach(cepAtual -> {
      tabela.addRow(new Object[]{
              cepAtual.getIdCep(),
              cepAtual.getCep(),
              cepAtual.getCidade().getDescricao(),
              cepAtual.getBairro().getDescricao(),
              cepAtual.getLogradouro()
      });
    });
  }

  @Override
  public void actionPerformed(ActionEvent event) {
    if (event.getSource() == this.telaBuscaCep.getjButtonCarregar()) {
      ControllerCadCep.codigo = (int) this.telaBuscaCep.getjTable().getValueAt(
              this.telaBuscaCep.getjTable().getSelectedRow(), 0
      );
      ControllerCadCliente.codigo = (int) this.telaBuscaCep.getjTable().getValueAt(
              this.telaBuscaCep.getjTable().getSelectedRow(), 0
      );
      ControllerCadFornecedor.codigo = (int) this.telaBuscaCep.getjTable().getValueAt(
              this.telaBuscaCep.getjTable().getSelectedRow(), 0
      );
      ControllerCadVendedor.codigo = (int) this.telaBuscaCep.getjTable().getValueAt(
              this.telaBuscaCep.getjTable().getSelectedRow(), 0
      );
      this.telaBuscaCep.dispose();
    } else if (event.getSource() == this.telaBuscaCep.getjButtonSair()) {
      this.telaBuscaCep.dispose();
    }

  }
}  