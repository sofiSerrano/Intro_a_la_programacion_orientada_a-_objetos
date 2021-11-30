package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Empresa {
    private List<Reserva> reservas;

    public Empresa(){
        reservas = new ArrayList<>();
    }

    public double recaudacionTotal(){
        double recaudacion =0.0;
        for (Reserva res : reservas){
            recaudacion += res.getPrecio();
        }
        return recaudacion;
    }

    public int cantVecesRecorrida(String estacion){
        List <String> estaciones = Arrays.asList("Buenos Aires", "Luján", "Mercedes", "Suipacha", "Chivilcoy", "Alberti" ,"Bragado");
        if (estacion.contains(estacion)){
            int cantPersonas=0;
            for (Reserva res : reservas){
                if (res)
            }
        }
    }
}
