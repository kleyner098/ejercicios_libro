package tema7;

public class Punto {
    /*
     * 7.16 Escribe la calse Punto que represneta un punto en el plano (con un
     * componente x y un componente y), con los métodos:
     * - Punto( double x, double y): construye un objeto con los datos pasados como
     * parámetros.
     * - void desplazarX(double dx): incrementa el componente x en la cantidad dx.
     * - void desplazarY(double dy): incrementa el componente y en la cantidad dy.
     * - void desplazar(double dx, double dy): desplaza ambos componentes según las
     *   cantidades dx ( en el eje x) y dy (en ele componente y)
     * - double distanciaEuclidea(Punto otro): calcula y devuelve la distancia
     *   euclidea entre el punto incovante y el punto otro.
     * - void muestra(): muestra por consola la información relativa al punto
     */

     private double x;
     private double y;

    //Constructor 
     Punto(double x, double y){
        this.x = x;
        this.y = y;
     }

    //Gets de x e y 
     public double getX() {
         return x;
     }

     public double getY() {
         return y;
     }

     //set de x e Y
     public void setX(double x) {
         this.x = x;
     }
    
     public void setY(double y) {
         this.y = y;
     }

    //Deplazar 
    public void desplazarX(double dx){
        this.x += dx; 
    }
    
    public void desplazarY(double dy){
        this.y += dy; 
    }

    public void desplazar(double dx, double dy){
        this.x += dx;
        this.y += dy; 
    }

    public double distanciaEuclidea(Punto otro){
        double xi = Math.pow(otro.getX() - this.x, 2);
        double yi = Math.pow(otro.getY() - this.y, 2);
        double distancia = Math.sqrt(xi + yi);
        return distancia;
    }

    public void mostrar(){
        System.out.printf("\nPunto : (%1$.2f, %2$.2f)", this.x, this.y);
    }

}
