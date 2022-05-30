package com.ifsc.lojamaven.model.DAO;

import java.util.List;

public interface InterfaceDAO<T> {
    
    void create(T objeto);
    List<T> read();
    T read(int codigo);
    T read(String descricao);
    void update(T objeto);
    void delete(T objeto);
}
