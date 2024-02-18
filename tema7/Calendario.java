package tema7;

public class Calendario {
    /*
     * 7.15 Diseña la calse Calendario que representa una fecha concreta (año, mes y
     * día). La clase debe disponer de los métodos:
     * - Calendario(int año, int mes, int día): que crea un objeto con los datos
     * pasados con parámetros, siempre y cuendo, la fecha que representa sea
     * correcta.
     * - void incrementarDia(): que incrementa en un día la fecha del calendario.
     * - void incrementarMes(): que incrementa en un mes la fecha del calendario.
     * - void incrementaAño(int cantidad): que incrementa si la fecha del calendario
     * en el número de años especificados. Ten en cuenta que el año 0 existió.
     * - void mostrar(): muestra la fecha por consola.
     * - boolean iguales(Calendario otraFecha): que determina si la fecha invocante
     * y la que se pasa como parámetro son iguales o distintas.
     * Por simplicidad, solo tendermos en consideración que existen meses con
     * distinto número de días, pero no tendremos en cuenta los años bisiestos.
     */

    private int anio;
    private int mes;
    private int dia;
    // Variable que guardará el número máximo de diás dependiendo del mes
    private int diasMeses = switch (this.mes) {
        case 1, 3, 5, 7, 8, 10, 12 -> 31;
        case 4, 6, 9, 11 -> 30;
        case 2 -> 28;
        default -> 31;
    };

    // Constructor
    public Calendario(int anio, int mes, int dia) {
        // los años puede ser 0 o mayor
        if (anio >= 0) {
            this.anio = anio;
        } else {
            this.anio = 0;
        }

        // los meses solo pueden ser un valor entre 1 o 12
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        } else {
            this.mes = 1;
        }

        // los dias solo pueden ser 1 o el máximo de días del mes
        if (dia >= 1 && dia <= diasMeses) {
            this.dia = dia;
        } else {
            this.dia = 1;
        }
    }

    // Método que suma uno al dia, si supera el límtede dias del mes se reinicia a 1
    public void incrementarDia() {
        if (this.dia < diasMeses) {
            this.dia++;
        } else {
            this.dia = 1;
        }
    }

    // Método que suma una al mes, si supera el límite de 12 se reinicia
    public void incrementarMes() {
        if (this.mes < 12) {
            this.mes++;
        } else {
            this.mes = 1;
        }
    }

    // incrementa los año según la cantidad introducida
    public void incrementaAnio(int cantidad) {
        if (cantidad >= 0) {
            this.anio += cantidad;
        }
    }

    // Método que muestra la fecha
    public void mostrar() {
        System.out.printf("%1$d/%2$d/%3$d\n", this.dia, this.mes, this.anio);
    }

    // Métodos get
    public int getAnio() {
        return anio;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    // Método que compara dos objetos Calendarios
    public boolean iguales(Calendario otraFecha) {
        boolean iguales = otraFecha.getAnio() == this.anio && otraFecha.getMes() == this.mes
                && otraFecha.getDia() == this.dia;
        return iguales;
    }

}
