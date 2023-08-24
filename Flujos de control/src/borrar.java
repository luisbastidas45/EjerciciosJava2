public class borrar {
    public static void main(String[] args) {
        int num1 = 8;
        int num2 = 5;
        int num3 = 3;

        int resultado = (num1 > num2) ? num1 : num2;
        resultado = (num3 > resultado) ? num3 : resultado;

        System.out.println("El numero mayor es: "+resultado);

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 3; j++){
                if (j == 1){
                    continue;
                }
                System.out.println(j);
            }
        }
    }
}
