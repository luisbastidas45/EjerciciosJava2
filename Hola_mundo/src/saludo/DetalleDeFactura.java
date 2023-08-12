package saludo;

import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        String nombreFactura;
        String detalleFactura;
        double precio1, precio2;
        String totalFactura;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la factura: ");
        nombreFactura = entrada.nextLine();
        System.out.print("Ingrese una descripcion de la factura: ");
        detalleFactura = entrada.nextLine();
        System.out.print("Ingrese el valor del primer elemento a comprar: ");
        precio1 = entrada.nextDouble();
        System.out.print("Ingrese el valor del segundo elemento a comprar: ");
        precio2 = entrada.nextDouble();



        totalFactura = "el valor total a pagar en la factura "+nombreFactura+" con descripcion "+detalleFactura+" es: "+(precio1+precio2);
        System.out.println(totalFactura);
    }
}
