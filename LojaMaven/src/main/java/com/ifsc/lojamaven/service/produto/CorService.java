package com.ifsc.lojamaven.service.produto;

import java.util.List;

import com.ifsc.lojamaven.model.DAO.produto.CorDAO;
import com.ifsc.lojamaven.model.bo.produto.Cor;

import com.ifsc.lojamaven.service.InterfaceService;

public class CorService implements InterfaceService<Cor> {

  @Override
  public void salvar(Cor obj) {
    CorDAO.getInstance().create(obj);
  }

  @Override
  public List<Cor> buscar() {
    return CorDAO.getInstance().read();
  }

  @Override
  public Cor buscar(int codigo) {
    return CorDAO.getInstance().read(codigo);
  }

  @Override
  public Cor buscar(String descricao) {
    return CorDAO.getInstance().read(descricao);
  }

  @Override
  public void atualizar(Cor obj) {
    CorDAO.getInstance().update(obj);
  }

  @Override
  public void deletar(Cor obj) {
    CorDAO.getInstance().delete(obj);
  }
}