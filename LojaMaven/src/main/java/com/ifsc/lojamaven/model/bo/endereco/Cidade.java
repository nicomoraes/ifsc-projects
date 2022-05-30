package com.ifsc.lojamaven.model.bo.endereco;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "cidade")
public class Cidade implements Serializable {
  @Id
  private int idCidade;

  @Column(name = "descricaoCidade")
  private String descricao;

  @Column(name = "ufCidade")
  private String uf;

  public Cidade() {

  }

  public Cidade(int idCidade, String descricao, String uf) {
    this.idCidade = idCidade;
    this.descricao = descricao;
    this.uf = uf;
  }

  public int getIdCidade() {
    return idCidade;
  }

  public void setIdCidade(int idCidade) {
    this.idCidade = idCidade;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public String getUf() {
    return uf;
  }

  public void setUf(String uf) {
    this.uf = uf;
  }

  @Override
  public String toString() {
    return this.getDescricao();
  }
}
