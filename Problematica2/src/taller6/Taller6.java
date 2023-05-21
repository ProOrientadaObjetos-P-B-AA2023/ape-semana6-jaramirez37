package taller6;

import java.util.Random;
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
                + "\nNombre: %s"
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
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        Materia materia[] = new Materia[100];
        Estudiante estudiante = new Estudiante();

        boolean in = true;
        int i = 0;
        while (in) {
            System.out.println("Agregar Materia     [1]");
            System.out.println("Mostrar informacion [2]");
            System.out.println("Salir               [0]");
            int opc = entrada.nextInt();

            switch (opc) {
                case 1 -> {
                    double num1 = random.nextDouble(0, 3.5);
                    double num2 = random.nextDouble(0, 3.5);
                    double num3 = random.nextDouble(0, 3);
                    System.out.println("INGRESE: MATERIA");
                    materia[i] = new Materia(entrada.nextLine(), num1, num2, num3);
                    estudiante = new Estudiante("Joseph ", 20, materia);
                    i++;
                }
                case 2 -> {
                    for (int j = 0; j < i; j++) {
                        System.out.println(estudiante);
                        materia[j].CalcularNotaTotal();
                        materia[j].CalcularEstado();
                        double recuperacion = random.nextDouble(0, 3.5);
                        materia[j].setRecuperacion(materia[j].getEstado().equals("REPROBADO") ? recuperacion : 0);
                        if (materia[j].getEstado().equals("REPROBADO")) {
                            materia[j].CalcularRecuperacion();
                        }
                        materia[j].CalcularEstado();
                        System.out.println(materia[j]);

                    }
                    System.out.println("\n");
                }
                case 0 ->
                    in = false;
                default -> {
                }
            }
        }
    }
}
