import java.util.Scanner;

public class PromedioNotas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] lista = new double[20];

        int contMay5 = 0;
        int contInf4 = 0;
        int contIgual1 = 0;

        double sumMay5 = 0;
        double sumInf4 = 0;
        double sumIgual1 = 0;

        boolean verificar = false;

        System.out.println("\t Ingreesa la nota de los estudiantes en escala de 1 a 7\t");
        for (int i = 0; i < 20; i++){
            System.out.print("Ingresa  la nota del alumno "+ (i+1)+": ");
            lista[i] = entrada.nextDouble();
            if (lista[i] == 0 || lista[i] > 7.0){
                System.out.println("Error al ingresar la nota");
                verificar = true;
                break;
            }
            if(lista[i] >= 5d){
                contMay5 += 1;
                sumMay5 += lista[i];
            }
            if(lista[i] <= 4.9 && lista[i] > 1d){
                contInf4 += 1;
                sumInf4 += lista[i];
            }
            if(lista[i] == 1d){
                contIgual1 += 1;
                sumIgual1 += lista[i];
            }
        }

        System.out.println("suma "+sumInf4+ " contador "+contInf4);
        if (verificar != true) {

            if (contMay5 > 0) {
                System.out.println("El promedio de las notas Superiores a 5 es: " + (sumMay5 / contMay5));
            }
            if (contInf4 > 0) {
                System.out.println("El promedio de las notas inferiores a 4 es: " + (sumInf4 / contInf4));
            }
            if (contIgual1 > 0) {
                System.out.println("El promedio de las notas iguales a 1 es: " + (sumIgual1 / contIgual1));
            }

        }
    }
}
