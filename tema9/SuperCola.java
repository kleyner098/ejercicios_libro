package tema9;

import java.util.Scanner;

public class SuperCola {

    /*
     * 9.15 Implementa la clase SuperCola, que tiene como atributos dos colas para
     * enteros, en las que se encola y desencola por separado. Sin embargo, si una
     * de las colas queda vacía, al llamar a su métodos desencolar, se desencola de
     * la otra mientras tenga elementos. Solo cuando las dos colas estén vacías,
     * cualquier llamada a desencolar devolverá null. Escribir un programa con el
     * menú:
     * 1. Escribir en cola1.
     * 2. Escibir en cola2.
     * 3. Desencolar en cola1.
     * 3. DEsencolar en cola2.
     * 5. Salir
     * Después de cada operación se mostrará el estado de las dos colas para seguir
     * su evolución
     */

    Cola cola1;
    Cola cola2;

    // Construtor

    public SuperCola(Cola cola1, Cola cola2) {
        this.cola1 = cola1;
        this.cola2 = cola2;
    }

    public void encolarCola1(int num) {
        cola1.encolar(num);
    }

    public void encolarCola2(int num) {
        cola2.encolar(num);
    }

    public int desencolarCola1() {
        if (cola1.toString() != "[]") {
            return (int) cola1.desencolar();
        } else if (cola2.toString() != "[]") {
            return (int) cola2.desencolar();
        } else {
            return 0;
        }

    }

    public int desencolarCola2() {
        if (cola2.toString() != "[]") {
            return (int) cola2.desencolar();
        } else if (cola1.toString() != "[]") {
            return (int) cola1.desencolar();
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        String resultado = cola2.toString() != "[]" || cola1.toString() != "[]"
                ? "Cola1: " + cola1.toString() + "\nCola2: " + cola2.toString()
                : "Null";
        return resultado;
    }

    public void menu() {
        Scanner sc = new Scanner(System.in);
        int option;
        int num;
        int fin = 1;
        String menu = """
                Introduce el numero de la opción
                    1. Encolar en cola1.
                    2. Encolar en cola2.
                    3. Desencolar de cola1.
                    4. Desencolar de cola2
                    5. Salir
                """;
        while (fin != 0) {
            System.out.println(menu);
            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    System.out.println("Introduce el número que quieres encolar en la cola 1");
                    num = sc.nextInt();
                    sc.nextLine();
                    encolarCola1(num);
                    System.out.println(this);
                    break;
                case 2:
                    System.out.println("Introduce el número que quieres encolar en la cola 2");
                    num = sc.nextInt();
                    sc.nextLine();
                    encolarCola2(num);
                    System.out.println(this);
                    break;
                case 3:
                    desencolarCola1();
                    System.out.println(this);
                    break;
                case 4:
                    desencolarCola2();
                    System.out.println(this);
                    break;
                case 5:
                    fin = 0;
                    break;
            }
        }
    }

}
