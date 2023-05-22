public class Enfermero {
    private String nombre;
    private String tipo;
    private double sueldoMensual;

    public Enfermero() {}

    public Enfermero(String nombre, String tipo, double sueldoMensual) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.sueldoMensual = sueldoMensual;
    }

    // set

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    // get


    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }
}
