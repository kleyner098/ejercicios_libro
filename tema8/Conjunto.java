package tema8;

import tema7.Lista;

public class Conjunto extends Lista {
    /*
     * 8.19 Un conjunto es un objeto similar a las listas, capaz de guardar valores
     * de u tipo determinado, con la diferencia de que sus elementos no pueden estar
     * repetidos. Escribe la clase Conjunto para enteros heredando la de Lista y
     * reimplementa los métodos de unserción para evitaar las repeticiones
     */
    Conjunto() {
        super();
    }

    @Override
    public void insertar(int posicion, Integer nuevo) {
        int indiceElemento = super.buscar(nuevo);
        if (indiceElemento < 0) {
            super.insertar(posicion, nuevo);
        }
    }

    @Override
    public void insertarFinal(Lista otroLista) {
        int indiceElemento;
        for (int i = 0; i < otroLista.numeroElemento(); i++) {
            indiceElemento = super.buscar(otroLista.get(i));
            if (indiceElemento < 0) {
                super.insertarFinal(otroLista.get(i));
            }
        }
    }

    @Override
    public void insertarPrincipio(Integer nuevo) {
        int indiceElemento = super.buscar(nuevo);
        if (indiceElemento < 0) {
            super.insertarPrincipio(nuevo);
        }
    }

    @Override
    public void insertarFinal(Integer nuevo) {
        int indiceElemento = super.buscar(nuevo);
        if (indiceElemento < 0) {
            super.insertarFinal(nuevo);
        }
    }

    /*
     * 8.20 Implementa el método equals() en la clase Conjunto. Dos conjuntos se
     * consideran iguales si tienen los mismo elementos, no importa el orden
     */

    @Override
    public boolean equals(Lista otraLista) {
        boolean isEquals = true;
        if (otraLista.numeroElemento() != super.numeroElemento()) {
            isEquals = false;
        }else{
            int indiceElemento;
            for (int i = 0; i < otraLista.numeroElemento(); i++) {
                indiceElemento = super.buscar(otraLista.get(i));
                if (indiceElemento < 0) {
                    isEquals = false;
                    break;
                }
            }
        }
        return isEquals;
    }

}
