package com.unisinos.kafkaconsumer.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="pedido")
public class OrderModel {
    @Id
    private Long id;
    @Column(name = "cliente")
    private String client;
    @Column(name = "valor_total")
    private BigDecimal totalValue;
    @Column(name = "status_pagamento")
    private String status;

    /*
    *   CLIENTE VARCHAR(200) NOT NULL,
    VALOR_TOTAL NUMERIC NOT NULL,
    STATUS_PAGAMENTO VARCHAR(200)NOT NULL

    *
    *
    * */
}
