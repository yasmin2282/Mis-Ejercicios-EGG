package EjerciciosDeAprendizaje;

import java.util.Scanner;

public class Ejercicio7 {

    /*Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo lee cadenas enviadas por el 
usuario. Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene 
que ser X y el último tiene que ser una O. Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial
“&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta de FDE, que no respete el formato se considera 
incorrecta. Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas. 
Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().*/
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String caracteres,primerCaracter, ultimoCaracter;
        int correctas = 0;
        int incorrectas = 0;
        int longitud =0;
        
        
        do {
            System.out.println("Ingrese datos de un maximo de 5 caracteres (los datos ingresados deben comenzar con X y terminar e o):");
            caracteres = leer.next();
               longitud = caracteres.length();
           // System.out.println(longitud);
            primerCaracter = caracteres.substring(0, 1);
           // System.out.println(primerCaracter);
            ultimoCaracter = caracteres.substring(longitud - 1, longitud);
            // System.out.println(segundoCaracter);
            if (caracteres.equalsIgnoreCase("&&&&&")) {
                break;
            }
            if (primerCaracter.equalsIgnoreCase("X")&& ultimoCaracter.equalsIgnoreCase("O")&& longitud == 5) {
                ++correctas;  
            }else{
                ++incorrectas;
            }
        } while(!caracteres.equalsIgnoreCase("&&&&&") );
        System.out.println("Final de los envios.......");
        System.out.println("La cantidad de lecturas correctas que se recibidas: "+correctas);
        System.out.println("La cantidad de lecturas incorrectas que se recibio: "+incorrectas);
    }

}
