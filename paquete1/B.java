package paquete1;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        //El método .saludo es estático, no necesita que se cree un obejeto para invocarla
        A.saludo();
        //el metodo .despedida no es estático, por lo que para invocarla necesitamos un objeto A
        // A.despedida();
        A nuevaA = new A(3);
        nuevaA.despedida();

        //----Caso en el que la variable nota de la clase A sea public
        // nuevaA.nota = 7;
        // System.out.println(nuevaA.nota);

        //----Caso en el que la variable nota de la clase A sea private
        nuevaA.setNota(8);
        System.out.println(nuevaA.getNota());

        //ENUM
        DiasDeLaSemana dia = DiasDeLaSemana.MIERCOLES;
        System.out.println(dia);
        System.out.println(dia.name());
        System.out.println(dia.toString());
        System.out.println(dia.ordinal());
        System.out.println(dia.equals(DiasDeLaSemana.MARTES));
        DiasDeLaSemana dia2 = DiasDeLaSemana.DOMINGO;
        System.out.println(dia.compareTo(dia2));
        for (DiasDeLaSemana d : DiasDeLaSemana.values()) {
            System.out.print(d + " ");
        }

        EnumConValor p = EnumConValor.PRECIOVIP;     //precio = 80    
        System.out.println("\n"+ p);                                                      
        System.out.println(p.getPrecio()); //muestra 80

        Scanner sc = new Scanner(System.in);
        System.out.println("\nIntroduce un dia ");
        String d = sc.next();
        sc.nextLine();
        //
        DiasDeLaSemana diaIntrodudido = DiasDeLaSemana.valueOf(d.toUpperCase());
        switch (diaIntrodudido) {  
            case LUNES:
            case MARTES:
            case MIERCOLES:
            case JUEVES:
            case VIERNES:
                System.out.println("Aún no ha llegado el fin de semana");                                         
                break;
            default:
                System.out.println("Estamos en fin de semana");
        }
        sc.close();
        
    }
}
