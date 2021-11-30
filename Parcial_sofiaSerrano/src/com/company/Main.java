package com.company;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Comparable casa1 = new Casa(2,1.2);
        Comparable casa2 = new Casa(3,4.5);

        if (casa1.compareTo(casa2) == 0){
            System.out.println("casa1 es igual a casa2");
        }
        else if(casa1.compareTo(casa2) > 0){
            System.out.println("casa1 es mayor a casa2");
        }
        else{
            System.out.println("casa2 es igual a casa1");
        }
        //pruebo los metodos de las clases
        Casa casa = new Casa();
        casa.getDuenio();
        casa.setCantidadAmbientes(2);
        casa.setFechaAdquerida(new Date());
        casa.setDireccion();
        casa.getPrecioUsd();



    }


}
