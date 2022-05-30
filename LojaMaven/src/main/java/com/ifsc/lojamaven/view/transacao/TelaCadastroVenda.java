package com.ifsc.lojamaven.view.transacao;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JRootPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class TelaCadastroVenda extends javax.swing.JDialog {

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JComboBox<String> CBNumParcelas;
  private javax.swing.JComboBox<String> CBformaPag;
  private javax.swing.JTable ItemTable;
  private javax.swing.JButton buttonIDCliente;
  private javax.swing.JButton buttonIDVendedor;
  private javax.swing.JButton buttonSetNewQtd;
  private javax.swing.JTextField inputBarCode;
  private javax.swing.JFormattedTextField inputClientID;
  private javax.swing.JTextField inputClientName;
  private javax.swing.JTextField inputItemQty;
  private javax.swing.JFormattedTextField inputVendedorID;
  private javax.swing.JTextField inputVendedorName;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel15;
  private javax.swing.JLabel jLabel18;
  private javax.swing.JLabel jLabel19;
  private javax.swing.JLabel jLabel20;
  private javax.swing.JLabel jLabel21;
  private javax.swing.JLabel jLabel22;
  private javax.swing.JLabel jLabel23;
  private javax.swing.JLabel jLabel24;
  private javax.swing.JLabel jLabel25;
  private javax.swing.JLabel jLabel26;
  private javax.swing.JLabel jLabel27;
  private javax.swing.JLabel jLabel28;
  private javax.swing.JLabel jLabel29;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel6;
  private javax.swing.JPanel jPanel8;
  private javax.swing.JPanel jPanel9;
  private javax.swing.JPanel jPanelBarCode;
  private javax.swing.JPanel jPanelButtonsInfo;
  private javax.swing.JPanel jPanelSaleInfos;
  private javax.swing.JPanel jPanelTotalSale;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JLabel labelDiscountSale;
  private javax.swing.JLabel labelTotalSale;

  public TelaCadastroVenda(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();
  }

  public static void main(String[] args) {

    java.awt.EventQueue.invokeLater(() -> {
      TelaCadastroVenda dialog = new TelaCadastroVenda(new javax.swing.JFrame(), true);
      dialog.addWindowListener(new java.awt.event.WindowAdapter() {
        @Override
        public void windowClosing(java.awt.event.WindowEvent e) {
          System.exit(0);
        }
      });
      dialog.setVisible(true);
    });
  }

  public JComboBox<String> getCBNumParcelas() {
    return CBNumParcelas;
  }

  public JComboBox<String> getCBformaPag() {
    return CBformaPag;
  }

  public JTable getItemTable() {
    return ItemTable;
  }

  public JButton getButtonIDCliente() {
    return buttonIDCliente;
  }

  public JButton getButtonIDVendedor() {
    return buttonIDVendedor;
  }

  public JTextField getInputBarCode() {
    return inputBarCode;
  }

  public JFormattedTextField getInputClientID() {
    return inputClientID;
  }

  public JTextField getInputClientName() {
    return inputClientName;
  }

  public JTextField getInputItemQty() {
    return inputItemQty;
  }

  public JFormattedTextField getInputVendedorID() {
    return inputVendedorID;
  }

  public JTextField getInputVendedorName() {
    return inputVendedorName;
  }

  public JLabel getLabelDiscountSale() {
    return labelDiscountSale;
  }

  public JLabel getLabelTotalSale() {
    return labelTotalSale;
  }

  public JRootPane getRootPane() {
    return rootPane;
  }

  public JButton getButtonSetNewQtd() {
    return buttonSetNewQtd;
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jPanelBarCode = new javax.swing.JPanel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    buttonSetNewQtd = new javax.swing.JButton();
    inputBarCode = new javax.swing.JTextField();
    inputItemQty = new javax.swing.JTextField();
    jPanelSaleInfos = new javax.swing.JPanel();
    jPanel6 = new javax.swing.JPanel();
    inputVendedorID = new javax.swing.JFormattedTextField();
    jLabel18 = new javax.swing.JLabel();
    jLabel19 = new javax.swing.JLabel();
    inputVendedorName = new javax.swing.JTextField();
    jLabel6 = new javax.swing.JLabel();
    buttonIDVendedor = new javax.swing.JButton();
    jPanel8 = new javax.swing.JPanel();
    inputClientID = new javax.swing.JFormattedTextField();
    jLabel20 = new javax.swing.JLabel();
    jLabel21 = new javax.swing.JLabel();
    inputClientName = new javax.swing.JTextField();
    jLabel7 = new javax.swing.JLabel();
    buttonIDCliente = new javax.swing.JButton();
    jPanel9 = new javax.swing.JPanel();
    jLabel8 = new javax.swing.JLabel();
    CBformaPag = new javax.swing.JComboBox<>();
    CBNumParcelas = new javax.swing.JComboBox<>();
    jLabel22 = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    ItemTable = new javax.swing.JTable();
    jPanelTotalSale = new javax.swing.JPanel();
    jLabel10 = new javax.swing.JLabel();
    labelDiscountSale = new javax.swing.JLabel();
    labelTotalSale = new javax.swing.JLabel();
    jLabel27 = new javax.swing.JLabel();
    jLabel28 = new javax.swing.JLabel();
    jLabel29 = new javax.swing.JLabel();
    jPanelButtonsInfo = new javax.swing.JPanel();
    jLabel15 = new javax.swing.JLabel();
    jLabel23 = new javax.swing.JLabel();
    jLabel24 = new javax.swing.JLabel();
    jLabel25 = new javax.swing.JLabel();
    jLabel26 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Faturamento");
    setResizable(false);

    jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    jPanelBarCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    jLabel3.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
    jLabel3.setText("Código de Barra");

    jLabel4.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
    jLabel4.setText("Quantidade");

    inputBarCode.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
    inputBarCode.setEnabled(false);

    inputItemQty.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
    inputItemQty.setEnabled(false);

    javax.swing.GroupLayout jPanelBarCodeLayout = new javax.swing.GroupLayout(jPanelBarCode);
    jPanelBarCode.setLayout(jPanelBarCodeLayout);
    jPanelBarCodeLayout.setHorizontalGroup(
            jPanelBarCodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBarCodeLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanelBarCodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(inputBarCode, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                            .addGroup(jPanelBarCodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelBarCodeLayout.createSequentialGroup()
                                            .addComponent(inputItemQty, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(buttonSetNewQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4))
                            .addGap(20, 20, 20))
    );
    jPanelBarCodeLayout.setVerticalGroup(
            jPanelBarCodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBarCodeLayout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addGroup(jPanelBarCodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                            .addGap(14, 14, 14)
                            .addGroup(jPanelBarCodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(buttonSetNewQtd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(inputItemQty)
                                    .addComponent(inputBarCode))
                            .addContainerGap(13, Short.MAX_VALUE))
    );

    jPanelSaleInfos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

    inputVendedorID.setText("000");
    inputVendedorID.setEnabled(false);

    jLabel18.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
    jLabel18.setText("ID");

    jLabel19.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
    jLabel19.setText("Nome");

    inputVendedorName.setText("...");
    inputVendedorName.setEnabled(false);

    jLabel6.setText("FUNCIONÁRIO");

    buttonIDVendedor.setEnabled(false);

    javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
    jPanel6.setLayout(jPanel6Layout);
    jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                            .addComponent(buttonIDVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(inputVendedorID, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                                            .addComponent(jLabel19)
                                                            .addGap(240, 240, 240))
                                                    .addComponent(inputVendedorName))))
                            .addContainerGap())
    );
    jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                    .addComponent(jLabel18)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(inputVendedorID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                    .addComponent(jLabel19)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(inputVendedorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(buttonIDVendedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(19, 19, 19))
    );

    jPanel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

    inputClientID.setText("000");
    inputClientID.setEnabled(false);

    jLabel20.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
    jLabel20.setText("ID");

    jLabel21.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
    jLabel21.setText("Nome");

    inputClientName.setText("...");
    inputClientName.setEnabled(false);

    jLabel7.setText("CLIENTE");

    buttonIDCliente.setEnabled(false);

    javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
    jPanel8.setLayout(jPanel8Layout);
    jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                            .addComponent(buttonIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(8, 8, 8)
                                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(inputClientID, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                                            .addComponent(jLabel21)
                                                            .addGap(240, 240, 240))
                                                    .addComponent(inputClientName))))
                            .addContainerGap())
    );
    jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                            .addComponent(jLabel21)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(inputClientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                            .addComponent(jLabel20)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(buttonIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                    .addComponent(inputClientID))))
                            .addGap(19, 19, 19))
    );

    jPanel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

    jLabel8.setText("FORMA PAGAMENTO");

    CBformaPag.setEnabled(false);

    CBNumParcelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
    CBNumParcelas.setToolTipText("");
    CBNumParcelas.setEnabled(false);

    jLabel22.setText("N° PARCELAS");

    javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
    jPanel9.setLayout(jPanel9Layout);
    jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(CBNumParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(53, 53, 53))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(CBformaPag, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(178, Short.MAX_VALUE)))
    );
    jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(14, 14, 14))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                            .addComponent(jLabel22)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addComponent(CBNumParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(13, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                    .addGap(39, 39, 39)
                                    .addComponent(CBformaPag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
    );

    javax.swing.GroupLayout jPanelSaleInfosLayout = new javax.swing.GroupLayout(jPanelSaleInfos);
    jPanelSaleInfos.setLayout(jPanelSaleInfosLayout);
    jPanelSaleInfosLayout.setHorizontalGroup(
            jPanelSaleInfosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSaleInfosLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanelSaleInfosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addContainerGap())
    );
    jPanelSaleInfosLayout.setVerticalGroup(
            jPanelSaleInfosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSaleInfosLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
    );

    ItemTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
    ItemTable.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
    ItemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][]{

            },
            new String[]{
                    "Item", "ID", "Produto", "QTD", "Valor", "SubTotal"
            }
    ) {
      final boolean[] canEdit = new boolean[]{
              false, false, false, false, false, false
      };

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit[columnIndex];
      }
    });
    jScrollPane1.setViewportView(ItemTable);
    if (ItemTable.getColumnModel().getColumnCount() > 0) {
      ItemTable.getColumnModel().getColumn(0).setMaxWidth(50);
      ItemTable.getColumnModel().getColumn(1).setMaxWidth(50);
      ItemTable.getColumnModel().getColumn(2).setMaxWidth(300);
      ItemTable.getColumnModel().getColumn(3).setMaxWidth(75);
      ItemTable.getColumnModel().getColumn(4).setMaxWidth(75);
      ItemTable.getColumnModel().getColumn(5).setMaxWidth(75);
    }

    jPanelTotalSale.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

    jLabel10.setFont(new java.awt.Font("Raleway", 1, 30)); // NOI18N
    jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel10.setText("R$");
    jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

    labelDiscountSale.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
    labelDiscountSale.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    labelDiscountSale.setText("0,00");
    labelDiscountSale.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

    labelTotalSale.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
    labelTotalSale.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    labelTotalSale.setText("0,00");
    labelTotalSale.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

    jLabel27.setFont(new java.awt.Font("Raleway", 0, 36)); // NOI18N
    jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel27.setText("Total:");
    jLabel27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

    jLabel28.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
    jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jLabel28.setText(" Desconto");
    jLabel28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

    jLabel29.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
    jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel29.setText("R$");
    jLabel29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

    javax.swing.GroupLayout jPanelTotalSaleLayout = new javax.swing.GroupLayout(jPanelTotalSale);
    jPanelTotalSale.setLayout(jPanelTotalSaleLayout);
    jPanelTotalSaleLayout.setHorizontalGroup(
            jPanelTotalSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTotalSaleLayout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addGroup(jPanelTotalSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanelTotalSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanelTotalSaleLayout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(labelDiscountSale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(labelTotalSale, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanelTotalSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanelTotalSaleLayout.setVerticalGroup(
            jPanelTotalSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTotalSaleLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanelTotalSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelTotalSale, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanelTotalSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelDiscountSale)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel29))
                            .addGap(9, 9, 9))
    );

    jPanelButtonsInfo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

    jLabel15.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
    jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel15.setText("{F1} - Nova venda");
    jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

    jLabel23.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
    jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel23.setText("{F2} - Adicionar produto");
    jLabel23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

    jLabel24.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
    jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel24.setText("{F3} - Remover produto");
    jLabel24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

    jLabel25.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
    jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel25.setText("{F4}- Cancelar venda");
    jLabel25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

    jLabel26.setFont(new java.awt.Font("Raleway", 0, 14)); // NOI18N
    jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel26.setText("{F5}- Finalizar Venda");
    jLabel26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

    javax.swing.GroupLayout jPanelButtonsInfoLayout = new javax.swing.GroupLayout(jPanelButtonsInfo);
    jPanelButtonsInfo.setLayout(jPanelButtonsInfoLayout);
    jPanelButtonsInfoLayout.setHorizontalGroup(
            jPanelButtonsInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelButtonsInfoLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanelButtonsInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel23))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelButtonsInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel26))
                            .addGap(104, 104, 104))
    );
    jPanelButtonsInfoLayout.setVerticalGroup(
            jPanelButtonsInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelButtonsInfoLayout.createSequentialGroup()
                            .addGap(0, 11, Short.MAX_VALUE)
                            .addGroup(jPanelButtonsInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel25))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanelButtonsInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel26))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel24)
                            .addContainerGap())
    );

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanelBarCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanelSaleInfos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanelButtonsInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanelTotalSale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE))
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(7, 7, 7)
                                            .addComponent(jPanelBarCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jPanelSaleInfos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanelTotalSale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanelButtonsInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents
  // End of variables declaration//GEN-END:variables
}
