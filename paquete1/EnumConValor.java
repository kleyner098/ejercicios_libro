package paquete1;

public enum EnumConValor {
    PRECIONORMAL(100), PRECIOVIP(80); // los valores se pasan al constructor

    private double precio;

    private EnumConValor(double p) {
        precio = p;
    }

    public double getPrecio() {
        return precio;
    }
}
