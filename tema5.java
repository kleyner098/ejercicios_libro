
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class tema5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ejercicio propuesto 5.4
        // int tabla[] = {1,2,3,4,5,6};
        // System.out.println(buscar(tabla, 7));
        // ---------------------------------------------------
        // Ejercicio propuesto 5.5
        // int tabla[] = {1,2,3,4,6,7,8};
        // tabla = insercionOrdenada(tabla, 9);
        // System.out.println(Arrays.toString(tabla));
        // -----------------------------------------------------------
        // Ejercicio propuesto 5.6
        // int[] tabla = {1,2,3,4,5,6};
        // tabla = eliminacionOrdenada(tabla, 3);
        // System.out.println(Arrays.toString(tabla));
        // ----------------------------------------------------------
        // Ejercicio 11
        // int[] tabla = {1,2,3,2,4,5,2};
        // int[] indice =buscarTodos(tabla, 8);
        // System.out.println(Arrays.toString(indice));
        // -----------------------------------------------------------
        // Ejercicio 12
        // int[] tabla = {1,2,3,4,5};
        // desordenar(tabla);
        // -----------------------------------------------------------
        // Ejercicio 13
        // int[] tabla = {1,2,3,4,5};
        // int[] nuevaTabla = desordenarNuevaTabla(tabla);
        // System.out.println(Arrays.toString(nuevaTabla));
        // --------------------------------------------------------------
        // Ejercicio 14
        // ayuntamiento();
        // ---------------------------------------------------------------
        // notasAlumnos[grupo][trimestre][alumno]
        // int notasAlumnos[][][] = {
        // {
        // {6,3,7,7,10},{4,8,3,5,10},{5,6,6,8,10}
        // },
        // {
        // {5,5,5,5,5},{5,5,5,5,5},{5,5,5,5,5}
        // },
        // {
        // {5,5,5,5,5},{5,5,5,5,5},{5,5,5,5,5}
        // },
        // {
        // {5,5,5,5,5},{5,5,5,5,5},{5,5,5,5,5}
        // }
        // };
        // // System.out.println(notasAlumnos[0][0].length);
        // System.out.println("Introduce un grupo");
        // int grupo = sc.nextInt();

        // colegio(notasAlumnos, grupo);
        // ----------------------------------------------------------

        // String mapDefenition ="""
        // ┌───────────────────┬■┬────────┐
        // │ │ │ │
        // ├──────── ──────────┘ └─ ────┐ │
        // │ │ │
        // │ ┌────── ──────────┐ ┌──────┤ │
        // │ │ │ │ │ │
        // │ │ │ │
        // │ │ ─────────────────────────┤ │
        // │ │ │ │
        // │ ├─────────┐ ───────────────┤ │
        // │ │ │ │ │
        // │ │ ┌────┐ └────────────────┤ │
        // │ │ │ │ │
        // └─┴ ┴────┴─────────────────────┘
        // """;
        // multiStringToArry2nd(mapDefenition);
        // --------------------------------------------------------------------
        // Ejercicio 17
        // int[] tabla = {10,1,5,8,9,2};
        // int[] resultados = suma(tabla, 3);
        // System.out.println(Arrays.toString(resultados));
        // ----------------------------------------------------------------
        // int tabla[][] = {
        //         { 1, 2, 3, 4 },
        //         { 4, 1, 2, 0 },
        //         { 3, 4, 1, 2 },
        //         { 2, 3, 4, 1 }
        // };

        // matrizMagica(tabla);

        int table[] ={1,2,3,4};
        int clon[] = table.clone();
        for(int i=0;i<clon.length;i++){
            clon[i] = i+5;
        }
        System.out.println(Arrays.toString(table));
        System.out.println(Arrays.toString(clon));
        
        //deepToString
        int[][] numlists = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(numlists));
        System.out.println(Arrays.deepToString(numlists));

        
        sc.close();

    }

    /*
     * Ejercicio propuesto 5.4 Escribe la función int buscar(int t[], int clave),
     * que busca de forma secuencial en la tabla t el vaor clave.
     * En caso de encontrarlo, deuelve en que posición lo encontra; y en caso
     * contraruio, devolverá -1
     */

    static int buscar(int[] t, int clave) {
        int indice = -1;
        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) {
                indice = i + 1;
                break;
            }
        }

        return indice;
    }

    // ----------------------------------------------------------------------

    /*
     * Ejercicio propuesto 5.5. Escribe en una dunción el comportamiento de la
     * inserción ordenada
     */
    static int[] insercionOrdenada(int tabla[], int nuevo) {

        int[] copia = tabla;
        // Buscamos si el em¡lemento ya esta en la tabla
        int indiceInsercion = Arrays.binarySearch(tabla, nuevo);
        // binarySearch devuelve un entero negativo si el elemento no está en la tabla.
        // El núemero que delvuelve si no está en la tabla es la posición en la que
        // debería ir el nuevo elemento
        if (indiceInsercion < 0) {
            // Transformamos la posición negativa en la indice positivo
            indiceInsercion = -indiceInsercion - 1;
            // creamos una nueva tabla que contendra los valores anteriores y el nuevo valor
            copia = new int[tabla.length + 1];
            // Insertamos los valores menores que el valor que vamos a introducir en la
            // nueva tabla
            System.arraycopy(tabla, 0, copia, 0, indiceInsercion);
            // Insertams el nuevo valor en la nueva tabla
            copia[indiceInsercion] = nuevo;
            // Insertamos los valores mayores al nuevo valor en la nueva tabla
            System.arraycopy(tabla, indiceInsercion, copia, indiceInsercion + 1, tabla.length - indiceInsercion);
            // Referenciamos la nueva tablas.
        }
        return copia;
    }

    // -------------------------------------------------------------------
    /*
     * Ejercicio propuesto 5.6: Crea una función que realice el borrado de un
     * elemento en una tabla ordenada
     */
    static int[] eliminacionOrdenada(int[] tabla, int valor) {
        int[] copia = tabla;
        // Buscamos el elemento en la tabla. Si se encuentra en la tabla, binarySearch
        // devuelve el indice de elemento
        int indiceEliminar = Arrays.binarySearch(tabla, valor);
        // Si se encuentra realizamos la eliminación
        if (indiceEliminar >= 0) {
            // Desplazamos los valores mayores al valor a eliminar una posición menos,
            // eliminando en le proceso el valor que quermos eliminar.
            System.arraycopy(tabla, indiceEliminar + 1, copia, indiceEliminar, tabla.length - 1 - indiceEliminar);
            // Copiamos de nuevo la tabla con una longitud menos
            copia = Arrays.copyOf(copia, tabla.length - 1);
        }

        return copia;
    }

    // -------------------------------------------------------------------
    /*
     * 11.Realiza la función: int[] buscarTodos (int t[], int clave), que crea y
     * devuelve una tabla con todos los índices de los elementos donde se
     * ecuentra la clave de búsqueda. En el caso de que clave no se encuentre en la
     * tabla t, la función devolverá una tabla vacía.
     */
    static int[] buscarTodos(int[] t, int clave) {
        // Creo una tabla con la misma longitud que la tabla a comprobar
        int[] indice = new int[t.length];
        // Creo un contador
        int contador = 0;
        // Recorro la tabla a comprobar
        for (int i = 0; i < t.length; i++) {
            // Si un elemento de la tabla es igual a la clave lo guardo en la tabla indice y
            // sumo uno al contador
            if (t[i] == clave) {
                indice[contador] = i;
                contador++;
            }
        }
        // Compruebo si el contador ha cambiado
        // En caso de que no indice será una tabla vacía
        // En caso contrario copia en la tabla indice los elementos que si tienen un
        // valor
        if (contador == 0) {
            indice = new int[0];
        } else {
            indice = Arrays.copyOf(indice, contador);
        }
        return indice;
    }

    // -------------------------------------------------
    /*
     * 12.Escribe la función void desordenar(int t[]) que cambia de forma aleatoria
     * los elementos contenidos en la tabla t.
     * Si la tabla estuviera ordenada dejarñia de estarlo
     */
    static void desordenar(int[] t) {
        int aux;
        for (int i = 0; i < t.length; i++) {
            int numRamdon = (int) (Math.random() * (t.length));
            aux = t[i];
            t[i] = t[numRamdon];
            t[numRamdon] = aux;
        }
        System.out.println(Arrays.toString(t));
    }

    // -------------------------------------------------
    /*
     * 13. Modifica la actividad anterior para que la función no modifica la tabla
     * que se pasa como parámetro y, en su lugar cree y devuelva una copia
     * de la tabla donde se a desordenado los valores de los elementos
     */
    static int[] desordenarNuevaTabla(int[] t) {
        int[] desorder = Arrays.copyOf(t, t.length);
        int aux;
        for (int i = 0; i < t.length; i++) {
            int numRamdon = (int) (Math.random() * (t.length));
            aux = desorder[i];
            desorder[i] = desorder[numRamdon];
            desorder[numRamdon] = aux;
        }

        return desorder;
    }

    // ---------------------------------------------------
    /*
     * 14. El ayuntamiento de tu localidad te ha te ha encargado una aplicación que
     * ayude a realizar encuestas estadísticas para conocer el nivel
     * adquisitivo de los habitantes del municipio. Para ello, tendrás que preguntar
     * el sueldo a cada persona encuestada. A priori, no conoces el
     * número de encuestados. Para finalizar la entrada de datos, introduce un
     * sueldo con valor -1.
     * Una vez terminada la entrada de datos, muestra la siguiente información:
     * -Todos los sueldos introducidos ordenados de forma decreciente.
     * -Sueldo máximo y mínimo
     * -La media de los sueldo.
     */
    static void ayuntamiento() {
        // Array que guardará los sueldos
        int sueldoArray[] = new int[0];

        // Instancia de scanner
        Scanner sc = new Scanner(System.in);

        // Declaración de variable
        int nuevoSueldo;
        double media;
        int sueldoSuma = 0;
        System.out.println("Introduce el sueldo. Para finalizar el programa introduce -1");
        do {

            nuevoSueldo = sc.nextInt();
            if (nuevoSueldo == -1) {
                break;
            }
            sueldoArray = Arrays.copyOf(sueldoArray, sueldoArray.length + 1);
            sueldoArray[sueldoArray.length - 1] = nuevoSueldo;
            System.out.println("Introduce otro sueldo");
        } while (true);

        // Condición en el que si el primer sueldo es -1, muestra un mensaje, en caso
        // contrario mostrara lo solicitado en el ejercicio
        if (sueldoArray.length == 0) {

            System.out.println("No se ha introducido ningún sueldo");

        } else {

            // Para utilizar sort() y que ordene de mayor a menor necesitamos una arrays de
            // objeto y la libreria java.util.Collections;
            // Creo una array Integer
            Integer[] nuevoSueldoArrays = new Integer[sueldoArray.length];
            // Copio los datos en la nueva lista
            // Este bucle tambien se puede utilizar para calcular le máximo, mínimo y la
            // media. Por defecto el mínimo y máximo sera el primer valor
            int maximo = sueldoArray[0];
            int minimo = sueldoArray[0];
            for (int i = 0; i < sueldoArray.length; i++) {
                nuevoSueldoArrays[i] = sueldoArray[i];
                sueldoSuma += sueldoArray[i];
                // Minimo
                if (minimo > sueldoArray[i]) {
                    minimo = sueldoArray[i];
                }
                // Máximo
                if (maximo < sueldoArray[i]) {
                    maximo = sueldoArray[i];
                }
            }

            // Calculo de la media
            media = sueldoSuma / sueldoArray.length;

            // Ordeno la lista de mayor a menor
            Arrays.sort(nuevoSueldoArrays, Collections.reverseOrder());
            // Muestro la lista
            System.out.println("Lista de sueldo decreciete: " + Arrays.toString(nuevoSueldoArrays));

            // Muestro el mínimo y el maximo
            System.out.printf("Mínimo: %1$d | Máximo: %2$d \nLa media es %3$.2f", minimo, maximo, media);

        }

        sc.close();
    }

    // ---------------------------------------------------------
    /*
     * 15. Debes desarrollar una aplicación que ayude a gestionar las notas de un
     * centro educativo. Los alumnos se organizan en grupos compuestos
     * por 5 personas. Leer las notas (números enteros) del primer, segundo y tercer
     * trimestre de un gurpo. Debes mostrar al final la nota media
     * del grupo en cada trimestre y la media del alumno que se encuentra en una
     * posición dada (que el usuario introduce por teclado).
     */
    static void colegio(int[][][] tabla, int grupo) {
        Scanner sc = new Scanner(System.in);
        int sumaNotas = 0;
        double media;

        if (grupo > tabla.length || grupo < 1) {
            System.out.println("Introduzca un grupo válido");
        } else {
            for (int trimestre = 0; trimestre < tabla[grupo - 1].length; trimestre++) {
                for (int alumno = 0; alumno < tabla[grupo - 1][trimestre].length; alumno++) {
                    sumaNotas += tabla[grupo - 1][trimestre][alumno];
                }
                System.out.println(sumaNotas);
                media = sumaNotas / 5.00;
                System.out.printf("Nota media del %1$dº trimestre: %2$.2f\n", trimestre + 1, media);
                sumaNotas = 0;
                media = 0;
            }

            System.out.println("Introduce el número del alumno del que quieres ver la media");
            int numAlumno = sc.nextInt();
            if (numAlumno > 5 || numAlumno < 1) {
                System.out.println("Introduzca un número de alumno válido (Entre 1 y 5)");
            } else {
                for (int trimestre = 0; trimestre < tabla[grupo - 1].length; trimestre++) {
                    sumaNotas += tabla[grupo - 1][trimestre][numAlumno - 1];
                }
                media = sumaNotas / 3.00;
                System.out.printf("Nota media del alumno nº %1$d del grupo %2$d es %3$.2f", numAlumno, grupo, media);
            }
        }
        sc.close();
    }

    // -------------------------------------------------------------------------------

    static void multiStringToArry2nd(String string) {
        // Creamos una array que guardará las líneas de de la multi string, luego la
        // utilizaremos tambíen para saber las líneas que hay
        String[] filas = string.split("\n");
        // Buscamos el número de columnas, es decir los caráteres
        int columnas = filas[0].split("").length;

        // Creamos un nuevo array bidimensional que guardara toda la string
        String[][] map = new String[filas.length][columnas];

        // Guardamos cada carácter en la array bidimensional
        for (int fila = 0; fila < filas.length; fila++) {
            String[] copia = filas[fila].split("");
            for (int columna = 0; columna < columnas; columna++) {
                map[fila][columna] = copia[columna];
            }
        }

        // Imprimimos la array bidimensional
        for (int fila = 0; fila < map.length; fila++) {
            for (int columna = 0; columna < map[fila].length; columna++) {
                System.out.print(map[fila][columna]);
            }
            System.out.println();
        }
    }

    // ----------------------------------------------------------------------------------

    /*
     * 17. Implementa la función: int[] suma(int[] t, int numElemento), que crea y
     * devuelve una tabla con las sumas de los numElementos elementos
     * consecutivos de t. Veamos un ejemplo, sea t =[10,1,5,8,9,2]. Si los elementos
     * de t se agrupan de 3 en e, se harán las sumas:
     * 10+1+5. Igual a 16
     * 1+5+8. Igual a 14
     * 5+8+9. Igual a 22
     * 8+9+2: Igual a 19
     */

    static int[] suma(int t[], int numElemento) {
        // Creo una copia de la array introducida
        int[] copia = Arrays.copyOf(t, t.length);
        // Array que guardará los resultados
        int resultados[] = new int[0];
        // Variable que sumará los n elementos
        int suma = 0;
        // Bucle que se repetira hasta que la tabla copia tenga la misma longitud que
        // numElemento
        while (copia.length >= numElemento) {
            // Iteración que hará la suma de los n elementos primeros de la tabla copia
            for (int i = 0; i < numElemento; i++) {
                suma += copia[i];
            }
            // Ampliación de la tabla resultado
            resultados = Arrays.copyOf(resultados, resultados.length + 1);
            // Asignamos el valor de lo n elementos sumados a último elemento de la tabla
            // resultado
            resultados[resultados.length - 1] = suma;
            // Reiniciamos la variable suma
            suma = 0;
            // Desplazamos todos los elementos de copia un posisción menos
            System.arraycopy(copia, 1, copia, 0, copia.length - 1);
            // Reducimos la longitud de la tabla copia
            copia = Arrays.copyOf(copia, copia.length - 1);
        }

        return resultados;

    }

    // ----------------------------------------------------------------------------------------------

    /*
     * 18. Escribe un programa que solicite los elementos de una matriz de tamaño 4
     * x 4. La aplicación debe decidir si la matriz introducida
     * si la matriz introducida corresponde a una matriz mágica, que es aquella
     * donde la suma de los elementos de cualquier fila o de cualquier
     * columna valen lo mismo
     */
    static void matrizMagica(int[][] t) {
        // Declaración de variable que tendra la sumas de las filas y columnas
        int sumaFila = 0;
        int sumaColumna = 0;
        // Varible que guradará el valor de la suma de la primera columna y la primera
        // fila y que se utilizará para comprobar las siguiente sumas de las filas y
        // columnas
        int sameSuma = 0;
        // Variable que guardara un valor booleano que nos indicara si la matriz es
        // mágica o no
        boolean isMagicArray = true;

        // Bucle que recorre la array
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                sumaFila += t[i][j]; // Variable que suma los elementos de la fila
                sumaColumna += t[j][i]; // Variable que suma los elementos de la columna
            }
            // Condición para comprobar si la suma de la primera fila y  primera columna son
            // iguales, en caso de ser iguales se guarda en las variables
            // sameSuma que se utilizaran para comprobar con las siguientes sumas de filas y columnas
            //Tambien comprobamos la primera iteración
            if (sameSuma == 0 && sumaColumna == sumaFila) {
                sameSuma = sumaColumna;
            } else {
                //Comprobación de las siguientes filas y columnas son iguales
                if (sumaColumna != sameSuma || sumaFila != sameSuma) {
                    isMagicArray = false;
                } 
            }
            //Reinicio de variables suma al acabar la comprobación de cada fila y columna 
            sumaFila = 0;
            sumaColumna = 0;
        }

        //Condición que nos muestra si es una matriz mágica
        if (isMagicArray) {
            System.out.println("Es una matriz mágica");
        } else {
            System.out.println("No es una matriz mágica");
        }

    }

}