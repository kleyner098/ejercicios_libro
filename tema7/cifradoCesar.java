package tema7;

public class cifradoCesar {
    // String que guarda todas las letras del abecedario incluida la n
    // Para utilizar una variable en un método estático, la varible tambien tiene que ser estática 
    final static private String ALFABETO = "abcdefghijklmnñopqrstuvwxyz";

    // Métod que cifra
    static public String cifra(String texto, int n) {
        // String que guardará el texto cifrado
        String relsutado = "";
        // Recorremos el texto introducido
        for (int i = 0; i < texto.length(); i++) {
            // Guardamos la posición del carácter, si es no es una letra será un valor
            // negativo
            int posicion = ALFABETO.indexOf(texto.charAt(i));
            // Si la posición es negativa se introducirá el caracter sin cambio, si es una
            // letra se calculara la nueva letra
            if (posicion < 0) {
                relsutado += texto.charAt(i);
            } else {
                // calcularemos la nueva letra sumando a posición n
                posicion += n;
                // Si posición supera el tamaño de la string se reinicia y empezará por el
                // principio
                if (posicion >= ALFABETO.length()) {
                    posicion -= ALFABETO.length();
                }
                // Introducimos el nuevo carácter
                relsutado += ALFABETO.charAt(posicion);
            }
        }
        return relsutado;
    }
}
