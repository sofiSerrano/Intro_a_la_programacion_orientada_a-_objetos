package com.company;

public class Cargando implements Estado{
    private Carrito c;

    public Cargando(Carrito c) {
        this.c = c;
    }

    @Override
    public void Volver() {
        this.c.setEstado(new Vacio(this.c));
    }

    @Override
    public void Seguir() {
        this.c.setEstado(new Pagando(this.c));

    }

    @Override
    public void Cancelar() {
        this.c.setEstado(new Vacio(this.c));
    }

    @Override
    public void Agregar(Producto producto) {
        this.c.getListaProductos().add(producto);
    }

    @Override
    public String toString() {
        return "Cargando{" +
                "c=" + c +
                '}';
    }
}
