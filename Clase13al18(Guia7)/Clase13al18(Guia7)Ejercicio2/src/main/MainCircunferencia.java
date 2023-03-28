
package main;

import Entidad.Circunferencia;
import java.util.Scanner;

public class MainCircunferencia {

    public static void main(String[] args) {
        
        Circunferencia r1= new Circunferencia(4);
        
        r1.crearCircunferencia();
        r1.area();
        r1.perimetro();
                
        System.out.println("el area del circulo es: "+r1.area());
        System.out.println("el perimetro del circulo es: "+r1.perimetro());

    }

}
