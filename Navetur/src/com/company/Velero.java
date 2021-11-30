package com.company;

import java.util.Date;

public class Velero extends Embarcacion{
    private int cantMastiles;

    public Velero(Double precioBase, Double valorAdicional, Date anioFabricacion, Double eslora, Capitan capitan, int cantMastiles) {
        super(precioBase, valorAdicional, anioFabricacion, eslora, capitan);
        this.cantMastiles = cantMastiles;
    }

    // esGrande() boolean <-- to do
}
