package tema7;

import java.util.Arrays;
import java.util.Random;

public class Colores {
    /*
     * 7.13 En el momento de decorar una casa, una habitación o cualquier objeto, se
     * plantea el problema de elegir la paleta de colores que
     * vamos a utilizar en nuestras decoración. Existe una solución, algo atrevida,
     * que consiste en utilizar colores al azar.
     * Diseña la clase colores, que alberga por defecto una serie de colores
     * (mediante una cadena), aunque es posible añadir tantos como necesitemos. La
     * clase tendrá un método que devuelva una tabla con los n colores que
     * necesitemos elegidos al azar sin repeticiones.
     */
    private String[] coloresArray = { "Amarillo", "Rojo", "Azul" };

    // Método qur añade un nuevo color
    public void addColor(String color) {
        coloresArray = Arrays.copyOf(coloresArray, coloresArray.length + 1);
        coloresArray[coloresArray.length - 1] = color;
    }

    // mostramos los n colores al azar
    public String mostrarColores(int n) {
        // Creamos una array de tamaño n
        String[] copiaColores = new String[n];
        // Instancia de random
        Random rdm = new Random();
        int numRandom;
        int index = 0;
        // inicialización de la array
        for (int i = 0; i < copiaColores.length; i++) {
            copiaColores[i] = " ";
        }

        do {
            //Número aleatorio
            numRandom = rdm.nextInt(coloresArray.length);
            // Convertimos la array en una lista y comprobamos si el nuevo color añadido esta el la lista
            if (!(Arrays.asList(copiaColores).contains(coloresArray[numRandom]))) {
                // Añadimos el nuevo color
                copiaColores[index] = coloresArray[numRandom];
                index++;
            }
        } while (copiaColores[copiaColores.length - 1].equals(" "));

        return Arrays.toString(copiaColores);
    }

    public String toString() {
        return Arrays.toString(coloresArray);
    }

    public String[] getColoresArray() {
        return coloresArray;
    }
}
