
package EjerciciosDeAprendizaje;

import java.util.Scanner;

public class Ejercicio3 {
/*Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el usuario ingresa una frase
o palabra de 8 de largo se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se debera
imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.*/

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese frase de 8 caracteres:");
        frase=leer.nextLine();
        int longit = frase.length();
        
        if (longit == 8) {
            System.out.println("Correcto, la frase tiene "+longit +"caracteres");
        }else{
            System.out.println("INCORRECTO; la frase tiene "+longit + " caracteres");
        }
        
        
    }
    
}
