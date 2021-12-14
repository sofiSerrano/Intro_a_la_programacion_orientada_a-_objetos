package ccepeda.practica5;

public class Taller extends Oferta {

    private int cantidadTrabajos;
    private double precio;

    public Taller(String nombre, String descripcion) {
        super(nombre, descripcion);
    }

    public Taller(String nombre, String descripcion, int cantidadTrabajos, double precio) {
        super(nombre, descripcion);
        this.cantidadTrabajos = cantidadTrabajos;
        this.precio = precio;
    }

    @Override
    public double calcularPrecio() {
        return cantidadTrabajos * precio;
    }
}
