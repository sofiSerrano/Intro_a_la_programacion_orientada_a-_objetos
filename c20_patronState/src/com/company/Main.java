package com.company;

public class Main {

    public static void main(String[] args) {

        Carrito carrito = new Carrito();

        carrito.setEstado(new Vacio(carrito));
        

    }
}
