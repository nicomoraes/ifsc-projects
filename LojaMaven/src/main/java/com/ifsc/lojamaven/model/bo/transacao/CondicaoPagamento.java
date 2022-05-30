package com.ifsc.lojamaven.model.bo.transacao;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "condicaopagamento")
public class CondicaoPagamento implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int idCondicaoPagamento;

  @Column(name = "descricaoCondicaoPagamento")
  private String descricao;

  @Column
  private int numDiasAtePrimeiraParcela;

  @Column
  private int numDiasEntreParcelas;

  public CondicaoPagamento() {

  }

  public int getIdCondicaoPagamento() {
    return idCondicaoPagamento;
  }

  public void setIdCondicaoPagamento(int idCondicaoPagamento) {
    this.idCondicaoPagamento = idCondicaoPagamento;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public int getNumDiasAtePrimeiraParcela() {
    return numDiasAtePrimeiraParcela;
  }

  public void setNumDiasAtePrimeiraParcela(int numDiasAtePrimeiraParcela) {
    this.numDiasAtePrimeiraParcela = numDiasAtePrimeiraParcela;
  }

  public int getNumDiasEntreParcelas() {
    return numDiasEntreParcelas;
  }

  public void setNumDiasEntreParcelas(int numDiasEntreParcelas) {
    this.numDiasEntreParcelas = numDiasEntreParcelas;
  }

  @Override
  public String toString() {
    return  this.getDescricao() + "\n" +
            this.getNumDiasAtePrimeiraParcela() + "\n" +
            this.getNumDiasEntreParcelas();
  }
}
