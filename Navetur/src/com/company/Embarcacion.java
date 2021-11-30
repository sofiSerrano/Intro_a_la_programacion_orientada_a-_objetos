package com.company;

import java.util.Date;

public abstract class Embarcacion {
    private Double precioBase;
    private Double valorAdicional;
    private Date anioFabricacion;
    private Double eslora;
    private Capitan capitan;

    public Embarcacion(Double precioBase, Double valorAdicional, Date anioFabricacion, Double eslora, Capitan capitan) {
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anioFabricacion = anioFabricacion;
        this.eslora = eslora;
        this.capitan = capitan;
    }

    public Double calcularAlquiler() {
        return 0.0; // aca va la logica <-- to do
    }
}
