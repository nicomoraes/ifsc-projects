package com.ifsc.lojamaven.model.bo.transacao;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@AttributeOverride(name="dataHoraEmissao",  column = @Column(name = "dataHoraEmissaoRec"))
@AttributeOverride(name="valorEmissao",     column = @Column(name = "valorEmissaoRec"))
@AttributeOverride(name="dataVencimento",   column = @Column(name = "dataVencimentoRec"))
@AttributeOverride(name="valorPago",        column = @Column(name = "valorPagoRec"))
@AttributeOverride(name="status",           column = @Column(name = "statusRec"))
@AttributeOverride(name="dataHoraPgto",     column = @Column(name = "dataHoraPagamentoRec"))
@AttributeOverride(name="acrescimo",        column = @Column(name = "acrescimoRec"))
@AttributeOverride(name="desconto",         column = @Column(name = "descontoRec"))
public class Receber extends Conta implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int idReceber;

  @ManyToOne
  @JoinColumn(name = "venda_idvenda", referencedColumnName = "idVenda")
  private Venda venda;

  public Receber() {

  }

  public Receber(int idReceber, Venda venda, Date dataHoraEmissao, Date dataHoraPgto, Date dataVencimento,
                 float valorEmissao, float valorPago, float desconto, float acrescimo, String status) {
    super(dataHoraEmissao, dataHoraPgto, dataVencimento, valorEmissao, valorPago, desconto, acrescimo, status);
    this.idReceber = idReceber;
    this.venda = venda;
  }

  public int getIdReceber() {
    return idReceber;
  }

  public void setIdReceber(int idReceber) {
    this.idReceber = idReceber;
  }

  public Venda getVenda() {
    return venda;
  }

  public void setVenda(Venda venda) {
    this.venda = venda;
  }

  @Override
  public String toString() {
    return super.toString() + "\n" + this.getVenda().toString();
  }

}
