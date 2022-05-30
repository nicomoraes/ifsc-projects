package com.ifsc.lojamaven.model.bo.produto;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "cor")
public class Cor implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int idCor;

  @Column(name = "descricaoCor")
  private String descricao;

  public Cor() {
  }

  public Cor(int idCor, String descricao) {
    this.idCor = idCor;
    this.descricao = descricao;
  }

  public int getIdCor() {
    return idCor;
  }

  public void setIdCor(int idCor) {
    this.idCor = idCor;
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
