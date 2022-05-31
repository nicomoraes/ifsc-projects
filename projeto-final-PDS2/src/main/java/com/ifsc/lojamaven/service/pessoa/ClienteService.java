package com.ifsc.lojamaven.service.pessoa;

import java.util.List;

import com.ifsc.lojamaven.model.DAO.pessoa.ClienteDAO;
import com.ifsc.lojamaven.model.bo.pessoa.Cliente;

import com.ifsc.lojamaven.service.InterfaceService;

public class ClienteService implements InterfaceService<Cliente> {

  @Override
  public void salvar(Cliente obj) {
    ClienteDAO.getInstance().create(obj);
  }

  @Override
  public List<Cliente> buscar() {
    return ClienteDAO.getInstance().read();
  }

  @Override
  public Cliente buscar(int codigo) {
    return ClienteDAO.getInstance().read(codigo);
  }

  @Override
  public Cliente buscar(String descricao) {
    return ClienteDAO.getInstance().read(descricao);
  }

  @Override
  public void atualizar(Cliente obj) {
    ClienteDAO.getInstance().update(obj);
  }

  @Override
  public void deletar(Cliente obj) {
    ClienteDAO.getInstance().delete(obj);
  }
}