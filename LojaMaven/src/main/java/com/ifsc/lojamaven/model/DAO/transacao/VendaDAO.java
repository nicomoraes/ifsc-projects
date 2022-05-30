package com.ifsc.lojamaven.model.DAO.transacao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ifsc.lojamaven.model.DAO.InterfaceDAO;
import com.ifsc.lojamaven.model.bo.transacao.Venda;

public class VendaDAO implements InterfaceDAO<Venda> {

  private static VendaDAO instance;
  protected EntityManager entityManager;

  public static VendaDAO getInstance(){
    if(instance == null){
      instance = new VendaDAO();
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

  public VendaDAO(){
    entityManager = getEntityManager();
  }

  @Override
  public void create(Venda obj) {
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
  public List<Venda> read() {
    List<Venda> VendaList;
    VendaList = entityManager.createQuery("SELECT b from Venda b", Venda.class).getResultList();
    return VendaList;
  }

  @Override
  public Venda read(int codigo) {
    return entityManager.find(Venda.class, codigo);
  }

  @Override
  public Venda read(String descricao) {
    return entityManager.find(Venda.class, descricao);
  }

  @Override
  public void update(Venda obj) {
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
  public void delete(Venda obj) {
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