package com.ifsc.lojamaven.model.DAO.produto;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ifsc.lojamaven.model.bo.produto.Produto;
import com.ifsc.lojamaven.model.bo.produto.Produto;

import com.ifsc.lojamaven.model.DAO.InterfaceDAO;

public class ProdutoDAO implements InterfaceDAO<Produto> {

  private static ProdutoDAO instance;
  protected EntityManager entityManager;

  public static ProdutoDAO getInstance(){
    if(instance == null){
      instance = new ProdutoDAO();
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

  public ProdutoDAO(){
    entityManager = getEntityManager();
  }

  @Override
  public void create(Produto obj) {
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
  public List<Produto> read() {
    List<Produto> ProdutoList;
    ProdutoList = entityManager.createQuery("SELECT p from Produto p", Produto.class).getResultList();
    return ProdutoList;
  }

  @Override
  public Produto read(int codigo) {
    return entityManager.find(Produto.class, codigo);
  }

  @Override
  public Produto read(String descricao) {
    Produto produto = entityManager.createQuery(
                    "SELECT p from Produto p WHERE p.descricao LIKE :produtoDescricao", Produto.class
            )
            .setParameter("produtoDescricao", descricao)
            .getSingleResult();
    return produto;
  }

  @Override
  public void update(Produto obj) {
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
  public void delete(Produto obj) {
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