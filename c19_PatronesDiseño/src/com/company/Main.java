package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Almacen almacen = new Almacen();
        double totalEspacio = almacen.CalcularEspacioNecesario();
        System.out.println("Total de espacio necesario: ");
        System.out.println(totalEspacio);
    }
}
