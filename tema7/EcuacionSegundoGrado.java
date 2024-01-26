package tema7;

public class EcuacionSegundoGrado {
    /*
     * 7.12 Implementa una clase que permita resolver ecuaciones de segundo grado.
     * Los coeficientes pueden indicarse en el constructor y modificarse a
     * posteriori. Es fundamenta que la clase disponga de un método que devuelva las
     * distintas soluciones y de un método que nos informe si el discriminante es
     * positivo
     */

    private double a;
    private double b;
    private double c;
    private double discriminante;
    private double resultadoSuma;
    private double resultadoResta;
    

     EcuacionSegundoGrado(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
     }

     public void setA(double a) {
         this.a = a;
     }

     public double getA() {
         return a;
     }

     public void setB(double b) {
         this.b = b;
     }

     public double getB() {
         return b;
     }

     public void setC(double c) {
         this.c = c;
     }

     public double getC() {
         return c;
     }

     public double getDiscriminante(){
        discriminante = Math.pow(b, 2) - 4*a*c;

        return discriminante;
     }

     public String getResultados(){
        resultadoResta = 0;
        resultadoSuma = 0;
        
        if(getDiscriminante() >= 0){
            resultadoSuma = (-b + Math.sqrt(getDiscriminante()))/(2*a);
            resultadoResta = (-b - Math.sqrt(getDiscriminante()))/(2*a);
        }
         

        return "Resultado 1: " + resultadoSuma + "| Resultado 2: " + resultadoResta;
     }
}
