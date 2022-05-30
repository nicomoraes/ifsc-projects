package com.ifsc.lojamaven.model.DAO.pessoa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ifsc.lojamaven.model.bo.pessoa.Fornecedor;

import com.ifsc.lojamaven.model.DAO.InterfaceDAO;

public class FornecedorDAO implements InterfaceDAO<Fornecedor> {

  private static FornecedorDAO instance;
  protected EntityManager entityManager;

  public static FornecedorDAO getInstance(){
    if(instance == null){
      instance = new FornecedorDAO();
    }
    return instance;
  }

  private EntityManager getEntityManager(){
    EntityManagerFactory factory = Persistence.createEntityManagerFactory(
            "com.ifsc_LojaJPAMaven"
    );

    if(entityManager == null){
      entityManager = factory.createEntityManager();
    }

    return entityManager;
}

  public FornecedorDAO(){
    entityManager = getEntityManager();
  }

  @Override
  public void create(Fornecedor obj) {
    try{
      entityManager.getTransaction().begin();
      entityManager.persist(obj);
      entityManager.getTransaction().commit();

    } catch (Exception exception) {
      exception.printStackTrace();
      entityManager.getTransaction().rollback();
    }
  }

  @Override
  public List<Fornecedor> read() {
    List<Fornecedor> FornecedorList;
    FornecedorList = entityManager.createQuery("SELECT b from Fornecedor b", Fornecedor.class).getResultList();
    return FornecedorList;
  }

  @Override
  public Fornecedor read(int codigo) {
    return entityManager.find(Fornecedor.class, codigo);
  }

  @Override
  public Fornecedor read(String descricao) {
    return entityManager.find(Fornecedor.class, descricao);
  }

  @Override
  public void update(Fornecedor obj) {
    try{
      entityManager.getTransaction().begin();
      entityManager.merge(obj);
      entityManager.getTransaction().commit();
    } catch (Exception exception){
      exception.printStackTrace();
      entityManager.getTransaction().rollback();
    }
  }

  @Override
  public void delete(Fornecedor obj) {
    try{
      entityManager.getTransaction().begin();
      entityManager.remove(obj);
      entityManager.getTransaction().commit();
    } catch (Exception exception){
      exception.printStackTrace();
      entityManager.getTransaction().rollback();
    }
  }
}