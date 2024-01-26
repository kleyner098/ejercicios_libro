package tema7;

public class CambioImporte {
    /*
     * 7.14 Crea una calse que sea capaz de mostrar el importe de un cambio, por
     * ejemplo, al realizar una compra, con el menor número de monedas y billetes
     * posibles
     */

    private double importeInicial;
    // Array con los diferentes billetes y monedas
    final double billetesMonedas[] = { 500, 100, 50, 20, 10, 5, 2, 1, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01 };

    // Constructor
    CambioImporte(double importeInicial) {
        this.importeInicial = importeInicial;
    }

    // Set y get de importes
    public void setImporteInicial(double importeInicial) {
        this.importeInicial = importeInicial;
    }

    public double getImporteInicial() {
        return importeInicial;
    }

    // Método que hace el cambio de monedas
    public void cambio() {
        int moneda;
        // Variable que se utilizara para calcular las distintas cantidades de billetes
        // y monedas
        double total = this.importeInicial;
        // String que guardará las cantidades de billetes y monedas
        String cambio = "";
        // bucle que recorrera la array de billetes
        for (int i = 0; i < billetesMonedas.length; i++) {
            // Comprueba si el elemento de la array es mayor al total
            if (billetesMonedas[i] <= total) {
                // Dividimos el total entre el elemento de la array y calcula la cantidad de
                // billetes o monedas, solo guardamos la parte entera
                moneda = (int) (total / billetesMonedas[i]);
                // calculamos el resto y será el nuevo total
                total = total % billetesMonedas[i];
                // actualizamos la string con la cantidad de billetes o de monedas
                if (billetesMonedas[i] >= 5) {
                    cambio += String.valueOf(moneda) + " billetes de " + String.valueOf(billetesMonedas[i]) + ", ";
                } else {
                    cambio += String.valueOf(moneda) + " monedas de " + String.valueOf(billetesMonedas[i]) + ", ";
                }
            }
        }
        // Imprimimos el resultado
        System.out.println(cambio);
    }
}
