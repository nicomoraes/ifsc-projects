package com.ifsc.lojamaven.service.produto;

import java.util.List;

import com.ifsc.lojamaven.model.DAO.produto.TamanhoDAO;
import com.ifsc.lojamaven.model.bo.produto.Tamanho;

import com.ifsc.lojamaven.service.InterfaceService;

public class TamanhoService implements InterfaceService<Tamanho> {

  @Override
  public void salvar(Tamanho obj) {
    TamanhoDAO.getInstance().create(obj);
  }

  @Override
  public List<Tamanho> buscar() {
    return TamanhoDAO.getInstance().read();
  }

  @Override
  public Tamanho buscar(int codigo) {
    return TamanhoDAO.getInstance().read(codigo);
  }

  @Override
  public Tamanho buscar(String descricao) {
    return TamanhoDAO.getInstance().read(descricao);
  }

  @Override
  public void atualizar(Tamanho obj) {
    TamanhoDAO.getInstance().update(obj);
  }

  @Override
  public void deletar(Tamanho obj) {
    TamanhoDAO.getInstance().delete(obj);
  }
}