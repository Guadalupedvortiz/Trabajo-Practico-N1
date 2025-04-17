import java.util.Scanner;

public class PromocionAlumno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sumaNotas = 0;



        for (int i = 1; i <= 3; i++) {
            System.out.print("Ingresa la nota del parcial " + i + ": ");
            sumaNotas += scanner.nextDouble();
        }


        double promedio = sumaNotas / 3;


        if (promedio >= 8) {
            System.out.println("El alumno está promocionado con un promedio de " + promedio);
        } else {
            System.out.println("El alumno no está promocionado. Su promedio es " + promedio);
        }

        scanner.close();
    }
}