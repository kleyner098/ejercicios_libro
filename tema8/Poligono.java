package tema8;

public abstract class Poligono {
    /*
     * 8.24 Implementa la clase abtracta Poligono, con los atributos base y altura, de
     * tipo double y el método abstracto double area()
     */
    protected double altura;
    protected double base;

    public Poligono(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    abstract double area();
}
