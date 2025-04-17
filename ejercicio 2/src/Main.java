import java.util.Scanner;

public class CoordenadasPlano {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese la coordenada x (entero, distinto de cero): ");
        int x = scanner.nextInt();
        System.out.print("Ingrese la coordenada y (entero, distinto de cero): ");
        int y = scanner.nextInt();


        if (x > 0 && y > 0) {
            System.out.println("El punto se encuentra en el 1º Cuadrante.");
        } else if (x < 0 && y > 0) {
            System.out.println("El punto se encuentra en el 2º Cuadrante.");
        } else if (x < 0 && y < 0) {
            System.out.println("El punto se encuentra en el 3º Cuadrante.");
        } else if (x > 0 && y < 0) {
            System.out.println("El punto se encuentra en el 4º Cuadrante.");
        } else {
            System.out.println("Las coordenadas no deben ser cero.");
        }

        scanner.close();
    }
}