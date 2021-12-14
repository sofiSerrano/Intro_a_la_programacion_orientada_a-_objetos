package ccepeda.practica5;

public abstract class Oferta {

    private String nombre;
    private String descripcion;

    public Oferta(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public abstract double calcularPrecio();

    public String getNombre() {
        return nombre;
    }
}
