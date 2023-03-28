
package EjemplosYejercicoGuia3;

import java.util.Scanner;

public class EjemploVideo {

    public static void main(String[] args) {
        int resultado = suma(10, 10);
        
        System.out.println(resultado);
      
        saludoPersonalizado("Emer"); //Primera una manera de invocar a la funcion
        
        //segunda  manera de invocar a la funcioncon con scanner:
        System.out.println("Ingresa tu nombre:");
        Scanner leer = new Scanner(System.in);
        String nombre = leer.next();//se ingresa por teclado el nombre
        saludoPersonalizado(nombre);//se invoca a la funcion
        
        //otra manera de invocar a la funcion con scanner
        saludoPersonalizado(leer.next());//omite los dos ultimos pasos anteriores
    }
    public static int suma(int a, int b){
        int c=a+b;
        return c;          
    }
    public static void saludoPersonalizado(String nombre) {
        System.out.println("hola "+ nombre + " como estas?");
    }
}
