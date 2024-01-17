package paquete1;

public class A {
    private int nota;

    public A (int nota){
        this.nota = nota;
    }

    public A(){
    }

    static public void saludo(){
        System.out.println("Hola, mundo");
    }

    public void despedida(){
        System.out.println("Adios, mundo");
    }
    public void setNota(int nota){
        this.nota = nota;
    }

    public int getNota(){
        return nota;
    }
}
