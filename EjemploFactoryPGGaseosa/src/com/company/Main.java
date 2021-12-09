package com.company;

public class Main {

    public static void main(String[] args) {

        // Delegar la Responsabildad de crear los objetos que necesito a una fabrica
        Gaseosa gs1 = FabricaGaseosa.crearGaseosas("Coca");
        System.out.println(gs1.toString());
        Gaseosa gs2 = FabricaGaseosa.crearGaseosas("Naranja");
        System.out.println(gs2.toString());
        Gaseosa gs3 = FabricaGaseosa.crearGaseosas("Uva");
        //gs3.toString();

        // PRACTICAR:
        //   1.- Agregar excepciones para manejar la creacion de gaseosas
        //   2.- agregar un nuevo tipo de gaseosa
        //   3.- crear el ojeto del nuevo tipo de gaseosa y mostrarlo


    }
}
