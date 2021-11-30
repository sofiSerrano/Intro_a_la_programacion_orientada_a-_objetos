package com.company;

public class Caja extends Producto{
    private double longitud;
    private double ancho;
    private double altura;

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double CalcularEspacio() {
        return this.longitud * this.ancho *this.altura;
    }
}

