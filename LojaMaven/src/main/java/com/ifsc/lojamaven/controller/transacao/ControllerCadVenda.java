package com.ifsc.lojamaven.controller.transacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.*;

import javax.swing.AbstractAction;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;

import com.ifsc.lojamaven.controller.pessoa.ControllerBusCliente;
import com.ifsc.lojamaven.controller.pessoa.ControllerBusVendedor;
import com.ifsc.lojamaven.model.bo.pessoa.Cliente;
import com.ifsc.lojamaven.model.bo.pessoa.Vendedor;
import com.ifsc.lojamaven.model.bo.produto.CaractProd;
import com.ifsc.lojamaven.model.bo.transacao.CondicaoPagamento;
import com.ifsc.lojamaven.model.bo.transacao.ItemVenda;
import com.ifsc.lojamaven.model.bo.transacao.Receber;
import com.ifsc.lojamaven.model.bo.transacao.Venda;
import com.ifsc.lojamaven.service.pessoa.ClienteService;
import com.ifsc.lojamaven.service.pessoa.VendedorService;
import com.ifsc.lojamaven.service.produto.CaractProdService;
import com.ifsc.lojamaven.service.transacao.CondicaoPagService;
import com.ifsc.lojamaven.service.transacao.ItemVendaService;
import com.ifsc.lojamaven.service.transacao.ReceberService;
import com.ifsc.lojamaven.service.transacao.VendaService;
import com.ifsc.lojamaven.view.pessoa.TelaBuscaVendedor;
import com.ifsc.lojamaven.view.transacao.TelaCadastroVenda;

import com.ifsc.lojamaven.view.pessoa.TelaBuscaCliente;

public class ControllerCadVenda implements ActionListener {
  public static int codeClient;
  public static int codeSeller;
  static float total = 0;
  static int itemID = 1;
  static int selectedRow = 0;
  TelaCadastroVenda telaVenda;

