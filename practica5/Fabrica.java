package ccepeda.practica5;

public class Fabrica {

    private static Fabrica fabrica;

    private Fabrica() {
    }

    public static Fabrica getInstance() {
        if (fabrica == null)
            fabrica = new Fabrica();
        return fabrica;
    }

    public Oferta crearOferta(String tipo, String nombre, String descripcion) {
        Oferta oferta = null;
        switch (tipo) {
            case "Carrera":
                oferta = new Carrera(nombre, descripcion);
                break;
            case "Curso":
                oferta = new Curso(nombre, descripcion);
                break;
            case "Taller":
                oferta = new Taller(nombre, descripcion);
                break;
            case "Programa":
                oferta = new Programa(nombre, descripcion);
                break;
        }
        return oferta;
    }
}
