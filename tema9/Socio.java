package tema9;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;

public class Socio implements Comparable {
    /*
     * Actividad resuelta 9.7
     * Implementa la intefaz Comparable en la clase Socio para que, por defecto, se
     * ordene según los número de identificación -id- creciente
     */

    // Atributos
    int id;
    String nombre;
    LocalDate fechaNacimiento;

    // Constructor
    public Socio(int id, String nombre, String fechaNacimeinto) {
        this.id = id;
        this.nombre = nombre;
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.fechaNacimiento = LocalDate.parse(fechaNacimeinto, f);
    }

    int edad() {
        return (int) fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    // @Override
    // public int compareTo(Object o) {
    // return id -((Socio)o).id;
    // }

    /*
     * 9.19 Implementa la interfaz Compareble en la clase SOcio para que el criterio
     * de ordenación natural sea de menor a mayor edad
     */

    // @Override
    // public int compareTo(Object o) {
    // return edad() - ((Socio)o).edad();
    // }

    /*
     * 9.20 Repite la actividad de aplicación 9.19 para que se ordene por edeades y,
     * si dos socios tienen las mism edad, vaya antes el que tenga un número de
     * socio menor.
     */

    // @Override
    // public int compareTo(Object o) {
    // int result;
    // Socio otroSocio = (Socio) o;
    // if (this.edad() < otroSocio.edad()) {
    // result = -1;
    // }else if(this.edad() > otroSocio.edad()){
    // result = 1;
    // }else{
    // if (this.id < otroSocio.id) {
    // result = -1;
    // }else if (this.id > otroSocio.id) {
    // result = 1;
    // }else{
    // result = 0;
    // }
    // }

    // return result;
    // }

    /*
     * 9.21 Repetir la Actividad de aplicación 9.20 con un criterio que ordene por
     * fecha de nacimeinto.
     */
    @Override
    public int compareTo(Object o) {
        Socio otrSocio = (Socio) o;
        return -((int) this.fechaNacimiento.until(otrSocio.fechaNacimiento, ChronoUnit.YEARS));
    }

    @Override
    public String toString() {
        return "Id: " + id + " Nombre: " + nombre + " Edad: " + edad() + "\n";
    }
}

class ComparadorNombre implements Comparator {

    /*
     * 9.22 Definir una clase compradora que ordene los socio por orden alfabéticos
     * de nombres invertidos ( que empieza por la letra 'z').
     */

    @Override
    public int compare(Object o1, Object o2) {
        return (-((Socio) o1).nombre.compareTo(((Socio) o2).nombre));
    }
}

class ComparadorEdadNombre implements Comparator {

    /*
     * 9.27 Manteniendo el mismo orden natural de la clase Socio (por edades),
     * ordenar la lsita de socios por orden alfabéticos de nombres
     */

    @Override
    public int compare(Object o1, Object o2) {
        int result;
        Socio socio = (Socio) o1;
        Socio otroSocio = (Socio) o2;
        if (socio.edad() > otroSocio.edad()) {
            result = -1;
        } else if (socio.edad() < otroSocio.edad()) {
            result = 1;
        } else {
            if (socio.nombre.compareTo(otroSocio.nombre) < 0) {
                result = -1;
            } else if (socio.nombre.compareTo(otroSocio.nombre) < 0) {
                result = 1;
            } else {
                result = 0;
            }
        }

        return result;
    }
}
