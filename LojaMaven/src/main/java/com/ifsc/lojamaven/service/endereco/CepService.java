package com.ifsc.lojamaven.service.endereco;

import java.util.List;

import com.ifsc.lojamaven.model.bo.endereco.Cep;

import com.ifsc.lojamaven.service.InterfaceService;
import com.ifsc.lojamaven.model.DAO.endereco.CepDAO;

public class CepService implements InterfaceService<Cep> {

  @Override
  public void salvar(Cep obj) {
    CepDAO.getInstance().create(obj);
  }

  @Override
  public List<Cep> buscar() {
    return CepDAO.getInstance().read();
  }

  @Override
  public Cep buscar(int codigo) {
    return CepDAO.getInstance().read(codigo);
  }

  @Override
  public Cep buscar(String descricao) {
    return CepDAO.getInstance().read(descricao);
  }

  @Override
  public void atualizar(Cep obj) {
    CepDAO.getInstance().update(obj);
  }

  @Override
  public void deletar(Cep obj) {
    CepDAO.getInstance().delete(obj);
  }
}