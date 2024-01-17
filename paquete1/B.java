package paquete1;

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
    }
}
