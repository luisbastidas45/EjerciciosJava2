public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programacion en JAVA";
        String curso2 = new String("Programacion en JAVA");

        boolean esIgual = curso == curso2; // compara por referencia
        System.out.println("esIgual = "+esIgual);


        esIgual = curso.equals(curso2);     // me compara por el valor de la variable
        System.out.println("es igual: "+esIgual);

    }
}
