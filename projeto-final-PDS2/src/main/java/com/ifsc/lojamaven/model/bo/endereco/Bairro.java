package com.ifsc.lojamaven.model.bo.endereco;


import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "bairro")
public class Bairro implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int idBairro;

  @Column(name = "descricaoBairro")
  private String descricao;

  public Bairro(){

  }

  public Bairro(int idBairro, String descricao) {
    this.idBairro = idBairro;
    this.descricao = descricao;
  }

  public int getIdBairro() {
    return idBairro;
  }

  public void setIdBairro(int idBairro) {
    this.idBairro = idBairro;
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
