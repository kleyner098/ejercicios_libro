
import java.util.Scanner;

/**
 * tema_3
 */
public class tema3 {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                /*
                 * 11.Realiza un programa que convierta un número decmial en su representasión
                 * binaria.
                 * Hay que tener en cuenta que desconovemos cuántas cifras tiene el número que
                 * introduce el usuario
                 * Por simplicidad, iremos mostrando el número binario con un dígitp por línia.
                 */

                // Decalración de variable
                // int numInicial;
                // int numDecimal;
                // String numBinary = "";
                // int rest;
                // //Introducimos el número
                // System.out.println("Introduce un numero entero en base decimal");
                // numInicial = sc.nextInt();
                // numDecimal = numInicial;
                // do{
                // rest = numDecimal % 2 ;
                // numBinary = rest + numBinary;
                // numDecimal /= 2;
                // } while(numDecimal >= 2);
                // numBinary = (numDecimal % 2) + numBinary;
                // //Mostrar resultado
                // System.out.printf("El numero %1$d en base decimal es %2$s en binario",
                // numInicial, numBinary);

                // ----------------------------------------------------------------

                /*
                 * 12. Modifica la actividad anterior para que el usuario introduzca un número
                 * en binario y el programa muestre su conversión a decimal
                 */

                // Declaración de variable
                // int numInicial;
                // int numBinary;
                // int numDecimal;
                // int conntador = 0;

                // //Introducimos el valor
                // numInicial = sc.nextInt();

                // numBinary = numInicial;

                // SIN HACER----------------------------------------------------------------

                // ------------------------------------------------------------------------------------------------

                /*
                 * 13. Escribe un programa que incremente la hora de un reloj. Se pedirán por
                 * teclado la hora, minutos y segundos.
                 * así como cuántos segundos se desea incrementar la hora introducida. La
                 * aplicación mostrará la nueva hora. Por ejmplo
                 * , si las 13:59:51 se incrementan en 10 segundos, resultan las 14:00:01.
                 */

                // Declaración de variables
                // String timeInput;
                // int secondsAdd, hours, minutes, seconds;
                // //Solicitamos la hora
                // System.out.println("Introduce la hora (00:00:00)");
                // timeInput =sc.nextLine();

                // //Rompenmos la cadena en hora, minutos y segundos
                // System.out.println("Introduce los segundos que quieres añadir");
                // String listTime[] = timeInput.split(":");

                // //Pedimos los segundos que se añadiran
                // secondsAdd = sc.nextInt();

                // seconds = Integer.parseInt(listTime[2]) + secondsAdd;
                // minutes = Integer.parseInt(listTime[1]);
                // hours = Integer.parseInt(listTime[0]);
                // if(seconds >= 60){
                // minutes = Integer.parseInt(listTime[1]) + seconds / 60;
                // seconds = seconds % 60;
                // if (minutes >= 60) {
                // hours =Integer.parseInt(listTime[0]) + minutes / 60;
                // minutes = minutes % 60;
                // if(hours >= 24){
                // hours = hours % 24;
                // }
                // }
                // }

                // System.out.printf("%1$d:%2$d:%3$d:", hours,minutes,seconds);

                // -----------------------------------------------------------------

                /*
                 * 14.Realiza un programa que nos pida un número n, y nos diga cuántos números
                 * hay entre 1 y n que sea primos.
                 * Un número primo es aquel que solo es divisible por 1 y por él mismo.
                 */

                // declaración de variables
                // int num;

                // //Introducimos un valor
                // System.out.println("Introduce un número entero que sera límite para buscar
                // cuantos números hay entre 1 y n");
                // num = sc.nextInt();

                // int contadorPrimos = num;

                // for(int numComprobando = num; numComprobando > 0 ; numComprobando--){
                // for(int divisor = 2; divisor < numComprobando; divisor++){
                // if( numComprobando % divisor == 0){
                // contadorPrimos--;
                // break;
                // }
                // }
                // }

                // //Mostrar resultado
                // System.out.printf("Entre 1 y %1$d hay %2$d números primos", num,
                // contadorPrimos);

                // -----------------------------------------------

