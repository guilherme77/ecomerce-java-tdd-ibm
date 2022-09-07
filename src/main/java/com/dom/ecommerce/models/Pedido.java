package com.dom.ecommerce.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Pedido {

    private int idCliente;
    private double valorTotal;
    private LocalDateTime data;
    public int getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    public LocalDateTime getData() {
        return data;
    }
    public void setData(LocalDateTime data) {
        this.data = data;
    }
}
