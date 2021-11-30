package com.company;

public class Reserva {
    private String codigo;
    private int Cantviajeros;
    private String estacionOrigen;
    private String estacionDestino;

    public Reserva(String codigo, int cantviajeros, String estacionOrigen, String estacionDestino) {
        this.codigo = codigo;
        Cantviajeros = cantviajeros;
        this.estacionOrigen = estacionOrigen;
        this.estacionDestino = estacionDestino;
    }

    public double getPrecio(){
        if((estacionOrigen.equals("Buenos Aires") && estacionDestino.equals("Bragado")) ||
        (estacionOrigen.equals("Bragado") && estacionDestino.equals("Buenos Aires"))){
            return 0.8 * Cantviajeros * 0.50;
        }
        return Cantviajeros * 0.8;
    }

    public int getCantviajeros() {
        return Cantviajeros;
    }

    public String getEstacionOrigen() {
        return estacionOrigen;
    }

    public String getEstacionDestino() {
        return estacionDestino;
    }
}
