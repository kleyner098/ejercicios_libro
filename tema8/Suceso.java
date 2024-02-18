package tema8;

public class Suceso extends Punto3D{
    private int tiempo;

    public Suceso(double x, double y, double z, int tiempo){
        super(x, y, z);
        this.tiempo = tiempo;
    }

    
    @Override
    public boolean equals(Punto otroPunto) {
        boolean equals = false;
        Suceso otroSuceso = (Suceso) otroPunto;
        if (super.equals(otroPunto) && otroSuceso.getTiempo() == this.getTiempo()) {
            equals = true;
        }
        return equals;
    }


    public int getTiempo() {
        return tiempo;
    }


    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
}
