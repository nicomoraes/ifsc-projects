package com.ifsc.lojamaven.model.DAO.produto;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ifsc.lojamaven.model.bo.endereco.Cep;
import com.ifsc.lojamaven.model.bo.produto.Marca;

import com.ifsc.lojamaven.model.DAO.InterfaceDAO;

public class MarcaDAO implements InterfaceDAO<Marca> {

  private static MarcaDAO instance;
  protected EntityManager entityManager;

  public static MarcaDAO getInstance(){
    if(instance == null){
      instance = new MarcaDAO();
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

  public MarcaDAO(){
    entityManager = getEntityManager();
  }

  @Override
  public void create(Marca obj) {
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
  public List<Marca> read() {
    List<Marca> MarcaList;
    MarcaList = entityManager.createQuery("SELECT b from Marca b", Marca.class).getResultList();
    return MarcaList;
  }

  @Override
  public Marca read(int codigo) {
    return entityManager.find(Marca.class, codigo);
  }

  @Override
  public Marca read(String descricao) {
    Marca marca = entityManager.createQuery(
            "SELECT m from Marca m WHERE m.descricao LIKE :marcaDescricao", Marca.class
            )
            .setParameter("marcaDescricao", descricao)
            .getSingleResult();
    return marca;
  }

  @Override
  public void update(Marca obj) {
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
  public void delete(Marca obj) {
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