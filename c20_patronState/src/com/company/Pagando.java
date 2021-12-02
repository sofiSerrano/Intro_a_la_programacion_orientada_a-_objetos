package com.company;

public class Pagando implements Estado{
    private Carrito c;

    public Pagando(Carrito c) {
        this.c = c;
    }

    @Override
    public void Volver() {
        this.c.setEstado(new Cargando(this.c));
    }

    @Override
    public void Seguir() {
        this.c.setEstado(new Cerrado(this.c));
    }

    @Override
    public void Cancelar() {
        this.c.setEstado(new Vacio(this.c));
    }

    @Override
    public void Agregar(Producto producto) {
        System.out.println("No puede agregar más productos!!!");
    }


}
