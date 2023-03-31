
package Main;

import Entidades.Puntos;
import java.util.Scanner;

public class mainPuntos {

    public static void main(String[] args) {
        Puntos cord1 = new Puntos();
        
        cord1.crearPuntos();
        System.out.println("La distancia entre los dos puntos es: "+cord1.calcularDistancia());
        
    }

}
