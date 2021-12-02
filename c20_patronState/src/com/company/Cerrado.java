package com.company;

public class Cerrado implements Estado{
    private Carrito c;

    public Cerrado(Carrito c) {
        this.c = c;
    }

    @Override
    public void Volver() {
        System.out.println("No puede volver al estado de Pagar");
    }

    @Override
    public void Seguir() {
        System.out.println("Ha finalizado la compra!!!, no se puede regresar");
    }

    @Override
    public void Cancelar() {
        System.out.println("No puede Cancelar porque ya se hizo el pago");
    }

    @Override
    public void Agregar(Producto producto) {

    }

    @Override
    public String toString() {
        return "Cerrado{" +
                "c=" + c +
                '}';
    }
}
