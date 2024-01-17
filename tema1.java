
import java.util.Locale;
import java.util.Scanner;

public class tema1 {
        public static void main(String[] args) {
                // /*11.Un economista te ha encargado un programa para realizar cálculos con el
                // IVA.
                // * La aplicación debe solicitar la base imponible y el IVA que se debe
                // aplicar.
                // * Muestra en pantalla el importe correspondiente al IVA y al total.
                // */

                // // Se crea un un objeto escaner
                // Scanner sc = new Scanner(System.in);

                // // Declaracion de variables
                // double base, iva, priceIva, total;

                // //Solicitamos el valor de la base imponoible y la guardamos en una variable
                // System.out.println("Intorduca el valor de la base imponible");
                // base = sc.nextDouble();

                // //Solicitamos el valor del IVA y la guardamos en una variable
                // System.out.println("Intorduca el valor del IVA imponible");
                // iva = sc.nextDouble();

                // // Calculamos el importe del IVA y el total
                // priceIva = base * iva /100;
                // total = priceIva + base;

                // //Mostramos los resultado por pantalla
                // System.out.printf("El importe de iva corresponde a %1$.2f y el importe total
                // es %2$.2f", priceIva, total);

                // ---------------------------------------------------

                /*
                 * 12. Escribe un programa que tome como entrada un número entero
                 * e indique qué cantidad hay que sumarle para que el resultado sea múltiplo de
                 * 7.
                 */

                // Se crea un un objeto escaner
                // Scanner sc = new Scanner(System.in);

                // // Declaramos la variable
                // int num;

                // //preguntamos el valor del número y los guardamos en una variable
                // System.out.println("Introduce un número entero");
                // num = sc.nextInt();

                // int mod = num % 7;
                // int result = mod == 0 ? 0 : 7 - mod;
                // sc.close();
                // System.out.printf("Al número %1$d hay que sumarle %2$d para que sea multiplo
                // de 7", num, result);

                // -----------------------------------------------------------

                /*
                 * 13.Modifica la actividad 12 para que, indicando dos números n y m,
                 * diga qué cantidad hay que sumarle a n para que sea multiplo de m
                 */

                // Se crea un un objeto escaner
                // Scanner sc = new Scanner(System.in);

                // // Declaramos la variable
                // int n, m;

                // //preguntamos el valor del número y los guardamos en una variable
                // System.out.println("Introduce el número entero objetivo");
                // m = sc.nextInt();

                // System.out.println("Introduce el número entero que quieres saber cuanto hay
                // que sumarle para que sea multiplo de " + m);
                // n = sc.nextInt();

                // int mod = n % m;
                // int result = mod == 0 ? 0 : m - mod;
                // sc.close();
                // System.out.printf("Al número %1$d hay que sumarle %2$d para que sea multiplo
                // de %3$d", n, result, m);

                // ------------------------------------------------------------

                /*
                 * 14.Crea un programa que pida la base y la altura de un triángulo y muestre su
                 * área
                 */

                // Se crea un un objeto escaner
                Scanner sc = new Scanner(System.in);
                sc.useLocale(Locale.US); // en lugar de coma utilizaremos punto para los decimales

                double base, altura, area;

                // Pedimos el base, la altura y guardamos el valor en las variables
                System.out.println("Introduce la base del triángulo");
                base = sc.nextDouble();
                System.out.println("Introduce la altura del truángulo");
                altura = sc.nextDouble();

                // Calculamos el area y la mostramos por pantalla
                area = (base * altura) / 2;
                System.out.printf("El área es de triánguloa con base %1$.2f y altura %2$.2f es %3$.2f ", base, altura,
                                area);

                sc.close();

                // --------------------------------------------------------

                /*
                 * 15. Dado el siguiente polinomio de segundo grado: y= ax^2 + bx + c
                 * crea un programa que pida los coeficientes a,b y c, así como el calor de x.y
                 * calcula el valor correspondiente
                 * de y.
                 */

                // Crea un nuevo instacia de scanner
                // Scanner sc = new Scanner(System.in);

                // //Declaración de variable
                // double a, b, c, x, y;

                // System.out.println("Introduce los valores de coeficientes de a, b, c y valor
                // de x. (Deje un espcio en blanco entre ellos y escribalos en el orden
                // indicado)");
                // a = sc.nextDouble();
                // b = sc.nextDouble();
                // c = sc.nextDouble();
                // x = sc.nextDouble();

                // y = a*Math.pow(x, 2) + b*x + c;
                // System.out.printf("%5$.2f = %1$.2f*%4$.2f^2 + %2$.2f*%4$.2f + %3$.2f",
                // a,b,c,x,y);

                // sc.close();

                // --------------------------------------------------------

                /*
                 * 16. Diseña una aplicación que solicite al usuario que introduzca una cantidad
                 * de segundos.
                 * La aplicación debe mostrar cuántos horas, minutos y, segundos hay en el
                 * número de
                 * segundos introducidos por el usuario.
                 */

                // Creamos una nueva intancia del objeto scanner
                // Scanner sc = new Scanner(System.in);

                // //Declaramos de variables

                // int hours, minutes, secondsFinal, secondsInicial;

                // //Pedimos y guardamos el valor de segundos introducidos
                // System.out.println("Introduzca la cantidad de segundos");
                // secondsInicial = sc.nextInt();

                // hours = secondsInicial /3600;
                // minutes = secondsInicial % 3600 / 60;
                // secondsFinal = secondsInicial % 3600 % 60;

                // //Mostramos el resultado
                // System.out.printf("Horas:%1$d Minutos:%2$d Segundos:%3$d", hours, minutes,
                // secondsFinal);
                // sc.close();

                // ---------------------------------------------------------------------------------

                /*
                 * 17. Solicita al usuario tres distancias:
                 * La primera , en milímetros
                 * La segunda, en centímetros
                 * La tercera, en metros
                 * Diseña un programa que muestre la suma de las tres longitudes medidas en
                 * centrimetros.
                 */

                // //Creamos una instancia del objeto scanner
                // Scanner sc = new Scanner(System.in);

                // //Declaración de variables
                // int m, cm, mm;
                // double total;
                // //Pedimos el valor de la variables y las inicializamos
                // System.out.println("Introduce los milímetros");
                // mm = sc.nextInt();
                // System.out.println("Introduce los centímetros");
                // cm = sc.nextInt();
                // System.out.println("Introduce los metros");
                // m = sc.nextInt();

                // //Calculamos el total en centímetros

                // total = m*100 + cm + mm/10.0;

                // //Mostramos el resultado
                // System.out.printf("El total de %1$dm, %2$dcm y %3$dmm es %4$.2fcm",
                // m,cm,mm,total);
                // sc.close();

        }
}
