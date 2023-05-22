public class Ciudad {

    private String nombre;
    private String provincia;

    public Ciudad () {}

    public Ciudad(String nombre, String provincia) {
        this.nombre = nombre;
        this.provincia = provincia;
    }

    // set

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    // get

    public String getNombre() {
        return nombre;
    }

    public String getProvincia() {
        return provincia;
    }

}