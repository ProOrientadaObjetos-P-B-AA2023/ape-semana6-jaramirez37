public class Hospital {
    private String nombre;
    private Ciudad ciudad;
    private int especialidades;
    private Medico[] medico;
    private Enfermero[] enfermero;
    private double totalPagar;
    private String dirHospital;

    public Hospital(){}

    public Hospital(String nombre, Ciudad ciudad, int especialidades, Medico[] medico, Enfermero[] enfermero, String dirHospital) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.especialidades = especialidades;
        this.medico = medico;
        this.enfermero = enfermero;
        this.dirHospital = dirHospital;
    }

    // set

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public void setEspecialidades(int especialidades) {
        this.especialidades = especialidades;
    }

    public void setMedico(Medico[] medico) {
        this.medico = medico;
    }

    public void setEnfermero(Enfermero[] enfermero) {
        this.enfermero = enfermero;
    }

    public void setDirHospital(String dirHospital) {
        this.dirHospital = dirHospital;
    }

    public void calcularSueldoTotal() {
        for (int i = 0; i < this.medico.length; i++) {
            this.totalPagar += this.medico[i].getSueldoMensual() + this.enfermero[i].getSueldoMensual();
        }
    }

    // get

    public String getNombre() {
        return nombre;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public int getEspecialidades() {
        return especialidades;
    }

    public Medico[] getMedico() {
        return medico;
    }

    public Enfermero[] getEnfermero () {
        return enfermero;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public String getDirHospital() {
        return dirHospital;
    }

    // toString

    public String toString() {
        return String.format("\n"
        +"Dirección: %s"
        +"\nCiudad: %s"
        +"\nProvincia: %s"
        +"\nNúmero de especialidades: %d"
        +"\nListado de médicos: "
        +"\nListado de enfermeros/as: "
        +"\nTotal a pagar: %.2f"
        , this.getNombre(), this.getCiudad().getNombre(), this.getCiudad().getProvincia(), this.getEspecialidades(), this.getMedico(), this.getEnfermero(), this.getTotalPagar());
    }
}
