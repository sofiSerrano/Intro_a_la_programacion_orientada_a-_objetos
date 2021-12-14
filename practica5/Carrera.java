package ccepeda.practica5;

import java.util.ArrayList;
import java.util.List;

public class Carrera extends Oferta {

    private double valorBasico;
    private List<Oferta> listaCursosTalleres;

    public Carrera(String nombre, String descripcion) {
        super(nombre, descripcion);
    }

    public Carrera(String nombre, String descripcion, double valorBasico) {
        super(nombre, descripcion);
        this.valorBasico = valorBasico;
        this.listaCursosTalleres = new ArrayList<>();
    }

    public void agregarCursoOTaller(Oferta oferta) throws Exception {
        if (oferta instanceof Curso) {
            if (((Curso) oferta).getHorasMes() < 10) {
                throw new Exception("No se puede agregar un curso con menos de 10 horas");
            }
        }
        this.listaCursosTalleres.add(oferta);
    }

    @Override
    public double calcularPrecio() {
        double total = 0;
        for (Oferta oferta : listaCursosTalleres) {
            total += oferta.calcularPrecio();
        }
        return valorBasico + total;
    }
}
