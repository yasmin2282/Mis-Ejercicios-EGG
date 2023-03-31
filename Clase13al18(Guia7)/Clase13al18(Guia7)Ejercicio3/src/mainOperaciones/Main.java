
package mainOperaciones;

import Entidad.Operaciones;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Operaciones n1=new Operaciones();
        
        n1.crearOperaciones();
        System.out.println("La suma de los numeros ingresados es " + n1.sumar());
        System.out.println("La resta de los numeros ingresados es "+n1.restar());
        System.out.println("La multimplicacion de los numeros ingresados es "+n1.multiplicar());
        System.out.println("La division de los numeros ingresados es "+n1.dividir());
        
    }

}
