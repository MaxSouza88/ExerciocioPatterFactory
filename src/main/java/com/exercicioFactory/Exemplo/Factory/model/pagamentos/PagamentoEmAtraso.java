package com.exercicioFactory.Exemplo.Factory.model.pagamentos;

import com.exercicioFactory.Exemplo.Factory.model.PagamentoModel;

import java.math.BigDecimal;

public class PagamentoEmAtraso implements CalculoPagamentos{


    @Override
    public BigDecimal calculoPagamento(PagamentoModel pagamentoModel) {
        return pagamentoModel.getValorPagamento().add(new BigDecimal(String.valueOf(pagamentoModel.getDiferencaPagamento())));
    }
}
