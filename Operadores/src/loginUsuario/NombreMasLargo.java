package loginUsuario;

import javax.swing.*;

public class NombreMasLargo {
    public static void main(String[] args) {

        String nombre1 = JOptionPane.showInputDialog("Ingrese el nombre de la primer personas: ");
        String nombre2 = JOptionPane.showInputDialog("Ingrese el nombre de la segunda personas: ");
        String nombre3 = JOptionPane.showInputDialog("Ingrese el nombre de la tercer personas: ");

        String[] name1 = nombre1.split(" ");
        String[] name2 = nombre2.split(" ");
        String[] name3 = nombre3.split(" ");


        int tam1 = name1[0].length() + name1[1].length();
        int tam2 = name2[0].length() + name2[1].length();
        int tam3 = name3[0].length() + name3[1].length();


        if (tam1 > tam2 && tam1 > tam3){
            System.out.println(nombre1+" Es el nombre mas largo");
        }
        if (tam2 > tam1 && tam2 > tam3){
            System.out.println(nombre2+" Es el nombre mas largo");
        }
        if (tam3 > tam1 && tam3 > tam2){
            System.out.println(nombre3+ " Es el nombre mas largo");
        }


    }
}
