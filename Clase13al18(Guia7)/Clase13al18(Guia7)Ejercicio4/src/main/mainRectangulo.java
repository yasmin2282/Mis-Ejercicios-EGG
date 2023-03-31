
package main;

import Entidad.Rectangulo;
import java.util.Scanner;

public class mainRectangulo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Rectangulo r1=new Rectangulo();
        
        r1.crearRectangulo();
        r1.superficieRectangulo();
        r1.perimetroRectangulo();
        r1.dibujarRectangulo();
    }

}