                /*
                 * 15. Diseña una aplicación que dibuje el triángulo de Pascal, para n fila.
                 * Numerando las filas y elementos desde 0, la fórmula
                 * para obtener el m-ésimo elemento de la n-ésima fila es:
                 * E(n,m) = n!/(m!(n-m)!)
                 * Donde n! es el factorial de n
                 * Un ejemplo de tríangulo de pascal con 5 filas (n = 4) es ;
                 * 1
                 * 1 1
                 * 1 2 1
                 * 1 3 3 1
                 * 1 4 6 4 1
                 * 
                 */

                // Declaracion de variables
                // int num;
                // int nFactorial = 1;
                // int mFactorial = 1;
                // int nmFactorial = 1;
                // int elemento;
                // //Solicitud de fila
                // System.out.println("Introduce el número de filas");
                // num = sc.nextInt();

                // for(int i = 1; i <= num; i++){
                // for (int j = 1; j <= i; j++){

                // //Calcular n factorial, factorial de la fila(i)
                // for(int k = 1; k < i-1; k++ ){
                // nFactorial *= k;
                // }

                // //Calcular m factorial, factorial de la columna(j)
                // for(int l = 1; l < j-1; l++ ){
                // mFactorial *= l;
                // }
                // //Calcular (n-m) factorial, factorial de la fila menos la columna( i - j)
                // for(int z = 1; z < (i-j-1); z++ ){
                // nmFactorial *= z;
                // // System.out.print(nmFactorial + "------");
                // }
                // //Imprimir el elemento de cada columna

                // elemento = nFactorial/(mFactorial*nmFactorial);
                // System.out.print(elemento + " ");

                // //Reiniciar variables
                // nFactorial = 1;
                // mFactorial = 1;
                // nmFactorial = 1;
                // elemento = 0;
                // }

                // //Salto de fila
                // System.out.println("");
                // }

                // ----------------------------------------------

                /*
                 * Solicita al usuario un número y dibuja un triángulo de base y altura n, de la
                 * forma
                 * (n = 4)
                 * *
                 * * *
                 * * * *
                 * * * * *
                 * 
                 */

                // solicitud de n
                // System.out.println("Introduce el número de base y altura del triángulo");
                // int num = sc.nextInt();

                // for(int i =1 ; i <= num; i++){
                // if( i < num){
                // for(int k =1; k <= num-i; k++){
                // System.out.print(" ");
                // }

                // }
                // for(int j =1 ; j<=i ; j++ ){

                // System.out.print("* ");
                // }
                // System.out.println("");
                // }

                // ------------------------------------

                /*
                 * 17. Para dos números dados, a y b, es posible buscar el máximo común divisor
                 * (el número más grande que divide a ambos) mediante un algoritmo
                 * ineficiente pero sencillo: desde el menor de a y e ir buscando, de forma
                 * decreciente, el primer número que divide a ambos simultáneamente.
                 * Realiza un programa que calcule el máximo común divisor de dos números
                 */

                // System.out.println("Introduce un número");
                // int a = sc.nextInt();
                // System.out.println("Introduce un número");
                // int b = sc.nextInt();
                // int maximoComunDivisor = 1;
                // int menor;
                // if( a < b){
                // menor = b;
                // }else{
                // menor = b;
                // }

                // for (int i = menor; i > 1; i--){
                // if ( a % i == 0 && b % i == 0){
                // maximoComunDivisor = i;
                // break;
                // }
                // }

                // System.out.printf("El máximo común divisor de %1$d y %2$d es %3$d", a, b ,
                // maximoComunDivisor);

                // --------------------------------------------------

                /* 18. Crea un programa que encuentre el mínimo común multiplo de dos números */

                // Solicitar al usuario que ingrese dos números enteros
                System.out.print("Ingresa el primer número entero: ");
                int numero1 = sc.nextInt();

                System.out.print("Ingresa el segundo número entero: ");
                int numero2 = sc.nextInt();

                // Encontrar el máximo de los dos números
                int maximo = (numero1 > numero2) ? numero1 : numero2;

                // Inicializar el mínimo común múltiplo
                int mcm = maximo;

                // Encontrar el mínimo común múltiplo utilizando un bucle while
                while (true) {
                        if (mcm % numero1 == 0 && mcm % numero2 == 0) {
                                // Si se encuentra el MCM, salir del bucle
                                break;
                        }
                        // Incrementar el MCM
                        mcm += maximo;
                }

                // Mostrar el resultado
                System.out.println("El Mínimo Común Múltiplo (MCM) de " + numero1 + " y " + numero2 + " es: " + mcm);

                sc.close();
        }
}