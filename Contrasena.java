import java.util.Scanner;

public class Contrasena {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean bandera = false;

        System.out.println("Ingresa el usuario:");
        String usuarioIngresado = sc.nextLine();

        System.out.println("Ingresa la contraseña:");
        String passwordIngresado = sc.nextLine();
        
        String usuario = "jose";
        String password = "1234";

        if (usuario.equals(usuarioIngresado) && password.equals(passwordIngresado)) {
            System.out.println("Bienvenido");
            bandera = true;
        }

        if (bandera == false) {
            System.out.println("NO AUTORIZADO");
        }

    }
}
