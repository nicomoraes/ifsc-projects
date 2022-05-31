package com.ifsc.lojamaven.model.DAO.endereco;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ifsc.lojamaven.model.bo.endereco.Bairro;
import com.ifsc.lojamaven.model.bo.endereco.Cep;

import com.ifsc.lojamaven.model.DAO.InterfaceDAO;

public class CepDAO implements InterfaceDAO<Cep> {

  private static CepDAO instance;
  protected EntityManager entityManager;

  public static CepDAO getInstance(){
    if(instance == null){
      instance = new CepDAO();
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

  public CepDAO(){
    entityManager = getEntityManager();
  }

  @Override
  public void create(Cep obj) {
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
  public List<Cep> read() {
    List<Cep> CepList;
    CepList = entityManager.createQuery("SELECT cep from Cep cep", Cep.class).getResultList();
    return CepList;
  }

  @Override
  public Cep read(int codigo) {
    return entityManager.find(Cep.class, codigo);
  }

  @Override
  public Cep read(String descricao) {
    Cep cep = entityManager.createQuery(
            "SELECT c from Cep c WHERE c.cep LIKE :cepDescricao", Cep.class
            )
            .setParameter("cepDescricao", descricao)
            .getSingleResult();
    return cep;
  }

  @Override
  public void update(Cep obj) {
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
  public void delete(Cep obj) {
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