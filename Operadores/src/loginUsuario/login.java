package loginUsuario;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        String usernanme1 = "luis";
        String password = "12345";

        String username2 = "admin";
        String password2 = "123";


        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el nombre de usuario: ");
        String usuario = entrada.nextLine();

        System.out.print("Ingrese su contraseña: ");
        String p = entrada.nextLine();

        boolean esAutenticado = false;


        if((usernanme1.equals(usuario) && password.equals(p)) || (username2.equals(usuario) && password2.equals(p))){
            esAutenticado = true;
        }
        else{
            System.out.println("Usuario o contraseña incorrectos");
        }

        if (esAutenticado){
            if (usuario.equals(username2)){
                System.out.println("Bienvenido ".concat(username2).concat("!"));
            }else{
                System.out.println("Bienvenido ".concat(usernanme1).concat("!"));
            }

        }
        else{
            System.out.println("Lo siento, requiere autenticacion");
        }

    }
}
