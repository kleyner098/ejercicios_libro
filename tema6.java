
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class tema6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
         * Ejercicio resuelto 6.5
         */

        // String antes, despues;

        // System.out.println("Esctibe una cadena: ");
        // antes = sc.nextLine();

        // despues = alReves(antes);
        // System.out.println(despues);

        // ----------------------------------------------------

        /* Ejercicio resuelto 6.11 */

        // final char conjunto1[] = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u',
        // 'v' };
        // final char conjunto2[] = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q',
        // 's' };
        // char codificado[];
        // String texto;

        // System.out.println("Introduca el texto a codificar");
        // texto = sc.nextLine();
        // texto = texto.toLowerCase();
        // codificado = new char[texto.length()];

        // for(int i = 0 ; i <texto.length(); i++){
        // codificado[i]= codifica(conjunto1, conjunto2, texto.charAt(i));
        // }
        // texto = String.valueOf(codificado);
        // System.out.println(texto);

        // ----------------------------------------------------------------------

        /* Ejercicio 11. relacionado con el anterior */

        // final char conjunto1[] = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u',
        // 'v' };
        // final char conjunto2[] = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q',
        // 's' };
        // char descodificado[];
        // String texto;

        // System.out.println("Introduca el texto a codificar");
        // texto = sc.nextLine();
        // texto = texto.toLowerCase();
        // descodificado = new char[texto.length()];

        // for (int i = 0; i < texto.length(); i++) {
        // descodificado[i] = descodificar(conjunto1, conjunto2, texto.charAt(i));
        // }
        // texto = String.valueOf(descodificado);
        // System.out.println(texto);

        // -----------------------------------------------------------------------

        /* Ejercicio 12 */
        // juegoAhorcado();

        // --------------------------------------------------------------------------

        /* Ejercicio 13 */

        // System.out.println("Introduce el código");
        // String codigo = sc.nextLine();
        // String codigoSinComentarios = eliminarComentarios(codigo);

        // System.out.println(codigoSinComentarios);

        // -------------------------------------------------------------------------

        /* Ejercicio 14 */

        // agenda();

        // ----------------------------------------------------------

        /* ejercicio 15 */
        // creaHTML();

        // -----------------------------------------------------------------

        /* Ejercicio 16 */
        // System.out.println("Introduce un frase o palabra");
        // String cadena = sc.nextLine();
        // sustiutir(cadena);

        // --------------------------------------------------------------------

        /* Ejercicio 17 */
        // System.out.println("Introduce una palabra");
        // String palabra = sc.nextLine();
        // secuencias(palabra, 4);

        // --------------------------------------------------------------

        /* Ejercicio 18 */
        // System.out.println("Introduce una frase");
        // String cadena = sc.nextLine();
        // juntarFrase(cadena);

        // --------------------------------------------------------------

        /* Ejercicio 19 */
        // System.out.println("Introduce una frase");
        // String cadena = sc.nextLine();
        // System.out.println("Introduce la palabra que quieres reemplazar");
        // String palabra = sc.next();
        // sc.nextLine();
        // System.out.println("Introduce la palabra que quieres que sea el reemplazo");
        // String reemplazo = sc.next();
        // sc.nextLine();
        // String cadenaFinal = reemplazar(cadena, palabra, reemplazo);
        // System.out.println(cadenaFinal);

        // --------------------------------------------------------------

        /* Ejercicio 20 */
        System.out.println("Introduce una frase");
        String cadena = sc.nextLine();
        String cadenaOrdena = ordenarFrase(cadena);
        System.out.println(cadenaOrdena);
        sc.close();

    }

    /*
     * Ejercicio resuelto 6.5. diseña una función a la que se le pase una cadena de
     * caracterer y la devuelva invertida.
     * Un ejemplo, la cadena <<Hola mundo>> quedaría <<odnum aloH>>
     */

    static String alReves(String original) {
        String nueva = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            nueva += original.charAt(i);
        }
        return nueva;
    }

    // -----------------------------------------------------------------------

    /*
     * Ejercicio resuleto 6.11. Se dispone de la siguiente ralación de letra
     * Conjunto 1 : e, i, k, m, p, q, r, s, t, u, v
     * Conjunto 2 : p, v, i, u, m, t, e, r, k, q, s
     * Con ella es posible codificar un texto, convirtiendo cada letra del conjunto
     * 1 en su correspondiente del conjunto 2.
     * El resto de las letras no se modifican. Los conjuntos se utilizn tanto para
     * mayúsculas como minúsculas, mostrando siempre la codifucación en minúsculas
     * Un ejemplo: la palabra <<PaquiTo>> se codifica como <<matqvko>>
     * Realizar un programa que codifique un texto. Para ello implementar la
     * siguiente función:
     * char codifica(char conjunto1[], char conjunto2[], char c)
     * que devuelve el cárcter c codificado según los conjuntos 1 y 2 que se le pasa
     */
    static char codifica(char conjunto1[], char conjunto2[], char c) {
        // Conj1 es una string con los elemetos de la tabla conjunto1: Facilita la
        // busqueda
        final String conj1 = String.valueOf(conjunto1);
        // carácter codificado correspondiente a c
        char codificado;
        // Buscamos c en el conjunto1. Al ser conj1 una cadena, indexOf() buca por
        // nosotros. En otro caso, tendríamos que buscar mediante un bucle un elemento
        // en uno tabla
        int pos = conj1.indexOf(c);
        // Si no encontramos c en conj1 no podemos codificar, devolvemos c
        if (pos == -1) {
            codificado = c;
        } else {
            // pos marca la posición de c en conjunto1, entonces elegimos el correspondiente
            // en conjunto2
            codificado = conjunto2[pos];
        }
        return codificado;
    }

    /*
     * 11. Escribe un programa descodificar que muestre un texto codificado con el
     * programa realizado en la Actividad resuelta 6.11
     */
    static char descodificar(char conjunto1[], char conjunto2[], char c) {
        final String conj2 = String.valueOf(conjunto2);
        char descodificado;
        int pos = conj2.indexOf(c);

        if (pos == -1) {
            descodificado = c;
        } else {
            descodificado = conjunto1[pos];
        }
        return descodificado;
    }

    // ------------------------------------------------------

    /*
     * 6.12. Realiza el juego del ahorcado. las reglas del juego son:
     * a) El jugador A teclea una palabra, sin que el juegador B la vea
     * b) Ahora se le muestra tantos guiones como letras tenga la palabra secreta.
     * Por ejemplo, para <<hola>> será <<_ _ _ _>>
     * c) El jugador B intentará acertarm letra a letra la palabra secreta
     * d) Cada acierto muestra la letra en su lugar y las letras no acertadas
     * seguirán ocultas como guiones. Siguiendo con el ejemplo anterior, y
     * suponiendo que se ha introducido: la la 'o', la 'i' y la 'a' se mostrará :
     * <<_ o _ a>>
     * e) El jugador B solo tienen 7 intentos
     * f) la partida terminará al acertar todas las letra que forman la palabra
     * secreta (gana el juegador B) o cuando se agoten todos los intentos(gana el
     * jugador A)
     */
    static void juegoAhorcado() {

        // Objeto scanner
        Scanner sc = new Scanner(System.in);

        // Varible que tendra la palabra secreta del juegador a y la palabra del
        // juegador b
        String palabraSecreta, palabraIntroducida;

        // Array que tendra en número de letras de la palabra secreta y mostra '_' como
        // letras tenga
        char adivinando[];

        // Variable que se utilizaran para acabar el juego
        int intentos = 7;
        Boolean acertado = false;

        // Borramos la consola
        borraConsola();
        // Pedimos la palabra secreta
        System.out.println("Introduce la palabra secreta");
        palabraSecreta = sc.next();
        sc.nextLine();
        // Convertimos todas la letra en minúsculas
        palabraSecreta = palabraSecreta.toLowerCase();
        // Limpiamos la pantalla
        borraConsola();
        // Asignamos la longitud de la array que mostrará la palabra que se esta
        // adivinando
        adivinando = new char[palabraSecreta.length()];

        // Asignamos el carátec '_' a cada elemento de la array de la
        for (int i = 0; i < palabraSecreta.length(); i++) {
            adivinando[i] = '_';
        }

        do {
            // Mostramos cuanta letra tiene la palabra y mostramos por pantalla las letra
            // adivinadas y los intentos
            System.out.println("Tienes " + intentos + " intentos");
            System.out.println("La palabra tiene " + palabraSecreta.length() + " letras\n");
            for (int i = 0; i < adivinando.length; i++) {
                System.out.print(adivinando[i] + " ");
            }
            // Pedimo la palabra al segundo jugador
            System.out.println("\n\nIntroudce una palabra con las misma letra");
            palabraIntroducida = sc.next();
            sc.nextLine();
            // Convertimos todas la letra en minúsculas
            palabraIntroducida = palabraIntroducida.toLowerCase();

            // Comprobamos la longitud de la palabra introducida
            if (palabraIntroducida.length() != palabraSecreta.length()) {
                // Se resta un intento si no tienen la misma longitud
                intentos--;
            } else {
                // Si las palabras son iguales gana
                if (palabraSecreta.equals(palabraIntroducida)) {
                    acertado = true;
                } else {
                    // En caso de no ser iguales, se comprueba las letra una por una y se resta un
                    // intento
                    for (int i = 0; i < palabraSecreta.length(); i++) {
                        if (palabraIntroducida.charAt(i) == palabraSecreta.charAt(i)) {
                            adivinando[i] = palabraIntroducida.charAt(i);
                        }
                    }
                    intentos--;
                }

            }
            // Se borra la consola
            borraConsola();
        } while (intentos != 0 && !(acertado));

        // Mostramos el resultado
        if (acertado) {
            System.out.println("Has ganado");
        } else {
            System.out.println("Has perdido");
        }

        sc.close();
    }

    // Metodo que borra consola
    static void borraConsola() {

        try {

            String sistemaOperativo = System.getProperty("os.name");
            System.out.println(sistemaOperativo);
            ArrayList<String> comando = new ArrayList<String>();
            if (sistemaOperativo.contains("Windows")) {
                comando.add("cmd");
                comando.add("/c");
                comando.add("cls");
            } else {
                comando.add("clear"); // UNIX => MAC, LINUX
            }
            ProcessBuilder pb = new ProcessBuilder(comando);
            Process iniciarProceso = pb.inheritIO().start();
            iniciarProceso.waitFor();

        } catch (Exception e) {
            System.err.println("Error al limpiar por pantalla" + e.getMessage());
        }
    }

    // -------------------------------------------------

    /*
     * 6.13 El preprocesador del lenguaje C elimina los comentario (\/* \*) del
     * códdigo fuente antes del compilar .
     * Diseña un programa que lea por teclado una sentencia c, y elemine los
     * comentario
     * 
     * Imcompleto
     */

    static String eliminarComentarios(String cadena) {
        String copiaCadena = "";
        if (cadena.contains("/*") || cadena.contains("*/")) {
            copiaCadena = cadena.replace("/*", "");
            copiaCadena = cadena.replace("*/", "");
        }
        return copiaCadena;
    }

    /*
     * 6.14 Diseña una aplicación que se comporte como una pequeña agenda. Mediante
     * un menú el usuario podrá elegir entre:
     * a) Añadir un nuevo contacto(nombre y teléfono)
     * b) Buscar el teléfono de un contacto a partir de su nombre
     * c) mostrar información de todos los contactos ordenados alfabéticamente con
     * la forma nombre:teléfono
     * Pista: El nombre y el teléfono se pueden codificar como una única cadena con
     * las forma <<Nombr:teléfono>>
     */

    public void agenda() {
        borraConsola();
        Scanner sc = new Scanner(System.in);
        String[] agenda = new String[0];
        boolean cerrar = true;
        int opcion, numeroTelf;
        String nombre, numeroTelfString, copiaContacto;
        do {
            System.out.println("Introduce el numero de la acción que quiere realizar:");
            System.out.println("1.Añadir nuevo contacto");
            System.out.println("2.Buscar contacto");
            System.out.println("3.Mostrar todos los contactos en orden alfabético ");
            System.out.println("4.Cerrar");
            opcion = sc.nextInt();
            if (opcion == 1) {
                borraConsola();
                System.out.println("Introduce el nombre del contacto");
                nombre = sc.next();
                sc.nextLine();
                System.out.println("Introduce el teléfono del contacto");
                do {
                    numeroTelf = sc.nextInt();
                    numeroTelfString = String.valueOf(numeroTelf);
                    if (numeroTelfString.length() != 9) {
                        System.out.println("Por favor, introduce un número de 9 digitos");
                    } else {
                        agenda = Arrays.copyOf(agenda, agenda.length + 1);
                        agenda[agenda.length - 1] = nombre + ":" + numeroTelfString;
                        System.out.println("Contacto añadido correctamente\n");
                    }
                } while (numeroTelfString.length() != 9);
            } else if (opcion == 2) {
                borraConsola();
                if (agenda.length == 0) {
                    borraConsola();
                    System.out.println("No hay contactos, añade un contactos\n");
                } else {
                    System.out.println("Introduce el nombre del contacto");
                    nombre = sc.next();
                    nombre = nombre.toLowerCase();
                    sc.nextLine();
                    for (int i = 0; i < agenda.length; i++) {
                        copiaContacto = agenda[i].toLowerCase();
                        if (copiaContacto.contains(nombre)) {
                            System.out.println(agenda[i]);

                        }
                    }
                    System.out.println("");
                }
            } else if (opcion == 3) {
                borraConsola();
                if (agenda.length == 0) {
                    borraConsola();
                    System.out.println("No hay contactos, añade un contactos\n");
                } else {
                    Arrays.sort(agenda);
                    for (int i = 0; i < agenda.length; i++) {
                        System.out.println(agenda[i]);
                    }
                    System.out.println("");

                }

            } else if (opcion == 4) {
                borraConsola();
                System.out.println("Agenta cerrada");
                cerrar = false;
            } else {
                borraConsola();
                System.out.println("Introduce una opción válida\n");
            }
        } while (cerrar);
        sc.close();
    }

    // --------------------------------------------------------------------------
    /*
     * 6.15. Escribe un programa que lea el título y el contenido de una página wev.
     * La aplicación generará por consola un documento HTML donde el título será un
     * encabezado de primer nivel (<h1>) y el resto del contenido será un párrafo
     * (<p>)
     */

    static void creaHTML() {
        Scanner sc = new Scanner(System.in);
        String titulo, contenido, pagina;

        System.out.println("Introduce el título de la página");
        titulo = sc.nextLine();
        System.out.println("Introduce el contenido de la página");
        contenido = sc.nextLine();
        pagina = "<body>\n\t<h1>" + titulo + "</h1>\n\t<p>" + contenido + "</p>\n<body>";
        System.out.println(pagina);
        sc.close();
    };

    // ----------------------------------------------

    /*
     * 6.16 Lee una palabra o frase y muestra el proceso en el que cada letra se
     * sustituye por otro símbolo por no alfabético. Por ejemplo el caracter 'a' se
     * podría sustituir por el carácter '@', la 'e' por '3', 'i' por '1', etc
     */
    static void sustiutir(String cadena) {
        char original[] = { 'a', 'e', 'i', 'o', 'u' };
        char sustituir[] = { '@', '3', '1', '0', 'v' };
        String copiaCadena = cadena.toLowerCase();
        for (int i = 0; i < original.length; i++) {
            if (cadena.indexOf(original[i]) >= 0) {
                copiaCadena = copiaCadena.replace(original[i], sustituir[i]);
                System.out.println(copiaCadena);
            }
        }
    }

    // --------------------------------------------

    /*
     * 6.17 Construir un programa que convierta una palabra en secuencias de n
     * letras. Por ejemplo , la palabra <<destornillador>>, dividida en secuencias
     * de 4 letras, se mostrará de la siguiente manera:
     * dest
     * orni
     * llad
     * or
     */
    static void secuencias(String palabra, int secuencia) {
        int count = 0;
        char character[] = palabra.toCharArray();
        while (count < palabra.length()) {
            System.out.print(character[count]);
            if ((count + 1) % secuencia == 0) {
                System.out.println("");
            }
            count++;
        }
    }

    // ------------------------------------------------------------------

    /*
     * 6.18 Escribe una aplicación que convierte una frase (que puede estar escrita
     * con cualquier combinación de mayúsculas y minúsculas) en el nombre de una
     * variable que utilice la nimenclatura Camel.Por ejemplo, la frase <<Me Gusta
     * merenDAR gaLLetas>>, se convertirá en meGustaMerendarGalletas
     * Supondremos que cada oalabra que compone la frase está separada por un único
     * espacion en blanco
     */
    static void juntarFrase(String cadena) {
        char[] primeraMayus;
        String[] arrayString = cadena.toLowerCase().split(" ");
        String cadenaFinal = arrayString[0];
        for (int i = 1; i < arrayString.length; i++) {
            primeraMayus = new char[arrayString[i].length()];
            primeraMayus = arrayString[i].toCharArray();
            primeraMayus[0] = (char) (primeraMayus[0] - 'a' + 'A');
            cadenaFinal = cadenaFinal + String.valueOf(primeraMayus);
        }
        System.out.println(cadenaFinal);
    }

    // ------------------------------------------------

    /*
     * 6.19 Implementa un sencillo editor de texto que, una vez que se ha
     * introducido el texto, permite reemplazar todas kas ocurrencias de una palabra
     * por otra
     */
    static String reemplazar(String cadena, String palabra, String reemplazo) {
        String copia = cadena.replace(palabra, reemplazo);
        return copia;
    }

    // ------------------------------------------------

    /*
     * 6.20 Implementa un programa que lea una frase y muestre todas sus palabras
     * ordenadas de forma alfabética.Suponemos que cada palabra de la frase se
     * separa de ootra por un único espacio
     */

    static String ordenarFrase(String cadena) {
        String arrayString[] = cadena.split(" ");
        String fraseOrdena = "";
        Arrays.sort(arrayString);
        for (int i = 0; i < arrayString.length; i++) {
            fraseOrdena = fraseOrdena + arrayString[i] + " ";
        }
        return fraseOrdena;
    }
}
