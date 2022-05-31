package com.ifsc.lojamaven.service;

import java.util.List;

public interface InterfaceService<T> {
  void salvar(T objeto);

  List<T> buscar();

  T buscar(int codigo);

  T buscar(String descricao);

  void atualizar(T objeto);

  void deletar(T objeto);
}

