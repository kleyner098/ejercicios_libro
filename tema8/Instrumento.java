package tema8;

import java.util.Arrays;

public abstract class Instrumento {
    /*
     * Actividad resuelta 8.4
     * Crea la clase abstracta Instrumento, que almacena en una tabla las notras
     * musicales de una melodía (dentro de una misma octava). El métod add() añade
     * nuevas notas musicales. La clase también dispone del método abstracto
     * interpretar() que, en cada subclase que herede de Instrumento, por consola
     * las notas musicales según las interprete. Utilizar enumerados para definir
     * las notas musicales
     */

    protected Nota[] melodia;

    public Instrumento() {
        melodia = new Nota[0];
    }

    void add(Nota n) {
        melodia = Arrays.copyOf(melodia, melodia.length + 1);
        melodia[melodia.length - 1] = n;
    }

    abstract void interpretar();

}
