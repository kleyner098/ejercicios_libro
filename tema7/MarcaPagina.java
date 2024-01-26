package tema7;

public class MarcaPagina {
    /*
     * 7.11 Escribe la clase MarcaPagina, ayuda a llevar el control de la lectura de
     * un libor. Deberá disponer de métodos para incrementar la página leída, para
     * obtener información de la última página que se ha leído y para comenzar desde
     * el principio una nueva lectura de mismo libro
     */
    private int pagina;

    public void incrementar() {
        pagina++;
    }

    public int getPagina(){
        return pagina;
    }
    public void  resetPagina(){
        pagina = 0;
    }
}
