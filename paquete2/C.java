package paquete2;

import paquete1.A;

public class C {
    public static void main(String[] args) {
        A.saludo();
        A nuevaA = new A();

        nuevaA.setNota(3);
        System.out.println(nuevaA.getNota());
    }
}
