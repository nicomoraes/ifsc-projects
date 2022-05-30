package com.ifsc.lojamaven.model.DAO.pessoa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ifsc.lojamaven.model.bo.pessoa.Cliente;

import com.ifsc.lojamaven.model.DAO.InterfaceDAO;

public class ClienteDAO implements InterfaceDAO<Cliente> {

  private static ClienteDAO instance;
  protected EntityManager entityManager;

  public static ClienteDAO getInstance(){
    if(instance == null){
      instance = new ClienteDAO();
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

  public ClienteDAO(){
    entityManager = getEntityManager();
  }

  @Override
  public void create(Cliente obj) {
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
  public List<Cliente> read() {
    List<Cliente> ClienteList;
    ClienteList = entityManager.createQuery("SELECT b from Cliente b", Cliente.class).getResultList();
    return ClienteList;
  }

  @Override
  public Cliente read(int codigo) {
    return entityManager.find(Cliente.class, codigo);
  }

  @Override
  public Cliente read(String descricao) {
    return entityManager.find(Cliente.class, descricao);
  }

  @Override
  public void update(Cliente obj) {
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
  public void delete(Cliente obj) {
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