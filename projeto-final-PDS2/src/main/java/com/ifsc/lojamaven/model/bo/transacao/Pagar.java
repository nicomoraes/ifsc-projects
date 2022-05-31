package com.ifsc.lojamaven.model.bo.transacao;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@AttributeOverride(name="dataHoraEmissao",  column = @Column(name = "dataHoraEmissaoPgto"))
@AttributeOverride(name="dataHora",         column = @Column(name = "dataHoraPgto"))
@AttributeOverride(name="dataVencimento",   column = @Column(name = "dataVencimentoPgto"))
@AttributeOverride(name="valorEmissao",     column = @Column(name = "valorEmissaoPgto"))
@AttributeOverride(name="valorPago",        column = @Column(name = "valorPagoPgto"))
@AttributeOverride(name="desconto",         column = @Column(name = "descontoPgto"))
@AttributeOverride(name="acrescimo",        column = @Column(name = "acrescimoPgto"))
@AttributeOverride(name="status",           column = @Column(name = "statusPgto"))
public class Pagar extends Conta implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int idPagar;

  @OneToOne
  private Compra compra;

  public Pagar() {

  }

  public Pagar(int idPagar, Compra compra, Date dataHoraEmissao, Date dataHoraPgto, Date dataVencimento,
      float valorEmissao, float valorPago, float desconto, float acrescimo, String status) {
    super(dataHoraEmissao, dataHoraPgto, dataVencimento, valorEmissao, valorPago, desconto, acrescimo, status);
    this.idPagar = idPagar;
    this.compra = compra;
  }

  public int getIdPagar() {
    return idPagar;
  }

  public void setIdPagar(int idPagar) {
    this.idPagar = idPagar;
  }

  public Compra getCompra() {
    return compra;
  }

  public void setCompra(Compra compra) {
    this.compra = compra;
  }

  @Override
  public String toString() {
    return super.toString() + "\n" + this.getCompra().toString();
  }
}
