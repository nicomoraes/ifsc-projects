package com.ifsc.lojamaven.controller.pessoa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.table.DefaultTableModel;

import com.ifsc.lojamaven.view.pessoa.TelaBuscaCliente;
import com.ifsc.lojamaven.controller.transacao.ControllerCadVenda;
import com.ifsc.lojamaven.service.pessoa.ClienteService;

import com.ifsc.lojamaven.view.pessoa.TelaBuscaCliente;

public class ControllerBusCliente implements ActionListener {

  TelaBuscaCliente telaBuscaCliente;

  public ControllerBusCliente(TelaBuscaCliente telaBuscaCliente) {
    this.telaBuscaCliente = telaBuscaCliente;

    telaBuscaCliente.getjButtonCarregar().addActionListener(this);
    telaBuscaCliente.getjButtonSair().addActionListener(this);

    DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaCliente.getjTable().getModel();

    ClienteService clienteService = new ClienteService();

    clienteService.buscar().forEach(clienteAtual ->
            tabela.addRow(new Object[]{
                    clienteAtual.getIdCliente(),
                    clienteAtual.getNome(),
                    clienteAtual.getCpf(),
                    clienteAtual.getRg(),
                    clienteAtual.getEnderecoCep().getCep(),
                    clienteAtual.getFone()
            })
    );
  }

  @Override
  public void actionPerformed(ActionEvent event) {
    if (event.getSource() == this.telaBuscaCliente.getjButtonCarregar()) {
      ControllerCadCliente.codigo = (int) this.telaBuscaCliente.getjTable().getValueAt(
              this.telaBuscaCliente.getjTable().getSelectedRow(), 0
      );
      ControllerCadVenda.codeClient = (int) this.telaBuscaCliente.getjTable().getValueAt(
              this.telaBuscaCliente.getjTable().getSelectedRow(), 0
      );
      this.telaBuscaCliente.dispose();
    } else if (event.getSource() == this.telaBuscaCliente.getjButtonSair()) {
      this.telaBuscaCliente.dispose();
    }
  }
}
