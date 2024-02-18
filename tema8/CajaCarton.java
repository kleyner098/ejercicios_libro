package tema8;

public class CajaCarton extends Caja {

    /*
     * 8.13 la empresa de mensajería BiciExpress, que reparte en bicicleta, para
     * disminuir el peso que transporta sus empleados solo utilizan cajas de cartón.
     * El volumnen de estas se calcula como el 80% del volumen real, con el fin de
     * evitar que se deformen y se rompan. Otra característica de las cajas de
     * cartón es que sus medidas siempres están en centimetros. Por último, la
     * empresa, para controlar costes, necesita saber cuás es a superficie total de
     * cartón utilizado para construir todas las cajas.
     * Escribe la clase cajaCartón heredando de la clase Caja.
     */

    // Constructor de CajaCarton
    public CajaCarton(int ancho, int alto, int fondo) {
        super(ancho, alto, fondo, Unidad.CENTIMETROS);
    }

    // Método override de getVolumen y devuelve el 80% del volumen real
    @Override
    public double getVolumen() {
        double volumen = super.getVolumen() * 80 / 100;
        return volumen;
    }

    // Método que calcula la superficie total de la caja
    public int getSuperficie() {
        int total;
        int superfice1 = this.alto * this.ancho * 2;
        int superfice2 = this.alto * this.fondo * 2;
        int superfice3 = this.ancho * this.fondo * 2;
        total = superfice1 + superfice2 + superfice3;
        return total;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSuperficie total: " + getSuperficie() + "cm";
    }
}
