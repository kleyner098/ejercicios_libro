package tema9;

import java.util.Arrays;
import java.util.Comparator;

import tema9.Llamada.ZonaTarifa;

public class Tema9 {
    public static void main(String[] args) {
        /* Ejercicio 9.13 */
        // Futbolista[] arrayFutbolistas = new Futbolista[5];
        // arrayFutbolistas[0] = new Futbolista("123456789F", "Marcelo", 22, 11);
        // arrayFutbolistas[1] = new Futbolista("987654321D", "Adrian", 17, 12);
        // arrayFutbolistas[2] = new Futbolista("12438789H", "Cristian", 29, 41);
        // arrayFutbolistas[3] = new Futbolista("34321245J", "Daniel", 25, 22);
        // arrayFutbolistas[4] = new Futbolista("123456789F", "Juan", 22, 100);

        // System.out.println("Array sin ordenar: \n" +
        // Arrays.deepToString(arrayFutbolistas));
        // System.out.println();

        // // Orden natural
        // Arrays.sort(arrayFutbolistas);
        // System.out.println("Array ordenada por Dni: \n" +
        // Arrays.deepToString(arrayFutbolistas));
        // System.out.println();

        // // Se crea una clase especifica
        // ComparadorFubolistaNombre compararNombre = new ComparadorFubolistaNombre();
        // Arrays.sort(arrayFutbolistas,compararNombre);
        // System.out.println("Array ordenada por Nombre: \n" +
        // Arrays.deepToString(arrayFutbolistas));
        // System.out.println();

        // Se crea una clase anonima
        // Arrays.sort(arrayFutbolistas, new Comparator() {
        // public int compare(Object o1, Object o2) {
        // return ((Futbolista)o1).getEdad() - ((Futbolista)o2).getEdad();
        // };
        // });
        // System.out.println("Array ordenada por Edad: \n" +
        // Arrays.deepToString(arrayFutbolistas));

        // --------------------------

        // Ejercicio 9.14
        // CompEdadNombre comparador = new CompEdadNombre();
        // Arrays.sort(arrayFutbolistas, comparador);
        // System.out.println("Array ordenada por Edad y por nombre: \n" +
        // Arrays.deepToString(arrayFutbolistas));

        // --------------------------

        // Ejercicio 9.14

        // Cola cola1 = new Lista();
        // Cola cola2 = new Lista();
        // SuperCola superCola = new SuperCola(cola1, cola2);
        // superCola.menu();

        // --------------------------

        /*
         * 9.17 Escribe un programa donde se usa una Lista para elementos Object para
         * encolar y desencolar objetos de distintos tipos, mostrnadolos pro pantalla
         */

        // Cola cola = new Lista();
        // cola.encolar(1);
        // cola.encolar("Cadena");
        // cola.encolar('a');
        // cola.encolar(1.23);
        // Futbolista furbol = new Futbolista("123456789f", "Aurelio", 18, 123);
        // cola.encolar(furbol);
        // Integer[] array = { 1, 23, 4, 5 };
        // cola.encolar(array);
        // System.out.println(cola);

        // --------------------------

        /* 9.18 Repetir la Actividad 9.17 con la interfaz Pila apilando y desapilando */

        // Pila pila = new Lista();
        // pila.apilar(1);
        // pila.apilar("Cadena");
        // pila.apilar('a');
        // pila.apilar(1.23);
        // Futbolista furbol = new Futbolista("123456789f", "Aurelio", 18, 123);
        // pila.apilar(furbol);
        // Integer[] array = { 1, 23, 4, 5 };
        // pila.apilar(array);
        // System.out.println(pila);
        // for (int i = 0; i < 5; i++) {
        // pila.desapilar();
        // }
        // System.out.println(pila);

        // --------------------------

        /* 9.19, 9.20, 9.21, 9.22 */

        // Socio[] array = new Socio[5];
        // array[0] = new Socio(10, "Maria", "14-02-2002");
        // array[1] = new Socio(5, "Leon", "31-12-2002");
        // array[2] = new Socio(2, "Marta", "14-08-2006");
        // array[3] = new Socio(3, "Leorio", "27-01-1995");
        // array[4] = new Socio(4, "Celia", "11-07-2002");

        // System.out.println(Arrays.deepToString(array));
        // Arrays.sort(array);
        // System.out.println(Arrays.deepToString(array));

        // --------------------------

        /* Ejercicio 9.23 */
        // Socio[] array = new Socio[5];
        // array[0] = new Socio(10, "Maria", "14-02-2002");
        // array[1] = new Socio(5, "Leon", "31-12-2002");
        // array[2] = new Socio(2, "Marta", "14-08-2006");
        // array[3] = new Socio(3, "Leorio", "27-01-1995");
        // array[4] = new Socio(4, "Celia", "11-07-2002");

        // ComparadorNombre comp = new ComparadorNombre();
        // Arrays.sort(array, comp);
        // System.out.println(Arrays.deepToString(array));

        // --------------------------

        /*
         * 9.25 Usar la Lista de la Actividad de aplicación 9.24 para insertar cadenas
         * de caracteres y ordenarlos por oreden alfabético
         */

        // Lista listaCadena = new Lista();
        // listaCadena.insertarFinal("Hoal");
        // listaCadena.insertarFinal("Zorra");
        // listaCadena.insertarFinal("Avion");
        // listaCadena.insertarFinal("Tractor");
        // System.out.println(listaCadena);
        // listaCadena.ordenar();
        // System.out.println(listaCadena);

        // --------------------------

        /*
         * 9.26 Repetir Actividad de aplicación 9.25 con elementos de tipo Socio cuyo
         * orden natural es de la edad
         */

        // Socio[] array = new Socio[5];
        // array[0] = new Socio(10, "Maria", "14-02-2002");
        // array[1] = new Socio(5, "Leon", "31-12-2002");
        // array[2] = new Socio(2, "Marta", "14-08-2006");
        // array[3] = new Socio(3, "Leorio", "27-01-1995");
        // array[4] = new Socio(4, "Celia", "11-07-2002");

        // Lista listaSocio = new Lista();

        // for (int i = 0; i < array.length; i++) {
        // listaSocio.insertarFinal(array[i]);
        // }

        // System.out.println(listaSocio);
        // listaSocio.ordenar();
        // System.out.println(listaSocio);

        // --------------------------

        /*
         * 9.27 Manteniendo el mismo orden natural de la clase Socio (por edades),
         * ordenar la lsita de socios por orden alfabéticos de nombres
         */

        // Socio[] array = new Socio[5];
        // array[0] = new Socio(10, "Maria", "14-02-2002");
        // array[1] = new Socio(5, "Leon", "31-12-2002");
        // array[2] = new Socio(2, "Marta", "14-08-2006");
        // array[3] = new Socio(3, "Leorio", "27-01-1995");
        // array[4] = new Socio(4, "Celia", "11-07-2002");

        // Lista listaSocio = new Lista();

        // for (int i = 0; i < array.length; i++) {
        // listaSocio.insertarFinal(array[i]);
        // }

        // System.out.println(listaSocio);
        // ComparadorEdadNombre comp = new ComparadorEdadNombre();
        // listaSocio.ordenar();
        // System.out.println(listaSocio);
        // listaSocio.ordenar(comp);
        // System.out.println(listaSocio);

        // --------------------------

        /* Ejercicio 9.28 */

        // Jornada[] fichaJornadas = new Jornada[7];

        // fichaJornadas[0] = new Jornada("123456789f", "01-12-2023", "08:00", "17:00");
        // fichaJornadas[1] = new Jornada("987654321f", "15-01-2024", "10:30", "13:00");
        // fichaJornadas[2] = new Jornada("123456789f", "12-11-2024", "08:00", "12:32");
        // fichaJornadas[3] = new Jornada("273645918f", "05-06-2021", "08:00", "19:30");
        // fichaJornadas[4] = new Jornada("987654321f", "13-05-2024", "11:00", "18:47");
        // fichaJornadas[5] = new Jornada("746819128f", "24-12-2021", "08:00", "16:45");
        // fichaJornadas[6] = new Jornada("123456789f", "14-08-2023", "08:00", "12:01");

        // System.out.println(Arrays.deepToString(fichaJornadas));

        // Arrays.sort(fichaJornadas);
        // System.out.println(Arrays.deepToString(fichaJornadas));

        // --------------------------

        /*
         * 9.29 Usar la clase Lista de elemtntos Object para almacenar una serie de
         * jornadas de empleados como las de la Actividad de ampliación 9.28. Una vez
         * insertadas, ordenar la lista y mostra por pantalla sus elementos
         */

        // Jornada[] fichaJornadas = new Jornada[7];

        // fichaJornadas[0] = new Jornada("123456789f", "01-12-2023", "08:00", "17:00");
        // fichaJornadas[1] = new Jornada("987654321f", "15-01-2024", "10:30", "13:00");
        // fichaJornadas[2] = new Jornada("123456789f", "12-11-2024", "08:00", "12:32");
        // fichaJornadas[3] = new Jornada("273645918f", "05-06-2021", "08:00", "19:30");
        // fichaJornadas[4] = new Jornada("987654321f", "13-05-2024", "11:00", "18:47");
        // fichaJornadas[5] = new Jornada("746819128f", "24-12-2021", "08:00", "16:45");
        // fichaJornadas[6] = new Jornada("123456789f", "14-08-2023", "08:00", "12:01");

        // Lista listaJonadas = new Lista();
        // for (int i = 0; i < fichaJornadas.length; i++) {
        // listaJonadas.insertarFinal(fichaJornadas[i]);
        // }

        // System.out.println(listaJonadas);
        // listaJonadas.ordenar();
        // System.out.println(listaJonadas);

        // --------------------------

        /*
         * 9.30 Implementar una clase comparadora para ordenar las jornadas de trabajo
         * (ver actividades anteriores) por orden de números de minutos trabajados.
         * Ordenar la lista de la Actividad de ampliación 9.29 por dicho orden y
         * mostrarla por pantalla
         */

        // Jornada[] fichaJornadas = new Jornada[7];

        // fichaJornadas[0] = new Jornada("123456789f", "01-12-2023", "08:00", "17:00");
        // fichaJornadas[1] = new Jornada("987654321f", "15-01-2024", "10:30", "13:00");
        // fichaJornadas[2] = new Jornada("123456789f", "12-11-2024", "08:00", "12:32");
        // fichaJornadas[3] = new Jornada("273645918f", "05-06-2021", "08:00", "19:30");
        // fichaJornadas[4] = new Jornada("987654321f", "13-05-2024", "11:00", "18:47");
        // fichaJornadas[5] = new Jornada("746819128f", "24-12-2021", "08:00", "16:45");
        // fichaJornadas[6] = new Jornada("123456789f", "14-08-2023", "08:00", "12:01");

        // Lista listaJonadas = new Lista();
        // for (int i = 0; i < fichaJornadas.length; i++) {
        // listaJonadas.insertarFinal(fichaJornadas[i]);
        // }

        // System.out.println(listaJonadas);
        // listaJonadas.ordenar( new Comparator() {
        // @Override
        // public int compare(Object o1, Object o2) {
        // return ((Jornada)o1).min - ((Jornada)o2).min;
        // }
        // });
        // System.out.println(listaJonadas);

        // --------------------------

        /*
         * 9.32 Utilizar la clase lista para guardar una serie de llamadas. A
         * continuación, ordenarla con el criterio de orden natural y mostrarla por
         * pantalla.
         */

        // Llamada[] llamadas = new Llamada[10];

        // llamadas[0] = new Llamada(123456789, 987654321, true, "24-08-2023", "10:24",
        // "10:54", ZonaTarifa.CENTRO);
        // llamadas[1] = new Llamada(789654321, 312454541, false, "10-12-2023", "11:24",
        // "12:54", ZonaTarifa.CENTRO);
        // llamadas[2] = new Llamada(789654321, 987412812, true, "09-01-2024", "09:00",
        // "19:00", ZonaTarifa.NORTE);
        // llamadas[3] = new Llamada(123456789, 567829379, true, "03-11-2023", "02:00",
        // "02:02", ZonaTarifa.SUR);
        // llamadas[4] = new Llamada(987123456, 487193944, false, "29-06-2022", "22:47",
        // "23:45", ZonaTarifa.CENTRO);
        // llamadas[5] = new Llamada(987123456, 124335465, false, "02-02-2021", "12:00",
        // "12:11", ZonaTarifa.CENTRO);
        // llamadas[6] = new Llamada(123789456, 987654321, true, "15-10-2024", "16:00",
        // "16:30", ZonaTarifa.ESTE);
        // llamadas[7] = new Llamada(123789456, 987654321, true, "16-04-2022", "17:39",
        // "15:00", ZonaTarifa.CENTRO);
        // llamadas[8] = new Llamada(123456789, 412446413, false, "16-03-2022", "10:24",
        // "10:31", ZonaTarifa.CENTRO);
        // llamadas[9] = new Llamada(123456789, 987654321, true, "21-07-2023", "10:24",
        // "10:54", ZonaTarifa.NORTE);

        // Lista listaLlamadas = new Lista();
        // for (int i = 0; i < llamadas.length; i++) {
        // listaLlamadas.insertarFinal(llamadas[i]);
        // }
        // System.out.println(listaLlamadas);

        // listaLlamadas.ordenar();
        // System.out.println(listaLlamadas);

        // --------------------------

        /*
         * 9.33 Implementar una clase comparadora que ordene las llamadas por costes.
         * Usala para ordenar las listas de la Activida de ampliación 9.32 y mostrar el
         * resultado por pantalla.
         */

        // Llamada[] llamadas = new Llamada[10];

        // llamadas[0] = new Llamada(123456789, 987654321, true, "24-08-2023", "10:24",
        // "10:54", ZonaTarifa.CENTRO);
        // llamadas[1] = new Llamada(789654321, 312454541, false, "10-12-2023", "11:24",
        // "12:54", ZonaTarifa.CENTRO);
        // llamadas[2] = new Llamada(789654321, 987412812, true, "09-01-2024", "09:00",
        // "19:00", ZonaTarifa.NORTE);
        // llamadas[3] = new Llamada(123456789, 567829379, true, "03-11-2023", "02:00",
        // "02:02", ZonaTarifa.SUR);
        // llamadas[4] = new Llamada(987123456, 487193944, false, "29-06-2022", "22:47",
        // "23:45", ZonaTarifa.CENTRO);
        // llamadas[5] = new Llamada(987123456, 124335465, false, "02-02-2021", "12:00",
        // "12:11", ZonaTarifa.CENTRO);
        // llamadas[6] = new Llamada(123789456, 987654321, true, "15-10-2024", "16:00",
        // "16:30", ZonaTarifa.ESTE);
        // llamadas[7] = new Llamada(123789456, 987654321, true, "16-04-2022", "17:39",
        // "17:59", ZonaTarifa.CENTRO);
        // llamadas[8] = new Llamada(123456789, 412446413, false, "16-03-2022", "10:24",
        // "10:31", ZonaTarifa.CENTRO);
        // llamadas[9] = new Llamada(123456789, 987654321, true, "21-07-2023", "10:24",
        // "10:54", ZonaTarifa.NORTE);

        // Lista listaLlamadas = new Lista();
        // for (int i = 0; i < llamadas.length; i++) {
        // listaLlamadas.insertarFinal(llamadas[i]);
        // }
        // System.out.println(listaLlamadas);

        // listaLlamadas.ordenar(new Comparator() {
        // @Override
        // public int compare(Object o1, Object o2) {
        // Llamada llamada1 = (Llamada) o1;
        // Llamada llamada2 = (Llamada) o2;
        // return (int)(llamada1.coste() - llamada2.coste());
        // }
        // });
        // System.out.println(listaLlamadas);

        // --------------------------

        /* Ejercicio 9.36 */

        double[] array = {4,9,16,25,36,50};
        double[] resultado = funcionTabla(array, new Funcion() {
            @Override
            public double aplicar(double d) {
                return Math.sqrt(d);
            }
        });
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(resultado));
    }

    /*
     * 9.36 Escribir la interfaz Funcion con un único método abstracto:
     * double aplicar(double d)
     * Implementar en la clase Main el método:
     * static double[] funcionTabla( double[] tabla, Funcion f)
     * al que se le pasa una tablas de número reales y un objeto cuya clase
     * implementa la intefaza Funcion. Devolverá una nueva tabla cuyos elementos son
     * el resultado de aplicar el método aplicar(), que se haya definido en f, a
     * cada uno de los elemenos de la tabla original. Utilizar funcionTabla() para
     * calcular la raíz cuadrada de los elementos de una tabla de números reales.
     */

    static double[] funcionTabla(double[] tabla, Funcion f){
        double[] resultado = new double[tabla.length];
        for (int i = 0; i < resultado.length; i++) {
            resultado[i] = f.aplicar(tabla[i]);
        }
        return resultado;
    }
}
