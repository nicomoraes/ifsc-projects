package com.ifsc.lojamaven.model.bo.transacao;
import java.io.Serializable;

import javax.persistence.*;

import com.ifsc.lojamaven.model.bo.produto.CaractProd;

@Entity
public class ItemCompra extends Item implements Serializable {
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idItensCompra;

    @ManyToOne
    private Compra compra;

    public ItemCompra() {
    }

    public ItemCompra(int idItensCompra, Compra compra, float valorUnitario, int qtdProduto, CaractProd caracteristicaProduto) {
        super(valorUnitario, qtdProduto, caracteristicaProduto);
        this.idItensCompra = idItensCompra;
        this.compra = compra;
    }

    public int getIdItemCompra() {
        return idItensCompra;
    }

    public void setIdItemCompra(int idItensCompra) {
        this.idItensCompra = idItensCompra;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    @Override
    public String toString() {
        return super.toString()+ "\n" + this.getCompra().getSerieNF();
    }
    
}
