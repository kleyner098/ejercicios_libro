
import java.util.Scanner;

public class tema2 {
        public static void main(String[] args) {

                /*
                 * 11. Escribe una aolicación que solicite al usuario un número compredido entre
                 * 0 y 9999.
                 * La aplicación tendrá que indicar si el número indtroducido es capicúa.
                 */

                // Crear nueva instancia de scanner
                // Scanner sc = new Scanner(System.in);

                // //Declaación de variables
                // int num, cifra_1, cifra_2, cifra_3, cifra_4;

                // //Introducir el valor por teclado y la guardamos en una variable
                // System.out.println("Introduce un número entre 0 y 9999");
                // num = sc.nextInt();

                // if( num >= 0 && num <= 9999){
                // cifra_1 = num / 1000;
                // cifra_2 = num / 100 % 10;
                // cifra_3 = num % 100 / 10;
                // cifra_4 = num % 10 ;
                // if (cifra_1 == cifra_4 && cifra_2 == cifra_3){
                // System.out.println("El número " + num + " es capicúa" );
                // } else{
                // System.out.println("El número " + num + " no es capicúa");
                // }

                // } else{
                // System.out.println("No has introducido un número comprendido entre 0 y
                // 9999");
                // }

                // -------------------------------------------------------------------

                /*
                 * El DNI consta de un entero de 8 dígitos seguido de una letra que se obtiene a
                 * partir del número
                 * de la siguiente forma:
                 * letra = número DNI módulo 23
                 * RESTO 0 1 2 3 4 5 6 7 8 9 10 11
                 * LETRA T R W A G M Y F P D X B
                 * 
                 * RESTO 12 13 14 15 16 17 18 19 20 21 22
                 * LETRA N J Z S Q V H L C K E
                 * 
                 * Y diseña una aplicación en la que, dado un número de DNI, calcule la letra
                 * que le corresponde.
                 * Observa que un número de 8 dígitos está dentro de rango del tipo int.
                 */

                // Objeto scanner
                // Scanner sc = new Scanner(System.in);

                // //Declaración de variable
                // int num_dni, modulo_dni;

                // //Introducir dni por teclado y guardar variable
                // System.out.println("Introduce solo los dígitos del DNI");
                // num_dni = sc.nextInt();
                // modulo_dni = num_dni % 23;

                // //Evaluamos el modulo del dni y asignamos un valor a letra
                // char letra = switch (modulo_dni) {
                // case 0 -> {
                // yield 'T';
                // }
                // case 1 -> {
                // yield 'R';
                // }
                // case 2 -> {
                // yield 'W';
                // }
                // case 3 -> {
                // yield 'A';
                // }
                // case 4 -> {
                // yield 'G';
                // }
                // case 5 -> {
                // yield 'M';
                // }
                // case 6 -> {
                // yield 'Y';
                // }
                // case 7 -> {
                // yield 'F';
                // }
                // case 8 -> {
                // yield 'P';
                // }
                // case 9 -> {
                // yield 'D';
                // }
                // case 10 -> {
                // yield 'X';
                // }
                // case 11 -> {
                // yield 'B';
                // }
                // case 12 -> {
                // yield 'N';
                // }
                // case 13 -> {
                // yield 'J';
                // }
                // case 14 -> {
                // yield 'Z';
                // }
                // case 15 -> {
                // yield 'S';
                // }
                // case 16 -> {
                // yield 'Q';
                // }
                // case 17 -> {
                // yield 'V';
                // }
                // case 18 -> {
                // yield 'H';
                // }
                // case 19 -> {
                // yield 'L';
                // }
                // case 20 -> {
                // yield 'C';
                // }
                // case 21 -> {
                // yield 'K';
                // }
                // case 22 -> {
                // yield 'E';
                // }
                // default -> {
                // yield '@';
                // }
                // };

                // //Mostramos el resultado
                // if (letra == '@'){
                // System.out.println("Error");
                // }else{
                // System.out.printf("Tu DNI tiene la letra %1$s ---> %2$d%1$s", letra,
                // num_dni);
                // }
                // sc.close();

                // --------------------------------------------------------------------------------------

                /*
                 * 13. En una granja se compra diariamente una cantidad (comidaDiaria) de comida
                 * para los animales. El número de animales
                 * que alimentar (todos de la misma especie) es numAnimales , y sabemos que cada
                 * animal come una media de kiloPorAnimal.
                 * Diseña un programa que solicite al usuario los valores anteriores y determine
                 * si disponemos de alimentos sufuciente para
                 * cada animal. En caso negativo, ha de calcular cuál es la ración que
                 * corresponde a cada uno de los animales.
                 * Nota: Evitar que la aplicación realice divisiones por cero.
                 */

                // Objetos escanner
                // Scanner sc = new Scanner(System.in);

                // //Declaración de variable
                // int comidaDiaria, numAnimales, kiloPorAnimal, comidaNecesaria;
                // double kiloPorAnimalCorrespondiente;

                // System.out.println("Introduzca la cantidad de comida diaria, el número de
                // animales y la media de kilo por animal." +
                // "En ese orden y dejando un espacio entre ellos");
                // comidaDiaria = sc.nextInt();
                // numAnimales = sc.nextInt();
                // kiloPorAnimal = sc.nextInt();

                // //Calculamos la comida necesaria
                // comidaNecesaria = numAnimales * kiloPorAnimal;

                // //Comproamos si los valores introducidos son mayor o igual a 0
                // if (comidaDiaria <= 0 && numAnimales <=0 && kiloPorAnimal <= 0) {
                // System.out.println("Introduca un valor mayor a 0");
                // }else{
                // //Comrpobamos si hay comida suficiente para cada animal
                // if( comidaDiaria >= comidaNecesaria){
                // System.out.println("Hay comida suficienta para cada animal");
                // } else{
                // kiloPorAnimalCorrespondiente = comidaDiaria / numAnimales;
                // System.out.printf("No hay comida suficienta para cada animal. A cada animal
                // le correspond %.2fKG", kiloPorAnimalCorrespondiente );
                // }
                // }

                // --------------------------------------------------------------

                /*
                 * 14. Escribe un programa que solicite al usuario un número comprendido entre 1
                 * y 99. El programa debe mostralo con letras,
                 * por ejemplo, para 56, se verá: <<Cicuenta y seis>>
                 */

                // //Objetos escanner
                // Scanner sc = new Scanner(System.in);

                // //Declaración de variabel
                // int num, cifra_1, cifra_2;
                // String decenas, unidades;
                // //Introduciomos el valor
                // System.out.println("Introduce un número entre el 0 y 99");
                // num = sc.nextInt();

                // //Comprobamos si el numero está entre el 0 y el 99
                // if(num >= 0 && num <= 99){

                // //Calculamos las cifras
                // cifra_1 = num/10;
                // cifra_2 = num % 10;

                // //Depediendo de las cifras asignamos un valor a las variable decenas y
                // unidades con switch y yield
                // decenas = switch (cifra_1) {
                // case 0 -> {
                // yield "Cero";
                // }
                // case 1 -> {
                // yield "Diez";
                // }
                // case 2 -> {
                // yield "Veinte";
                // }
                // case 3 -> {
                // yield "Treinta";
                // }
                // case 4 -> {
                // yield "Cuaranta";
                // }
                // case 5 -> {
                // yield "Cicuenta";
                // }
                // case 6 -> {
                // yield "Sesenta";
                // }
                // case 7 -> {
                // yield "Setenta";
                // }
                // case 8 -> {
                // yield "Ochenta";
                // }
                // case 9 -> {
                // yield "Noventa";
                // }
                // default -> "Error";
                // };

                // unidades = switch (cifra_2) {
                // case 0 -> {
                // yield "Cero";
                // }
                // case 1 -> {
                // yield "uno";
                // }
                // case 2 -> {
                // yield "dos";
                // }
                // case 3 -> {
                // yield "tres";
                // }
                // case 4 -> {
                // yield "cuatro";
                // }
                // case 5 -> {
                // yield "cinco";
                // }
                // case 6 -> {
                // yield "seis";
                // }
                // case 7 -> {
                // yield "siete";
                // }
                // case 8 -> {
                // yield "ocho";
                // }
                // case 9 -> {
                // yield "nueve";
                // }
                // default -> "Error";
                // };

                // //Mostramos el resultado
                // System.out.printf("%1$s y %2$s", decenas, unidades);

                // }else{

                // //Indicamos que nos se ha introducido un número entre el 0 y el 99
                // System.out.println("Introduce un número entre 0 y 99");
                // }

                // sc.close();

                // ----------------------------------------------------------------------------------------------

                /*
                 * 15. Escribe una aplicación que solicite por consola dos números reales que
                 * corresponden a
                 * la base y la altura de un triángulo. Deberá mostrarse su área, comprobando
                 * que los números introducidos por el usuario
                 * no son negativos, algo que no tendría sentido.
                 */

                // //Objetos escanner
                // Scanner sc = new Scanner(System.in);

                // //Declaracion de variables
                // double base, height, area;

                // //Pedimos el valor por teclado
                // System.out.println("Introduce el valor de la base y el valor de la altura.
                // (Deja un espacion en blanco entre ellos)");
                // base = sc.nextInt();
                // height = sc.nextInt();

                // //Coprobamos que los números no son negativos o 0
                // if (base <= 0 || height <= 0) {
                // System.out.println("La base y la altura no pueden ser negativos ni cero");
                // }else{
                // area = base * height / 2;
                // System.out.printf("El áera de un triangulo con base %1$.2f y altura %2$.2f es
                // %3$.2f", base, height, area);
                // }
                // sc.close();

                // ---------------------------------------------------------------------------------------

                /*
                 * 16. Utiliza el operador ternario para calcular el valor absoluto de un número
                 * que se solicita a usuario por teclado
                 */

                // //Objetos escanner
                Scanner sc = new Scanner(System.in);

                // Declaracion de variable

                int num, absoluto;

                // Pedimos el valor
                System.out.println("Introduce un número");
                num = sc.nextInt();

                // Utilizamos el operador ternario para conseguir el absoluto de numero
                absoluto = num < 0 ? -num : num;

                // Mostramos resultado
                System.out.printf("|%1$d| = %2$d", num, absoluto);

                sc.close();

        }
}
