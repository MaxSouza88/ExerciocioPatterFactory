package com.exercicioFactory.Exemplo.Factory.model.recebimentos;

import com.exercicioFactory.Exemplo.Factory.model.RecebimentoModel;

import java.math.BigDecimal;

public class Din_Pix_Cheque implements CalculoRecebimento{
    @Override
    public BigDecimal calculoRecebimento(RecebimentoModel recebimentoModel) {
        return BigDecimal.ZERO;
    }
}
