package tema7;

import java.util.Arrays;

public class Pila {
    /*
     * 7.19 Implementa la clase de Pila para números Integer, usando directamente
     * una tabla para guardar los elementos apilados
     */

    private Integer pila[] = new Integer[0];

     public void push(Integer num){
        pila = Arrays.copyOf(pila, pila.length +1);
        pila[pila.length-1] = num; 
     }

     public void pop(){
        System.arraycopy(pila, 0, pila, 0, pila.length-1);
        pila = Arrays.copyOf(pila, pila.length-1);
     }

     public void mostrar(){
        System.out.println(Arrays.toString(pila));
     }
}
