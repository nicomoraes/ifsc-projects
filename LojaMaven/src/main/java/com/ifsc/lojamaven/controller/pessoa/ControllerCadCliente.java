package com.ifsc.lojamaven.controller.pessoa;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JFormattedTextField;
import javax.swing.JTextField;

import com.ifsc.lojamaven.controller.endereco.ControllerBusCep;
import com.ifsc.lojamaven.controller.endereco.ControllerCadCep;
import com.ifsc.lojamaven.model.bo.endereco.Cep;
import com.ifsc.lojamaven.model.bo.pessoa.Cliente;
import com.ifsc.lojamaven.service.endereco.CepService;
import com.ifsc.lojamaven.service.pessoa.ClienteService;
import com.ifsc.lojamaven.view.endereco.TelaBuscaCep;
import  com.ifsc.lojamaven.view.pessoa.TelaBuscaCliente;
import com.ifsc.lojamaven.view.endereco.TelaCadastroCep;
import com.ifsc.lojamaven.view.pessoa.TelaCadastroCliente;


public class ControllerCadCliente implements ActionListener {

  TelaCadastroCliente telaCadCliente;
  public static int codigo;

  public ControllerCadCliente(TelaCadastroCliente telaCadCliente) { // Passa a tela como parâmetro para o controller.
    this.telaCadCliente = telaCadCliente;

    // Funções que escutam ações dos botões.
    telaCadCliente.getjButtonNovo().addActionListener(this);
    telaCadCliente.getjButtonCancelar().addActionListener(this);
    telaCadCliente.getjButtonSalvar().addActionListener(this);
    telaCadCliente.getjButtonBuscar().addActionListener(this);
    telaCadCliente.getjButtonSair().addActionListener(this);
    telaCadCliente.getjBtnAddCep().addActionListener(this);
    telaCadCliente.getjBtnBuscaCep().addActionListener(this);

    // Inputs
    telaCadCliente.getjTFId().addActionListener(this);
    telaCadCliente.getjTFNome().addActionListener(this);
    telaCadCliente.getjTFEmail().addActionListener(this);
    telaCadCliente.getjTFCidade().addActionListener(this);
    telaCadCliente.getjTFBairro().addActionListener(this);
    telaCadCliente.getjTFComplemento().addActionListener(this);
    telaCadCliente.getjTFLogradouro().addActionListener(this);
    telaCadCliente.getjFTFCep().addActionListener(this);
    telaCadCliente.getjFTFCpf().addActionListener(this);
    telaCadCliente.getjFTFRg().addActionListener(this);
    telaCadCliente.getjFTFFone1().addActionListener(this);
    telaCadCliente.getjFTFDtNasc().addActionListener(this);

    buttonState(true);
    inputState(false);
  }

