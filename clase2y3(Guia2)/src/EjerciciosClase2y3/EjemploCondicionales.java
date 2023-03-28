/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosClase2y3;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class EjemploCondicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int opinion;//definimos una variable de tipo entera con nombre "opinion"
        Scanner leer =  new Scanner(System.in);
        System.out.println("Clasifique la pelicula de 1 a 5 estrellas");
        opinion = leer.nextInt();//le pedimos que nos cargue por teclado una opcion(para que nos lea un entero se usa el nextInt
        
        //if es Si en psint
        if (opinion >= 1 && opinion <= 5){
            switch (opinion){ //switch es "Segun"
                case 1:
                case 2: //segun los caso 1 y 2 dan el mismo mesaje
                    System.out.println("Nos sentimos apenados que no aya disfrutdo la peli..");
                    break; //este comando es necesario en caso de usar el switch
                case 3:
                    System.out.println("Has clasificado la peli como buena");
                     break; //le dice que una vez que se ejecuto el bloque de codigo se debe detener y no ejecutar el proximo caso
                case 4:
                    System.out.println("Has clasificado la pelicula como buena");
                     break;//si lo omitieramos se seguiria ejecutando
                case 5:
                    System.out.println("Fantastico que hayas disfrutado un excelente entretenimiento!");
                     break;
             //Si ninguna de las 5 acciones e cumple se realiza por defecto lo q viene abajo
            }
        
        } else if (opinion < 0) { //else if = Sino Si. Concatenamos expresiones de tipo condicionales 
            System.out.println("¿una opinion negativa? ¿Tan mala fue la peli? :( ");
        } else if (opinion == 0) {
            System.out.println("El valor "+opinion +" no es valido y no se tomara en cuenta :D");
        } else {//else es SiNo
            System.out.println("!wow ! Se te fue la mano con la calificacion ! :D ");
        }
        System.out.println("Hasta la proxima!");
    }
    
}
