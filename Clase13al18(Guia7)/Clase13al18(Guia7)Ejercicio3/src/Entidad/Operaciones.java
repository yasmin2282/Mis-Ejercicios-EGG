package Entidad;

import java.util.Scanner;

/*Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. A continuación, se deben crear los siguientes métodos:
Método constructor con todos los atributos pasados por parámetro.
Método constructor sin los atributos pasados por parámetro.
Métodos get y set.
Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
Método sumar(): calcular la suma de los números y devolver el resultado al main.
Método restar(): calcular la resta de los números y devolver el resultado al main
Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar por cero, el método devuelve 
0 y se le informa al usuario el error. Si no, se hace la multiplicación y se devuelve el resultado al main
Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero, el método devuelve 0 
y se le informa al usuario el error se le informa al usuario. Si no, se hace la división y se devuelve el resultado al main.*/

public class Operaciones {
    Scanner leer = new Scanner(System.in);
    private int numero1;
    private int numero2;

    public Operaciones() {
    }

    public Operaciones(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    
    public void crearOperaciones(){
        System.out.println("ingrese 2 numeros:");
        setNumero1(leer.nextInt());
        setNumero2(leer.nextInt());
    }
    public int sumar(){
    int suma = numero1+numero2;
    return suma;
    }
    public int restar(){
        int resta;
        resta = numero1-numero2;
        return resta;
    }
    public int multiplicar(){
        if (numero1==0 || numero2==0) {
            System.out.println("Error en los datos ingresados para la multiplicacion!!!");
            return 0;
        }else{
           int multiplicar=numero1*numero2;
            return multiplicar;
        }
    }
    public double dividir(){
        double num1=getNumero1();
        double num2=getNumero2();
        
          if (numero1==0 || numero2==0) {
            System.out.println("Error en los datos ingresados para la division!!!");
            return 0;
        }else{
           double division =  num1/num2;
            return division;
        }
    }
    
}

