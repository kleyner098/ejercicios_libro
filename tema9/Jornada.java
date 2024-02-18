package tema9;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Jornada implements Comparable {
    /*
     * 9.28 Implementa la clase Jornada, cuyos objetos son los datos de cada día de
     * trabajo de los empleados de una empresa. En ella se identificará al
     * trabajador por su DNI y figurarán la fecha y las horas de entrada y salida
     * del trabajo de cada jornada. Un método computará el número de minutos
     * trabajados en la jornada. El criterio de orden natural de las jornadas será
     * el de los Dni, y para igual DNI, el de la fecha de la jornada, con objeto de
     * que aparezcan consecutivas todas las jornadas de cada trabajador, Asimismo
     * implementar el método toString() que muestre el DNI del empleado, la fecha y
     * la duración en minutos las jornadas.
     * 
     */
    private String dni;
    LocalDate fechaJornada;
    LocalTime horaEntrada;
    LocalTime horaSalida;
    int min;
    private DateTimeFormatter formatFecha = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    private DateTimeFormatter formatHora = DateTimeFormatter.ofPattern("HH:mm");

    public Jornada(String dni, String fechaJornada, String horaEntrada, String horaSalida) {
        this.dni = dni;
        
        this.fechaJornada = LocalDate.parse(fechaJornada, formatFecha);
        
        this.horaEntrada = LocalTime.parse(horaEntrada, formatHora);
        this.horaSalida = LocalTime.parse(horaSalida, formatHora);
    }

    public int minJornada() {
        return min = (int) horaEntrada.until(horaSalida, ChronoUnit.MINUTES);

    }

    @Override
    public int compareTo(Object o) {
        Jornada otraJornada = (Jornada) o;
        int result;
        if (this.dni.compareTo(otraJornada.dni) < 0) {
            result = -1;
        } else if (this.dni.compareTo(otraJornada.dni) > 0) {
            result = 1;
        } else {
            if (this.fechaJornada.until(otraJornada.fechaJornada,ChronoUnit.DAYS) > 0 ) {
                result = -1;
            }else if(this.fechaJornada.until(otraJornada.fechaJornada,ChronoUnit.DAYS) < 0){
                result = 1;
            }else{
                result = 0;
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "\nDNI: " + dni + " | Fecha: " + fechaJornada + " | Minutos de la jornada: " + minJornada() + " min";
    }
}

