package tema10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Tema10 {
    public static void main(String[] args) {

        /*
         * Actividad propuesta 10.3
         * Crea con un editor de texto Jugadores.txt en la carpeta del proyecto actual y
         * escribe en él los nombres. edades y estaturas de los jugadores de un equipo
         * de, cada uno en una línea.
         * juan 22 1.77
         * luis 22 1.80
         * pedro 20 1.73
         * ...
         * Implementa un programa que lea del fichero los datos, muestre los nombres y
         * calcule la media de la edad y de las estaturas, mostrándolas por pantalla.
         */
        // BufferedReader in = null;
        // try {
        // in = new BufferedReader(new FileReader("tema10\\Jugadores.txt"));
        // String linea = in.readLine();
        // ;
        // Scanner sc;
        // int contador = 0;
        // int sumaEdad = 0, nextNumber;
        // double sumaAltura = 0, nextDouble;
        // String nextName;
        // double mediaEdad = 0, mediaAltura = 0;
        // while (linea != null) {

        // sc = new Scanner(linea).useLocale(Locale.US);
        // contador++;
        // while (sc.hasNext()) {

        // if (sc.hasNextInt()) {
        // nextNumber = sc.nextInt();
        // sumaEdad += nextNumber;
        // } else if (sc.hasNextDouble()) {
        // nextDouble = sc.nextDouble();
        // sumaAltura += nextDouble;
        // } else {
        // nextName = sc.next();
        // System.out.print(nextName + " ");
        // }
        // }
        // linea = in.readLine();

        // }
        // mediaEdad = sumaEdad / (double) contador;
        // mediaAltura = sumaAltura / (double) contador;
        // NumberFormat nf = NumberFormat.getNumberInstance();
        // DecimalFormat decimalFormat = new DecimalFormat("#.00");

        // System.out.println(
        // "\nLa media de las edades es " + (int) mediaEdad + " y de la altura es " +
        // nf.format(mediaAltura));
        // System.out.println("\nLa media de las edades es " + (int) mediaEdad + " y de
        // la altura es "
        // + decimalFormat.format(mediaAltura));
        // } catch (IOException e) {
        // System.out.println(e.getMessage());
        // }

        /*
         * Actividad propuesta 10.4
         * Escribe un texto en un archivo de texto, línea a línea leídas del teclado.
         * hsata que introduzca la cadena <<fin>>
         */

        BufferedWriter out = null;
        Scanner sc = new Scanner(System.in);
        String entrada;
        System.out.println("Directorio de trabajo actual: " + System.getProperty("user.dir"));

        try {
            // out = new BufferedWriter(new FileWriter("tema10\\actividad10_4.txt"));
            out = new BufferedWriter(new FileWriter("C:\\Users\\kleyn\\OneDrive\\Escritorio\\prueba.txt"));
            System.out.println("Introduce una frase o palabra. Escribe \"fin\" para cerrar el programa");
            entrada = sc.nextLine();
            while (!(entrada.equals("fin"))){
                out.write(entrada);
                out.newLine();
                System.out.println("Introduce una frase o palabra. Escribe \"fin\" para cerrar el programa");
                entrada = sc.nextLine();
            }
            out.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            // e.printStackTrace();
        }finally{
            sc.close();
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    
                    // System.out.println(e.getMessage());
                    // e.printStackTrace();
                }    
            }
        }
    }
}
