public class Medico {
    private String nombre;
    private String especialidad;
    private double sueldoMensual;

    public Medico () {}

    public Medico(String nombre, String especialidad, double sueldoMensual) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.sueldoMensual = sueldoMensual;
    }

    // set

    public void setNombre(String nombre) {
       this.nombre = nombre;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }


    // get

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }
}
