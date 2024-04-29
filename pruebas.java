import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Random;


public class pruebas {
    public static void main(String[] args) {

        // Crear una intancia de random
        Random nrd = new Random();
        
        for (int i = 0 ; i < 10 ; i++){
            System.out.println(nrd.nextInt(10)+1); //Numero aleatorio entre el 1 y el 10
        }
        char uno = 9829;
        char dos = '♥';
        System.out.println(uno+" ♥♦♣♠");

        char h = 'h';
        char H = 'h' + 'A' - 'a';
        System.out.println("Minúscula: "+ h +" | Mayúscula: " + H);
        //Solo entran en el rango de imprimible hasta 0x007E, apartir de 0x007F la consola no puede imprimir estos caracteres 
        /* for (int codePoint = 0x000; codePoint <= 0xFFFF; codePoint++){
            String xxxx = Integer.toHexString(codePoint);
            System.out.println("\\u" + xxxx + ": " + (char)codePoint);
        } */

        // agenda();
        
        
        try {
            int c = 5/ 0;
        } catch (Exception e) {
            System.out.println("Soy la excepcion");
        }
        System.out.println("Hola");
        

        // FileReader in = null;
        BufferedReader in = null;
        String texto = "";
        // String caracteres = "";


        try {
            // in = new FileReader("prueba.txt");
            in = new BufferedReader(new FileReader("prueba.txt"));
            // int c = in.read();
            String line = in.readLine();
            // while (c != -1) {
            while (line != null){
                // caracteres = caracteres + String.valueOf(c) + " ";
                // texto = texto + (char) c;
                // c = in.read();
                texto = texto + line + "\n";
                line = in.readLine();
            }
        } catch (IOException ex) {
            
            System.out.println(ex.getMessage() + " Primera excepción");
        }finally{
            if (in != null){
                try {
                    in.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        }
        // System.out.println(caracteres);
        System.out.println(texto);
        System.out.println(LocalDate.now());
    }
}
