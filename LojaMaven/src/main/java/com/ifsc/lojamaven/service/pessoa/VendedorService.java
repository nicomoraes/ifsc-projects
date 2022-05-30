package com.ifsc.lojamaven.service.pessoa;

import java.util.List;

import com.ifsc.lojamaven.model.DAO.pessoa.VendedorDAO;
import com.ifsc.lojamaven.model.bo.pessoa.Vendedor;

import com.ifsc.lojamaven.service.InterfaceService;

public class VendedorService implements InterfaceService<Vendedor> {

  @Override
  public void salvar(Vendedor obj) {
    VendedorDAO.getInstance().create(obj);
  }

  @Override
  public List<Vendedor> buscar() {
    return VendedorDAO.getInstance().read();
  }

  @Override
  public Vendedor buscar(int codigo) {
    return VendedorDAO.getInstance().read(codigo);
  }

  @Override
  public Vendedor buscar(String descricao) {
    return VendedorDAO.getInstance().read(descricao);
  }

  @Override
  public void atualizar(Vendedor obj) {
    VendedorDAO.getInstance().update(obj);
  }

  @Override
  public void deletar(Vendedor obj) {
    VendedorDAO.getInstance().delete(obj);
  }
}