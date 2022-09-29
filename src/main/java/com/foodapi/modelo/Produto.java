package com.foodapi.modelo;

import java.math.BigDecimal;

public class Produto {
    private String name;
    private BigDecimal valorTotal;

    public Produto(String name, BigDecimal valorTotal){
        super();
        this.name = name;
        this.valorTotal = valorTotal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }
}
