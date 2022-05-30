package com.ifsc.lojamaven.model.DAO.endereco;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ifsc.lojamaven.model.bo.endereco.Cidade;

import com.ifsc.lojamaven.model.DAO.InterfaceDAO;

public class CidadeDAO implements InterfaceDAO<Cidade> {

  private static CidadeDAO instance;
  protected EntityManager entityManager;

  public static CidadeDAO getInstance() {
    if (instance == null) {
      instance = new CidadeDAO();
    }
    return instance;
  }

  private EntityManager getEntityManager() {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory(
            "com.ifsc_LojaJPAMaven"
    );

    if (entityManager == null) {
      entityManager = factory.createEntityManager();
    }

    return entityManager;
  }

  public CidadeDAO() {
    entityManager = getEntityManager();
  }

  @Override
  public void create(Cidade obj) {
    try {
      entityManager.getTransaction().begin();
      entityManager.persist(obj);
      entityManager.getTransaction().commit();

    } catch (Exception exception) {
      exception.printStackTrace();
      entityManager.getTransaction().rollback();
    }
  }

  @Override
  public List<Cidade> read() {
    List<Cidade> cidadeList;
    cidadeList = entityManager.createQuery("SELECT c from Cidade c", Cidade.class).getResultList();
    return cidadeList;
  }

  @Override
  public Cidade read(int codigo) {
    return entityManager.find(Cidade.class, codigo);
  }

  @Override
  public Cidade read(String descricao) {
    Cidade cidade = entityManager.createQuery(
                    "SELECT c from Cidade c WHERE c.descricao LIKE :cidadeNome", Cidade.class
            )
            .setParameter("cidadeNome", descricao)
            .getSingleResult();
    return cidade;
  }

  @Override
  public void update(Cidade obj) {
    try {
      entityManager.getTransaction().begin();
      entityManager.merge(obj);
      entityManager.getTransaction().commit();
    } catch (Exception exception) {
      exception.printStackTrace();
      entityManager.getTransaction().rollback();
    }
  }

  @Override
  public void delete(Cidade obj) {
    try {
      entityManager.getTransaction().begin();
      entityManager.remove(obj);
      entityManager.getTransaction().commit();
    } catch (Exception exception) {
      exception.printStackTrace();
      entityManager.getTransaction().rollback();
    }
  }
}