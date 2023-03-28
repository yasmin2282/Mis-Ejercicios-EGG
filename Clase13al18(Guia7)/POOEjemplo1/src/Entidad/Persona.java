package Entidad;
public class Persona {
    //atributos, son caracteristicas comunes a todos los objetos
    public String nombre;
    public int edad;
    public double talla;
    //contructores
    // Contructores por defecto
    public Persona() {
    }
  //Contructores por parametros
    public Persona(String nombre, int edad, double talla) {
        this.nombre = nombre;
        this.edad = edad;
        this.talla = talla;
    }
    
   //metodos propios Getter and Setter
    public String getNombre() { // El metodo get se usa para para consultar el estado de un objeto
        return nombre;
    }

    public void setNombre(String nombre) { //El metodo Set se usa para modificar su estado
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", talla=" + talla + '}';
    }
    
    
}
