package org.example;

import java.time.LocalDate;

public class Pedido {
    private String nome;
    private LocalDate data;
    private double total;
    private int id;

    public Pedido(String nome, LocalDate data, double total) {
        this.nome = nome;
        this.data = data;
        this.total = total;
        this.id = id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}