package tema10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
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

        // -----------------------------------------------

        /*
         * Actividad propuesta 10.4
         * Escribe un texto en un archivo de texto, línea a línea leídas del teclado.
         * hsata que introduzca la cadena <<fin>>
         */

        // BufferedWriter out = null;
        // Scanner sc = new Scanner(System.in);
        // String entrada;
        // System.out.println("Directorio de trabajo actual: " +
        // System.getProperty("user.dir"));
        // File file = new File("tema10\\actividad10_4.txt");
        // try {
        // out = new BufferedWriter(new FileWriter(file));
        // System.out.println("Introduce una frase o palabra. Escribe \"fin\" para
        // cerrar el programa");
        // entrada = sc.nextLine();
        // while (!(entrada.equals("fin"))){
        // out.write(entrada);
        // out.newLine();
        // System.out.println("Introduce una frase o palabra. Escribe \"fin\" para
        // cerrar el programa");
        // entrada = sc.nextLine();
        // }
        // out.flush();
        // } catch (IOException e) {
        // System.out.println(e.getMessage());
        // // e.printStackTrace();
        // }finally{
        // sc.close();
        // if (out != null) {
        // try {
        // out.close();
        // } catch (IOException e) {

        // System.out.println(e.getMessage());
        // e.printStackTrace();
        // }
        // }
        // }

        // -----------------------------

        /*
         * Ejercicio 10.11 Escribe un programa que soliciete al usuario el nombre
         * de un fichero de texto y mustre su contenido en pantalla. Si no se
         * proporciona ningún nombre de fichero. la aplicación utilizara por defecto
         * prueba.txt.
         */
        // leerFichero();

        // ---------------------------------

        /*
         * Ejercicio 10.12 Diseña una aplicación qie pida al usuario su nombre y edad.
         * Estos datos deben
         * guardarse en el fichero datos.txt. Si este ficehro existe, debe añadirse al
         * final en una nueva línea, y en caso de no existir debe crearse.
         */
        // escribirNombreEdad();

        // ---------------------------

        /*
         * Ejercicio 10.13 Implementa un programa que lea dos listas de números enteros
         * no ordenados de sendos archivos con un número por línea, los reúna en un
         * lista única y los guarde en orden creciente en un tercer archivo, de nuevo
         * uno por línea.
         */
        // ordenarNumeros();

        // ---------------------------

        /*
         * Ejercicio 10.14 Escribe un programa que lea un fichero de texto llamado
         * carta.txt. Tenenmos que contar los caracteres las líneas y las palabras. Para
         * simplificar suponemos que cada palabra está separada de otra por un único
         * espacio en blanco o por un cambios de línea.
         */
        // contadorArchivo();

        // -----------------------------------
        /*
         * Ejercicio 10.15 En el archivo numeros.txt disponemos de una serie de números
         * (uno por cada línea). Diseña un programa que procese el fichero y nos muestre
         * el menor y el mayor.
         */

        // menorMayor();

        // -----------------------------------

        /*
         * Ejercicio 10.16 Un libro de firmas es útil para recoger los nombres de todas
         * las personas que han pasodo por un determinado lugar. Crea una aplicación que
         * permita mostrar el libro de firmas e insertar un nuevo nombres (comprobando
         * que no se encuentre repetido).LLamaremos al fichero firmas.txt
         */

         firma("pedrO");
    }

    /*
     * Ejercicio 10.11 Escribe un programa que soliciete al usuario el nombre
     * de un fichero de texto y mustre su contenido en pantalla. Si no se
     * proporciona ningún nombre de fichero. la aplicación utilizara por defecto
     * prueba.txt.
     */
    static public void leerFichero() {

        String fichero = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre o la ruta del fichero que quieres leer");
        fichero = sc.nextLine();
        // Compruebo si el fichero está vacío
        if (fichero.isEmpty()) {
            fichero = "tema10/prueba.txt";
        }
        // try-catch-resourse
        try (BufferedReader read = new BufferedReader(new FileReader(fichero))) {
            // Lee el fichero y lo imprime
            String cad = read.readLine();
            while (cad != null) {
                System.out.println(cad + "\n");
                cad = read.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }

    // ---------------------------

    /*
     * Ejercicio 10.12 Diseña una aplicación qie pida al usuario su nombre y edad.
     * Estos datos deben
     * guardarse en el fichero datos.txt. Si este ficehro existe, debe añadirse al
     * final en una nueva línea, y en caso de no existir debe crearse.
     */
    static public void escribirNombreEdad() {
        File fichero = new File("tema10/datos.txt");
        String nombre;
        int edad;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escibe tu nombre");
        nombre = sc.nextLine();
        System.out.println("Escribe tu edad:");
        edad = sc.nextInt();

        BufferedWriter writer = null;

        try {
            // Crear un flujo de salida
            writer = new BufferedWriter(new FileWriter(fichero, true));
            // Escribo en el fichero
            writer.write("Nombre: " + nombre + " | Edad: " + edad);
            // Inserto un salto de línea
            writer.newLine();
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        } finally {
            sc.close();
            // Cierro el flujo de salida en caso de que este abierto
            if (writer != null) {
                try {
                    writer.close();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    // ---------------------------

    /*
     * Ejercicio 10.13 Implementa un programa que lea dos listas de números enteros
     * no ordenados de sendos archivos con un número por línea, los reúna en un
     * lista única y los guarde en orden creciente en un tercer archivo, de nuevo
     * uno por línea.
     */
    static public void ordenarNumeros() {
        File numList1 = new File("tema10/numList1.txt");
        File numList2 = new File("tema10/numList2.txt");
        File numListOrdenados = new File("tema10/numOrdenados.txt");

        // Try-catch-resourse
        try (BufferedReader reader1 = new BufferedReader(new FileReader(numList1));
                BufferedReader reader2 = new BufferedReader(new FileReader(numList2));
                BufferedWriter writer = new BufferedWriter(new FileWriter(numListOrdenados))) {

            Integer numList[] = new Integer[0]; // Array que guardara los numeros de las dos listas
            String nextNum1 = reader1.readLine();
            String nextNum2 = reader2.readLine();
            while (nextNum1 != null || nextNum2 != null) {
                if (nextNum1 != null) {
                    numList = Arrays.copyOf(numList, numList.length + 1);
                    numList[numList.length - 1] = Integer.parseInt(nextNum1);
                    nextNum1 = reader1.readLine();
                }
                if (nextNum2 != null) {
                    numList = Arrays.copyOf(numList, numList.length + 1);
                    numList[numList.length - 1] = Integer.parseInt(nextNum2);
                    nextNum2 = reader2.readLine();
                }
            }

            // Ordenar la lista
            Arrays.sort(numList);
            for (int i = 0; i < numList.length; i++) {
                writer.write(String.valueOf(numList[i])); // Debemos parsear a String porque si tomará el valor del
                                                          // interger como un Charater
                writer.newLine();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    // ---------------------------

    /*
     * Ejercicio 10.14 Escribe un programa que lea un fichero de texto llamado
     * carta.txt. Tenenmos que contar los caracteres las líneas y las palabras. Para
     * simplificar suponemos que cada palabra está separada de otra por un único
     * espacio en blanco o por un cambios de línea.
     */
    static public void contadorArchivo() {
        File carta = new File("tema10/carta.txt");
        int caractersContSin = 0;
        int palabarasCont = 0;
        int lineasCont = 0;
        int caractersCont = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(carta))) {
            String cadena = reader.readLine();
            String[] palabrasArray;
            while (cadena != null) {
                lineasCont++;
                caractersCont += cadena.length();
                palabrasArray = cadena.split(" ");
                palabarasCont += palabrasArray.length;
                for (int i = 0; i < palabrasArray.length; i++) {
                    caractersContSin += palabrasArray[i].length(); // En el contador de caracteres no estoy ni
                                                                   // incluyendo los espacios en blanco ni el salto de
                                                                   // líneas
                }
                cadena = reader.readLine();
            }

            caractersCont = caractersCont + lineasCont - 1; // Incluimos los saltos de línea en la cuenta de caracteres
            System.out.println("El archivo tiene " + caractersContSin
                    + " caracteres (sin espacios en blancos ni saltos de líneas) o " + caractersCont + " (incluyendo), "
                    + palabarasCont + " palabras y "
                    + lineasCont + " líenas");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // -----------------------------------
    /*
     * Ejercicio 10.15 En el archivo numeros.txt disponemos de una serie de números
     * (uno por cada línea). Diseña un programa que procese el fichero y nos muestre
     * el menor y el mayor.
     */

    static public void menorMayor() {
        File file = new File("tema10/numeros.txt");
        Integer mayor = 0;
        Integer menor = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String nextNumber = reader.readLine();

            while (nextNumber != null) {
                if (Integer.parseInt(nextNumber) > mayor) {
                    mayor = Integer.parseInt(nextNumber);
                }
                if (Integer.parseInt(nextNumber) < menor) {
                    menor = Integer.parseInt(nextNumber);
                }
                nextNumber = reader.readLine();
            }

            System.out.println("El numero mayor es " + mayor + " y el menor es " + menor);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // -----------------------------------

    /*
     * Ejercicio 10.16 Un libro de firmas es útil para recoger los nombres de todas
     * las personas que han pasodo por un determinado lugar. Crea una aplicación que
     * permita mostrar el libro de firmas e insertar un nuevo nombres (comprobando
     * que no se encuentre repetido).LLamaremos al fichero firmas.txt
     */
    static public void firma(String nombre) {
        File file = new File("tema10/firmas.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(file));
                BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {

            Boolean repetido = false; // Variable guardian
            String firma = reader.readLine();
            while (firma != null) {
                System.out.println(firma);
                repetido = firma.toLowerCase().equals(nombre.toLowerCase());
                firma = reader.readLine();
            }

            if (!(repetido)) {
                writer.write(nombre);
                writer.newLine();
                System.out.println("Se ha guardado el usuario " + nombre + " correctamente");
            } else {
                System.out.println("El usuario " + nombre + " ya ha firmado");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
