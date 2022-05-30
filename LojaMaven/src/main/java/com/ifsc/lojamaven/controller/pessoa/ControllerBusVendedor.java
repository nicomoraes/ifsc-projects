package com.ifsc.lojamaven.controller.pessoa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.table.DefaultTableModel;

import com.ifsc.lojamaven.controller.transacao.ControllerCadVenda;
import com.ifsc.lojamaven.service.pessoa.VendedorService;
import com.ifsc.lojamaven.view.pessoa.TelaBuscaVendedor;

public class ControllerBusVendedor implements ActionListener{

    TelaBuscaVendedor telaBuscaVendedor;
    
    public ControllerBusVendedor(TelaBuscaVendedor telaBuscaVendedor){
        this.telaBuscaVendedor = telaBuscaVendedor;
        
        telaBuscaVendedor.getjButtonCarregar().addActionListener(this);
        telaBuscaVendedor.getjButtonSair().addActionListener(this);

        DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaVendedor.getjTable().getModel();

        VendedorService vendedorService = new VendedorService();
        
        vendedorService.buscar().forEach(vendedorAtual -> {
            tabela.addRow(new Object[]{
                vendedorAtual.getIdVendedor(),
                vendedorAtual.getNome(),
                vendedorAtual.getCpf(),
                vendedorAtual.getEnderecoCep().getCep(),
                vendedorAtual.getFone()
            });
        });
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == this.telaBuscaVendedor.getjButtonCarregar()){
            ControllerCadVendedor.codigo =  (int) this.telaBuscaVendedor.getjTable().getValueAt(
                this.telaBuscaVendedor.getjTable().getSelectedRow(), 0
            );
            ControllerCadVenda.codeSeller =  (int) this.telaBuscaVendedor.getjTable().getValueAt(
                this.telaBuscaVendedor.getjTable().getSelectedRow(), 0
            );
            this.telaBuscaVendedor.dispose();
        } else if(event.getSource() == this.telaBuscaVendedor.getjButtonSair()){
            this.telaBuscaVendedor.dispose();
        }
    }
}  