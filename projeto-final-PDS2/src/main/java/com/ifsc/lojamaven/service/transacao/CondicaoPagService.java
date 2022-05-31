package com.ifsc.lojamaven.service.transacao;

import java.util.List;

import com.ifsc.lojamaven.model.DAO.transacao.CondicaoPagDAO;
import com.ifsc.lojamaven.model.bo.transacao.CondicaoPagamento;

import com.ifsc.lojamaven.service.InterfaceService;

public class CondicaoPagService implements InterfaceService<CondicaoPagamento> {

  @Override
  public void salvar(CondicaoPagamento obj) {
    CondicaoPagDAO.getInstance().create(obj);
  }

  @Override
  public List<CondicaoPagamento> buscar() {
    return CondicaoPagDAO.getInstance().read();
  }

  @Override
  public CondicaoPagamento buscar(int codigo) {
    return CondicaoPagDAO.getInstance().read(codigo);
  }

  @Override
  public CondicaoPagamento buscar(String descricao) {
    return CondicaoPagDAO.getInstance().read(descricao);
  }

  @Override
  public void atualizar(CondicaoPagamento obj) {
    CondicaoPagDAO.getInstance().update(obj);
  }

  @Override
  public void deletar(CondicaoPagamento obj) {
    CondicaoPagDAO.getInstance().delete(obj);
  }
}