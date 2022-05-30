package com.ifsc.lojamaven.controller.pessoa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.table.DefaultTableModel;

import com.ifsc.lojamaven.service.pessoa.FornecedorService;
import com.ifsc.lojamaven.view.pessoa.TelaBuscaFornecedor;

public class ControllerBusFornecedor implements ActionListener{

    TelaBuscaFornecedor telaBuscaFornecedor;
    
    public ControllerBusFornecedor(TelaBuscaFornecedor telaBuscaFornecedor){
        this.telaBuscaFornecedor = telaBuscaFornecedor;
        
        telaBuscaFornecedor.getjButtonCarregar().addActionListener(this);
        telaBuscaFornecedor.getjButtonSair().addActionListener(this);

        DefaultTableModel tabela = (DefaultTableModel) this.telaBuscaFornecedor.getjTable().getModel();

        FornecedorService fornecedorService = new FornecedorService();
        
        fornecedorService.buscar().forEach(fornecedorAtual -> {
            tabela.addRow(new Object[]{
                fornecedorAtual.getIdFornecedor(),
                fornecedorAtual.getRazaoSocial(),
                fornecedorAtual.getNome(),
                fornecedorAtual.getCnpj(),
                fornecedorAtual.getInscEstadual()
            });
        });
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == this.telaBuscaFornecedor.getjButtonCarregar()){
            ControllerCadFornecedor.codigo =  (int) this.telaBuscaFornecedor.getjTable().getValueAt(
                this.telaBuscaFornecedor.getjTable().getSelectedRow(), 0
            );
            this.telaBuscaFornecedor.dispose();
        } else if(event.getSource() == this.telaBuscaFornecedor.getjButtonSair()){
            this.telaBuscaFornecedor.dispose();
        }
    }
}  