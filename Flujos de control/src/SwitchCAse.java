public class SwitchCAse {
    public static void main(String[] args) {
        int mes = 4;
        String nombreMes = null;

        switch(mes){
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
            default:
                System.out.println("Mes ingresado incorrecto");
                break;
        }
        System.out.println("Nombre del mes ingresado: "+nombreMes);


        String nombre = "Luis";

        switch (nombre){
            case "sofia":
                System.out.println("fallo");
                break;

            case "pedro":
                System.out.println("fallo");
                break;
            case "Luis":
                System.out.println("correcto");
                break;
            default:
                System.out.println("NO se ha ingresado el nombre correcto");
        }
    }
}
