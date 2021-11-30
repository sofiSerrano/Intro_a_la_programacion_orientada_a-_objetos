package com.company;
import java.util.ArrayList;

public class Almacen {
    private ArrayList<Producto> producto;
    public Almacen(){
        producto = new ArrayList<>();

    }
    public double CalcularEspacioNecesario(){
        double total=0;
        for (Producto prod:producto)
            total+=prod.CalcularEspacio();
        return total;
    }
}
