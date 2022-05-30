package com.ifsc.lojamaven.model.DAO.pessoa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ifsc.lojamaven.model.bo.pessoa.Vendedor;

import com.ifsc.lojamaven.model.DAO.InterfaceDAO;

public class VendedorDAO implements InterfaceDAO<Vendedor> {

  private static VendedorDAO instance;
  protected EntityManager entityManager;

  public static VendedorDAO getInstance(){
    if(instance == null){
      instance = new VendedorDAO();
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

  public VendedorDAO(){
    entityManager = getEntityManager();
  }

  @Override
  public void create(Vendedor obj) {
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
  public List<Vendedor> read() {
    List<Vendedor> VendedorList;
    VendedorList = entityManager.createQuery("SELECT b from Vendedor b", Vendedor.class).getResultList();
    return VendedorList;
  }

  @Override
  public Vendedor read(int codigo) {
    return entityManager.find(Vendedor.class, codigo);
  }

  @Override
  public Vendedor read(String descricao) {
    return entityManager.find(Vendedor.class, descricao);
  }

  @Override
  public void update(Vendedor obj) {
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
  public void delete(Vendedor obj) {
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