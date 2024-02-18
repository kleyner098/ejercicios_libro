package tema8;

import tema7.Lista;

public class Cola extends Lista {
    /* 8.17 Escribe la calse Cola heredando de Lista (ver Atiividades 7.18) */
    public Cola() {
        super();
    }

    // Método que añade un elemento a la cola
    public void offer(Integer nuevo) {
        super.insertarFinal(nuevo);
    }

    // Método que elimina el primer elemento de la cola
    public Integer poll() {
        return super.eliminar(0);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    // Trabajar mejor el teme de herencia, debido a que la clase cola heredea algunos
    // métodos que no tiene sentido que herede debido al funcionamiento de una cola
}
