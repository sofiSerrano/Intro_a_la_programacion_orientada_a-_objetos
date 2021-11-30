package com.company;

public class Pelota extends Producto{
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double CalcularEspacio() {
        return radio*3.14;
    }
}
