package com.ifsc.lojamaven.model.bo.pessoa;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

import com.ifsc.lojamaven.model.bo.endereco.Cep;

@MappedSuperclass
abstract class Pessoa implements Serializable {
    @Column
    private String nome;
      
    @Column
    private String email;

    @Column
    private String complementoEnd;

    @OneToOne
    @JoinColumn(name = "endereco_idCep")
    private Cep enderecoCep;

    Pessoa() {

    }

    Pessoa(String nome, String email, Cep enderecoCep, String complementoEnd) {
        this.nome = nome;
        this.email = email;
        this.enderecoCep = enderecoCep;
        this.complementoEnd = complementoEnd;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }


    public Cep getEnderecoCep() {
        return enderecoCep;
    }

    public String getComplementoEnd() {
        return complementoEnd;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEnderecoCep(Cep enderecoCep) {
        this.enderecoCep = enderecoCep;
    }

    public void setComplementoEnd(String complementoEnd) {
        this.complementoEnd = complementoEnd;
    }

    @Override
    public String toString() {
        return this.getNome()  + "\n" + this.getEmail() + "\n" + this.getEnderecoCep().getCep() + "\n" + this.getComplementoEnd();
    }
   
    
}
