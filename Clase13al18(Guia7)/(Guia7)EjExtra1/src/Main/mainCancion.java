
package Main;

import Entidades.Cancion;
import java.util.Scanner;

public class mainCancion {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cancion tema1=new Cancion();
        Cancion tema2=new Cancion("Marimar", "Thalia");
        
        System.out.println(tema1.toString());
        System.out.println(tema2.toString());
       
        
    }

}
