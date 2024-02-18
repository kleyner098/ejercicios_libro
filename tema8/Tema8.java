package tema8;

import java.math.BigDecimal;
import java.math.MathContext;

import tema7.Lista;
import tema8.Caja.Unidad;

public class Tema8 {
    public static void main(String[] args) {

        // Ejercicio 8.11
        // Nota canción[] = { Nota.DO, Nota.SOL, Nota.RE, Nota.FA, Nota.SI, Nota.MI,
        // Nota.LA };
        // Campana bell = new Campana();
        // for (Nota nota : canción) {
        // bell.add(nota);
        // }

        // bell.interpretar();

        // -------------------------------------------------

        // Ejercicio 8.12

        // Caja cajaGrande = new Caja(500, 400, 300, Unidad.CENTIMETROS);
        // String etiqueta ="Caja grande para uso diverso de transporte";
        // String etiqueta2 ="Caja grande para uso diverso";
        // cajaGrande.setEtiqueta(etiqueta);
        // System.out.println(cajaGrande);
        // cajaGrande.setEtiqueta(etiqueta2);
        // System.out.println(cajaGrande);
        // Caja cajaMuyGrnade = new Caja(2, 3, 4, Unidad.METROS);
        // String etiqueta3 ="Caja muy grande";
        // cajaMuyGrnade.setEtiqueta(etiqueta3);
        // System.out.println(cajaMuyGrnade);

        // -------------------------------------------------

        // Ejercicio 8.13

        // Caja cajaBici = new CajaCarton(500, 400, 300);
        // String etiqueta ="Caja grande para uso diverso de transporte";
        // String etiqueta2 ="Caja grande para bici 1";
        // cajaBici.setEtiqueta(etiqueta);
        // System.out.println(cajaBici);
        // cajaBici.setEtiqueta(etiqueta2);
        // System.out.println(cajaBici);

        // -------------------------------------------------

        // Ejercicio 8.14

        // Lista nuevLista = new Lista();
        // nuevLista.insertarFinal(1);
        // nuevLista.insertarFinal(4);
        // nuevLista.insertarFinal(7);
        // System.out.println("Lista 1" + nuevLista.toString());
        // Lista nuevLista2 = new Lista();
        // nuevLista2.insertarFinal(1);
        // nuevLista2.insertarFinal(4);
        // nuevLista2.insertarFinal(7);
        // System.out.println("Lista 2" + nuevLista.toString());

        // -------------------------------------------------

        // Ejercicio 8.15

        // System.out.println("Son iguales? " + nuevLista.equals(nuevLista2));

        // -------------------------------------------------

        // Ejercicio 8.16

        // Pila pila = new Pila();
        // pila.apilar(1);
        // pila.apilar(2);
        // pila.apilar(1);
        // System.out.println(pila);
        // pila.desapilar();
        // System.out.println(pila);

        // -------------------------------------------------

        // Ejercicio 8.17

        // Cola cola = new Cola();
        // cola.offer(1);
        // cola.offer(2);
        // cola.offer(3);
        // System.out.println(cola);
        // cola.poll();
        // System.out.println(cola);

        // -------------------------------------------------

        // Ejercicio 8.18

        // ColaDoble colaDoble = new ColaDoble();
        // colaDoble.offer(1);
        // colaDoble.offer(2);
        // colaDoble.offer(3);
        // System.out.println(colaDoble);
        // colaDoble.encolarPrincipio(4);
        // System.out.println(colaDoble);
        // colaDoble.desencolarFinal();
        // System.out.println(colaDoble);

        // -------------------------------------------------

        // Ejercicio 8.19

        // Conjunto set = new Conjunto();
        // set.insertarFinal(1);
        // set.insertarFinal(1);
        // System.out.println(set);
        // set.insertarPrincipio(2);
        // set.insertarPrincipio(2);
        // System.out.println(set);
        // set.insertar(1, 3);
        // set.insertar(1, 3);
        // System.out.println(set);
        // Lista lista = new Lista();
        // lista.insertarFinal(1);
        // lista.insertarFinal(2);
        // lista.insertarFinal(3);
        // lista.insertarFinal(4);
        // set.insertarFinal(lista);
        // System.out.println(set);

        // -------------------------------------------------

        // Ejercicio 8.20

        // Conjunto set1 = new Conjunto();
        // Conjunto set2 = new Conjunto();
        // Conjunto set3 = new Conjunto();
        // set1.insertarFinal(1);
        // set1.insertarFinal(2);
        // set1.insertarFinal(3);
        // set2.insertarFinal(3);
        // set2.insertarFinal(2);
        // set2.insertarFinal(1);
        // set3.insertarFinal(1);
        // set3.insertarFinal(2);
        // set3.insertarFinal(4);
        // System.out.println("Conjunto 1: " + set1);
        // System.out.println("Conjunto 2: " + set2);
        // System.out.println("Conjunto 3: " + set3);
        // System.out.println("Los conjunto 1 y 2 son iguales?: " + set1.equals(set2));
        // System.out.println("Los conjunto 1 y 3 son iguales?: " + set1.equals(set3));

        // -------------------------------------------------

        // Ejercicio 8.21

        // Integer num = 9;
        // String cadena = "9";
        // Double num2 = 8.24;
        // String cadena2 = "Hola";

        // System.out.println(esNumero(num));
        // System.out.println(esNumero(cadena));

        // Boolean cadenas = sumar(cadena, cadena2);
        // System.out.println(cadenas + "\n");
        // Boolean numNum = sumar(num, num2);
        // System.out.println(numNum + "\n");
        // Boolean cadenaNum = sumar(cadena, num);
        // System.out.println(cadenaNum + "\n");

        // -------------------------------------------------

        // Ejercicio 8.23 y 8.24

        // Poligono poligono = new Triangulo(4, 2);
        // System.out.println(poligono.area());
        // poligono = new Rectagunlo(4, 2);
        // System.out.println(poligono.area());

        // -------------------------------------------------

        // Ejercicio 8.25

        // Punto punto1 = new Punto(1, 2);
        // Punto punto2 = new Punto(4, 7);
        // System.out.println(punto1.distancia(punto2));
        // Punto3D punto3d = new Punto3D(4, 5, 2);
        // Punto3D punto3d2 = new Punto3D(5, 1, 7);
        // System.out.println(punto3d.distancia(punto3d2));

        // -------------------------------------------------

        // Ejercicio 8.26

        // CalendarioExacto fecha1 = new CalendarioExacto(2023, 4, 15, 25, 23);
        // CalendarioExacto fecha2 = new CalendarioExacto(2023, 4, 15, 12, 76);
        // CalendarioExacto fecha3 = new CalendarioExacto(2023, 4, 15, 12, 76);
        // System.out.println(fecha1);
        // System.out.println(fecha2);
        // System.out.println(fecha3);
        // System.out.println(fecha2.equals(fecha3));
        // System.out.println(fecha2.equals(fecha1));

        // -------------------------------------------------

        // Ejercicio 8.27

        // Punto punto1 = new Punto(1, 2);
        // Punto punto2 = new Punto(1, 2);
        // Punto punto3 = new Punto(1, 1);
        // Punto3D punto3d1 = new Punto3D(1, 1, 1);
        // Punto3D punto3d2 = new Punto3D(1, 1, 1);
        // Punto3D punto3d3 = new Punto3D(1, 1, 2);
        // System.out.println(punto1.equals(punto2));
        // System.out.println(punto1.equals(punto3));
        // System.out.println(punto3d1.equals(punto3d2));
        // System.out.println(punto3d1.equals(punto3d3));

        // -------------------------------------------------

        // Ejercicio 8.27

        // Suceso suceso1 = new Suceso(1, 2, 3, 4);
        // Suceso suceso2 = new Suceso(1, 2, 3, 4);
        // Suceso suceso3 = new Suceso(1, 2, 3, 1);
        // Suceso suceso4 = new Suceso(1, 2, 1, 4);
        // System.out.println(suceso1.equals(suceso2));
        // System.out.println(suceso1.equals(suceso3));
        // System.out.println(suceso1.equals(suceso4));

        /*
         * 8.29 Calcula la raíz cuadrada de 2 con 100 cifras significativas usando
         * objetos de la clase big decimal
         */

        BigDecimal dos = new BigDecimal(2);
        MathContext presicion = new MathContext(100);
        BigDecimal raizDos = dos.sqrt(presicion);
        System.out.println(raizDos);
        System.out.println(String.valueOf(raizDos).length());
    }

