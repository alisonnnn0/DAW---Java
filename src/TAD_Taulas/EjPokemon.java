
package TAD_Taulas;

import java.util.Random;

public class EjPokemon {
    
    public static void main(String[] args) {
        
        int [] jugador1 = new int[10];
        int [] jugador2 = new int[10];

        System.out.println("**********************************************");
        System.out.println("          POKEMON DE CADA JUGADOR");
        System.out.println("**********************************************");
        System.out.println("");
        
        //Asignar de manera aleatoria la força del pokemon a cada jugador.
        for (int i = 0; i < jugador1.length; i++) {
            
            Random r = new Random();
            int valor = r.nextInt((100)+1);
            
            jugador1[i] = valor;
            
            for (int j = 0; j < jugador2.length; j++) {
                
                valor = r.nextInt((100)+1);
                
                jugador2[i] = valor;
            }
            
            System.out.println("Jugador 1 -> "+ jugador1[i] + "     Jugador 2 -> "+ jugador2[i]);
        }
        
        
        int maxJugador1 = 0;
        int maxJugador2 = 0;
        int puntos1 = 0;
        int puntos2 = 0;
        
        //Seleccionar el pokemon con el ataque mas alto
        
        System.out.println("");
        System.out.println("**********************************************");
        System.out.println("           RESULTAT DE CADA COMBAT");
        System.out.println("**********************************************");
        System.out.println("");
        
        for (int k = 0; k < jugador2.length; k++) {

            for (int i = 0; i < jugador1.length; i++) {

                if (maxJugador1 < jugador1[i]) {

                    maxJugador1 = jugador1[i];
                }
            }

            for (int j = 0; j < jugador2.length; j++) {

                if (maxJugador2 < jugador2[j]) {

                    maxJugador2 = jugador2[j];
                }
            }

            System.out.println("Maxim Jugador 1 -> " + maxJugador1 + "    Maxim Jugador 2 ->" + maxJugador2);

            if (maxJugador1 < maxJugador2) {

                puntos2++;

            } else if (maxJugador1 > maxJugador2) {

                puntos1++;

            } else {

                puntos1++;
                puntos2++;
            }
       

            for (int i = 0; i < jugador1.length; i++) {

                if (maxJugador1 != jugador1[i]) {



                } else {

                    jugador1[i] = 0;
                    maxJugador1 = 0;
                }
            }
            
            for (int i = 0; i < jugador2.length; i++) {

                if (maxJugador2 != jugador2[i]) {



                } else {

                    jugador2[i] = 0;
                    maxJugador2 = 0;
                }
            }
        }
        
        System.out.println("");
        System.out.println("**********************************************");
        System.out.println("               RESULTAT FINAL");
        System.out.println("**********************************************");
        System.out.println("");
        
        System.out.println("Puntos Jugador 1: " + puntos1);
        System.out.println("Puntos Jugador 2: " + puntos2);
    }
}

