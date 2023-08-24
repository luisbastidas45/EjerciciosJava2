package loginUsuario;

import java.util.Scanner;

public class LoginArreglos {
    public static void main(String[] args) {
        String[] usernames = new String[2];
        String[] passwords = new String[2];

        usernames[0] = "luis";
        passwords[0] = "12345";

        usernames[1] = "admin";
        passwords[1] = "123";

        boolean esAutenticado = false;
        int pos = -1;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el nombre de usuario: ");
        String usuario = entrada.nextLine();

        System.out.print("Ingrese su contraseña: ");
        String p = entrada.nextLine();

        for(int i = 0; i < usernames.length; i++){
            if (usuario.equals(usernames[i]) && p.equals(passwords[i])){
                esAutenticado = true;
                pos = i;
            }
        }

        if (esAutenticado){
            System.out.println("Bienvenido ".concat(usernames[pos]).concat("!"));
        }else{
            System.out.println("Lo siento, requiere autenticacion");
        }

    }
}
