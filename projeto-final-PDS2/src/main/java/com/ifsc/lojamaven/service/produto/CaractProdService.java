package com.ifsc.lojamaven.service.produto;

import java.util.List;

import com.ifsc.lojamaven.model.DAO.produto.CaractProdDAO;
import com.ifsc.lojamaven.model.bo.produto.CaractProd;

import com.ifsc.lojamaven.service.InterfaceService;

public class CaractProdService implements InterfaceService<CaractProd> {

  @Override
  public void salvar(CaractProd obj) {
    CaractProdDAO.getInstance().create(obj);
  }

  @Override
  public List<CaractProd> buscar() {
    return CaractProdDAO.getInstance().read();
  }

  @Override
  public CaractProd buscar(int codigo) {
    return CaractProdDAO.getInstance().read(codigo);
  }

  @Override
  public CaractProd buscar(String descricao) {
    return CaractProdDAO.getInstance().read(descricao);
  }

  @Override
  public void atualizar(CaractProd obj) {
    CaractProdDAO.getInstance().update(obj);
  }

  @Override
  public void deletar(CaractProd obj) {
    CaractProdDAO.getInstance().delete(obj);
  }
}