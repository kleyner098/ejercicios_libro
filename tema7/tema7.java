package tema7;

import java.util.Arrays;

public class tema7 {
    public static void main(String[] args) {
        // Ejercicio 7.11
        // MarcaPagina marcador = new MarcaPagina();
        // marcador.incrementar();
        // marcador.incrementar();
        // System.out.println(marcador.getPagina());
        // marcador.resetPagina();
        // System.out.println(marcador.getPagina());

        // -----------------------------------------------

        // Ejercicio 7.12
        // EcuacionSegundoGrado ecuacion = new EcuacionSegundoGrado(2, 4, 1);

        // System.out.println(ecuacion.getDiscriminante());
        // System.out.println(ecuacion.getResultados());
        // ecuacion.setA(3);
        // System.out.println(ecuacion.getResultados());

        // ------------------------------------------------

        // Ejercicio 7.13
        // Colores decoracion = new Colores();

        // decoracion.addColor("Naranja");
        // System.out.println(decoracion.toString());
        // System.out.println(decoracion.mostrarColores(2));

        // ------------------------------------------------

        //Ejercicio 7.14

        // CambioImporte nuevImporte = new CambioImporte(724.67);
        // nuevImporte.cambio();

        // ------------------------------------------------

        //Ejercicio 7.15

        // Calendario calendario1 = new Calendario(2023, 6, 30);
        // Calendario calendario2 = new Calendario(2024, 7, 31);
        // calendario1.mostrar();
        // calendario1.incrementaAnio(1);
        // calendario1.incrementarMes();
        // calendario1.incrementarDia();
        // calendario1.mostrar();
        // boolean iguales = calendario1.iguales(calendario2);
        // System.out.print("Fecha 1 :");
        // calendario1.mostrar();
        // System.out.print("Fecha 2 :");
        // calendario2.mostrar();
        // System.out.println(iguales ? "Los dos fechas son iguales" : "Los dos fechas son diferentes");
        // calendario2.incrementarDia();
        // calendario2.mostrar();

        // ------------------------------------------------

        //Ejercicio 7.15

        // Punto punto1 = new Punto(2, 5);
        // punto1.mostrar();
        // punto1.desplazarX(1);
        // punto1.desplazarY(1);
        // punto1.desplazar(1, 1);
        // punto1.mostrar();
        // Punto punto2 = new Punto(2, 5);
        // double distancia = punto1.distanciaEuclidea(punto2);
        // System.out.println("La distancia entre el punto 1 y el puneto dos es:" + distancia);

        // ------------------------------------------------

        //Ejercicio 7.17

        // String texto = "zorra wendigo,.,.,````";
        // String textoCifrado = cifradoCesar.cifra(texto, 9);
        // System.out.println(textoCifrado);

        // ------------------------------------------------

        //Ejercicio 7.18

        // Cola cola = new Cola();

        // cola.offer(1);
        // cola.offer(1);
        // cola.offer(3);
        // cola.offer(2);
        // cola.mostrar();
        // cola.poll();
        // cola.mostrar();
        // cola.poll();
        // cola.mostrar();
        // cola.poll();
        // cola.mostrar();
        // cola.poll();
        // cola.mostrar();

        // ------------------------------------------------

        //Ejercicio 7.19

        // Pila pila = new Pila();

        // pila.push(1);
        // pila.push(1);
        // pila.push(3);
        // pila.push(2);
        // pila.mostrar();
        // pila.pop();
        // pila.mostrar();
        // pila.pop();
        // pila.mostrar();
        // pila.pop();
        // pila.mostrar();
        // pila.pop();
        // pila.mostrar();

        // ------------------------------------------------

        //Ejercicio 7.19

        Conjunto conjunto1 = new Conjunto();
        conjunto1.insertar(1);
        conjunto1.insertar(1);
        conjunto1.insertar(2);
        System.out.println("Conjunto 1: " + conjunto1.mostrar());
        Conjunto conjunto2 = new Conjunto();
        conjunto2.insertar(conjunto1);
        System.out.println("Conjunto 2: " + conjunto2.mostrar());
        conjunto2.insertar(3);
        conjunto2.insertar(4);
        System.out.println("Conjunto 2: " + conjunto2.mostrar());
        System.out.println("Conjunto 2 tamaño: " + conjunto2.numeroElemento());
        conjunto2.eliminarElemento(4);
        System.out.println("Conjunto 2: " + conjunto2.mostrar());
        conjunto2.eliminarConjunto(conjunto1);        
        System.out.println("Conjunto 2: " + conjunto2.mostrar());
        System.out.println("3 pertenece al Conjunto 2: " + conjunto2.pertenece(3));
        System.out.println("Union de conjunto 1 y 2: " + Conjunto.union(conjunto1, conjunto2).mostrar());
        Conjunto conjunto3 = new Conjunto();
        conjunto3.insertar(1);
        System.out.println("Conjunto 3: " + conjunto3.mostrar());
        System.out.println("Interceción de conjunto 1 y 3: " + Conjunto.interccion(conjunto1, conjunto3).mostrar());
        System.out.println("Diferencia de conjunto 1 y 3: " + Conjunto.diferencia(conjunto1, conjunto3).mostrar());

    }
}
