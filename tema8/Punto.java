package tema8;

public class Punto {
    /*
     * 8.25 Define la clase Punto, que tiene como atributos las coordenadas x e y,
     * de tipo entero, que lo sitúan en el plano. Además del constructor, implementa
     * el método double distncia(Punto otroPunto), que devuelve la distancia a otro
     * punto que se le pasa como parámetro. A partir de Punto, por herencia,
     * impleemnta la clase Punto3D, que representa un punto en tres dimensiones y
     * necesita una coordenada adicional z. Reimplementa el método distancia() para
     * puntos 3D.
     */

    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distancia(Punto otrPunto) {
        double xi = otrPunto.getX() - x;
        double yi = otrPunto.getY() - y;
        return Math.sqrt((Math.pow(xi, 2) + Math.pow(yi, 2)));
    }

    /*
     * 8.27 Implementa el método equals() pra las clases Punto y Punto3D, teniendo
     * en cuenta que dos puntos son iguales solo si tienen todas sus coodenadas
     * iguales
     */
    public boolean equals(Punto otroPunto) {
        boolean equals = false;
        if (otroPunto.getX() == this.x && otroPunto.getY() == this.y){
            equals = true;
        }
        return equals;
    }

}
