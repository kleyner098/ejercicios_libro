package tema7;

import java.util.Arrays;

public class Lista {

    /* Ejercicio resuelto 7.11 */
    protected Integer[] tabla;

    public Lista() {
        tabla = new Integer[0];
    }

    public void insertarPrincipio(Integer nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, 0, tabla, 1, tabla.length - 1);
        tabla[0] = nuevo;
    }

    public void insertarFinal(Integer nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = nuevo;
    }

    public void insertarFinal(Lista otroLista) {
        int tam = tabla.length;
        tabla = Arrays.copyOf(tabla, tabla.length + otroLista.tabla.length);
        System.arraycopy(otroLista.tabla, 0, tabla, tam, otroLista.tabla.length);
    }

    public void insertar(int posicion, Integer nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length);
        System.arraycopy(tabla, posicion, tabla, posicion + 1, tabla.length - posicion - 1);
        tabla[posicion] = nuevo;
    }

    public Integer eliminar(int indice) {
        Integer eliminado = null;
        if (indice >= 0 && indice < tabla.length) {
            eliminado = tabla[indice];
            for (int i = indice + 1; i < tabla.length; i++) {
                tabla[i - 1] = tabla[i];
            }
            tabla = Arrays.copyOf(tabla, tabla.length - 1);
        }
        return eliminado;
    }

    public Integer get(int indice) {
        Integer resultado = null;
        if (indice >= 0 && indice < tabla.length) {
            resultado = tabla[indice];
        }

        return resultado;
    }

    public int buscar(Integer claveBusqueda) {
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

}
