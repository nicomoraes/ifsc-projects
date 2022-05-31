package com.ifsc.lojamaven.model.bo.pessoa;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "fonefornecedor")
public class FoneFornecedor implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int idFone;

  @Column(name = "foneFornecedor")
  private String descricao;

  @OneToOne
  @JoinColumn(name = "fornecedor_idFornecedor")
  private Fornecedor fornecedor;

  public FoneFornecedor() {

  }

  public FoneFornecedor(int idFone, String descricao, Fornecedor fornecedor) {
    this.idFone = idFone;
    this.descricao = descricao;
    this.fornecedor = fornecedor;
  }

  public int getIdFone() {
    return idFone;
  }

  public void setIdFone(int idFone) {
    this.idFone = idFone;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public Fornecedor getFornecedor() {
    return fornecedor;
  }

  public void setFornecedor(Fornecedor fornecedor) {
    this.fornecedor = fornecedor;
  }

  @Override
  public String toString() {
    return "FoneFornecedor{" + ", descricao=" + descricao + ", fornecedor=" + fornecedor + '}';
  }
} 
    