package ccepeda.practica5;

import java.util.ArrayList;
import java.util.List;

public class Programa extends Oferta {

    private List<Curso> listaCursos;
    private double porcentaje;

    public Programa(String nombre, String descripcion) {
        super(nombre, descripcion);
    }

    public Programa(String nombre, String descripcion, double porcentaje) {
        super(nombre, descripcion);
        this.porcentaje = porcentaje;
        this.listaCursos = new ArrayList<>();
    }

    public void agregarCurso(Curso curso) {
        this.listaCursos.add(curso);
    }

    @Override
    public double calcularPrecio() {
        double total = 0;
        for (Curso curso : listaCursos) {
            total += curso.calcularPrecio();
        }
        return total - (total * porcentaje) / 100;
    }
}
