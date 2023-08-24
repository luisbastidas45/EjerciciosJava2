package loginUsuario;

import java.util.Scanner;

public class Medidas {
    public static void main(String[] args) {
        double capacidad;
        double litros;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la medida actual del estanque: ");
        litros = entrada.nextDouble();

        if (litros > 70.0){
            System.out.println("Error al ingresar el valor, la capacidad maxima del estanque es de 70 litros");
        }
        else {
            if (litros == 70.0){
                System.out.println("Estanque lleno");
            }
            if (litros >= 60 && litros < 70){
                System.out.println("Estanque casi lleno");
            }
            if (litros >= 40 && litros <60){
                System.out.println("Estanque 3/4");
            }
            if (litros >= 35 && litros < 40){
                System.out.println("Medio Estanque");
            }
            if (litros >= 20 && litros < 35){
                System.out.println("Estanque insuficiente");
            }
            if (litros >= 1 && litros < 20){
                System.out.println("Insuficiente");
            }
        }
    }
}
