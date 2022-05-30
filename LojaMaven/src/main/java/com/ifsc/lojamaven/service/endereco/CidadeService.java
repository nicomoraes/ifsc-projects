package com.ifsc.lojamaven.service.endereco;

import com.ifsc.lojamaven.model.DAO.endereco.CidadeDAO;
import com.ifsc.lojamaven.model.bo.endereco.Cidade;
import com.ifsc.lojamaven.service.InterfaceService;

import java.util.List;

public class CidadeService implements InterfaceService<Cidade> {

  @Override
  public void salvar(Cidade obj) {
    CidadeDAO.getInstance().create(obj);
  }

  @Override
  public List<Cidade> buscar() {
    return CidadeDAO.getInstance().read();
  }

  @Override
  public Cidade buscar(int codigo) {
    return CidadeDAO.getInstance().read(codigo);
  }

  @Override
  public Cidade buscar(String descricao) {
    return CidadeDAO.getInstance().read(descricao);
  }

  @Override
  public void atualizar(Cidade obj) {
    CidadeDAO.getInstance().update(obj);
  }

  @Override
  public void deletar(Cidade obj) {
    CidadeDAO.getInstance().delete(obj);
  }
}