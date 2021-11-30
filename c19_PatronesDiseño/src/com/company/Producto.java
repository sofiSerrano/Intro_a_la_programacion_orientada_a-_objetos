package com.company;

public abstract  class Producto {
    private Double peso;

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
    public abstract double CalcularEspacio();
}
