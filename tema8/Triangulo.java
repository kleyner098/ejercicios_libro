package tema8;

public class Triangulo extends Poligono {

    /*
     * 8.24 Heredando de Poligono, implementa las clases no abstractas Trinagulo y
     * Rectagunlo
     */
    Triangulo(double altura, double base) {
        super(altura, base);
    }

    @Override
    double area() {
        double area = (altura * base) / 2.0;
        return area;
    }

}
