package com.ifsc.lojamaven.model.DAO.produto;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ifsc.lojamaven.model.bo.produto.Cor;

import com.ifsc.lojamaven.model.DAO.InterfaceDAO;

public class CorDAO implements InterfaceDAO<Cor> {

  private static CorDAO instance;
  protected EntityManager entityManager;

  public static CorDAO getInstance(){
    if(instance == null){
      instance = new CorDAO();
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

  public CorDAO(){
    entityManager = getEntityManager();
  }

  @Override
  public void create(Cor obj) {
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
  public List<Cor> read() {
    List<Cor> CorList;
    CorList = entityManager.createQuery("SELECT b from Cor b", Cor.class).getResultList();
    return CorList;
  }

  @Override
  public Cor read(int codigo) {
    return entityManager.find(Cor.class, codigo);
  }

  @Override
  public Cor read(String descricao) {
    Cor cor = entityManager.createQuery("SELECT c from Cor c WHERE c.descricao LIKE :corNome", Cor.class)
            .setParameter("corNome", descricao)
            .getSingleResult();
    return cor;
  }

  @Override
  public void update(Cor obj) {
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
  public void delete(Cor obj) {
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