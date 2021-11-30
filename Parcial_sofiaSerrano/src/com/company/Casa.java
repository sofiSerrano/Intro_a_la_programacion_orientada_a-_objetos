package com.company;

import javax.swing.text.StyledEditorKit;
import java.util.Date;

public class Casa extends Propiedad implements Comparable{

    private int cantidadAmbientes;
    private Double cantidadMetros;

    public Casa(int cantidadAmbientes, Double cantidadMetros){
        super(fechaAdquerida, PrecioUsd, Direccion,Marca);
        this.cantidadAmbientes=cantidadAmbientes;
        this.cantidadMetros=cantidadMetros;
    }


    public int getCantidadAmbientes(){
        return cantidadAmbientes;
    }

    public void setCantidadAmbientes(int cantidadAmbientes){
        this.cantidadAmbientes=cantidadAmbientes;
    }

    @Override
    public int compareTo(Object y2) {

        return this.cantidadAmbientes- ((Casa)y2).getCantidadAmbientes();
    }


}
