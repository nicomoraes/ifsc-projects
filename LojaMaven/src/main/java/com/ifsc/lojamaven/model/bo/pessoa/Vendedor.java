package com.ifsc.lojamaven.model.bo.pessoa;

import java.io.Serializable;

import javax.persistence.*;

import com.ifsc.lojamaven.model.bo.endereco.Cep;

@Entity
@AttributeOverride(name="nome", column = @Column(name = "nomeVendedor"))
@AttributeOverride(name="email", column = @Column(name = "emailVendedor"))
@AttributeOverride(name="complementoEnd", column = @Column(name = "complementoEndVendedor"))
public class Vendedor extends Pessoa implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int idVendedor;

  @Column(name = "cpfVendedor")
  private String cpf;

  @Column
  private float percentComissaoVenda;

  @Column
  private float percentComissaoRecebto;

  @Column(name = "foneVendedor")
  private String fone;

  public Vendedor() {
  }

  public Vendedor(int idVendedor, String cpf, float percentComissaoVenda, float percentComissaoRecebto, String nome, String email, String fone, Cep enderecoCep, String complementoEnd) {
    super(nome, email, enderecoCep, complementoEnd);
    this.idVendedor = idVendedor;
    this.cpf = cpf;
    this.percentComissaoVenda = percentComissaoVenda;
    this.percentComissaoRecebto = percentComissaoRecebto;
    this.fone = fone;
  }

  public int getIdVendedor() {
    return idVendedor;
  }

  public void setIdVendedor(int idVendedor) {
    this.idVendedor = idVendedor;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public float getPercentComissaoVenda() {
    return percentComissaoVenda;
  }

  public void setPercentComissaoVenda(float percentComissaoVenda) {
    this.percentComissaoVenda = percentComissaoVenda;
  }

  public float getPercentComissaoRecebto() {
    return percentComissaoRecebto;
  }

  public void setPercentComissaoRecebto(float percentComissaoRecebto) {
    this.percentComissaoRecebto = percentComissaoRecebto;
  }

  public String getFone() {
    return fone;
  }

  public void setFone(String fone) {
    this.fone = fone;
  }

  @Override
  public String toString() {
    return super.toString()
            + this.getCpf() + "\n"
            + this.getPercentComissaoVenda() + "\n"
            + this.getPercentComissaoRecebto();
  }

}
