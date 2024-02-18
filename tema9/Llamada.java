package tema9;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Llamada implements Comparable {
    /*
     * 9.31 En una compañía de telecomunicaciones se desean registrar los datos de
     * todas las llamadas de sus clientes. Implementa la Clase Llamada, que guardará
     * los siguientes datos: número de teléfono del cliente, número del
     * interlocutor, atributo booleano que indique si la llamada es saliente, fecha
     * y hora del incio de la llamada y del fin, atributo enumerado que que indique
     * la zona del interlocutor( suponer cinco zonas con tarifas distintas) y tablas
     * de constantes con las tarifas de las zonas en céntimos de euro/minutos. En la
     * clase se establecerá un orden natural compuesto basado en el número del
     * teléfono del cliente como primer criterio y en la fecha y hora de inicio como
     * segundo criterio. Asimismo, se implementará un método que devuelva la
     * duración la en minutos de la llamada y otro que calcule su coste, si es
     * saliente. Por último, implementar el método toString(), que muestre los dos
     * números de teléfonos, la fecha y hora del inicio, la duración y el coste
     */

    // Atributos
    int telfCliente, telfInterlocutor;
    boolean saliente;
    LocalDate fechaLlamada;
    LocalTime horaInicio, horaFin;
    ZonaTarifa zona;

    // Enumerado
    public enum ZonaTarifa {
        NORTE(0.02), SUR(0.05), ESTE(0.07), OESTE(0.04), CENTRO(0.4);

        double tarifa;

        private ZonaTarifa(double tarifa) {
            this.tarifa = tarifa;
        }

        public double getTarifa() {
            return tarifa;
        }
    }

    // Format
    private final DateTimeFormatter FORMATFECHA = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    private final DateTimeFormatter FORMATHORA = DateTimeFormatter.ofPattern("HH:mm");

    // Constructor
    public Llamada(int telfCliente, int telfInterlocutor, boolean saliente, String fechaLlamada,
            String horaInicio, String horaFin, ZonaTarifa zona) {
        this.telfCliente = telfCliente;
        this.telfInterlocutor = telfInterlocutor;
        this.saliente = saliente;
        this.fechaLlamada = LocalDate.parse(fechaLlamada, FORMATFECHA);
        this.horaInicio = LocalTime.parse(horaInicio, FORMATHORA);
        this.horaFin = LocalTime.parse(horaFin, FORMATHORA);
        this.zona = zona;
    }

    // Compare
    @Override
    public int compareTo(Object o) {

        Llamada otraLlamada = (Llamada) o;
        int comparacionPorTelefono = Integer.compare(this.telfCliente, otraLlamada.telfCliente);

        if (comparacionPorTelefono != 0) {
            return comparacionPorTelefono;
        }

        int horasDiferencia = -((int)this.fechaLlamada.until(otraLlamada.fechaLlamada, ChronoUnit.DAYS));

        return Long.compare(horasDiferencia, 0);
    }

    public int minutos() {
        return (int) this.horaInicio.until(horaFin, ChronoUnit.MINUTES);
    }

    public double coste() {
        if (saliente) {
            return (double) minutos() * zona.getTarifa();
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "\nTeléfono cliente: " + telfCliente + " | Teléfono interlocutor: " + telfInterlocutor + " | Fecha: "
                + fechaLlamada + " | Hora: " + horaInicio + " | Duración: " + minutos() + " | Coste: " + coste();
    }
}
