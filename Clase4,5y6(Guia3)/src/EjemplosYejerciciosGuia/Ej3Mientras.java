
package EjemplosYejerciciosGuia;

import java.util.Scanner;


public class Ej3Mientras {

  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String respuesta = "S";
        
                while (respuesta.equalsIgnoreCase("S")){
                    System.out.println("Desea continuar?");
                    respuesta=leer.nextLine();
                }
    }
    
}
