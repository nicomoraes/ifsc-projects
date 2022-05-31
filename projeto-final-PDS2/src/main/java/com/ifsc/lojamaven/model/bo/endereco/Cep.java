package com.ifsc.lojamaven.model.bo.endereco;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "endereco")
public class Cep implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int idCep;

  @Column(name = "cepCep")
  private String cep;

  @Column(name = "logradouroCep")
  private String logradouro;

  @OneToOne
  private Bairro bairro;

  @OneToOne
  private Cidade cidade;

  public Cep() {

  }

  public Cep(int idCep, String cep, String logradouro, Bairro bairro, Cidade cidade) {
    this.idCep = idCep;
    this.cep = cep;
    this.logradouro = logradouro;
    this.bairro = bairro;
    this.cidade = cidade;
  }

  public int getIdCep() {
    return idCep;
  }

  public void setIdCep(int idCep) {
    this.idCep = idCep;
  }

  public String getCep() {
    return cep;
  }

  public void setCep(String cep) {
    this.cep = cep;
  }

  public String getLogradouro() {
    return logradouro;
  }

  public void setLogradouro(String logradouro) {
    this.logradouro = logradouro;
  }

  public Bairro getBairro() {
    return bairro;
  }

  public void setBairro(Bairro bairro) {
    this.bairro = bairro;
  }

  public Cidade getCidade() {
    return cidade;
  }

  public void setCidade(Cidade cidade) {
    this.cidade = cidade;
  }

  @Override
  public String toString() {
    return this.getCep() + "\n" + this.getLogradouro() + "\n" + this.getCidade().getDescricao() + "\n"
        + this.getBairro().getDescricao();
  }

}
