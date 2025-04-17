import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countEquilatero = 0, countIsosceles = 0, countEscaleno = 0;

        System.out.print("Ingrese la cantidad de triángulos a evaluar: ");
        int cantidadTriangulos = scanner.nextInt();

        for (int i = 1; i <= cantidadTriangulos; i++) {
            System.out.println("Triángulo " + i + ":");
            System.out.print("Ingrese el lado 1: ");
            int lado1 = scanner.nextInt();
            System.out.print("Ingrese el lado 2: ");
            int lado2 = scanner.nextInt();
            System.out.print("Ingrese el lado 3: ");
            int lado3 = scanner.nextInt();

            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Es un triángulo equilátero.");
                countEquilatero++;
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Es un triángulo isósceles.");
                countIsosceles++;
            } else {
                System.out.println("Es un triángulo escaleno.");
                countEscaleno++;
            }
        }


        System.out.println("\nCantidad de triángulos equiláteros: " + countEquilatero);
        System.out.println("Cantidad de triángulos isósceles: " + countIsosceles);
        System.out.println("Cantidad de triángulos escalenos: " + countEscaleno);


        int menorCantidad = Math.min(countEquilatero, Math.min(countIsosceles, countEscaleno));

        System.out.print("El tipo de triángulo con menor cantidad es: ");
        if (menorCantidad == countEquilatero) {
            System.out.println("Equilátero");
        } else if (menorCantidad == countIsosceles) {
            System.out.println("Isósceles");
        } else {
            System.out.println("Escaleno");
        }

        scanner.close();
    }
}