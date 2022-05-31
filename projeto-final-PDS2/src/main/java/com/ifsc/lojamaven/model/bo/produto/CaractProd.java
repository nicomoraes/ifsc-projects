package com.ifsc.lojamaven.model.bo.produto;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "caracteristicaproduto")
public class CaractProd implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "idCaractProd")
  private int idCaracteristicaProduto;

  @Column
  private String tamanhoProduto;
  
  @Column(name = "cdgBarraProduto")
  private String barraProduto;
  
  @Column(name = "qtdEstoqueProduto")
  private float qtdEstoque;
  
  @OneToOne
  private Produto produto;

  @OneToOne
  private Cor cor;

  public CaractProd() {
  }

  public CaractProd(int idCaracteristicaProduto, Produto produto, Cor cor, String tamanhoProduto, String barraProduto, float qtdEstoque) {
    this.idCaracteristicaProduto = idCaracteristicaProduto;
    this.produto = produto;
    this.cor = cor;
    this.tamanhoProduto = tamanhoProduto;
    this.barraProduto = barraProduto;
    this.qtdEstoque = qtdEstoque;
  }

  public int getIdCaracteristicaProduto() {
    return idCaracteristicaProduto;
  }

  public void setIdCaracteristicaProduto(int idCaracteristicaProduto) {
    this.idCaracteristicaProduto = idCaracteristicaProduto;
  }

  public Produto getProduto() {
    return produto;
  }

  public void setProduto(Produto produto) {
    this.produto = produto;
  }

  public Cor getCor() {
    return cor;
  }

  public void setCor(Cor cor) {
    this.cor = cor;
  }

  public String getTamanhoProduto() {
    return tamanhoProduto;
  }

  public void setTamanhoProduto(String tamanhoProduto) {
    this.tamanhoProduto = tamanhoProduto;
  }

  public String getBarraProduto() {
    return barraProduto;
  }

  public void setBarraProduto(String barraProduto) {
    this.barraProduto = barraProduto;
  }

  public float getQtdEstoque() {
    return qtdEstoque;
  }

  public void setQtdEstoque(float qtdEstoque) {
    this.qtdEstoque = qtdEstoque;
  }

  @Override
  public String toString() {
    return this.getProduto().getDescricao() + "\n" + this.getCor().getDescricao() + "\n" + this.getTamanhoProduto() + "\n" + this.getBarraProduto() + "\n" + this.getQtdEstoque();
  }


}
