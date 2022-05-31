package com.ifsc.lojamaven.service.pessoa;

import java.util.List;

import com.ifsc.lojamaven.model.DAO.pessoa.FornecedorDAO;
import com.ifsc.lojamaven.model.bo.pessoa.Fornecedor;

import com.ifsc.lojamaven.service.InterfaceService;

public class FornecedorService implements InterfaceService<Fornecedor> {

  @Override
  public void salvar(Fornecedor obj) {
    FornecedorDAO.getInstance().create(obj);
  }

  @Override
  public List<Fornecedor> buscar() {
    return FornecedorDAO.getInstance().read();
  }

  @Override
  public Fornecedor buscar(int codigo) {
    return FornecedorDAO.getInstance().read(codigo);
  }

  @Override
  public Fornecedor buscar(String descricao) {
    return FornecedorDAO.getInstance().read(descricao);
  }

  @Override
  public void atualizar(Fornecedor obj) {
    FornecedorDAO.getInstance().update(obj);
  }

  @Override
  public void deletar(Fornecedor obj) {
    FornecedorDAO.getInstance().delete(obj);
  }
}