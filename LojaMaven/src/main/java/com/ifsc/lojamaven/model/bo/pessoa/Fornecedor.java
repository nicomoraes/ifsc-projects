package com.ifsc.lojamaven.model.bo.pessoa;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.ifsc.lojamaven.model.bo.endereco.Cep;

@Entity
@Table(name = "fornecedor")
@AttributeOverride(name="nome", column = @Column(name = "nomeFantasiaFornecedor"))
@AttributeOverride(name="email", column = @Column(name = "emailFornecedor"))
@AttributeOverride(name="complementoEnd", column = @Column(name = "complementoEndForncedor"))
public class Fornecedor extends Pessoa implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFornecedor;

    @Column(name = "razaoSocialFornecedor")
    private String razaoSocial;

    @Column(name = "cnpjFornecedor")
    private String cnpj;

    @Column(name = "inscEstadualFornecedor")
    private String inscEstadual;

    public Fornecedor(){
    }

    public Fornecedor(int idFornecedor, String razaoSocial, String cnpj, String inscEstadual, String nome, String email, Cep enderecoCep, String complementoEnd) {
        super(nome, email, enderecoCep, complementoEnd);
        this.idFornecedor = idFornecedor;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.inscEstadual = inscEstadual;
    }

    public int getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscEstadual() {
        return inscEstadual;
    }

    public void setInscEstadual(String inscEstadual) {
        this.inscEstadual = inscEstadual;
    }

    @Override
    public String toString() {
        return super.toString()
                + this.getCnpj() + "\n"
                + this.getInscEstadual() + "\n"
                + this.getRazaoSocial();
    }
} 
    