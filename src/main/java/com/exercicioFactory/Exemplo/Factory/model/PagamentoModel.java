package com.exercicioFactory.Exemplo.Factory.model;

import lombok.Data;
import lombok.Getter;
import org.hibernate.type.StringNVarcharType;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "pagamento_registro")

public class PagamentoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoPagamento;

    @Column(name = "status_pagamento", length = 30, nullable = false)
    private String statusPagamento;

    @Column(name = "valor_pagamento", length = 30, nullable = false)
    private BigDecimal valorPagamento;

    @Column(name = "diferenca_valor", length = 30, nullable = false)
    private BigDecimal diferencaPagamento;

    @Column(name = "valor_pago", length = 30)
    private BigDecimal valorPago;

}
