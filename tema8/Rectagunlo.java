package tema8;

public class Rectagunlo extends Poligono {
    
    /*
     * 8.24 Heredando de Poligono, implementa las clases no abstractas Trinagulo y
     * Rectagunlo
     */

    Rectagunlo(double altura, double base) {
        super(altura, base);
    }

    @Override
    double area() {
        double area = altura * base;
        return area;
    }

}
