import java.util.Scanner;

public class TrimestreFecha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.print("Ingresa el día: ");
        int dia = scanner.nextInt();
        System.out.print("Ingresa el mes: ");
        int mes = scanner.nextInt();
        System.out.print("Ingresa el año: ");
        int anio = scanner.nextInt();


        if (mes >= 1 && mes <= 3) {
            System.out.println("La fecha " + dia + "/" + mes + "/" + anio + " corresponde al primer trimestre.");
        } else if (mes >= 4 && mes <= 6) {
            System.out.println("La fecha " + dia + "/" + mes + "/" + anio + " corresponde al segundo trimestre.");
        } else if (mes >= 7 && mes <= 9) {
            System.out.println("La fecha " + dia + "/" + mes + "/" + anio + " corresponde al tercer trimestre.");
        } else if (mes >= 10 && mes <= 12) {
            System.out.println("La fecha " + dia + "/" + mes + "/" + anio + " corresponde al cuarto trimestre.");
        } else {
            System.out.println("Mes inválido. Por favor, ingresa un valor entre 1 y 12.");
        }

        scanner.close();
    }
}