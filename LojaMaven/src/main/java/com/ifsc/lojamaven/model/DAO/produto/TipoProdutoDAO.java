package com.ifsc.lojamaven.model.DAO.produto;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ifsc.lojamaven.model.bo.produto.Tamanho;
import com.ifsc.lojamaven.model.bo.produto.TipoProduto;

import com.ifsc.lojamaven.model.DAO.InterfaceDAO;

public class TipoProdutoDAO implements InterfaceDAO<TipoProduto> {

  private static TipoProdutoDAO instance;
  protected EntityManager entityManager;

  public static TipoProdutoDAO getInstance(){
    if(instance == null){
      instance = new TipoProdutoDAO();
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

  public TipoProdutoDAO(){
    entityManager = getEntityManager();
  }

  @Override
  public void create(TipoProduto obj) {
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
  public List<TipoProduto> read() {
    List<TipoProduto> TipoProdutoList;
    TipoProdutoList = entityManager.createQuery("SELECT b from TipoProduto b", TipoProduto.class).getResultList();
    return TipoProdutoList;
  }

  @Override
  public TipoProduto read(int codigo) {
    return entityManager.find(TipoProduto.class, codigo);
  }

  @Override
  public TipoProduto read(String descricao) {
    TipoProduto tipoProd = entityManager.createQuery(
            "SELECT tp from TipoProduto tp WHERE tp.descricao LIKE :tipoProdDescricao", TipoProduto.class
            )
            .setParameter("tipoProdDescricao", descricao)
            .getSingleResult();
    return tipoProd;
  }

  @Override
  public void update(TipoProduto obj) {
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
  public void delete(TipoProduto obj) {
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