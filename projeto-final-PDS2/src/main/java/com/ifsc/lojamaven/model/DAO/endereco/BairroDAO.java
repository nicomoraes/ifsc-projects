package com.ifsc.lojamaven.model.DAO.endereco;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ifsc.lojamaven.model.bo.endereco.Bairro;

import com.ifsc.lojamaven.model.DAO.InterfaceDAO;
import com.ifsc.lojamaven.model.bo.endereco.Bairro;

public class BairroDAO implements InterfaceDAO<Bairro> {

  private static BairroDAO instance;
  protected EntityManager entityManager;

  public static BairroDAO getInstance(){
    if(instance == null){
      instance = new BairroDAO();
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

  public BairroDAO(){
    entityManager = getEntityManager();
  }

  @Override
  public void create(Bairro obj) {
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
  public List<Bairro> read() {
    List<Bairro> BairroList;
    BairroList = entityManager.createQuery("SELECT b from Bairro b", Bairro.class).getResultList();
    return BairroList;
  }

  @Override
  public Bairro read(int codigo) {
    return entityManager.find(Bairro.class, codigo);
  }

  @Override
  public Bairro read(String descricao) {
    Bairro bairro = entityManager.createQuery("SELECT b from Bairro b WHERE b.descricao LIKE :bairroNome", Bairro.class)
            .setParameter("bairroNome", descricao)
            .getSingleResult();
    return bairro;
  }

  @Override
  public void update(Bairro obj) {
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
  public void delete(Bairro obj) {
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