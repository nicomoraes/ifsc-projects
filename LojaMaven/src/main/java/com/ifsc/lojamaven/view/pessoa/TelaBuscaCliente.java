package com.ifsc.lojamaven.view.pessoa;

import javax.swing.JButton;
import javax.swing.JTable;

public class TelaBuscaCliente extends javax.swing.JDialog {


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButtonCarregar;
  private javax.swing.JButton jButtonSair;
  private javax.swing.JLabel jLabelTitulo;
  private javax.swing.JPanel jPTitulo;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable jTable;

  public TelaBuscaCliente(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();
  }

  public static void main(String[] args) {

    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        TelaBuscaCliente dialog = new TelaBuscaCliente(new javax.swing.JFrame(), true);
        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
          @Override
          public void windowClosing(java.awt.event.WindowEvent e) {
            System.exit(0);
          }
        });
        dialog.setVisible(true);
      }
    });
  }

  public JButton getjButtonCarregar() {
    return jButtonCarregar;
  }

  public JButton getjButtonSair() {
    return jButtonSair;
  }

  public JTable getjTable() {
    return jTable;
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPTitulo = new javax.swing.JPanel();
    jLabelTitulo = new javax.swing.JLabel();
    jPanel1 = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    jTable = new javax.swing.JTable();
    jButtonCarregar = new javax.swing.JButton();
    jButtonSair = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    jPTitulo.setBackground(new java.awt.Color(255, 255, 51));
    jPTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

    jLabelTitulo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
    jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabelTitulo.setText("Busca Cliente");

    javax.swing.GroupLayout jPTituloLayout = new javax.swing.GroupLayout(jPTitulo);
    jPTitulo.setLayout(jPTituloLayout);
    jPTituloLayout.setHorizontalGroup(
            jPTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPTituloLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addContainerGap())
    );
    jPTituloLayout.setVerticalGroup(
            jPTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPTituloLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                            .addContainerGap())
    );

    jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

    jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][]{

            },
            new String[]{
                    "ID", "Nome", "CPF", "RG", "Endereço", "Fone"
            }
    ) {
      final boolean[] canEdit = new boolean[]{
              false, false, false, false, false, true
      };

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit[columnIndex];
      }
    });
    jScrollPane1.setViewportView(jTable);
    if (jTable.getColumnModel().getColumnCount() > 0) {
      jTable.getColumnModel().getColumn(0).setMinWidth(50);
      jTable.getColumnModel().getColumn(0).setMaxWidth(50);
    }

    jButtonCarregar.setText("Carregar");

    jButtonSair.setText("Sair");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jButtonCarregar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonCarregar, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                                    .addComponent(jButtonSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addContainerGap())
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                            .addComponent(jPTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents
  // End of variables declaration//GEN-END:variables
}
