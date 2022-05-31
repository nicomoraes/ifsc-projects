package com.ifsc.lojamaven.service.pessoa;

import java.util.List;

import com.ifsc.lojamaven.model.DAO.pessoa.FoneFornecedorDAO;
import com.ifsc.lojamaven.model.bo.pessoa.FoneFornecedor;

import com.ifsc.lojamaven.service.InterfaceService;

public class FoneFornecedorService{

  public void salvar(FoneFornecedor obj) {
    FoneFornecedorDAO.getInstance().create(obj);
  }

  public List<FoneFornecedor> buscarPorFornecedor(int codigo) {
    return FoneFornecedorDAO.getInstance().readByFornecedor(codigo);
  }

  public FoneFornecedor buscar(int codigo) {
    return FoneFornecedorDAO.getInstance().read(codigo);
  }

  public FoneFornecedor buscar(String descricao) {
    return FoneFornecedorDAO.getInstance().read(descricao);
  }

  public void atualizar(FoneFornecedor obj) {
    FoneFornecedorDAO.getInstance().update(obj);
  }

  public void deletar(FoneFornecedor obj) {
    FoneFornecedorDAO.getInstance().delete(obj);
  }
}