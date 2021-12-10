package ccepeda.practica5;

import java.util.ArrayList;
import java.util.List;

public class Intitucion {

    private List<Oferta> listaOfertas;

    public Intitucion() {
        this.listaOfertas = new ArrayList<>();
    }

    public void agregarOferta(Oferta oferta) {
        this.listaOfertas.add(oferta);
    }

    public void generarInforme() {
        for (Oferta oferta : listaOfertas) {
            System.out.println(oferta.getNombre() + ", precio :" + oferta.calcularPrecio());
        }
    }

}
