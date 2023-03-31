package Entidades;

import java.util.Scanner;

/*Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores jugar un juego de adivinanza de números.
El primer jugador elige un número y el segundo jugador intenta adivinarlo. 
El segundo jugador tiene un número limitado de intentos y recibe una pista de "más alto" o "más bajo" después de cada intento.
El juego termina cuando el segundo jugador adivina el número o se queda sin intentos. 
Registra el número de intentos necesarios para adivinar el número y el número de veces que cada jugador ha ganado.*/

public class Juego {
    Scanner leer = new Scanner(System.in);
    private int num1;
    private int num2;
    
   

    public Juego() {
    }

    public Juego(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
       
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void iniciarJuego(){
        System.out.println("Ingrese un numero a adivinar");
        setNum1(leer.nextInt());
        System.out.println("==========================================");
        System.out.println("Tiene 5 intentos para adivinar el numero");
        System.out.println("==========================================");
        int contador=0;
        do {
            System.out.println("Ingrese numero a adivinar");
            setNum2(leer.nextInt());
            if (num2==num1) {
                contador++;
                System.out.println("Acertastes");
                break;
            }else if ( num2<num1) {
                contador++;
                System.out.println("el numor a adivinar es mayor al numero ingresado");
                
            }else{
                    System.out.println("El numro a adivianr es menor al numero ingresado");
                    contador++;
                    }
                
        } while (contador<5 );
       
        
        if (num2==num1) {
            System.out.println("Lo as logrado en "+contador +" intentos");
            
        }else{
             System.out.println("Perdistes, se ababaron los intentos!!!");
        }
            
                
                
        
    
    
   
    }

}
