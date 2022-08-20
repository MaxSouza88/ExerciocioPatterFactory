package com.exercicioFactory.Exemplo.Factory.model.pagamentos;

import com.exercicioFactory.Exemplo.Factory.model.PagamentoModel;

import java.math.BigDecimal;

public interface CalculoPagamentos {

    public BigDecimal calculoPagamento(PagamentoModel pagamentoModel);


}
