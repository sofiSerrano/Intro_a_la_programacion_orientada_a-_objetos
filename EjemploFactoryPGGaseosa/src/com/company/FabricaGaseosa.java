package com.company;

public class FabricaGaseosa {

    public static Gaseosa crearGaseosas(String tipo){
        switch (tipo){
            case "Coca":
                return new GaseosaCola("Coca");
            case "Naranja":
                return new GaseosaNaranja("Naranja");
            default:
                System.out.println("Ups, no encontramos este objeto para construir");
                return null;
        }
    }
}
