package com.ifsc.lojamaven.model.DAO.pessoa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ifsc.lojamaven.model.bo.pessoa.FoneFornecedor;

import com.ifsc.lojamaven.model.DAO.InterfaceDAO;

public class FoneFornecedorDAO{

  private static FoneFornecedorDAO instance;
  protected EntityManager entityManager;

  public static FoneFornecedorDAO getInstance(){
    if(instance == null){
      instance = new FoneFornecedorDAO();
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

  public FoneFornecedorDAO(){
    entityManager = getEntityManager();
  }

  public void create(FoneFornecedor obj) {
    try{
      entityManager.getTransaction().begin();
      entityManager.persist(obj);
      entityManager.getTransaction().commit();

    } catch (Exception exception) {
      exception.printStackTrace();
      entityManager.getTransaction().rollback();
    }
  }

  public List<FoneFornecedor> readByFornecedor(int codigo) {
    List<FoneFornecedor> FoneFornecedorList;
    FoneFornecedorList = entityManager.createQuery(
            "SELECT f FROM FoneFornecedor f WHERE f.fornecedor.idFornecedor = :fornecedor",
               FoneFornecedor.class
            )
            .setParameter("fornecedor", codigo)
            .getResultList();
    return FoneFornecedorList;
  }

  public FoneFornecedor read(int codigo) {
    return entityManager.find(FoneFornecedor.class, codigo);
  }

  public FoneFornecedor read(String descricao) {
    return entityManager.find(FoneFornecedor.class, descricao);
  }

  public void update(FoneFornecedor obj) {
    try{
      entityManager.getTransaction().begin();
      entityManager.merge(obj);
      entityManager.getTransaction().commit();
    } catch (Exception exception){
      exception.printStackTrace();
      entityManager.getTransaction().rollback();
    }
  }

  public void delete(FoneFornecedor obj) {
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