package com.ifsc.lojamaven.model.bo.produto;


import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "tamanho")
public class Tamanho implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int idTamanho;

  @Column(name = "descricaoTamanho")
  private String descricao;

  public Tamanho() {
  }

  public Tamanho(int idTamanho, String descricao) {
    this.idTamanho = idTamanho;
    this.descricao = descricao;
  }

  public int getIdTamanho() {
    return idTamanho;
  }

  public void setIdTamanho(int idTamanho) {
    this.idTamanho = idTamanho;
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
