import java.util.Scanner;

public class EvaluacionAlumno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la nota del alumno: ");
        int nota = scanner.nextInt();

        if (nota < 4) {
            System.out.println("El alumno desaprobó la materia.");
        } else if (nota >= 4 && nota < 10) {
            System.out.println("El alumno aprobó la materia.");
        } else if (nota == 10) {
            System.out.println("El alumno es sobresaliente.");
        } else {
            System.out.println("Nota inválida.");
        }

        scanner.close();
    }
}