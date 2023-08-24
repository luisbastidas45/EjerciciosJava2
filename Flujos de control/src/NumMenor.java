import java.util.Scanner;

public class NumMenor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de numeros que deseas ingresar: ");
        int cant = entrada.nextInt();


        int[] lista = new int[cant];

        for (int i = 0; i < cant; i++){
            System.out.print((i+1)+". Ingresa el numero: ");
            lista[i] = entrada.nextInt();
        }

        int numMenor = lista[0];

        for (int i = 1; i < lista.length; i++){
            if(lista[i] < numMenor){
                numMenor = lista[i];
            }
        }

        System.out.println("EL numero menor de los numeros ingresados es: "+numMenor);

        if (numMenor < 10){
            System.out.println("El numero menor de los numeros ingresados es menor a 10");
        } else if (numMenor > 10) {
            System.out.println("El numero menor de los numeros ingresados es mayor a 10");
        }else {
            System.out.println("El numero menor de los numeros ingresados es igual a 10");
        }

    }
}
