package com.exercicioFactory.Exemplo.Factory.model.recebimentos;

import com.exercicioFactory.Exemplo.Factory.model.RecebimentoModel;

import java.math.BigDecimal;

public class Cartao_Debito implements CalculoRecebimento{
    @Override
    public BigDecimal calculoRecebimento(RecebimentoModel recebimentoModel) {
        return recebimentoModel.getValorAPagar().multiply(new BigDecimal("0.025"));
    }
}
