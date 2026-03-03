
package Recu_TAD_examen;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreaJugadors {
     public static void main(String[] args) {
        List<Jugador> equip = creaLlistaEquips();
        System.out.println("=== Llista inicial ===");
        equip.forEach(System.out::println);

       
    }

    // ====== Generació de dades del control ======
    public static List<Jugador> creaLlistaEquips() {
        final String[] noms = {"Laia", "Jordi", "Núria", "Pau", "Aina", "Marc", "Ivet", "Pol", "Berta", "Oriol"};
        final int[] dorsals = {4, 7, 9, 11, 13, 18, 21, 23, 30, 34};

        Random r = new Random();
        List<Jugador> equip = new ArrayList<>(noms.length);

        for (int i = 0; i < noms.length; i++) {
            Jugador j = new Jugador(noms[i], dorsals[i]);
            j.setEstadistiques(new Estadistica[]{
                new Estadistica("Punts", r.nextInt(11)),
                new Estadistica("Assistències", r.nextInt(11)),
                new Estadistica("Rebots", r.nextInt(11))
            });
            equip.add(j);
        }
        return equip;
    }

    // ====== Exercicis ======

    public static String[] ex0(String[] paraules) {

       return null;
    }


    public static void ex1(List<Jugador> equip) {
        

    }


    public static void ex2(List<Jugador> equip) {
       
    }

    public static List<Integer> ex3(List<Jugador> equip) {
        return null;
    }

    public static void ex4(List<Jugador> equip) {
       
       
    }

 
    public static void ex5(List<Jugador> equip) {
        

    }


    public static void ex6(List<Jugador> equip, Prova<Jugador> prova) {
        
    }
    
}