  @Override // Quando disparar a ação aqui será executado o código do botão em questão.
  public void actionPerformed(ActionEvent event) {
    if (event.getSource() == telaCadCliente.getjButtonNovo()) {
      buttonState(false);
      inputState(true);
    } else if (event.getSource() == telaCadCliente.getjButtonCancelar()) {
      buttonState(true);
      inputState(false);
    } else if (event.getSource() == telaCadCliente.getjButtonSalvar()) {
      Cliente cliente = new Cliente();
      ClienteService cService = new ClienteService();
      Cep cep = new Cep();
      CepService cepService = new CepService();

      cliente.setNome(this.telaCadCliente.getjTFNome().getText());

      int day = Integer.parseInt(this.telaCadCliente.getjFTFDtNasc().getText().substring(0,2));
      int month = Integer.parseInt(this.telaCadCliente.getjFTFDtNasc().getText().substring(3,5));
      int year = Integer.parseInt(this.telaCadCliente.getjFTFDtNasc().getText().substring(6,10));
      Calendar cal = Calendar.getInstance();
      cal.set(Calendar.YEAR, year);
      cal.set(Calendar.MONTH, month - 1); // <-- months start at 0.
      cal.set(Calendar.DAY_OF_MONTH, day);

      java.sql.Date date = new java.sql.Date(cal.getTimeInMillis());

      cliente.setDtNasc(date);
      cliente.setCpf(this.telaCadCliente.getjFTFCpf().getText());
      cliente.setRg(this.telaCadCliente.getjFTFRg().getText());
      cliente.setEmail(this.telaCadCliente.getjTFEmail().getText());
      cliente.setFone(this.telaCadCliente.getjFTFFone1().getText());
      cliente.setComplementoEnd(this.telaCadCliente.getjTFComplemento().getText());

      cep = cepService.buscar(this.telaCadCliente.getjFTFCep().getText());
      cliente.setEnderecoCep(cep);

      if (this.telaCadCliente.getjTFId().getText().trim().equalsIgnoreCase("")) {
        cService.salvar(cliente);
      } else {
        cliente.setIdCliente(Integer.parseInt(this.telaCadCliente.getjTFId().getText()));
        cService.atualizar(cliente);
      }
      buttonState(true);
      inputState(false);
    } else if (event.getSource() == telaCadCliente.getjButtonBuscar()) {
      codigo = 0;
      TelaBuscaCliente telaBusCliente = new TelaBuscaCliente(null, true);
      ControllerBusCliente controllerBusCliente = new ControllerBusCliente(telaBusCliente);
      telaBusCliente.setVisible(true);
      if (codigo != 0) {
        buttonState(false);
        inputState(true);

        Cliente cliente = new Cliente();
        ClienteService cService = new ClienteService();
        Cep cep = new Cep();
        CepService cepService = new CepService();

        cliente = cService.buscar(codigo);
        cep = cepService.buscar(cliente.getEnderecoCep().getIdCep());

        this.telaCadCliente.getjTFId().setText(cliente.getIdCliente() + "");
        this.telaCadCliente.getjTFNome().setText(cliente.getNome());

        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        this.telaCadCliente.getjFTFDtNasc().setText(sdf.format(cliente.getDtNasc()));

        this.telaCadCliente.getjFTFCpf().setText(cliente.getCpf());
        this.telaCadCliente.getjFTFRg().setText(cliente.getRg());
        this.telaCadCliente.getjTFEmail().setText(cliente.getEmail());
        this.telaCadCliente.getjFTFFone1().setText(cliente.getFone());
        this.telaCadCliente.getjTFComplemento().setText(cliente.getComplementoEnd());
        this.telaCadCliente.getjFTFCep().setText(cliente.getEnderecoCep().getCep());
        this.telaCadCliente.getjTFBairro().setText(cep.getBairro().getDescricao());
        this.telaCadCliente.getjTFCidade().setText(cep.getCidade().getDescricao());
        this.telaCadCliente.getjTFLogradouro().setText(cep.getLogradouro());

        this.telaCadCliente.getjTFId().setEnabled(false);
      }
    } else if (event.getSource() == telaCadCliente.getjButtonSair()) {
      this.telaCadCliente.dispose();
    } else if (event.getSource() == telaCadCliente.getjBtnBuscaCep()) {
      codigo = 0;
      TelaBuscaCep telaBusCep = new TelaBuscaCep(null, true);
      ControllerBusCep controllerBusCep = new ControllerBusCep(telaBusCep);
      telaBusCep.setVisible(true);

      if (codigo != 0) {
        Cep cep = new Cep();
        CepService cepService = new CepService();

        cep = cepService.buscar(codigo);

        this.telaCadCliente.getjFTFCep().setText(cep.getCep());
        this.telaCadCliente.getjTFBairro().setText(cep.getBairro().getDescricao());
        this.telaCadCliente.getjTFCidade().setText(cep.getCidade().getDescricao());
        this.telaCadCliente.getjTFLogradouro().setText(cep.getLogradouro());
      }
    } else if (event.getSource() == telaCadCliente.getjBtnAddCep()) {
      TelaCadastroCep telaCadCep = new TelaCadastroCep();
      ControllerCadCep controllerCadCep = new ControllerCadCep(telaCadCep);
      telaCadCep.setVisible(true);
    }

  }

  public void buttonState(boolean state) {
    telaCadCliente.getjButtonNovo().setEnabled(state);
    telaCadCliente.getjButtonCancelar().setEnabled(!state);
    telaCadCliente.getjButtonSalvar().setEnabled(!state);
    telaCadCliente.getjButtonBuscar().setEnabled(state);
    telaCadCliente.getjButtonSair().setEnabled(state);
    telaCadCliente.getjBtnAddCep().setEnabled(!state);
    telaCadCliente.getjBtnBuscaCep().setEnabled(!state);
  }

  public void inputState(boolean state) {

    Component[] componentes = this.telaCadCliente.getjPanelContainer().getComponents();

    for (Component componente : componentes) {
      if (componente instanceof JTextField) {
        ((JTextField) componente).setText("");
        componente.setEnabled(state);
      } else if (componente instanceof JFormattedTextField) {
        ((JFormattedTextField) componente).setText("");
        componente.setEnabled(state);
      }
    }
    this.telaCadCliente.getjTFId().setEnabled(false);
  }
}