package tema8;

public class ColaDoble extends Cola {
    /*
     * Diseña la clase ColaDoble , que hereda de Cola para enteros, añadiendo los
     * siguientes mértodos:
     * -- void encolarPrincipio(), que encola un elemento al principio de la cola
     * -- Integer desencolarFinal(), que desencola un elemento de final de la cola.
     */
    ColaDoble() {
        super();
    }

    public void encolarPrincipio(Integer nuevo) {
        super.insertarPrincipio(nuevo);
    }

    public Integer desencolarFinal() {
        return super.eliminar(super.numeroElemento() - 1);
    }
}
