package com.exercicioFactory.Exemplo.Factory.model.recebimentos;

import com.exercicioFactory.Exemplo.Factory.model.RecebimentoModel;

import java.math.BigDecimal;

public interface CalculoRecebimento {

    public BigDecimal calculoRecebimento (RecebimentoModel recebimentoModel);
}
