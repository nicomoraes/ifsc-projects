package com.ifsc.lojamaven.model.DAO.produto;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ifsc.lojamaven.model.bo.produto.CaractProd;

import com.ifsc.lojamaven.model.DAO.InterfaceDAO;
import com.ifsc.lojamaven.model.bo.produto.CaractProd;

public class CaractProdDAO implements InterfaceDAO<CaractProd> {

  private static CaractProdDAO instance;
  protected EntityManager entityManager;

  public static CaractProdDAO getInstance(){
    if(instance == null){
      instance = new CaractProdDAO();
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

  public CaractProdDAO(){
    entityManager = getEntityManager();
  }

  @Override
  public void create(CaractProd obj) {
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
  public List<CaractProd> read() {
    List<CaractProd> CaractProdList;
    CaractProdList = entityManager.createQuery("SELECT b from CaractProd b", CaractProd.class).getResultList();
    return CaractProdList;
  }

  @Override
  public CaractProd read(int codigo) {
    return entityManager.find(CaractProd.class, codigo);
  }

  @Override
  public CaractProd read(String descricao) {
    CaractProd caractProd = entityManager.createQuery(
                    "SELECT cp from CaractProd cp WHERE cp.barraProduto LIKE :cdgDeBarra", CaractProd.class
            )
            .setParameter("cdgDeBarra", descricao)
            .getSingleResult();
    return caractProd;
  }

  @Override
  public void update(CaractProd obj) {
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
  public void delete(CaractProd obj) {
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