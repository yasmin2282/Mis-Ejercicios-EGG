
package Main;

import Entidades.Juego;

public class mainJuego {

    public static void main(String[] args) {
        Juego jugador1=new Juego();
        Juego jugador2=new Juego();
        
        System.out.println("TURNO del PRIMER jugador");
        jugador1.iniciarJuego();
        System.out.println("TURNO del SEGUNDO jugador");
        jugador2.iniciarJuego();
        
    }

}
