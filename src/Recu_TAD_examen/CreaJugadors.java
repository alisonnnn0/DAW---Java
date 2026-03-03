package Recu_TAD_examen;

import java.util.*;
import java.util.stream.Collectors;

public class CreaJugadors {

    public static void main(String[] args) {
        List<Jugador> equip = creaLlistaEquips();
        System.out.println("=== Llista inicial ===");
        equip.forEach(System.out::println);

        
        ex6(equip, p -> p.getEstadistiques()[0].getValor());
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

        String[] copiaParaules = Arrays.copyOf(paraules, paraules.length);

        String var = "";

        for (int i = 0; i < copiaParaules.length; i++) {

            var = "";

            for (int j = copiaParaules[i].length() - 1; j >= 0; j--) {

                var += copiaParaules[i].charAt(j);
            }

            var = copiaParaules[i];
        }

        Arrays.sort(copiaParaules, Comparator.comparingInt(String::length));

        return copiaParaules;
    }

    public static void ex1(List<Jugador> equip) {

        equip.sort(Comparator.comparing((Jugador p) -> p.getEstadistiques()[0].getValor()).reversed().thenComparing(Jugador::getDorsal));
    }

    public static void ex2(List<Jugador> equip) {

        equip.removeIf(p -> p.getEstadistiques()[1].getValor() < 5);
    }

    public static List<Integer> ex3(List<Jugador> equip) {

        return equip.stream()
                .map(p -> p.getEstadistiques()[2].getValor())
                .map(r -> r < 10 ? r + 1 : r)
                .collect(Collectors.toList());
    }

    public static void ex4(List<Jugador> equip) {

        Map<Integer, Jugador> ordenats = new HashMap<>();
        
        for (Jugador j : equip) {
            
            ordenats.put(j.getDorsal(), j);
        }
        
        ordenats.keySet().stream()
                .sorted()
                .forEach(System.out::println);
    }

    public static void ex5(List<Jugador> equip) {

        Set<Jugador> o = new TreeSet<>(Comparator.comparing(Jugador::getNom).thenComparing(Jugador::getDorsal));
        
        o.addAll(equip);
        
        o.stream()
                .filter(p -> p.getEstadistiques()[0].getValor() >= 5 && p.getEstadistiques()[1].getValor() >= 5 && p.getEstadistiques()[2].getValor() >= 5)
                .forEach(System.out::println);
    }

    public static void ex6(List<Jugador> equip, Prova<Jugador> prova) {

        for (Jugador jugador : equip) {
            
            System.out.println(jugador.getNom() + " Puntuacio: " + prova.aplica(jugador));
        }
    }

    @FunctionalInterface
    interface Prova<T>{
        
        int aplica(T generic);
            
        
    }
}
