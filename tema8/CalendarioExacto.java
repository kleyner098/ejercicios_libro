package tema8;

import tema7.Calendario;

public class CalendarioExacto extends Calendario {
    private int hora;
    private int min;

    public CalendarioExacto(int anio, int mes, int dia, int hora, int min) {
        super(anio, mes, dia);
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
        } else {
            this.hora = 0;
        }
        if (min >= 0 && min < 60) {
            this.min = min;
        } else {
            this.min = 0;
        }
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora <= 0 && hora > 24) {
            this.hora = hora;
        } else {
            this.hora = 0;
        }
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        if (min <= 0 && min > 60) {
            this.min = min;
        } else {
            this.min = 0;
        }
    }

    public String toString() {
        int anio = super.getAnio();
        int mes = super.getMes();
        int dia = super.getDia();
        String fecha = hora + ":" + min + " " + dia + "/" + mes + "/" + anio;
        return fecha;
    }

    public boolean equals(CalendarioExacto otraFecha) {
        boolean annioSame = otraFecha.getAnio() == this.getAnio();
        boolean mesSame = otraFecha.getMes() == this.getMes();
        boolean diaSame = otraFecha.getDia() == this.getDia();
        boolean horaSame = otraFecha.getHora() == this.getHora();
        boolean minSame = otraFecha.getMin() == this.getMin();
        boolean fechaSame = annioSame && mesSame && diaSame && horaSame && minSame;
        return fechaSame;
    }
}
