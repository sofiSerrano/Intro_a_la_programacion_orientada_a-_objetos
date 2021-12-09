package com.company;

import java.util.ArrayList;
import java.util.List;

public class Carrito  {
    private List<Comprable> carrito;

    public Carrito() {
        this.carrito = new ArrayList<>();
    }

    public void addCarrito(Comprable comprable){
        carrito.add(comprable);
    }

    public Double calcularPrecioCarrito(){
        Double precioTotal = 0.0;
        for (Comprable comprable : carrito) {
            precioTotal += comprable.calcularPrecio();
        }
        return  precioTotal;

    }

}
