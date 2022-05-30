package com.ifsc.lojamaven.model.bo.transacao;
import java.io.Serializable;

import javax.persistence.*;

import com.ifsc.lojamaven.model.bo.produto.CaractProd;

@Entity
@Table(name = "itensvenda")
public class ItemVenda extends Item implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int idItensVenda;

  @ManyToOne
  @JoinColumn(name="venda_idVenda")
  private Venda venda;

  public ItemVenda() {
  }

  public ItemVenda(int idItensVenda, Venda venda, float valorUnitario, int qtdProduto, CaractProd caracteristicaProduto) {
    super(valorUnitario, qtdProduto, caracteristicaProduto);
    this.idItensVenda = idItensVenda;
    this.venda = venda;
  }

  public int getIdItemVenda() {
    return idItensVenda;
  }

  public void setIdItemVenda(int idItensVenda) {
    this.idItensVenda = idItensVenda;
  }

  public Venda getVenda() {
    return venda;
  }

  public void setVenda(Venda venda) {
    this.venda = venda;
  }

  @Override
  public String toString() {
    return super.toString()+ "\n" + this.getVenda().getSerie();
  }


}


