package loginUsuario;

import java.util.Scanner;

public class OrdenarNumeros {
    public static void main(String[] args) {
        int num1, num2;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Por favor ingresa el primer numero: ");
        num1 = entrada.nextInt();
        System.out.print("Por favor ingresa el segundo numero: ");
        num2 = entrada.nextInt();


        int resultado = (num1 > num2)? num1 : num2;
        System.out.println("El numero mayor que ha sido ingresado es: "+resultado);

    }
}
