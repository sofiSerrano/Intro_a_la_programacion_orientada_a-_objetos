package ccepeda.practica5;

public class Main {

    public static void main(String[] args) {

        Intitucion intitucion = new Intitucion();

        Curso frontEnd = new Curso("FrontEnd", "Curso frontend", 16, 2, 1000);
        intitucion.agregarOferta(frontEnd);

        Curso backend = new Curso("Backend", "Curso backend", 20, 2, 900);
        intitucion.agregarOferta(backend);

        Programa programa = new Programa("FullStack", "programa completo de deasrrollo", 20);
        programa.agregarCurso(frontEnd);
        programa.agregarCurso(backend);
        intitucion.agregarOferta(programa);

        //--------- parte 2 --------
        Taller taller = new Taller("Scrum", "metodologia agil", 10, 1000);
        Carrera ingenieria = new Carrera("Ingenieroa", "ingenieria", 2000);
        Curso matematicas = new Curso("Matematicas", "matematicas", 19, 2, 200);
        try {
            ingenieria.agregarCursoOTaller(taller);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            ingenieria.agregarCursoOTaller(matematicas);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        intitucion.agregarOferta(ingenieria);

        System.out.println("..........");
        intitucion.generarInforme();

    }
}
