package tema8;

import tema7.Lista;

public class Pila extends Lista {
    /* 8.16 Diseñ la clase Pila heredando de Lista (ver actividad resuelta 7.13) */
    public Pila() {
        super();
    }

    // Método apilar
    public void apilar(Integer nuevo) {
        super.insertarFinal(nuevo);
    }

    // Método desapilar
    public Integer desapilar() {
        return super.eliminar(super.numeroElemento() - 1);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    // Trabajar mejor el teme de herencia, debido a que la pila heredea algunos
    // métodos que no tiene sentido que herede debido al funcionamiento de una pila
}
