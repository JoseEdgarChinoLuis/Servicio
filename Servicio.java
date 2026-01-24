import java.util.Scanner;

public class Servicio {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char genero;
        int edad;

        System.out.println("Ingresa tu genero (H/M):");
        genero = scanner.next().charAt(0);

        System.out.println("Ingresa tu edad:");
        edad = scanner.nextInt();

        if (edad >= 18 && (genero == 'H' || genero == 'h')) {
            System.out.println("Te toca hacer servicio militar");
        } else {
            System.out.println("No haces servicio militar");
        }

        scanner.close();
    }
}
