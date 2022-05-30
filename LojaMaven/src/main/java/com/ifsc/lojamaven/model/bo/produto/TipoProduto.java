package com.ifsc.lojamaven.model.bo.produto;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "tipoproduto")
public class TipoProduto implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int idTipoProduto;

  @Column(name = "descricaoTipoProd")
  private String descricao;

  public TipoProduto() {
  }

  public TipoProduto(int idTipoProduto, String descricao) {
    this.idTipoProduto = idTipoProduto;
    this.descricao = descricao;
  }

  public int getIdTipoProduto() {
    return idTipoProduto;
  }

  public void setIdTipoProduto(int idTipoProduto) {
    this.idTipoProduto = idTipoProduto;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  @Override
  public String toString() {
    return this.getDescricao();
  }

}
