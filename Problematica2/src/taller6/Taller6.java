package taller6;

import java.util.Scanner;

/**
 *
 * @author joseph
 */
class Estudiante {

    private String nombreEstudiante;
    private int edad;
    private Materia materia[];

    public Estudiante() {
    }

    public Estudiante(String nombreEstudiante, int edad, Materia materia[]) {
        this.nombreEstudiante = nombreEstudiante;
        this.edad = edad;
        this.materia = materia;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Materia[] getMateria() {
        return materia;
    }

    public void setMateria(Materia[] materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return String.format("-----ESTUDIANTE-----"
                +"\nNombre: %s"
                + "\nEdad: %d",
                this.nombreEstudiante,
                this.edad);
    }

}

class Materia {

    private String nombreMateria;
    private double notaACD;
    private double notaAPE;
    private double notaAA;
    private double recuperacion;
    private double notaTotal;
    private String estado;

    public Materia() {
    }

    public Materia(String nombreMateria, double notaACD, double notaAPE, double notaAA) {
        this.nombreMateria = nombreMateria;
        this.notaACD = notaACD;
        this.notaAPE = notaAPE;
        this.notaAA = notaAA;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public double getNotaACD() {
        return notaACD;
    }

    public void setNotaACD(double notaACD) {
        this.notaACD = notaACD;
    }

    public double getNotaAPE() {
        return notaAPE;
    }

    public void setNotaAPE(double notaAPE) {
        this.notaAPE = notaAPE;
    }

    public double getNotaAA() {
        return notaAA;
    }

    public void setNotaAA(double notaAA) {
        this.notaAA = notaAA;
    }

    public double getRecuperacion() {
        return recuperacion;
    }

    public void setRecuperacion(double recuperacion) {
        this.recuperacion = recuperacion;
    }

    public double getNotaTotal() {
        return notaTotal;
    }

    public void setNotaTotal(double notaTotal) {
        this.notaTotal = notaTotal;
    }

    public void CalcularNotaTotal() {
        this.notaTotal = this.notaAA + this.notaACD + this.notaAPE;
    }

    public String CalcularEstado() {
        this.estado = this.notaTotal >= 7 ? "Aprobado" : "Reprobado";
        return this.estado;
    }

    public void CalcularRecuperacion() {
        this.notaTotal = this.recuperacion + this.notaTotal * 0.65;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return String.format("Nombre de la Materia: %s"
                + "\nNota ACD: %.2f"
                + "\nNota APE: %.2f"
                + "\nNota AA: %.2f"
                + "\nNota Recuperacion: %.2f"
                + "\nNota Total: %.2f"
                + "\nEstado: %s",
                this.nombreMateria,
                this.notaACD,
                this.notaAPE,
                this.notaAA,
                this.recuperacion,
                this.notaTotal,
                this.estado);
    }

}

public class Taller6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Materia materia1 = new Materia("Programacion Orientada a Objetos", 3.5, 3, 3.5);
        Materia materia2 = new Materia("Estructura de Datos", 3.5, 0, 3);
        Materia materia3 = new Materia("Base de Datos", 3.5, 0, 0);
        Materia materias[] = {materia1, materia2, materia3};
        System.out.println("Ingresa tu nombre, edad y materia: ");
        Estudiante est1 = new Estudiante(sc.nextLine(), sc.nextInt(), materias);
        System.out.println(est1);
        for (Materia materiaAux : materias) {
            materiaAux.CalcularNotaTotal();
            materiaAux.CalcularEstado();
            materiaAux.setRecuperacion(materiaAux.getEstado().equals("Reprobado") ? 3 : 0);
            if (materiaAux.getEstado().equals("Reprobado")) {
                materiaAux.CalcularRecuperacion();
                materiaAux.CalcularEstado();
            }
            System.out.println(materiaAux);
        }
    }
}
