package com.ifsc.lojamaven.model.bo.transacao;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import com.ifsc.lojamaven.model.bo.pessoa.Fornecedor;

@Entity
@AttributeOverride(name="dataHora",       column = @Column(name = "dataHoraCompra"))
@AttributeOverride(name="valorTotal",     column = @Column(name = "valorTotalCompra"))
@AttributeOverride(name="valorDesconto",  column = @Column(name = "valorDescontoCompra"))
public class Compra extends Transacao implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int idCompra;

  @Column(name = "numNFCompra")
  private int numNF;

  @Column(name = "serieNFCompra")
  private String serieNF;

  @OneToOne
  private Fornecedor fornecedor;

  public Compra() {

  }

  public Compra(int idCompra, int numNF, String serieNF, Fornecedor fornecedor, Date dtHora, float valorTotal,
      float valorDesconto, CondicaoPagamento condicaoPagamento) {
    super(dtHora, valorTotal, valorDesconto, condicaoPagamento);
    this.idCompra = idCompra;
    this.numNF = numNF;
    this.serieNF = serieNF;
    this.fornecedor = fornecedor;
  }

  public int getIdCompra() {
    return idCompra;
  }

  public void setIdCompra(int idCompra) {
    this.idCompra = idCompra;
  }

  public int getNumNF() {
    return numNF;
  }

  public void setNumNF(int numNF) {
    this.numNF = numNF;
  }

  public String getSerieNF() {
    return serieNF;
  }

  public void setSerieNF(String serieNF) {
    this.serieNF = serieNF;
  }

  public Fornecedor getFornecedor() {
    return fornecedor;
  }

  public void setFornecedor(Fornecedor fornecedor) {
    this.fornecedor = fornecedor;
  }

  @Override
  public String toString() {
    return super.toString() + "\n" + this.getNumNF() + "\n" + this.getSerieNF() + "\n"
        + this.getFornecedor().getRazaoSocial();
  }

}
