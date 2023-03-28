package EjemplosYejerciciosGuia;

import java.util.Scanner;

public class switchDefault {
/*Considera que estás desarrollando una web para una empresa que fabrica motores 
(suponemos que se trata del tipo de motor de una bomba para mover fluidos). 
Definir una variable tipoMotor y permitir que el usuario ingrese un valor entre 1 y 4. 
El programa debe mostrar lo siguiente:
oSi el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una bomba de agua”.
oSi el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una bomba de gasolina”.
oSi el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una bomba de hormigón”.
oSi el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una bomba de pasta alimenticia”.*/

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int tipoMotor;
        System.out.println("Digite el tipo de motor:");
        tipoMotor = leer.nextInt();
        switch (tipoMotor) {
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("la bomba es una bomba de hormigon");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor valido para el tipo de bomba");
        }

    }

}
