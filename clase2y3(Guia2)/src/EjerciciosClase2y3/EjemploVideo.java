/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosClase2y3;

import java.util.Scanner;//Me aparece esto luego de corregir la clase Scaner, lo que me quier decir es:
                           //importa  la clase Scaner que se encuentra en el paquete JAva.Util

/**
 *
 * @author ASUS
 */
public class EjemploVideo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //al igual que psint se tiene ¿q definir q tipo de variables se va a definir
        //Scaner es una variable q se utiliza para leer un datos por tclado que ingrese el usurio 
        //(emula el comportamiento de leer de psint)
        //leer es el nombre q se le da a la variable
        // se le asigna un objeto "=" para decirle que necesitamos la funcionalidad del scaner obteniendo el valor por el teclado
        Scanner leer = new Scanner(System.in);//System.in ->Indica entrada
        // se esribe una variable cadena(String) con nu respectivo nombre "nombre" 
        String nombre;
        //muestra un mensaje por pantalla la frase "ingresa tu nombre"
        System.out.println("ingresa tu nombre:");//System.out->indica salida
        //lego de imprimir se le va a pedir a traves del scaner  que el usuario ingrese una linea y se le asigne a nombre
        //leemos el nombre de la persona en la variable nombre
        nombre = leer.next();//leer es una variable que invoca a una funcion "next" y el resultado de esta funcion se asigna a la variavle strig o cadena
        //mostramos por pantalla  un saludo personalizado concatenamos el nombre de la persona 
        System.out.println("Hola mundo! Soy "+nombre + " y estoy programando en Java.");
    }
    
}
