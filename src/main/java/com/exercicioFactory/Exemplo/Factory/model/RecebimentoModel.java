package com.exercicioFactory.Exemplo.Factory.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "tipo_recebimento")

public class RecebimentoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRecebimento;

    @Column(name = "status_pagamento", length = 100, nullable = false)
    private String statusDoRecebimento;

    @Column(name = "valor_a_pagar", length = 100, nullable = false)
    private BigDecimal valorAPagar;

    @Column(name = "diferença_valor", length = 100, nullable = false)
    private BigDecimal desconto;

    @Column(name = "valor_pago", length = 100)
    private BigDecimal valorPago;

}


