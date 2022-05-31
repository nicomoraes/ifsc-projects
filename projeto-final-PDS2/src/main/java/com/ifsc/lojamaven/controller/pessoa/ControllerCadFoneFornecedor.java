package com.ifsc.lojamaven.controller.pessoa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.ifsc.lojamaven.model.bo.pessoa.FoneFornecedor;
import com.ifsc.lojamaven.model.bo.pessoa.Fornecedor;
import com.ifsc.lojamaven.service.pessoa.FoneFornecedorService;
import com.ifsc.lojamaven.service.pessoa.FornecedorService;
import com.ifsc.lojamaven.view.pessoa.TelaCadastroFoneFornecedor;

import com.ifsc.lojamaven.view.pessoa.TelaBuscaFoneFornecedor;

public class ControllerCadFoneFornecedor implements ActionListener {

  TelaCadastroFoneFornecedor telaCadFoneFornecedor;

  public static int idFornecedor; //Recebe o ID do Fornecedor da tela de Cadastro de Fornecedores.
  public static int idFone;

  // Passa a tela como parâmetro para o controller.
  public ControllerCadFoneFornecedor(TelaCadastroFoneFornecedor telaCadFoneFornecedor, int fornecedorCode) {
    this.telaCadFoneFornecedor = telaCadFoneFornecedor;
    idFornecedor = fornecedorCode;

    // Funções que escutam ações dos botões.
    telaCadFoneFornecedor.getjButtonSalvar().addActionListener(this);
    telaCadFoneFornecedor.getjButtonBuscar().addActionListener(this);
    telaCadFoneFornecedor.getjButtonSair().addActionListener(this);

    // Inputs
    telaCadFoneFornecedor.getjTFIdFone().addActionListener(this);
    telaCadFoneFornecedor.getjTFFornecedorID().addActionListener(this);
    telaCadFoneFornecedor.getjFTFContato().addActionListener(this);

    buttonState(true);
    inputState();
    this.telaCadFoneFornecedor.getjTFFornecedorID().setText(String.valueOf(idFornecedor));
  }

  @Override // Quando disparar a ação aqui será executado o código do botão em questão.
  public void actionPerformed(ActionEvent event) {
    if (event.getSource() == telaCadFoneFornecedor.getjButtonSalvar()) {
      Fornecedor fornecedor = new Fornecedor();
      FornecedorService fornecedorService = new FornecedorService();
      FoneFornecedor foneFornecedor = new FoneFornecedor();
      FoneFornecedorService foneFornecedorService = new FoneFornecedorService();

      foneFornecedor.setDescricao(this.telaCadFoneFornecedor.getjFTFContato().getText());
      fornecedor = fornecedorService.buscar(
              Integer.parseInt(this.telaCadFoneFornecedor.getjTFFornecedorID().getText())
      );
      foneFornecedor.setFornecedor(fornecedor);

      if (this.telaCadFoneFornecedor.getjTFIdFone().getText().trim().equalsIgnoreCase("")) {
        foneFornecedorService.salvar(foneFornecedor);
      } else {
        foneFornecedor.setIdFone(Integer.parseInt(this.telaCadFoneFornecedor.getjTFIdFone().getText()));
        foneFornecedorService.atualizar(foneFornecedor);
      }
      buttonState(true);
      inputState();
    } else if (event.getSource() == telaCadFoneFornecedor.getjButtonBuscar()) {
      idFone = 0;
      TelaBuscaFoneFornecedor telaBusFornecedor = new TelaBuscaFoneFornecedor(null, true);
      ControllerBusFoneFornecedor controllerBusFornecedor =
              new ControllerBusFoneFornecedor(telaBusFornecedor, idFornecedor);
      telaBusFornecedor.setVisible(true);
      if (idFone != 0) {
        System.out.println("id: " + idFone);
        FoneFornecedor foneFornecedor = new FoneFornecedor();
        FoneFornecedorService foneFornecedorService = new FoneFornecedorService();

        foneFornecedor = foneFornecedorService.buscar(idFone);

        this.telaCadFoneFornecedor.getjTFIdFone().setText(foneFornecedor.getIdFone() + "");
        this.telaCadFoneFornecedor.getjFTFContato().setText(foneFornecedor.getDescricao());
      }
    } else if (event.getSource() == telaCadFoneFornecedor.getjButtonSair()) {
      this.telaCadFoneFornecedor.dispose();
    }
  }

  public void buttonState(boolean state) {
    telaCadFoneFornecedor.getjButtonSalvar().setEnabled(state);
    telaCadFoneFornecedor.getjButtonBuscar().setEnabled(state);
    telaCadFoneFornecedor.getjButtonSair().setEnabled(state);
  }

  public void inputState() {
    this.telaCadFoneFornecedor.getjFTFContato().setText("");
    this.telaCadFoneFornecedor.getjTFIdFone().setText("");
    this.telaCadFoneFornecedor.getjTFFornecedorID().setEnabled(false);
    this.telaCadFoneFornecedor.getjTFIdFone().setEnabled(false);
  }

}
