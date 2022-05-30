package com.ifsc.lojamaven.model.bo.transacao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import com.ifsc.lojamaven.model.bo.pessoa.Cliente;
import com.ifsc.lojamaven.model.bo.pessoa.Vendedor;

@Entity
@AttributeOverride(name="dataHora",       column = @Column(name = "dataHoraVenda"))
@AttributeOverride(name="valorTotal",     column = @Column(name = "valorTotalVenda"))
@AttributeOverride(name="valorDesconto",  column = @Column(name = "valorDescontoVenda"))
public class Venda extends Transacao implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int idVenda;

  @Column(name = "serieVenda")
  private String serie;

  @Column(name = "diaVencimentoVenda")
  private int diaVencimento;

  @OneToOne
  private Cliente cliente;

  @OneToOne
  private Vendedor vendedor;

  @OneToMany(mappedBy = "venda", cascade = CascadeType.ALL)
  private List<ItemVenda> itens;

  @OneToMany(mappedBy = "venda", cascade = CascadeType.ALL)
  private List<Receber> contasReceber;

  public Venda() {
    this.itens = new ArrayList<>();
    this.contasReceber = new ArrayList<>();
  }

  public Venda(int idVenda, String serie, Cliente cliente, Vendedor vendedor, int diaVencimento,
               Date dataHora, float valorTotal, float valorDesconto, CondicaoPagamento condicaoPagamento) {
    super(dataHora, valorTotal, valorDesconto, condicaoPagamento);
    this.idVenda = idVenda;
    this.serie = serie;
    this.cliente = cliente;
    this.vendedor = vendedor;
    this.diaVencimento = diaVencimento;
  }

  public int getIdVenda() {
    return idVenda;
  }

  public void setIdVenda(int idVenda) {
    this.idVenda = idVenda;
  }

  public String getSerie() {
    return serie;
  }

  public void setSerie(String serie) {
    this.serie = serie;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public Vendedor getVendedor() {
    return vendedor;
  }

  public void setVendedor(Vendedor vendedor) {
    this.vendedor = vendedor;
  }

  public int getDiaVencimento() {
    return diaVencimento;
  }

  public void setDiaVencimento(int diaVencimento) {
    this.diaVencimento = diaVencimento;
  }

  public List<ItemVenda> getItens() {
    return itens;
  }

  public void setItens(List<ItemVenda> itens) {
    this.itens = itens;
  }

  public List<Receber> getContasReceber() {
    return contasReceber;
  }

  public void setContasReceber(List<Receber> contasReceber) {
    this.contasReceber = contasReceber;
  }

  @Override
  public String toString() {
    return super.toString() + "\n" + this.getSerie() + "\n" + this.getCliente().getCpf() + "\n"
            + this.getVendedor().getCpf() + "\n" + this.getDiaVencimento();
  }
}
