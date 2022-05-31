package com.ifsc.lojamaven.service.produto;

import java.util.List;

import com.ifsc.lojamaven.model.DAO.produto.TipoProdutoDAO;
import com.ifsc.lojamaven.model.bo.produto.TipoProduto;

import com.ifsc.lojamaven.service.InterfaceService;

public class TipoProdutoService implements InterfaceService<TipoProduto> {

  @Override
  public void salvar(TipoProduto obj) {
    TipoProdutoDAO.getInstance().create(obj);
  }

  @Override
  public List<TipoProduto> buscar() {
    return TipoProdutoDAO.getInstance().read();
  }

  @Override
  public TipoProduto buscar(int codigo) {
    return TipoProdutoDAO.getInstance().read(codigo);
  }

  @Override
  public TipoProduto buscar(String descricao) {
    return TipoProdutoDAO.getInstance().read(descricao);
  }

  @Override
  public void atualizar(TipoProduto obj) {
    TipoProdutoDAO.getInstance().update(obj);
  }

  @Override
  public void deletar(TipoProduto obj) {
    TipoProdutoDAO.getInstance().delete(obj);
  }
}