package loginUsuario;

public class OperadorTernario {
    public static void main(String[] args) {
        //variable = condicion ? si_es_verdad (devuelve un valor): si_es_falso(devulve otro valor)
        int edad = 17;

        String resultado = (edad >= 18) ? "mayor de edad":"menor de edad";
        System.out.println(resultado);

        String estado = "";
        double promedio = 6.2;

        estado = promedio >= 5.49 ? "aprobado":"rechazado";
        System.out.println(estado);
    }
}
