package com.ifsc.lojamaven.model.DAO.transacao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ifsc.lojamaven.model.bo.transacao.Receber;

import com.ifsc.lojamaven.model.DAO.InterfaceDAO;

public class ReceberDAO implements InterfaceDAO<Receber> {

  private static ReceberDAO instance;
  protected EntityManager entityManager;

  public static ReceberDAO getInstance(){
    if(instance == null){
      instance = new ReceberDAO();
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

  public ReceberDAO(){
    entityManager = getEntityManager();
  }

  @Override
  public void create(Receber obj) {
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
  public List<Receber> read() {
    List<Receber> ReceberList;
    ReceberList = entityManager.createQuery("SELECT b from Receber b", Receber.class).getResultList();
    return ReceberList;
  }

  @Override
  public Receber read(int codigo) {
    return entityManager.find(Receber.class, codigo);
  }

  @Override
  public Receber read(String descricao) {
    return entityManager.find(Receber.class, descricao);
  }

  @Override
  public void update(Receber obj) {
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
  public void delete(Receber obj) {
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