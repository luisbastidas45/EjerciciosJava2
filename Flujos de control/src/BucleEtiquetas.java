public class BucleEtiquetas {
    public static void main(String[] args) {
        String frase = "tres tristes trigo tigres tragan trigo en un trigal";
        int cantidad = 0;
        char letra = 'g';
        String palabra = "trigo";

        buscar:
        for (int i = 0; i < frase.length(); i++){ // me controla cada frase de la cadena
            int k = i;
            for (int j = 0; j < palabra.length(); j++){ // controla la revision letra por letra
                if (frase.charAt(k++) !=  palabra.charAt(j)) {
                    continue buscar;
                }
            }
            cantidad+=1;
        }
        System.out.println("Encontrado: "+cantidad+" veces el caracter '"+letra+"' en la frase");
    }
}
