package com.ifsc.lojamaven.service.endereco;

import java.util.List;

import com.ifsc.lojamaven.model.bo.endereco.Bairro;

import com.ifsc.lojamaven.service.InterfaceService;
import com.ifsc.lojamaven.model.DAO.endereco.BairroDAO;

public class BairroService implements InterfaceService<Bairro> {

  @Override
  public void salvar(Bairro obj) {
    BairroDAO.getInstance().create(obj);
  }

  @Override
  public List<Bairro> buscar() {
    return BairroDAO.getInstance().read();
  }

  @Override
  public Bairro buscar(int codigo) {
    return BairroDAO.getInstance().read(codigo);
  }

  @Override
  public Bairro buscar(String descricao) {
    return BairroDAO.getInstance().read(descricao);
  }

  @Override
  public void atualizar(Bairro obj) {
    BairroDAO.getInstance().update(obj);
  }

  @Override
  public void deletar(Bairro obj) {
    BairroDAO.getInstance().delete(obj);
  }
}