package ccepeda.practica5;

public class Curso extends Oferta {

    private int horasMes;
    private int meses;
    private double valorHora;

    public Curso(String nombre, String descripcion) {
        super(nombre, descripcion);
    }

    public Curso(String nombre, String descripcion, int horasMes, int meses, double valorHora) {
        super(nombre, descripcion);
        this.horasMes = horasMes;
        this.meses = meses;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularPrecio() {
        return horasMes * meses * valorHora;
    }

    public int getHorasMes() {
        return horasMes;
    }

    public void setHorasMes(int horasMes) {
        this.horasMes = horasMes;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
}
