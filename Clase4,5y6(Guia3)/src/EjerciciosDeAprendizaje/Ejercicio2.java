
package EjerciciosDeAprendizaje;

import java.util.Scanner;

public class Ejercicio2 {
/*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa pondrá un 
mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar la función equals() en Java*/

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase1, frase2="eureka";
        
        System.out.println("Ingrese frase");
        frase1=leer.nextLine();
        if (frase1.equalsIgnoreCase(frase2)){
            System.out.println("CORRECTO");
    }else{
            System.out.println("INCORRECTO");
        }
    }
    
}
