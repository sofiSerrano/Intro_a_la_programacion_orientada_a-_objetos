package com.company;

import java.util.Date;

public class Yate extends Embarcacion implements Comparable{
    private int cantCamarotes;

    public Yate(Double precioBase, Double valorAdicional, Date anioFabricacion, Double eslora, Capitan capitan, int cantCamarotes) {
        super(precioBase, valorAdicional, anioFabricacion, eslora, capitan);
        this.cantCamarotes = cantCamarotes;
    }

    @Override
    public int compareTo(Object o) {
        return 0; // aca va la logica <-- to do
    }
}
