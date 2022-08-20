package com.exercicioFactory.Exemplo.Factory.model.pagamentos;


import com.exercicioFactory.Exemplo.Factory.model.PagamentoModel;

import java.math.BigDecimal;

public class PagamentoEmDia implements CalculoPagamentos{

    @Override
    public BigDecimal calculoPagamento(PagamentoModel pagamentoModel) {
        return pagamentoModel.getValorPagamento().subtract(new BigDecimal(String.valueOf(pagamentoModel.getDiferencaPagamento())));
    }
}
