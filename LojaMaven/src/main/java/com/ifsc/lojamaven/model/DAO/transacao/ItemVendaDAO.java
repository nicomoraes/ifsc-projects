package com.ifsc.lojamaven.model.DAO.transacao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ifsc.lojamaven.model.bo.transacao.ItemVenda;

import com.ifsc.lojamaven.model.DAO.InterfaceDAO;

public class ItemVendaDAO implements InterfaceDAO<ItemVenda> {

  private static ItemVendaDAO instance;
  protected EntityManager entityManager;

  public static ItemVendaDAO getInstance(){
    if(instance == null){
      instance = new ItemVendaDAO();
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

  public ItemVendaDAO(){
    entityManager = getEntityManager();
  }

  @Override
  public void create(ItemVenda obj) {
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
  public List<ItemVenda> read() {
    List<ItemVenda> ItemVendaList;
    ItemVendaList = entityManager.createQuery("SELECT b from ItemVenda b", ItemVenda.class).getResultList();
    return ItemVendaList;
  }

  @Override
  public ItemVenda read(int codigo) {
    return entityManager.find(ItemVenda.class, codigo);
  }

  @Override
  public ItemVenda read(String descricao) {
    return entityManager.find(ItemVenda.class, descricao);
  }

  @Override
  public void update(ItemVenda obj) {
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
  public void delete(ItemVenda obj) {
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