import java.util.Scanner;

public class MultiplicarNum {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa el primer numero: ");
        int num1 = entrada.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int num2 = entrada.nextInt();
        int resultado = 0;

        for (int i = 0; i < Math.abs(num2); i++){
            resultado += Math.abs(num1);
        }

        if(num1 < 0 && num2 > 0 || num1 > 0 && num2 < 0){
            resultado = resultado * -1;
        }
        System.out.println("El resultado de multiplicar "+num1+" X "+num2+" es: "+resultado);
    }
}
