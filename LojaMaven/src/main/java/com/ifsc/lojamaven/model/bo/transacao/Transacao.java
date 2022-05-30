package com.ifsc.lojamaven.model.bo.transacao;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public abstract class Transacao implements Serializable {

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataHora;

    @Column
    private float valorTotal;

    @Column
    private float valorDesconto;

    @OneToOne
    private CondicaoPagamento condicaoPagamento;
    
    public Transacao(){
    
    }

    public Transacao(Date dataHora, float valorTotal, float valorDesconto, CondicaoPagamento condicaoPagamento) {
        this.dataHora = dataHora;
        this.valorTotal = valorTotal;
        this.valorDesconto = valorDesconto;
        this.condicaoPagamento = condicaoPagamento;
    }

    public Date getDtHora() {
        return dataHora;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public float getValorDesconto() {
        return valorDesconto;
    }

    public CondicaoPagamento getCondicaoPagamento() {
        return condicaoPagamento;
    }

    public void setDtHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public void setCondicaoPagamento(CondicaoPagamento condicaoPagamento) {
        this.condicaoPagamento = condicaoPagamento;
    }
    
    
    
}
