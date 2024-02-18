package tema9;

import java.util.Arrays;
import java.util.Comparator;

public class Lista implements Cola, Pila {

    /* 9.11 Implementa la clase Lista para almacenar elementos de tipo String */
    /* Ejercicio resuelto 7.11 */
    protected Object[] tabla;

    public Lista() {
        tabla = new Object[0];
    }

    public void insertarPrincipio(Object nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, 0, tabla, 1, tabla.length - 1);
        tabla[0] = nuevo;
    }

    public void insertarFinal(Object nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = nuevo;
    }

    public void insertarFinal(Lista otroLista) {
        int tam = tabla.length;
        tabla = Arrays.copyOf(tabla, tabla.length + otroLista.tabla.length);
        System.arraycopy(otroLista.tabla, 0, tabla, tam, otroLista.tabla.length);
    }

    public void insertar(int posicion, Object nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length);
        System.arraycopy(tabla, posicion, tabla, posicion + 1, tabla.length - posicion - 1);
        tabla[posicion] = nuevo;
    }

    public Object eliminar(int indice) {
        Object eliminado = null;
        if (indice >= 0 && indice < tabla.length) {
            eliminado = tabla[indice];
            for (int i = indice + 1; i < tabla.length; i++) {
                tabla[i - 1] = tabla[i];
            }
            tabla = Arrays.copyOf(tabla, tabla.length - 1);
        }
        return eliminado;
    }

    public Object get(int indice) {
        Object resultado = null;
        if (indice >= 0 && indice < tabla.length) {
            resultado = tabla[indice];
        }

        return resultado;
    }

    public int buscar(Object claveBusqueda) {
        int indice = -1;
        for (int i = 0; i < tabla.length && indice == -1; i++) {
            if (tabla[i].equals(claveBusqueda)) {
                indice = i;
            }
        }
        return indice;
    }

    public int numeroElemento() {
        return tabla.length;
    }

    /*
     * 8.14 Reimplementa la clase Lista de la Actividad resuelta 7.11 sustituyendo
     * el método mostrar por el método toString()
     */
    public String toString() {
        return Arrays.toString(tabla);
    }

    // public void mostrar() {
    // System.out.println("Lista: " + Arrays.toString(tabla));
    // }

    /*
     * 8.15 Escribe en la clase Lista un método equals() para compararlas. Dos
     * listas se considerán iguales si tienen los mismos elementos (incluidas las
     * repeticiones) en ele mismo orden.
     */

    public boolean equals(Lista otraLista) {
        boolean isEquasl = true;
        if (tabla.length != otraLista.tabla.length) {
            isEquasl = false;
        } else {
            for (int i = 0; i < tabla.length; i++) {
                if (tabla[i] != otraLista.tabla[i]) {
                    isEquasl = false;
                    break;
                }
            }
        }

        return isEquasl;
    }

    // Ejercicio 9.12
    @Override
    public void encolar(Object o) {
        insertarFinal(o);
    }

    @Override
    public Object desencolar() {
        return eliminar(0);
    }

    @Override
    public void apilar(Object nuevo) {
        insertarFinal(nuevo);
    }

    @Override
    public Object desapilar() {
        return eliminar(tabla.length - 1);
    }

    /*
     * 9.24 Implementar en la clase Lista para elementos Object las funciones
     * sobrecargadas:
     * -- void ordenar(), que ordena la lista con el orden natural de sus elementos.
     * -- void ordernar( Comparator c), que la ordena con el criterio que establezca
     * c. Aquí tendremos que ser muy cuidadosos con que todos los elementos
     * insertados sean del mismo tipo
     */

     public void ordenar(){
        Arrays.sort(tabla);
     }

     public void ordenar(Comparator c){
        Arrays.sort(tabla, c);
     }
}
