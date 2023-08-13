import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre1, nombre2, nombre3;

        System.out.println("\tNOMBRE FAMILIARES\t");
        System.out.print("Ingrese el primer nombre: ");
        nombre1 = entrada.nextLine();
        System.out.print("Ingrese el segundo nombre: ");
        nombre2 = entrada.nextLine();
        System.out.print("Ingrese el tercer nombre: ");
        nombre3 = entrada.nextLine();

        System.out.println("Los nombres ingresados son: "+ nombre1 +" "+nombre2 + " "+ nombre3);

        String n1 = String.valueOf(nombre1.charAt(1)).toUpperCase().concat(".").concat(nombre1.substring(nombre1.length()-2));
        String n2 = String.valueOf(nombre2.charAt(1)).toUpperCase().concat(".").concat(nombre2.substring(nombre2.length()-2));
        String n3 = String.valueOf(nombre3.charAt(1)).toUpperCase().concat(".").concat(nombre3.substring(nombre3.length()-2));
        System.out.println(n1+"_"+n2+"_"+n3);

    }
}
