package EjemplosYejerciciosGuia;

import java.util.Scanner;

public class Ej4DoWhile {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String respuesta;
        do {
            System.out.println("Desea continuar?:");
            respuesta = leer.nextLine();
        } while (respuesta.equalsIgnoreCase("S"));//mientras la condicion se verdadera el buble se repetira 
    }
}
