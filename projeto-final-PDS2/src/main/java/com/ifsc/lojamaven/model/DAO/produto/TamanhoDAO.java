package com.ifsc.lojamaven.model.DAO.produto;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ifsc.lojamaven.model.bo.produto.Marca;
import com.ifsc.lojamaven.model.bo.produto.Tamanho;

import com.ifsc.lojamaven.model.DAO.InterfaceDAO;

public class TamanhoDAO implements InterfaceDAO<Tamanho> {

  private static TamanhoDAO instance;
  protected EntityManager entityManager;

  public static TamanhoDAO getInstance(){
    if(instance == null){
      instance = new TamanhoDAO();
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

  public TamanhoDAO(){
    entityManager = getEntityManager();
  }

  @Override
  public void create(Tamanho obj) {
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
  public List<Tamanho> read() {
    List<Tamanho> TamanhoList;
    TamanhoList = entityManager.createQuery("SELECT t from Tamanho t", Tamanho.class).getResultList();
    return TamanhoList;
  }

  @Override
  public Tamanho read(int codigo) {
    return entityManager.find(Tamanho.class, codigo);
  }

  @Override
  public Tamanho read(String descricao) {
    Tamanho tamanho = entityManager.createQuery(
      "SELECT t from Tamanho t WHERE t.descricao LIKE :tamanhoDescricao", Tamanho.class
    )
            .setParameter("tamanhoDescricao", descricao)
            .getSingleResult();
    return tamanho;
  }

  @Override
  public void update(Tamanho obj) {
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
  public void delete(Tamanho obj) {
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