  public ControllerCadVenda(TelaCadastroVenda telaVenda) {
    this.telaVenda = telaVenda;

    JRootPane window = this.telaVenda.getRootPane();

    this.telaVenda.getButtonIDCliente().addActionListener(this);
    this.telaVenda.getButtonIDVendedor().addActionListener(this);
    this.telaVenda.getButtonSetNewQtd().addActionListener(this);
    this.telaVenda.getButtonSetNewQtd().setVisible(false);

    //Insere atalhos de comandos na tela
    window.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
            KeyStroke.getKeyStroke("F1"), "newSale"
    );
    window.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
            KeyStroke.getKeyStroke("F2"), "addItem"
    );
    window.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
            KeyStroke.getKeyStroke("F3"), "removeItem"
    );
    window.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
            KeyStroke.getKeyStroke("F4"), "resetSale"
    );
    window.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
            KeyStroke.getKeyStroke("F5"), "saveSale"
    );

    window.getActionMap().put("newSale", new AbstractAction("newSale") {
      public void actionPerformed(ActionEvent evt) {
        newSale();
      }
    });
    window.getActionMap().put("addItem", new AbstractAction("addItem") {
      public void actionPerformed(ActionEvent evt) {
        addItem();
      }
    });
    window.getActionMap().put("removeItem", new AbstractAction("removeItem") {
      public void actionPerformed(ActionEvent evt) {
        removeItem();
      }
    });
    window.getActionMap().put("resetSale", new AbstractAction("resetSale") {
      public void actionPerformed(ActionEvent evt) {
        resetSale();
      }
    });
    window.getActionMap().put("saveSale", new AbstractAction("saveSale") {
      public void actionPerformed(ActionEvent evt) { saveSale(); }
    });

    this.telaVenda.getItemTable().addMouseListener(new MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        if (telaVenda.getItemTable().getSelectedColumn() == 3) {
          selectedRow = telaVenda.getItemTable().getSelectedRow();
          telaVenda.getInputItemQty().setText(String.valueOf(selectedRow));
          JOptionPane.showMessageDialog(null, "Insira uma nova quantidade!");
          telaVenda.getButtonSetNewQtd().setVisible(true);
          telaVenda.getItemTable().getModel().getValueAt(selectedRow, 5);

          String actualSubtotal = telaVenda.getItemTable().getModel().getValueAt(selectedRow, 5).toString();
          updateTotal(Float.parseFloat(actualSubtotal), true);

        } else {
          selectedRow = telaVenda.getItemTable().getSelectedRow();
        }
      }
    });

    this.telaVenda.getCBformaPag().addItemListener(e -> {
      if (e.getStateChange() == ItemEvent.SELECTED) {
        String selectedItem = e.getItem().toString();
        if (selectedItem.equals("A vista")) {
          updateDiscount();
          this.telaVenda.getCBNumParcelas().setEnabled(false);
        } else {
          JLabel labelTotal = this.telaVenda.getLabelTotalSale();
          labelTotal.setText(String.format("%.2f", total));
          telaVenda.getLabelDiscountSale().setText("0,00");
          this.telaVenda.getCBNumParcelas().setEnabled(true);
        }
      }
    });
    fillComboBox();
  }

  public void actionPerformed(ActionEvent event) {
    if (event.getSource() == telaVenda.getButtonIDCliente()) {
      codeClient = 0;
      TelaBuscaCliente telaBusCliente = new TelaBuscaCliente(null, true);
      ControllerBusCliente controllerBusCliente = new ControllerBusCliente(telaBusCliente);
      telaBusCliente.setVisible(true);

      if (codeClient != 0) {
        Cliente Cliente;
        ClienteService ClienteService = new ClienteService();

        Cliente = ClienteService.buscar(codeClient);

        this.telaVenda.getInputClientID().setText(Cliente.getIdCliente() + "");
        this.telaVenda.getInputClientName().setText(Cliente.getNome());
      }
    } else if (event.getSource() == telaVenda.getButtonIDVendedor()) {
      codeSeller = 0;
      TelaBuscaVendedor telaBusVendedor = new TelaBuscaVendedor(null, true);
      ControllerBusVendedor controllerBusVendedor = new ControllerBusVendedor(telaBusVendedor);
      telaBusVendedor.setVisible(true);

      if (codeClient != 0) {
        Vendedor Vendedor;
        VendedorService VendedorService = new VendedorService();

        Vendedor = VendedorService.buscar(codeSeller);

        this.telaVenda.getInputVendedorID().setText(Vendedor.getIdVendedor() + "");
        this.telaVenda.getInputVendedorName().setText(Vendedor.getNome());
      }
    } else if (event.getSource() == telaVenda.getButtonSetNewQtd()) {
      JTable jtable = this.telaVenda.getItemTable();
      DefaultTableModel itensTable = (DefaultTableModel) jtable.getModel();
      String prodValue = itensTable.getValueAt(selectedRow, 4).toString();

      if (!this.telaVenda.getInputItemQty().getText().isEmpty()) {
        this.telaVenda.getItemTable().getModel().setValueAt(
                this.telaVenda.getInputItemQty().getText(), selectedRow, 3
        );

        String prodQuantity = itensTable.getValueAt(selectedRow, 3).toString();

        float subtotal = (Float.parseFloat(prodValue)) * (Float.parseFloat(prodQuantity));

        itensTable.setValueAt(String.valueOf(subtotal), selectedRow, 5);

        updateTotal(subtotal, false);

        telaVenda.getButtonSetNewQtd().setVisible(false);
        selectedRow = 0;
      }
    }
  }

  void addItem() {
    String cdgValido = "";
    String prodQuantity = this.telaVenda.getInputItemQty().getText();
    JTextField inputCdgBarra = this.telaVenda.getInputBarCode();
    DefaultTableModel itensTable = (DefaultTableModel) this.telaVenda.getItemTable().getModel();

    if (inputCdgBarra.getText().length() < 13) {
      JOptionPane.showMessageDialog(null, "Código de produto inválido");
    } else if (inputCdgBarra.getText().length() > 13) {
      cdgValido = inputCdgBarra.getText().substring(0, 13);
    } else if (inputCdgBarra.getText().length() == 13) {
      cdgValido = inputCdgBarra.getText();
    }

    if (!Objects.equals(cdgValido, "") && !Objects.equals(prodQuantity, "")) {
      try {
        CaractProdService caractProdService = new CaractProdService();
        CaractProd caractProd = caractProdService.buscar(cdgValido);

        if(caractProd.getQtdEstoque() < Float.parseFloat(prodQuantity)) {
          throw new RuntimeException("O valor inserido excede a quantidade no estoque");
        }

        float subtotal = caractProd.getProduto().getValProduto() * (Float.parseFloat(prodQuantity));
        itensTable.addRow(new Object[]{
                itemID,
                caractProd.getIdCaracteristicaProduto(),
                caractProd.getProduto().getDescricao(),
                prodQuantity,
                caractProd.getProduto().getValProduto(),
                subtotal
        });
        itemID++;
        updateTotal(subtotal, false);
      } catch (Exception exception) {
        JOptionPane.showMessageDialog(null, exception.getMessage());
      }
    } else if (Objects.equals(prodQuantity, "")) {
      JOptionPane.showMessageDialog(null, "A quantidade de produtos não pode estar vazia!");
    }
  }

  public void removeItem() {
    JTable jtable = this.telaVenda.getItemTable();
    DefaultTableModel itensTable = (DefaultTableModel) jtable.getModel();
    updateTotal((float) itensTable.getValueAt(selectedRow, 5), true);
    itensTable.removeRow(selectedRow);
    selectedRow = 0;
  }

  void saveSale() {
    JTable jtable = this.telaVenda.getItemTable();
    DefaultTableModel itensTable = (DefaultTableModel) jtable.getModel();

    //Salvar venda
    Venda venda = new Venda();
    Cliente cliente;
    Vendedor vendedor;
    CondicaoPagamento condicaoPag;
    VendaService vendaService = new VendaService();
    ClienteService cService = new ClienteService();
    VendedorService vService = new VendedorService();
    CondicaoPagService cpService = new CondicaoPagService();

    //Salvar item
    List<Venda> listaVenda;
    ItemVendaService ItemVendaService = new ItemVendaService();
    CaractProdService caractProdService = new CaractProdService();
    CaractProd caractProd;

    //Salvar contas a receber
    ReceberService receberService = new ReceberService();

    //Recebe a data atual
    Calendar calendar = getDate();
    Date today = getDate().getTime();

    //Gera série de venda aleatória
    Random random = new Random();

    try {
      venda.setSerie(String.valueOf(random.nextInt(10000) + 50000));

      float desconto = Float.parseFloat(
              telaVenda.getLabelDiscountSale().getText().replaceAll(",", ".")
      );

      venda.setValorDesconto(desconto);

      total -= desconto;
      venda.setValorTotal(total);

      cliente = cService.buscar(Integer.parseInt(this.telaVenda.getInputClientID().getText()));
      venda.setCliente(cliente);

      vendedor = vService.buscar(Integer.parseInt(this.telaVenda.getInputVendedorID().getText()));
      venda.setVendedor(vendedor);

      condicaoPag = cpService.buscar(Objects.requireNonNull(
              this.telaVenda.getCBformaPag().getSelectedItem()
      ).toString());

      venda.setCondicaoPagamento(condicaoPag);

      //Seta o dia vencimento
      calendar.add(Calendar.DATE, condicaoPag.getNumDiasAtePrimeiraParcela());
      venda.setDiaVencimento(calendar.get(Calendar.DAY_OF_MONTH));

      //Hora da venda
      venda.setDtHora(today);

      //Percorre tabela de itens
      for (int i = 0; i < itensTable.getRowCount(); i++) {
        ItemVenda itemVenda = new ItemVenda();
        itemVenda.setVenda(venda);

        caractProd = caractProdService.buscar((int) itensTable.getValueAt(i, 1));
        String updatedStock = String.valueOf(itensTable.getValueAt(i, 1));
        caractProd.setQtdEstoque(caractProd.getQtdEstoque() - Float.parseFloat(updatedStock));
        caractProdService.atualizar(caractProd);
        itemVenda.setCaracteristicaProduto(caractProd);

        itemVenda.setQtdProduto(Integer.parseInt((String) itensTable.getValueAt(i, 3)));

        itemVenda.setValUnitario((float) itensTable.getValueAt(i, 4));
        venda.getItens().add(itemVenda);
      }

      String salePaymentType = condicaoPag.getDescricao();
      int vezes = Objects.equals(salePaymentType, "A vista") ? 1 : Integer.parseInt(
              Objects.requireNonNull(this.telaVenda.getCBNumParcelas().getSelectedItem()).toString()
      );

      float valorEmissao = venda.getValorTotal() / vezes;

      for (int i = 0; i < vezes; i++) {
        Receber receber = new Receber();
        receber.setVenda(venda);
        receber.setValorEmissao(valorEmissao);
        receber.setDesconto(desconto);
        receber.setDtHrEmissao(today);
        receber.setDtVencimento(calendar.getTime());
        calendar.add(Calendar.MONTH, 1);

        if (condicaoPag.getDescricao().equalsIgnoreCase("A vista")) {
          receber.setDtHrPagamento(today);
          receber.setStatus("Fechado");
          receber.setValPago(venda.getValorTotal());
          venda.getContasReceber().add(receber);
        } else {
          receber.setAcrescimo(0);
          receber.setValPago(0);
          receber.setStatus("Pendente");
          venda.getContasReceber().add(receber);
        }
      }
      vendaService.salvar(venda);
      resetSale();
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  void updateTotal(float value, boolean discount) {
    JLabel labelTotal = this.telaVenda.getLabelTotalSale();
    JComboBox<String> comboBoxPayMethod = this.telaVenda.getCBformaPag();
    if (discount) {
      total -= value;
    } else {
      total += value;
    }

    if (Objects.equals(Objects.requireNonNull(comboBoxPayMethod.getSelectedItem()).toString(), "A vista")) {
      updateDiscount();
    } else {
      labelTotal.setText(String.format("%.2f", total));
    }
  }

  public void fillComboBox() {
    CondicaoPagService condPagService = new CondicaoPagService();
    condPagService.buscar().forEach(
            condicaoAtual -> this.telaVenda.getCBformaPag().addItem(condicaoAtual.getDescricao())
    );
  }

  void resetSale() {
    DefaultTableModel model = (DefaultTableModel) this.telaVenda.getItemTable().getModel();
    model.setRowCount(0);
    this.telaVenda.getInputClientID().setText("000");
    this.telaVenda.getInputVendedorID().setText("000");
    this.telaVenda.getInputClientName().setText("...");
    this.telaVenda.getInputVendedorName().setText("...");
    this.telaVenda.getInputItemQty().setText("");
    this.telaVenda.getInputBarCode().setText("");
    this.telaVenda.getLabelTotalSale().setText("0,00");
    this.telaVenda.getLabelDiscountSale().setText("0,00");
    itemID = 1;
    total = 0;
  }

  void newSale() {
    this.telaVenda.getButtonIDCliente().setEnabled(true);
    this.telaVenda.getButtonIDVendedor().setEnabled(true);
    this.telaVenda.getInputBarCode().setEnabled(true);
    this.telaVenda.getInputItemQty().setEnabled(true);
    this.telaVenda.getCBformaPag().setEnabled(true);
  }

  Calendar getDate() {
    Locale locale = new Locale("pt", "BR");
    TimeZone timeZone = TimeZone.getTimeZone("GMT-03:00");
    return Calendar.getInstance(timeZone, locale);
  }

  void updateDiscount() {
    JLabel labelTotal = this.telaVenda.getLabelTotalSale();
    JLabel labelDiscount = this.telaVenda.getLabelDiscountSale();
    float totalDiscounted = 0.05f;
    labelDiscount.setText(String.format("%.2f", totalDiscounted * total));
    labelTotal.setText(String.format("%.2f", total - (totalDiscounted * total)));
  }
}
