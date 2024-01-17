import java.util.Random;
import java.io.*;


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
        //Solo entran en el rango de imprimible hasta 0x007E, apartir de 0x007F la consla no puede imprimir estos caracteres 
        for (int codePoint = 0x000; codePoint <= 0xFFFF; codePoint++){
            String xxxx = Integer.toHexString(codePoint);
            System.out.println("\\u" + xxxx + ": " + (char)codePoint);
        }

        // agenda();
        
        
    }
}
