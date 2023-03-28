
package pooej1;

import Entidad.Persona;
import java.util.Scanner;


public class POOEj1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Persona primeraPersona=new Persona("Maria", 40,1.55);
        Persona segundaPersona =new Persona();
        
        primeraPersona.setNombre("Yolanda");
        
        //System.out.println(primeraPersona.nombre+" "+primeraPersona.edad+" "+primeraPersona.talla);
        System.out.println(primeraPersona);
    }

}
