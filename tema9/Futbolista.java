package tema9;

import java.util.Comparator;

public class Futbolista implements Comparable {
    /*
     * 8.13 Definir la clase futbolista con los siguientes atributos: dni, nombre,
     * edad y número de goles. Implentar:
     * -- Un constructor y los métodos toString() y equals() (este último basado en
     * el DNI).
     * -- La interfaz Compable con un críterio de ordenación basado en tambien en el
     * DNI.
     * -- Un Comparador para hacer ordenaciones basadas en el nombre y otro por la
     * edad.
     */
    // Atributos
    private String dni, nombre;
    private int edad, numGoles;

    // Constructor
    public Futbolista(String dni, String nombre, int edad, int numGoles) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.numGoles = numGoles;
    }

    // Métodos toString y equals
    @Override
    public String toString() {
        return "DNI: " + dni + " | nombre: " + nombre + " | Edad: " + edad + " | numGoles: " + numGoles + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        Futbolista otroFutbolista = (Futbolista) (obj);
        return otroFutbolista.getDni() == this.getDni() ? true : false;
    }

    // Setter y getters
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumGoles() {
        return numGoles;
    }

    public void setNumGoles(int numGoles) {
        this.numGoles = numGoles;
    }

    @Override
    public int compareTo(Object o) {
        Futbolista otroFutbolista = (Futbolista) (o);
        return getDni().compareTo(otroFutbolista.getDni());
    }
}

class ComparadorFubolistaNombre implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return ((Futbolista) o1).getNombre().compareTo(((Futbolista) o2).getNombre());
    }
 
}


class CompEdadNombre implements Comparator {
    /*
     * 9.14 Añadir a la Actividad de aplicación 9.13 un comparador que ordene los
     * futbolistas por edades y, para aquellos que tienen la misma edad, por nombres
     */
    @Override
    public int compare(Object o1, Object o2) {
        Futbolista futbolista1 = (Futbolista) o1;
        Futbolista futbolista2 = (Futbolista) o2;
        int num;
        if (futbolista1.getEdad() > futbolista2.getEdad()) {
            num = 1;
        }else if (futbolista1.getEdad() < futbolista2.getEdad()) {
            num = -1;
        }else{
            if (futbolista1.getNombre().compareTo(futbolista2.getNombre()) > 0) {
                num = 1;
            }else if (futbolista1.getNombre().compareTo(futbolista2.getNombre()) < 0) {
                num = -1;
            }else{
                num = 0;
            }
        }
        return num;
    }
}
