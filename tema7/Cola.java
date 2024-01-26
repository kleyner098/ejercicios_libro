package tema7;

import java.util.Arrays;

public class Cola {

    /*
     * 7.16 Una cola es otra estructura dinámica como la pila, donde los elementos,
     * en vez de apilarse y despilarse, se encolan y desecolan. La diferencia cp las
     * pilas es que se desencola el primer elemento encolado, ya que así es como
     * funcionan las colas del autobús o del cien. El primero que llega es el
     * primero que sale de la cola (vamos a suponer que nadie se cuela). Por lo
     * tanto, los elementos se encolan y se desecnolan en extremos opuestos de la
     * estrucutura, llamados primero (el que está primero y será el próximo en
     * abandonar la cola) y último (el que llegó último). Implementa la calse Cola
     * deonde los elementos Interger encolados se guardan en una tabla
     */

    private Integer numArrays[] = new Integer[0];

    //Método que añade un nuevo número a la cola
    public void offer(Integer num) {
        this.numArrays = Arrays.copyOf(this.numArrays, this.numArrays.length + 1);
        this.numArrays[this.numArrays.length - 1] = num;
    }

    //Métod que elimina el primer elemento de la cola
    public void poll() {
        System.arraycopy(this.numArrays, 1, this.numArrays, 0, this.numArrays.length - 1);
        this.numArrays = Arrays.copyOf(this.numArrays, this.numArrays.length - 1);
    }

    //Mostrar cola
    public void mostrar() {
        System.out.println(Arrays.toString(numArrays));
    }
}