    /*
     * 8.21 Implementa los siguientes métodos:
     * -- static boolean esNumero(Object ob), que nos dice si su parámetro de
     * entrada es de tipo númerico (Integer, double, Long, Float...).
     * -- boolean sumar(object a, object b), que muestra por consola la
     * concatenación de los parámetros de entrada, si ambos son cadenas, o muestra
     * su suma convertida al tipo double, si ambos son de tipo numérico. En
     * cualquier caso, muestra el mensaje <<No sumables>>.
     */

    static public boolean esNumero(Object ob) {
        boolean isNumero = false;
        // Obtenemos la super clase
        String superClase = ob.getClass().getSuperclass().getName();
        // Comparamos si es la clase number
        if (superClase.equals("java.lang.Number")) {
            isNumero = true;
        }
        return isNumero;
    }

    static public boolean sumar(Object a, Object b) {
        boolean isSuma = false;
        // Obtememos la clase
        String classA = String.valueOf(a.getClass().getName());
        String classB = String.valueOf(b.getClass().getName());
        if (esNumero(a) && esNumero(b)) {
            // Casteamos a la Clase Number
            Number castA = (Number) a;
            Number castB = (Number) b;
            // Realizamos la suma mediante el metodo doubleValues()
            Double suma = castA.doubleValue() + castB.doubleValue();
            isSuma = true;
            System.out.println(suma);
        } else if (classA.equals(classB) && classA.equals("java.lang.String")) {
            String concatenacion = a + " " + b;
            System.out.println(concatenacion);
            isSuma = true;
        } else {
            System.out.println("No sumables");
        }
        return isSuma;
    }
}
