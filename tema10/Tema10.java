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

        // firma("pedrO");

        // -----------------------------------------------------------

        /*
         * 10.17 En Linux disponemos de un comando more, al que se le pasa un fichero y
         * lo muestra poco a poco: cada 24 líneas. Implementa un programa que funcione
         * de forma similar.
         */
        // more();

        // -----------------------------------------------------

        /*
         * 10.18 Escribe la función Integer[] leerEnteros(String texto), al que se le
         * pasa una cadena y devuelve una tabla con todos enteros que aparecen en ella.
         */
        /*
         * Integer numbers[] =
         * leerEnteros("Esto es un número 1 , este es el 17 , y por último 123 ");
         * for (int i = 0; i < numbers.length; i++) {
         * System.out.print(numbers[i] + " ");
         * }
         */

        // ------------------------------------------------------------

        /*
         * 10.19 Un encriptador es una aplicación que transforma un texto haciéndolo
         * ilegible para aquellos que desconosen el código. Diseña un programa que lea
         * un fichero de texto, lo codifique y cree un nuevo archivo con el mensaje
         * cifrado. El afalbeto de codificación se encontrará en el codec.txt. Un
         * ejemplo de codificación de alfabeto es:
         * Alfabeto: a b c d e f g h i j k l m n o p q r s t u w x y z
         * Cifrado: e m s r c y j n f x i w t a k o z d l q v b h u p g
         */
        // encriptador();

        /*
         * 10.20 Akgunos sistemas operativos disponen de la orden comp, que compara dos
         * archivos y nos dicesi son iguales o distintos. Diseña esta orden de forma
         * que, además, nos diga en qué línea y caráter se encuenta la priemara
         * diferencia. Utiliza los fucuheros texto1.txt y texto2.txt.
         */
        // comp();

        // --------------------------

        /*
         * Ejercicio 10.21 Diseña una pequeña agenda, que nuestre el siguiente menú:
         * 1. Nuevo contacto.
         * 2. Buscar por nombre.
         * 3. Mostrar todos.
         * 4. Salir.
         * En ella, guardaremos el nombre y el teléfono de un máximo de 20 personas.
         * La opción 1, nos premitirá introducir un nuevo contacto siempre y cuando la
         * agenda no esté llena, comprobando que el nombre no se ecuentre insertado ya.
         * La opción 2, muestra todos los teléfonos que coinciden con la cadena que se
         * busca. Por ejemplo, sin tecleamos <<Pe>>, mostrará el teléfono de Pedro, de
         * Pepe y de Peturia.
         * La opción 3 mostrará un listado con toda la información (nombres y teléfono)
         * ordenes dis alfabéticamente por el nombre.
         * Por último, la opción 4 guarda todos los datos de la agenda en el archivo
         * agenda.txt. La próxima vez que se ejecute la aplicación, si hay datos
         * guardados, se cargarán en memoria
         */

        // Agenda a = new Agenda();
        // a.iniciar();

        // ------------------------------------------------

        /*
         * 10.22 Crea con un editor de texto el fichero deportistas.txt, donde se
         * recogen los datos de un grupo de deportistas, uno en cada línea. Aparecerá el
         * nombre completo, seguido de la edad, el peso y la estatura. La primera lñuena
         * será el encabezamiento con los nombre de los campos. El documento tendrá la
         * siguiente forma:
         * Nombre Edad Peso Estatura
         * Juan Pedro Pérez Gómez 25 70,5 1,80
         * Ana Ruiz del Val 23 60 1,75
         * ...
         * Implementa un programa donde se creen un flujo de texto de entrada, a partir
         * del cual, usando un objeto Scanner, se leerán los datos de los deportistas,
         * que se mostrarán por pantalla. Al final aparecerán los valores medios de la
         * edad, el peso y la estatura.
         */
        // deportistas();

        /*
         * 10.23 Con el fichero deportistas.txt de la Actividad de aplicación 10.22.
         * implrementa una aplicación que lea los datos que lea los datos de los
         * deportistas y los guarde en otros tres ficheros, uno con los nombres y las
         * edades, otro con los nombres y los pesos y el tercero con los nombres y las
         * estatura.
         */
        deportistas2();
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
        // Compruebo si se ha dado el nombre del fichero
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

    /*
     * 10.17 En Linux disponemos de un comando more, al que se le pasa un fichero y
     * lo muestra poco a poco: cada 24 líneas. Implementa un programa que funcione
     * de forma similar.
     */
    static public void more() {
        /*
         * Para este ejercicio usare el fichero carta.txt y mostrare el fichero de dos
         * en dos. Otra aclaración, es que obligatoriamente tenemos que pulsar enter, ya
         * que para detectar que tecla se está pulsado necesitaremos una dependencia o
         * mediante eventos con el paquete Swing
         */

        File file = new File("tema10/carta.txt");
        Scanner sc = new Scanner(System.in);
        int numFilas = 2; // Número de fila a mostrasr
        String cadena = null;
        String entrada = null;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            System.out.println("Pulsa enter para continuar leyendo el archivo o q para cerrar");
            // El bucle continuará hasta que el archivo se acabe o cuando se escriba q
            do {
                entrada = sc.nextLine();
                if (!(entrada.toLowerCase().equals("q"))) {
                    for (int i = 0; i < numFilas; i++) {
                        cadena = reader.readLine();
                        if (cadena == null) {
                            System.out.println("\nFin del archivo");
                            break;
                        } else {
                            System.out.println(cadena);
                        }
                    }

                } else {
                    System.out.println("\nCerrando archivo...");
                    break;
                }
            } while (cadena != null);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * 10.18 Escribe la función Integer[] leerEnteros(String texto), al que se le
     * pasa una cadena y devuelve una tabla con todos enteros que aparecen en ella.
     */
    static public Integer[] leerEnteros(String texto) {
        Integer numeros[] = new Integer[0];
        String palabras[] = texto.split(" ");
        Scanner sc;
        for (int i = 0; i < palabras.length; i++) {
            sc = new Scanner(palabras[i]);
            if (sc.hasNextInt()) {
                numeros = Arrays.copyOf(numeros, numeros.length + 1);
                numeros[numeros.length - 1] = sc.nextInt();
            }
        }

        return numeros;
    }

    /*
     * 10.19 Un encriptador es una aplicación que transforma un texto haciéndolo
     * ilegible para aquellos que desconosen el código. Diseña un programa que lea
     * un fichero de texto, lo codifique y cree un nuevo archivo con el mensaje
     * cifrado. El afalbeto de codificación se encontrará en el codec.txt. Un
     * ejemplo de codificación de alfabeto es:
     * Alfabeto: a b c d e f g h i j k l m n o p q r s t u w x y z
     * Cifrado: e m s r c y j n f x i w t a k o z d l q v b h u p g
     */
    static public void encriptador() {
        char alfabeto[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'w', 'x', 'y', 'z' };
        char cifrado[] = { 'e', 'm', 's', 'r', 'c', 'y', 'j', 'n', 'f', 'x', 'i', 'w', 't', 'a', 'k', 'z', 'd', 'l',
                'q', 'v', 'b', 'h', 'u', 'p', 'g' };
        File file = new File("tema10/carta.txt");
        int charPosition = 0;
        boolean cifrar;
        try (FileReader reader = new FileReader(file);
                FileWriter writer = new FileWriter("tema10/codec.txt")) {

            int character = reader.read();
            while (character != -1) {
                cifrar = false;
                for (int i = 0; i < alfabeto.length; i++) {
                    if (alfabeto[i] == (char) character) {
                        cifrar = true;
                        charPosition = i;
                    }
                }
                if (cifrar) {
                    writer.write((char) cifrado[charPosition]);
                } else {
                    writer.write((char) character);
                }
                character = reader.read();
            }
            System.out.println("Archivo cifrado");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * 10.20 Akgunos sistemas operativos disponen de la orden comp, que compara dos
     * archivos y nos dicesi son iguales o distintos. Diseña esta orden de forma
     * que, además, nos diga en qué línea y caráter se encuenta la priemara
     * diferencia. Utiliza los fucuheros texto1.txt y texto2.txt.
     */
    static public void comp() {
        File texto1 = new File("tema10/texto1.txt");
        File texto2 = new File("tema10/texto2.txt");
        int numFila = 1;
        Boolean diferente = false;
        int postDiferente = 0;
        char carateres[] = new char[2];
        try (BufferedReader reader1 = new BufferedReader(new FileReader(texto1));
                BufferedReader reader2 = new BufferedReader(new FileReader(texto2));) {
            String cadena1 = reader1.readLine();
            String cadena2 = reader2.readLine();
            while (cadena1 != null && cadena2 != null) {
                if (cadena1.length() == cadena2.length()) {
                    for (int i = 0; i < cadena1.length(); i++) {
                        if (cadena1.charAt(i) != cadena2.charAt(i)) {
                            diferente = true;
                            carateres[0] = cadena1.charAt(i);
                            carateres[1] = cadena2.charAt(i);
                            postDiferente = i + 1;
                            break;
                        }
                    }
                }
                cadena1 = reader1.readLine();
                cadena2 = reader2.readLine();
                if (!diferente) {
                    numFila++;
                }

            }

            if (diferente) {
                System.out.println("Archivos diferentes: Línea " + numFila + ", posisión " + postDiferente
                        + ", los caracteres que se diferencia son '" + carateres[0] + "' y '" + carateres[1] + "'");
            } else {
                System.out.println("No han encontrado diferencia en los archivos");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * 10.22 Crea con un editor de texto el fichero deportistas.txt, donde se
     * recogen los datos de un grupo de deportistas, uno en cada línea. Aparecerá el
     * nombre completo, seguido de la edad, el peso y la estatura. La primera lñuena
     * será el encabezamiento con los nombre de los campos. El documento tendrá la
     * siguiente forma:
     * Nombre Edad Peso Estatura
     * Juan Pedro Pérez Gómez 25 70,5 1,80
     * Ana Ruiz del Val 23 60 1,75
     * ...
     * Implementa un programa donde se creen un flujo de texto de entrada, a partir
     * del cual, usando un objeto Scanner, se leerán los datos de los deportistas,
     * que se mostrarán por pantalla. Al final aparecerán los valores medios de la
     * edad, el peso y la estatura.
     */
    static public void deportistas() {
        File file = new File("tema10/deportistas.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String cad = reader.readLine();
            double edadMedia, pesoMedia, estaturaMedia;
            double edadSuma = 0, pesoSuma = 0, estaturaSuma = 0;
            int numlinea = 0;
            String linea[] = new String[4];
            while (cad != null) {
                if (numlinea != 0) {

                    linea = cad.split("\\s{2,}"); // expresión regular que divide la cadena si hay 2 o más espacio en
                                                  // blanco
                    edadSuma += Double.parseDouble(linea[1]);
                    pesoSuma += Double.parseDouble(linea[2]);
                    estaturaSuma += Double.parseDouble(linea[3]);
                    System.out.println(cad);
                }
                numlinea++;
                cad = reader.readLine();
            }
            edadMedia = edadSuma / (numlinea - 1);
            pesoMedia = pesoSuma / (numlinea - 1);
            estaturaMedia = estaturaSuma / (numlinea - 1);
            System.out.println("La edad media es de " + edadMedia + ", el peso media es de " + pesoMedia
                    + " y la estatura media es de " + estaturaMedia);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
     * 10.23 Con el fichero deportistas.txt de la Actividad de aplicación 10.22.
     * implrementa una aplicación que lea los datos que lea los datos de los
     * deportistas y los guarde en otros tres ficheros, uno con los nombres y las
     * edades, otro con los nombres y los pesos y el tercero con los nombres y las
     * estatura.
     */
    static public void deportistas2() {
        File file = new File("tema10/deportistas.txt");
        File edadFile = new File("tema10/deporEdad.txt");
        File pesoFile = new File("tema10/deporPeso.txt");
        File alturaFile = new File("tema10/deporAltura.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(file));
                BufferedWriter writerEdad = new BufferedWriter(new FileWriter(edadFile, true));
                BufferedWriter writerPeso = new BufferedWriter(new FileWriter(pesoFile, true));
                BufferedWriter writerAltrua = new BufferedWriter(new FileWriter(alturaFile, true))) {
            String cad = reader.readLine();
            cad = reader.readLine();
            String linea[] = new String[4];
            String nombre;
            int edad;
            double altura, peso;
            while (cad != null) {
                linea = cad.split("\\s{2,}"); // expresión regular que divide la cadena si hay 2 o más espacio en
                                              // blanco
                nombre = linea[0];
                edad = Integer.parseInt(linea[1]);
                peso = Double.parseDouble(linea[2]);
                altura = Double.parseDouble(linea[3]);

                writerEdad.write(nombre + "-" + edad);
                writerEdad.newLine();
                writerPeso.write(nombre + "-" + peso);
                writerPeso.newLine();
                writerAltrua.write(nombre + "-" + altura);
                writerAltrua.newLine();

                cad = reader.readLine();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    
}