package com.exercicioFactory.Exemplo.Factory.model.pagamentos;

public class CalculoPagamentoFactory {

    public static CalculoPagamentos tipoPagamento(String tipoPagamento) {
        if (tipoPagamento.equalsIgnoreCase("PAGAMENTO_ATRASADO")) {
            return new PagamentoEmAtraso();
        } else if (tipoPagamento.equalsIgnoreCase("PAGAMENTO_EM_DIA")) {
            return new PagamentoEmDia();
        } else {
            return null;
        }
    }
}
