package com.ifsc.lojamaven.model.bo.transacao;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

import com.ifsc.lojamaven.model.bo.produto.CaractProd;

@MappedSuperclass
public abstract class Item implements Serializable {
    @Column
    private float valorUnitario;

    @Column
    private int qtdProduto;

    @OneToOne
    private CaractProd caracteristicaProduto;

    public Item() {
    }

    public Item(float valorUnitario, int qtdProduto, CaractProd caracteristicaProduto) {
        this.valorUnitario = valorUnitario;
        this.qtdProduto = qtdProduto;
        this.caracteristicaProduto = caracteristicaProduto;
    }

    public float getValUnitario() {
        return valorUnitario;
    }

    public float getQtdProduto() {
        return qtdProduto;
    }

    public CaractProd getCaracteristicaProduto() {
        return caracteristicaProduto;
    }

    public void setValUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public void setQtdProduto(int qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    public void setCaracteristicaProduto(CaractProd caracteristicaProduto) {
        this.caracteristicaProduto = caracteristicaProduto;
    }
    
    @Override
    public String toString() {
        return this.getValUnitario()+ "\n" + this.getQtdProduto() + this.getCaracteristicaProduto().getProduto().getDescricao();
    }
    
}
