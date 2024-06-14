package tema10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Agenda {

    /*
     *
     *  Ejercicio 10.21 Diseña una pequeña agenda, que nuestre el siguiente menú:
     * 1. Nuevo contacto.
     * 2. Buscar por nombre.
     * 3. Mostrar todos.
     * 4. Salir.
     * En ella, guardaremos el nombre y el teléfono de un máximo de 20 personas.
     * La opción 1, nos premitirá introducir un nuevo contacto siempre y cuando la
     * agenda no esté llena, comprobando que el nombre no se ecuentre insertado ya.
     * La opción 2, muestra todos los teléfonos que coinciden con la cadena que se
     * busca. Por ejemplo, sin tecleamos <<Pe>>, mostrará el teléfono de Pedro, de
     * Pepe y de Peturia.
     * La opción 3 mostrará un listado con toda la información (nombres y teléfono)
     * ordenes dis alfabéticamente por el nombre.
     * Por último, la opción 4 guarda todos los datos de la agenda en el archivo
     * agenda.txt. La próxima vez que se ejecute la aplicación, si hay datos
     * guardados, se cargarán en memoria
     */
    private String[] contactos;
    private long[] numeros;
    private int numContacto = 0;
    private String menu = """
            Escribe el número de la opción:
            1. Nuevo contacto.
            2. Buscar por nombre.
            3. Mostrar todos.
            4. Salir.
                   """;

    public Agenda() {
        this.contactos = new String[20];
        this.numeros = new long[20];
    }

    private void agregar(String contacto, long numero) {
        this.contactos[numContacto] = contacto;
        this.numeros[numContacto] = numero;
        numContacto++;
        System.out.println("\nContacto guardado");
        if (numContacto >= 20) {
            numContacto++;
        }
    }

    private void buscar(String index) {
        index = index.toLowerCase();
        int num = 0;
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] != null && contactos[i].toLowerCase().startsWith(index)) {
                System.out.println(contactos[i] + "-" + numeros[i]);
                num++;
            }
        }
        if (num == 0) {
            System.out.println("No se han encontrado ningún contacto");
        }
    }

    private void todos() {
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] != null) {
                System.out.println(contactos[i] + "-" + numeros[i]);
            }
        }
    }

    private void guardar() {
        File agenda = new File("tema10/agenda.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(agenda, false))) {
            for (int i = 0; i < contactos.length; i++) {
                if (contactos[i] != null) {
                    writer.write(contactos[i] + "-" + numeros[i]);
                    writer.newLine();
                }

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void cargar(){
        File agenda = new File("tema10/agenda.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(agenda))) {
            String linea = null;
            String contactoNumero[] = new String[2];
            for (int i = 0; i < contactos.length; i++) {
                linea = reader.readLine();
                if(linea != null){
                    contactoNumero = linea.split("-");
                    contactos[i] = contactoNumero[0];
                    numeros[i] = Integer.parseInt(contactoNumero[1]);

                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void iniciar() {
        Boolean terminar = false;
        Scanner sc = new Scanner(System.in);
        cargar();
        while (!terminar) {
            System.out.println(menu);
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    sc.nextLine();
                    System.out.println("Escribe el nombre del contacto");
                    String nombre = sc.nextLine();
                    System.out.println("Escribe el número del contacto");
                    long telf = sc.nextLong();
                    agregar(nombre, telf);
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("Escribe un patron para buscar");
                    String index = sc.nextLine();
                    buscar(index);
                    break;
                case 3:
                    todos();
                    break;
                case 4:
                    guardar();
                    terminar = true;
                    break;
                default:
                    System.out.println("\n!!!Elige una de las opciones disponibles.!!!");
            }
        }
    }
}
