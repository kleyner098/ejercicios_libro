package tema8;

public class Punto3D extends Punto{
    private double z;
    public Punto3D(double x, double y, double z){
        super(x, y);
        this.z = z;
    }
    public Punto3D(double x, double y){
        super(x, y);
        this.z = 0;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public double distancia(Punto otroPunto) {
        Punto3D otroPunto3D = (Punto3D) otroPunto;
        double xi = otroPunto3D.getX() - super.getX();
        double yi = otroPunto3D.getY() - super.getY();
        double zi = otroPunto3D.getZ() - z;
        return Math.sqrt((Math.pow(xi, 2) + Math.pow(yi, 2) + Math.pow(zi, 2)));
    }

    @Override
    public boolean equals(Punto otroPunto) {
        boolean equals = false;
        Punto3D otroPunto3D = (Punto3D) otroPunto;
        if (super.equals(otroPunto) && otroPunto3D.getZ() == this.z) {
            equals = true;
        }
        return equals;
    }

    

}
