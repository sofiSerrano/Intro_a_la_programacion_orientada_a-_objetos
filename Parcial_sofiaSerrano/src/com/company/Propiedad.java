package com.company;

import java.util.Date;

public abstract class Propiedad {
    private Date FechaAdquerida;
    private Double PrecioUsd;
    private String Direccion;
    private Boolean Marca;
    private Duenio duenio;

    public Propiedad(Date fechaAdquerida,Double PrecioUsd, String Direccion, Boolean Marca) {
        this.FechaAdquerida = fechaAdquerida;
        this.PrecioUsd=PrecioUsd;
        this.Direccion=Direccion;
        this.Marca=Marca;
    }
    public Boolean seVende(){
        return Marca;
    }

    protected Boolean getMarca(){
        return  Marca;
    }

    public Date getFechaAdquerida() {
        return FechaAdquerida;
    }

    public void setFechaAdquerida(Date fechaAdquerida) {
        FechaAdquerida = fechaAdquerida;
    }

    public Double getPrecioUsd() {
        return PrecioUsd;
    }

    public void setPrecioUsd(Double precioUsd) {
        PrecioUsd = precioUsd;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public void setMarca(Boolean marca) {
        Marca = marca;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }
}
