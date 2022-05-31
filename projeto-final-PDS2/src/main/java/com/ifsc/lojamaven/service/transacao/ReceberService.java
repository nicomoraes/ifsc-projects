package com.ifsc.lojamaven.service.transacao;

import com.ifsc.lojamaven.model.DAO.transacao.ReceberDAO;
import com.ifsc.lojamaven.model.bo.transacao.Receber;

public class ReceberService {
  public void salvar(Receber obj) {
    ReceberDAO.getInstance().create(obj);
  }
}
