package tema8;

public class Campana extends Instrumento {
    /*
     * 8.11 Crea la clase campana que hereda de Instrumento (definida en la
     * Actividad resuelta 8.4)
     */

    public Campana() {
        super();
    }

    @Override
    void interpretar() {
        for (Nota nota : melodia) {
            switch (nota) {
                case DO:
                    System.out.print("TOON ");
                    break;
                case RE:
                    System.out.print("DON ");
                    break;
                case MI:
                    System.out.print("DAN ");
                    break;
                case FA:
                    System.out.print("TAN ");
                    break;
                case SOL:
                    System.out.print("din don ");
                    break;
                case LA:
                    System.out.print("tilín ");
                    break;
                case SI:
                    System.out.print("tintín ");
                    break;
            }
        }
        System.out.println("");
    }

}
