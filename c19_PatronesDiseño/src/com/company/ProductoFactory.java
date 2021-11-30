package com.company;

public class ProductoFactory {
    private static ProductoFactory instance;
    private ProductoFactory(){

    }
    public static ProductoFactory getInstance(){
        if(instance == null)
            instance = new ProductoFactory();
        return  instance;
    }

    public Producto crearProducto(String cod){
        Producto resultado =null;
        switch (cod) {
            case "pelota":
                resultado = new Pelota();
                break;
            case "caja":
                resultado =  new Caja();
                break;
        }

        return resultado;
    }
}
