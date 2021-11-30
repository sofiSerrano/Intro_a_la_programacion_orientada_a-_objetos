package com.company;

import java.util.Date;

public class Campo extends Propiedad{
    private Boolean tieneCasco;

    private int CantidadHectareas;

    public Campo(Date fechaAdquerida, Double PrecioUsd, String Direccion, Boolean Marca) {
        super(fechaAdquerida, PrecioUsd, Direccion, Marca);
    }

    public int getCantidadHectareas(){
        return CantidadHectareas;
    }

    public void setCantidadHectareas(int cantidadHectareas){
        this.CantidadHectareas=cantidadHectareas;
    }

    public boolean AptoCultivo(){
        return this.getCantidadHectareas() > 10;
    }

}
