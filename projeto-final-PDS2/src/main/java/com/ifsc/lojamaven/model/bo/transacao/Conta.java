package com.ifsc.lojamaven.model.bo.transacao;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public abstract class Conta implements Serializable {
  @Temporal(TemporalType.TIMESTAMP)
  private Date dataHoraEmissao;

  @Temporal(TemporalType.TIMESTAMP)
  private Date dataHoraPgto;

  @Temporal(TemporalType.DATE)
  private Date dataVencimento;

  @Column
  private float valorEmissao;

  @Column
  private float valorPago;

  @Column
  private float desconto;

  @Column
  private float acrescimo;

  @Column
  private String status;

  public Conta() {

  }

  public Conta(Date dataHoraEmissao, Date dataHoraPgto, Date dataVencimento, float valorEmissao, float valorPago,
      float desconto, float acrescimo, String status) {
    this.dataHoraEmissao = dataHoraEmissao;
    this.dataHoraPgto = dataHoraPgto;
    this.dataVencimento = dataVencimento;
    this.valorEmissao = valorEmissao;
    this.valorPago = valorPago;
    this.desconto = desconto;
    this.acrescimo = acrescimo;
    this.status = status;
  }

  public Date getDtHrEmissao() {
    return dataHoraEmissao;
  }

  public Date getDtHrPagamento() {
    return dataHoraPgto;
  }

  public Date getDtVencimento() {
    return dataVencimento;
  }

  public float getValorEmissao() {
    return valorEmissao;
  }

  public float getValPago() {
    return valorPago;
  }

  public float getDesconto() {
    return desconto;
  }

  public float getAcrescimo() {
    return acrescimo;
  }

  public String getStatus() {
    return status;
  }

  public void setDtHrEmissao(Date dataHoraEmissao) {
    this.dataHoraEmissao = dataHoraEmissao;
  }

  public void setDtHrPagamento(Date dataHoraPgto) {
    this.dataHoraPgto = dataHoraPgto;
  }

  public void setDtVencimento(Date dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  public void setValorEmissao(float valorEmissao) {
    this.valorEmissao = valorEmissao;
  }

  public void setValPago(float valorPago) {
    this.valorPago = valorPago;
  }

  public void setDesconto(float desconto) {
    this.desconto = desconto;
  }

  public void setAcrescimo(float acrescimo) {
    this.acrescimo = acrescimo;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return this.getDtHrEmissao() + "\n" + this.getDtHrPagamento() + "\n" + this.getDtVencimento() + "\n"
        + this.getValorEmissao() + "\n" + this.getValPago() + "\n" + this.getDesconto() + "\n" + this.getAcrescimo()
        + "\n" + this.getStatus();
  }

}
