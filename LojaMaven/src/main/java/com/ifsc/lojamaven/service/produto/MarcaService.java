package com.ifsc.lojamaven.service.produto;

import java.util.List;

import com.ifsc.lojamaven.model.DAO.produto.MarcaDAO;
import com.ifsc.lojamaven.model.bo.produto.Marca;

import com.ifsc.lojamaven.service.InterfaceService;

public class MarcaService implements InterfaceService<Marca> {

  @Override
  public void salvar(Marca obj) {
    MarcaDAO.getInstance().create(obj);
  }

  @Override
  public List<Marca> buscar() {
    return MarcaDAO.getInstance().read();
  }

  @Override
  public Marca buscar(int codigo) {
    return MarcaDAO.getInstance().read(codigo);
  }

  @Override
  public Marca buscar(String descricao) {
    return MarcaDAO.getInstance().read(descricao);
  }

  @Override
  public void atualizar(Marca obj) {
    MarcaDAO.getInstance().update(obj);
  }

  @Override
  public void deletar(Marca obj) {
    MarcaDAO.getInstance().delete(obj);
  }
}