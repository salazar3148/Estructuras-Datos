import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Maps {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Map<String, String> usuarios = new HashMap<String, String>();
        usuarios.put("admin", "admin");
        usuarios.put("user", "user");
        usuarios.put("jorge", "jorge123");
        usuarios.put("ssuser", "password");

        int intentos = 4;
        while(intentos != 0) {
            System.out.println("Ingrese su usuario: ");
            String usuario = input.nextLine();

            System.out.println("Ingrese su contraseña: ");
            String pass = input.nextLine();

            if(usuarios.get(usuario).equals(pass)) {
                System.out.println("Sesion iniciada correctamente, bienvenido " + usuario);
                break;
            } else {
                System.out.println("Usuario o Contraseña incorrecta! Le quedan " + --intentos + " intentos.");
            }
        }
    }
}
