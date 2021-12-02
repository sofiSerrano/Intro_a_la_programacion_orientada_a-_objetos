package com.company;

public class Vacio implements Estado{
    private Carrito c;

    public Vacio(Carrito c) {
        this.c = c;
    }

    @Override
    public void Volver() {

    }

    @Override
    public void Seguir() {
        this.c.setEstado(new Cargando(this.c));
    }

    @Override
    public void Cancelar() {

    }

    @Override
    public void Agregar(Producto producto) {

    }

    @Override
    public String toString() {
        return "Vacio{" +
                "c=" + c +
                '}';
    }

    public Carrito getC() {
        return c;
    }

    public void setC(Carrito c) {
        this.c = c;
    }
}
