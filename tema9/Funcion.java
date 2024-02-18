package tema9;

public interface Funcion {
    /*
     * 9.36 Escribir la interfaz Funcion con un único método abstracto:
     * double aplicar(double d)
     * Implementar en la clase Main el método:
     * static double[] funcionTabla( double[] tabla, Funcion f)
     * al que se le pasa una tablas de número reales y un objeto cuya clase
     * implementa la intefaza Funcion. Devolverá una nueva tabla cuyos elementos son
     * el resultado de aplicar el método aplicar(), que se haya definido en f, a
     * cada uno de los elemenos de la tabla original. Utilizar funcionTabla() para
     * calcular la raíz cuadrada de los elementos de una tabla de números reales.
     */
    double aplicar(double d);
}
