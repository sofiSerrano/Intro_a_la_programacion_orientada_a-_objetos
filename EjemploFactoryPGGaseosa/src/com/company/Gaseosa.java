package com.company;

public abstract class Gaseosa {

    // CLASE ABTRACTA: una propriedad

    private String nombre;

    public Gaseosa(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }
    @Override
    public String toString() {
        return "Gaseosa{" +
                "Abriste una Gaseosa ='" + nombre + '\'' +
                '}';
    }
}
