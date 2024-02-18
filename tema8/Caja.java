package tema8;

public class Caja {

    /*
     * 8.12 Las empresas de transporte, para evitar daños en los paquetess, embalan
     * todas sus mercancías en cajas cpn el tamaño adecuado. Una caja se crea
     * expresamente con un ancho, un alto y un fondo y, una vez creada, se mantiene
     * inmutale. Cada caja lleva pegada una etiqueta, de un máximo de 30 cracteres,
     * con información útil como el nombre del destinatario, dirección, etc.
     * Implementa la clase Caja con los siguientes métodos:
     * -- Caja(int ancho, int alto, int fondo, Unidad unidad): que construye una
     * caja
     * con las dimensiones especificadas, que pueden encontrarse en <<cm>>
     * (centímetros) o <<m>> (metros)
     * -- double getVolumen(): que devuelve el volumen de la caja en metros cúbicos.
     * -- void setEtiqueta(String etiqueta): que modifica el valor de la etiqueta de
     * la caja.
     * -- String toString(): que devuelve una cadena con la representación de la
     * caja.
     */

    //Enumerado con metros y centrimetros
    enum Unidad {
        METROS, CENTIMETROS
    }

    //Atributos de caja
    protected int ancho, alto, fondo;
    private String etiqueta;
    Unidad unidad;

    //Constructor
    public Caja(int ancho, int alto, int fondo, Unidad unidad) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.unidad = unidad;
        this.etiqueta = "";
    }

    //Método get volumen
    public double getVolumen() {
        double volumen;
        volumen = ancho * alto * fondo;
        if (unidad.equals(Unidad.CENTIMETROS)) {
            volumen /= 1000000;
        }
        return volumen;
    }

    //Método set de etiqueta
    public void setEtiqueta(String etiqueta) {
        if (etiqueta.length() > 30) {
            System.out.println(
                    "Límite de 30 caráteres superado. Por favor vuelva a introducir la etiqueta sin superar el límite");
        } else {
            this.etiqueta = etiqueta;
        }
    }

    //Método toString
    @Override
    public String toString() {
        double volumen = getVolumen();
        String medida;
        if(unidad.equals(Unidad.CENTIMETROS)){
             medida = "cm"; 
        }else{
            medida = "m";
        }
        String infoEtiqueta = etiqueta.isEmpty() ? "No hay etiqueta" : etiqueta;
        String datos = "Ancho: " + ancho + medida + " | alto: " + alto + medida + " | Largo: " + fondo + medida + " | Volumen (metro^3): " + volumen;
        return datos + "\n" + "Etiqueta: " + infoEtiqueta;
    }
}
