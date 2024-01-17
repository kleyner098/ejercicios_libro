
import java.util.Scanner;

public class tema4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ejercicios resuelto 10
        // double base = 2;
        // int exponente = 2;
        // aElevadoNIterativa(base, exponente);
        // double resultado = aElevadoNRecursiva(base, exponente);
        // System.out.printf("%1$.2f^%2$d = %3$.2f\n", base, exponente, resultado);

        // ------------------------------------------------------------

        // Fibonacci
        // System.out.println("El valor de el elemento en la posición 5 de Fibonacci es
        // " + fibonacci(5));

        // -----------------------------------------------------
        // 11.====================================
        // System.out.println("Introduce el radio de la esfera");
        // double radio = sc.nextDouble();
        // System.out.println("Introduce la opción que quieres calcular: 1(Área)
        // 2(Volumen)");
        // int option = sc.nextInt();

        // double resultado = esfera(radio, option);

        // String cadena = option == 1 ? "area" : "volumen";
        // System.out.printf("El %1$s es %2$.2f ", cadena, resultado) ;
        // ==================================================

        // ------------------------------------------------------------------------------

        // 12.========================================================================
        // System.out.println("Introduce el primer punto de la siguiente manera: x1
        // y1");
        // double x1 = sc.nextDouble();
        // double y1 = sc.nextDouble();
        // System.out.println("Introduce el segundo punto de la siguiente manera: x2
        // y2");
        // double x2 = sc.nextDouble();
        // double y2 = sc.nextDouble();

        // double resultado = distancia(x1, y1, x2, y2);

        // System.out.printf("La distancia entre el punto (%1$.2f ,%2$.2f) y el punto
        // (%3$.2f ,%4$.2f) es %5$.2f ", x1,y1,x2,y2,resultado);
        // =================================================================================

        // --------------------------------------------------------------------------

        // 13.==============================================================================
        // System.out.println("Introduce un número ");
        // int num = sc.nextInt();
        // muestraPares(num);
        // =================================================================================

        // ---------------------------------------------------------------------------
        // 14.=====================================================================
        // System.out.println("Introduce el número de días, horas y minutos. (Todos en
        // una línea y dejando un espacio entre ellos)");
        // int dias = sc.nextInt();
        // int horas = sc.nextInt();
        // int minutos = sc.nextInt();

        // calcularSegundo(dias, horas, minutos);

        // ---------------------------------------------------------------------------
        // 15.===================================================================
        // System.out.println("Introduce la primera hora(00:00)");
        // String time1 = sc.nextLine();
        // String[] listTime1= time1.split(":");
        // int hora1 = Integer.parseInt(listTime1[0]);
        // int minutos1 = Integer.parseInt(listTime1[1]);

        // System.out.println("Introduce la segunda hora(00:00)");
        // String time2 = sc.nextLine();
        // String[] listTime2= time2.split(":");
        // int hora2 = Integer.parseInt(listTime2[0]);
        // int minutos2 = Integer.parseInt(listTime2[1]);

        // int resultrado = diferenciaMin(hora1, minutos1, hora2, minutos2);

        // System.out.printf("Entre %1$s y %2$s hay %3$d minutos", time1, time2,
        // resultrado);

        // ----------------------------------------------------------------------------
        // 16.=====================================================
        // System.out.println("Introduce un número");
        // int num = sc.nextInt();
        // divisoresPrimos(num);

        // -----------------------------------------------------------------------------
        // 17.=============================================
        // System.out.println("Introduce un número");
        // int num1 = sc.nextInt();
        // System.out.println("Introduce otro número");
        // int num2 = sc.nextInt();
        // sonAmigos(num1, num2);

        // -------------------------------------------------------------------------------
        // 18.=====================================================
        // System.out.println("Introduce el número de números aleatorios que quieres");
        // int numRandoms =sc.nextInt();
        // System.out.println("Introduce el número mínimo que mostrará en el rango");
        // int min =sc.nextInt();
        // System.out.println("Introduce el número máximo que mostrará en el rango");
        // int max =sc.nextInt();

        // numerosAleatorios(numRandoms, min, max);

        // -----------------------------------------------------------------------------------
        // 19.=================================================
        System.out.println("Introduce el número de números aleatorios que quieres");
        int numRandoms = sc.nextInt();

        numerosAleatorios(numRandoms);

        sc.close();
    }

    // Ejercicio 10. Diseña una función calcule a elevado a n, donde a es un real y
    // n un entero positivo.Realiza una version iterativa y otra recursiva
    // ITERATIVA
    static void aElevadoNIterativa(double base, int exponente) {
        double resultado = base;

        // Comprobar que el exponente es no es negativo
        if (exponente < 0) {
            System.out.println("Error. Introduce un numero entero positivo o cero\n");
        } else if (exponente == 0) {
            System.out.printf("%1$.2f^%2$d = 1\n", base, exponente);
        } else {
            // Realiza la multiplitación x veces
            for (int i = 1; i < exponente; i++) {
                resultado = resultado * base;
            }
            // Imprime por pantalla el resultado
            System.out.printf("%1$.2f^%2$d = %3$.2f\n", base, exponente, resultado);
        }
    };

    // RECURSIVA
    static double aElevadoNRecursiva(double base, int exponente) {
        double resultado;
        if (exponente == 0) {
            resultado = 1; // caso base
        } else {
            resultado = base * aElevadoNRecursiva(base, exponente - 1); // Llamada recursiva de la función
        }
        return (resultado);
    }

    // ------------------------------------------------------------------
    // Fibonacci
    static int fibonacci(int num) {
        int resultado;
        if (num == 0 || num == 1) {
            resultado = 1;
        } else {
            resultado = fibonacci(num - 1) + fibonacci(num - 2);
        }
        return (resultado);
    };

    // -----------------------------------------------

    /*
     * 11. Diseña una función que calcule y muestre la superficei y el volumen de
     * una esfera
     */
    static double esfera(double radio, int option) {
        double result = 0;
        if (option == 1) {
            double area = 4 * Math.PI * Math.pow(radio, 2);
            result = area;
        } else if (option == 2) {
            double volumnen = 4 * Math.PI * Math.pow(radio, 3) / 3;
            result = volumnen;
        } else {
            result = 0;
        }

        return result;
    }

    // -------------------------------------------------------

    /*
     * 12. Implementa la función:
     * static double distancia(double x1, double y1, double x2, double y2)
     * que calcula y devuelve la distancia euclidea que separa los puntos(x1, y1) y
     * (x2,y2). La fórmula para calcular esta distancia es:
     * distancia = ((x1-x2)^2 + (y1 - y2)^2)^(1/2)
     */
    static double distancia(double x1, double y1, double x2, double y2) {
        double resultado;
        resultado = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        return (resultado);
    }

    // ------------------------------------------------------
    /*
     * 13. Crea la función muestraPares(int n) que muestre por consola los primeros
     * n números pares.
     */
    static void muestraPares(int n) {
        if (n <= 0) {
            System.out.println("Error, introduce un número mayor 0 ");
        } else {
            System.out.print("Los numeros pares compredido entre 1 hasta " + n + " son : ");
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + ", ");
                }
            }
        }
    }

    // ---------------------------------------------------------------------------
    /*
     * 14. Escribe una función a la que se pase como parámetros de entrada una
     * cantidad de días, horas y minutos. La función calculará y delvolverá
     * el número de segundos que existen en los datos de entradas.
     */
    static void calcularSegundo(int dias, int horas, int minutos) {
        if (dias < 0 && horas < 0 && minutos < 0) {
            System.out.println("Por favor, introduzca un número entero positivo");
        } else {
            int resultado = dias * 24 * 3600 + horas * 3600 + minutos * 60;
            System.out.printf("Hay %1$d segundos en %2$d dias, %3$d horas, %4$d minutos", resultado, dias, horas,
                    minutos);
        }
    }

    // ----------------------------------------------------------------------------
    /*
     * 15. Diseña una función a la que se le pasan las horas y minutos de dos
     * instantes de tiempo cpn el siguiente prototipo:
     * static int diferenciaMin( int hora1, int minuto1, int hora2, minuto2)
     * La función devolverá la cantidad de minutos que existen de diferencia entre
     * los dos instantes utilizados
     */
    static int diferenciaMin(int hora1, int minuto1, int hora2, int minuto2) {
        int restultado;
        restultado = hora1 * 60 - hora2 * 60 + minuto1 - minuto2;
        restultado = restultado < 0 ? -restultado : restultado;
        return restultado;
    }

    // --------------------------------------------------------------------------
    /*
     * 16. Implementa la función divisoresPrimos() que muestra, por consola, todos
     * los divisores primos del número que se le pasa parámetros
     */
    static void divisoresPrimos(int number) {
        int esPrimo = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        esPrimo += 1;
                    }
                }
                if (esPrimo <= 2) {
                    System.out.printf("El número %1$d es divisor de %2$d y es primo\n", i, number);
                }
                esPrimo = 0;
            }
        }
    }

    // --------------------------------------------------------------------------
    /*
     * 17. Escribe una función que decida si dos números enteros positivos son
     * amigos. Dos números a y b son amigos si las suma de dos divisores
     * propios (distintos de él mismo) de a es igual a b. Y viceversa.
     * Para probar se pueden usar los números 220 y 284, que son amigos.
     */
    static void sonAmigos(int num1, int num2) {
        int sumaDivisores1 = 0;
        int sumaDivisores2 = 0;
        for (int i = 1; i <= num1 / 2; i++) {
            if (num1 % i == 0) {
                sumaDivisores1 += i;
            }
        }
        for (int i = 1; i <= num2 / 2; i++) {
            if (num1 % i == 0) {
                sumaDivisores2 += i;
            }
        }
        if (sumaDivisores1 == sumaDivisores2) {
            System.out.printf("Los números %1$d y %2$d son amigos", num1, num2);
        } else {
            System.out.printf("Los números %1$d y %2$d  no son amigos", num1, num2);
        }
    }

    // ---------------------------------------------------------------------------
    /*
     * 18. Crea una función que muestre por consola una serie de números aleatorios
     * enteros. Los parámetros de la función serán: la cantidad de números
     * aleatorios que ae mostrarár y los valores mínimos y máximos que estos pueden
     * tomar.
     */
    static void numerosAleatorios(int randomnumbes, int min, int max) {
        int contador = 1;
        while (contador != randomnumbes) {
            int random = (int) (Math.random() * max + min);
            if (min <= random && random <= max) {
                System.out.printf("El %1$dº número aleatorio es: %2$d\n", contador, random);
                contador++;
            }
        }
    }

    // ----------------------------------------
    /*
     * 19. Sobrecarga la función realizada en la Atividad de aplicación 4.18 para
     * que el único parámetro sea la cantidad de números aleatorios que
     * muestran por consola .
     * los números aleatorios serán reales y estarán comprendidos entre 0 y 1
     */
    static void numerosAleatorios(int randomnumbes) {
        int contador = 1;
        while (contador <= randomnumbes) {
            int random = (int) (Math.random() * 2);
            System.out.printf("El %1$dº número aleatorio es: %2$d\n", contador, random);
            contador++;

        }
    }

}
