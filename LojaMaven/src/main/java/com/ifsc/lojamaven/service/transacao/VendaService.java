package com.ifsc.lojamaven.service.transacao;

import java.util.List;

import com.ifsc.lojamaven.model.DAO.transacao.VendaDAO;

import com.ifsc.lojamaven.model.bo.transacao.Venda;
import com.ifsc.lojamaven.service.InterfaceService;

public class VendaService implements InterfaceService<Venda> {

  @Override
  public void salvar(Venda obj) {
    VendaDAO.getInstance().create(obj);
  }

  @Override
  public List<Venda> buscar() {
    return VendaDAO.getInstance().read();
  }

  @Override
  public Venda buscar(int codigo) {
    return VendaDAO.getInstance().read(codigo);
  }

  @Override
  public Venda buscar(String descricao) {
    return VendaDAO.getInstance().read(descricao);
  }

  @Override
  public void atualizar(Venda obj) {
    VendaDAO.getInstance().update(obj);
  }

  @Override
  public void deletar(Venda obj) {
    VendaDAO.getInstance().delete(obj);
  }
}