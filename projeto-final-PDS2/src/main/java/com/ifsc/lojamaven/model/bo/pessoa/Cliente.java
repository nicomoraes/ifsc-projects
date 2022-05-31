package com.ifsc.lojamaven.model.bo.pessoa;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import com.ifsc.lojamaven.model.bo.endereco.Cep;


@Entity
@Table(name = "cliente")
@AttributeOverride(name="nome", column = @Column(name = "nomeCliente"))
@AttributeOverride(name="email", column = @Column(name = "emailCliente"))
@AttributeOverride(name="complementoEnd", column = @Column(name = "complementoEndCliente"))
public class Cliente extends Pessoa implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int idCliente;

  @Column(name = "cpfCliente")
  private String cpf;

  @Column(name = "rgCliente")
  private String rg;

  @Temporal(TemporalType.DATE)
  @Column(name = "dtNascCliente")
  private Date dtNasc;

  @Column(name = "foneCliente")
  private String fone;

  public Cliente() {
  }

  public Cliente(int idCliente, String cpf, String rg, Date dtNasc, String nome, String email, String fone, Cep enderecoCep, String complementoEnd) {
    super(nome, email,enderecoCep, complementoEnd);
    this.idCliente = idCliente;
    this.cpf = cpf;
    this.rg = rg;
    this.fone = fone;
    this.dtNasc = dtNasc;
  }

  public int getIdCliente() {
    return idCliente;
  }

  public void setIdCliente(int idCliente) {
    this.idCliente = idCliente;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getRg() {
    return rg;
  }

  public void setRg(String rg) {
    this.rg = rg;
  }

  public String getFone() {
    return fone;
  }

  public void setFone(String fone) {
    this.fone = fone;
  }

  public Date getDtNasc() {
    return dtNasc;
  }

  public void setDtNasc(Date dtNasc) {
    this.dtNasc = dtNasc;
  }

  @Override
  public String toString() {
    return super.toString()
            + this.getCpf() + "\n"
            + this.getRg() + "\n"
            + this.getDtNasc();
  }

}
