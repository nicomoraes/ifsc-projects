package com.ifsc.lojamaven.service.transacao;

import com.ifsc.lojamaven.model.DAO.transacao.ItemVendaDAO;
import com.ifsc.lojamaven.model.bo.transacao.ItemVenda;

public class ItemVendaService {
  public void salvar(ItemVenda obj) {
    ItemVendaDAO.getInstance().create(obj);
  }
}
