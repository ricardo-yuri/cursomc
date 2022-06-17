package com.ricardo.cursomc.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ItemPedido {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Double desconto;

    @Column
    private Integer quantidade;

    @Column
    private Double preco;

    public ItemPedido () {

    }

    public ItemPedido(Double desconto, Integer quantidade, Double preco) {
        this.desconto = desconto;
        this.quantidade = quantidade;
        this.preco = preco;
    }
}
