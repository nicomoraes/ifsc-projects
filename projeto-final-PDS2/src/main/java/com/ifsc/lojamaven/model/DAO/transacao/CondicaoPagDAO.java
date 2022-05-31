package com.ifsc.lojamaven.model.DAO.transacao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ifsc.lojamaven.model.bo.transacao.CondicaoPagamento;
import com.ifsc.lojamaven.model.bo.transacao.CondicaoPagamento;

import com.ifsc.lojamaven.model.DAO.InterfaceDAO;

public class CondicaoPagDAO implements InterfaceDAO<CondicaoPagamento> {

  private static CondicaoPagDAO instance;
  protected EntityManager entityManager;

  public static CondicaoPagDAO getInstance(){
    if(instance == null){
      instance = new CondicaoPagDAO();
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

  public CondicaoPagDAO(){
    entityManager = getEntityManager();
  }

  @Override
  public void create(CondicaoPagamento obj) {
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
  public List<CondicaoPagamento> read() {
    List<CondicaoPagamento> CondicaoPagamentoList;
    CondicaoPagamentoList = entityManager.createQuery("SELECT c from CondicaoPagamento c", CondicaoPagamento.class).getResultList();
    return CondicaoPagamentoList;
  }

  @Override
  public CondicaoPagamento read(int codigo) {
    return entityManager.find(CondicaoPagamento.class, codigo);
  }

  @Override
  public CondicaoPagamento read(String descricao) {
    CondicaoPagamento condicaoPagamento = entityManager.createQuery(
            "SELECT c from CondicaoPagamento c WHERE c.descricao LIKE :condPagamentoNome", CondicaoPagamento.class
            )
            .setParameter("condPagamentoNome", descricao)
            .getSingleResult();
    return condicaoPagamento;
  }

  @Override
  public void update(CondicaoPagamento obj) {
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
  public void delete(CondicaoPagamento obj) {
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