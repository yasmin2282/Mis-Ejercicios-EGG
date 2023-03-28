
package EjemplosYejerciciosGuia;

import java.util.Scanner;

public class DoWhile {
/*Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del bucle
y mostrar el mensaje "Se capturó el numero cero".  El programa deberá calcular y mostrar el resultado de la suma
de los números leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.*/
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num,i=0,suma=0;
       
        
        do {
            System.out.println("Ingresar numeros");
            num = leer.nextInt();
            i++;
           
            if (num!=0) {
              
                if (num>0){
                    suma = num+suma;
                }
                
            }else{
                System.out.println("Atrapamos un cero");
                break;
            }      
            
        } while (i!=20);
        
        System.out.println("se ingresaron "+i +" numeros");
                System.out.println("La suma total de los numeros ingresados es: " +suma); 
        
  
            
        
        
        
    }

}
