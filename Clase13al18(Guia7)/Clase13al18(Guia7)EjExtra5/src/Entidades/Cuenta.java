package Entidades;

import java.util.Scanner;

/*Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". 
Luego, crea un método "retirar_dinero" que permita retirar una cantidad de dinero del saldo de la cuenta. 
Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.*/

public class Cuenta {
    Scanner leer = new Scanner(System.in);
  private int saldo;
  private String titular;  

    public Cuenta() {
    }

    public Cuenta(int saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
  
  public void retirarDinero(){
      System.out.println("Bienvenida Sr(a) "+this.titular);
      System.out.println( "Cuanto dinero desea retirar:");
      
      int retiro = leer.nextInt();
      
      if (retiro<=saldo) {
          saldo -= retiro;
          System.out.println("Usted retiro "+retiro +" pesos");
      }else{
          System.out.println("No posee los fondos suficientes");
      }
      
      System.out.println("Su saldo actual es: " +this.saldo +" pesos"); 
      
      
  }
    
}
