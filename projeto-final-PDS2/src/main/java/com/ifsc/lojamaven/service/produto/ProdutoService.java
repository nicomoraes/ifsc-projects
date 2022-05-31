package com.ifsc.lojamaven.service.produto;

import java.util.List;

import com.ifsc.lojamaven.model.DAO.produto.ProdutoDAO;
import com.ifsc.lojamaven.model.bo.produto.Produto;

import com.ifsc.lojamaven.service.InterfaceService;

public class ProdutoService implements InterfaceService<Produto> {

  @Override
  public void salvar(Produto obj) {
    ProdutoDAO.getInstance().create(obj);
  }

  @Override
  public List<Produto> buscar() {
    return ProdutoDAO.getInstance().read();
  }

  @Override
  public Produto buscar(int codigo) {
    return ProdutoDAO.getInstance().read(codigo);
  }

  @Override
  public Produto buscar(String descricao) {
    return ProdutoDAO.getInstance().read(descricao);
  }

  @Override
  public void atualizar(Produto obj) {
    ProdutoDAO.getInstance().update(obj);
  }

  @Override
  public void deletar(Produto obj) {
    ProdutoDAO.getInstance().delete(obj);
  }
}