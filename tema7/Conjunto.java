package tema7;

import java.util.ArrayList;

public class Conjunto {

    /*
     * 7.21 Un conjunto es una estructura dinámica de datos como las listas, don dos
     * diferencias : en primer lugar, en una lista puede haber elementos repetidos,
     * mientras que en un conjunto,no. Además, en una lista el orden de inserción de
     * los elementos piede ser relevante y debemos tenerlo en cuenta, mientras que
     * en un conjunto solo interesa si un elemeto pertenece o no al conjunto y no
     * el lugar que ocupa. Se pide implementar la calse Conjunto utilizando una
     * lista
     * para alamcenar números de tipo Interger. Implermenta los siguientes métodos:
     * - Un constructor sin parámetros.
     * - int numeroElemento(): devuelve el número de elementos del conjunto.
     * - boolean insertar(Integer nuevo): inserta un nuevo elemento en el conjunto.
     * - boolean insertar( Conjunto otroConjunto): añade al conjunto los elementos
     * del otroConjunto.
     * - boolean eliminarElemento(Integer elemento): en caso de pertenecer al
     * conjunto, elimina elemento
     * - boolean eliminarConjunto(Conjunto otroConjunto): elimina del conjunto
     * invocante los elementos del conjunto que se pasa como parámetro.
     * - boolean pertenece(Integer elemento): indica si el elemnto que se le pasa
     * como parámetro pertenece o no al conjuto
     * De forma general, los métodos que devuelven un booleano indica con él si el
     * conjunto se ha modificado
     */

    /*
     * 7.22 Añade a la clase conjunto los metodos estáticos:
     * - static boolean incluido(Conjuton c1, Conjunto c2): que devuelce true si c1
     * está incluido en c2, es decir, si todos los elementos de c1 está también en
     * c2.
     * - static Conjunto union(Conjunto c1, Conjunto c2): devuelve un nuevo conjunto
     * con todos los elemento que están en c1, en c2 o en ambos (elementos comunes y
     * no comunes).
     * - static interseccion(Conjunto c1, Conjunto c2): que devuelve un nuevo
     * conjunto con todos los elementos que están en c1 y c2 a la vez (elementos
     * comunes).
     * static diferecia(Conjunto c1, Conjunto c2): que devuelve un nuevo conjunto
     * con todos los elementos que están en c1 pero no en c2.
     */

    private ArrayList<Integer> set;

    // Constructor general
    Conjunto() {
        this.set = new ArrayList<>();
    }

    // método que devuelve el tamaño del conjunto
    public int numeroElemento() {
        return set.size();
    }

    // Método que inserta un nuevo elemento
    public boolean insertar(Integer nuevo) {
        boolean insert = false;
        if (!(set.contains(nuevo))) {
            set.add(nuevo);
        }
        return insert;
    }

    // Método que devuelve un elemento
    public Integer get(int index) {
        return set.get(index);
    }

    // método que inserta otro conjunto
    public boolean insertar(Conjunto otroConjunto) {
        boolean insert = false;
        for (int i = 0; i < otroConjunto.numeroElemento(); i++) {
            if (!(set.contains(otroConjunto.get(i)))) {
                this.set.add(otroConjunto.get(i));
                insert = true;
            }
        }
        return insert;
    }

    // Método que elimina un elemento si esta en el conjunto
    public boolean eliminarElemento(Integer elemento) {
        boolean delete = false;
        if (set.contains(elemento)) {
            set.remove(elemento);
        }
        return delete;
    }

    // Método que elimina un conjunto si esta en el conjunto
    public boolean eliminarConjunto(Conjunto otroConjunto) {
        boolean delete = false;
        for (int i = 0; i < otroConjunto.numeroElemento(); i++) {
            if (set.contains(otroConjunto.get(i))) {
                set.remove(otroConjunto.get(i));
                delete = true;
            }
        }
        return delete;
    }

    // método que indica si un elemento está en el conjunto
    public boolean pertenece(Integer elemento) {
        boolean isIn = false;
        if (set.contains(elemento)) {
            isIn = true;
        }
        return isIn;
    }

    // Método que muestra el conjunto
    public String mostrar(){
        return set.toString();
    }

    // Método estático que comprue si los elementode de c1 están en c2
    static public boolean incluido(Conjunto c1, Conjunto c2) {
        boolean isIn = true;
        for (int i = 0; i < c1.numeroElemento(); i++) {
            if (!(c2.pertenece(c1.get(i)))) {
                isIn = false;
                break;
            }
        }
        return isIn;
    }

    //Método que devuelve la unión de los dos conjuntos
    static public Conjunto union(Conjunto c1, Conjunto c2){
        Conjunto nuevoConjunto = new Conjunto();
        nuevoConjunto.insertar(c1);
        nuevoConjunto.insertar(c2);        
        return nuevoConjunto;
    }

    // Método que devuelve la interseccion de dos conjuntos
    static public Conjunto interccion(Conjunto c1, Conjunto c2){
        Conjunto nuevoConjunto = new Conjunto();
        Conjunto menosElemntos = c1.numeroElemento() <= c2.numeroElemento() ? c1 : c2;
        Conjunto masElemntos = c1.numeroElemento() >= c2.numeroElemento() ? c1 : c2;

        for (int i = 0; i < menosElemntos.numeroElemento() ; i++) {
            if (masElemntos.pertenece(menosElemntos.get(i))) {
                nuevoConjunto.insertar(menosElemntos.get(i));
            }
        }
        return nuevoConjunto;
    }

    // Método que devuelve la diferencia de dos conjuntos
    static public Conjunto diferencia(Conjunto c1, Conjunto c2){
        Conjunto nuevoConjunto = new Conjunto();
        for (int i = 0; i < c1.numeroElemento(); i++) {
            if(!(c2.pertenece(c1.get(i)))){
                nuevoConjunto.insertar(c1.get(i));
            }
        }
        for (int i = 0; i < c2.numeroElemento(); i++) {
            if(!(c1.pertenece(c2.get(i)))){
                nuevoConjunto.insertar(c2.get(i));
            }
        }
        
        return nuevoConjunto;
    }
}
