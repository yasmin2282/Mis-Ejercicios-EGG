package Entidad;
/*Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un atributo privado altura. 
La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario. 
También incluirá un método para calcular la superficie del rectángulo y un método para calcular el perímetro del rectángulo. 
Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura. 
Se deberán además definir los métodos getters, setters y constructores correspondientes.
             Superficie = base * altura / Perímetro = (base + altura) * 2.*/

import java.util.Scanner;

public class Rectangulo {
    Scanner leer = new Scanner(System.in);
    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void crearRectangulo(){
        
        System.out.println("ingrese base del triangulo:");
        setBase(leer.nextInt());
        System.out.println("Ingrese altura del triangulo:");
        setAltura(leer.nextInt());
    }
    public void superficieRectangulo(){
        int superficie = getBase()*getAltura();
        System.out.println("la supeficie de rectangulo es "+superficie);
    }
    public void perimetroRectangulo(){
        int perimetro = ((getBase() + getAltura())*2);
        System.out.println("El perimetro del rectangulo es "+perimetro);
    }
    public void dibujarRectangulo(){
        for (int i = 0; i < getAltura(); i++) {
            if (i==getAltura()-1 || i==0) {
                for (int j = 0; j < getBase(); j++) {
                    System.out.print("* ");
                }
            }else{
                for (int j = 0; j < getBase(); j++) {
                    if (j==getBase()-1 || j==0) {
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
    
}
