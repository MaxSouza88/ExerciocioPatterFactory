package com.exercicioFactory.Exemplo.Factory.model.recebimentos;


public class CalculoRecebimentoFactory {

    public static CalculoRecebimento tipoRecebimento(String tipoRecebimento) {
        if (tipoRecebimento.equalsIgnoreCase("DIN_PIX_CHEQUE")) {
            return new Din_Pix_Cheque();
        } else if (tipoRecebimento.equalsIgnoreCase("CARTAO_DEBITO")) {
            return new Cartao_Debito();
        } else if (tipoRecebimento.equalsIgnoreCase("CARTAO_CREDITO")) {
            return new Cartao_Credito();
        } else if (tipoRecebimento.equalsIgnoreCase("VALE_REFEICAO")) {
            return new Vale_Refeicao();
        }
        else {
            return null;
        }
    }
}

