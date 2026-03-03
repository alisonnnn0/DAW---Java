
package Recu_TAD_examen2;

import java.util.*;
import java.util.stream.Collectors;

class Categoria {
    private final String nom;
    private final int puntuacio;

    public Categoria(String nom, int puntuacio) {
        this.nom = nom;
        this.puntuacio = puntuacio;
    }

    public String getNom() {
        return nom;
    }

    public int getPuntuacio() {
        return puntuacio;
    }

    @Override
    public String toString() {
        return nom + ": " + puntuacio;
    }
}

class Videojoc {
    private final String titol;
    private final int id;
    private Categoria[] categories = new Categoria[3];

    public Videojoc(String titol, int id) {
        this.titol = titol;
        this.id = id;
    }

    public String getTitol() {
        return titol;
    }

    public int getId() {
        return id;
    }

    public Categoria[] getCategories() {
        return categories;
    }

    public void setCategories(Categoria[] categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        return String.format("ID: %-4d | Títol: %-15s | %s, %s, %s",
                id, titol, categories[0], categories[1], categories[2]);
    }
}

public class ExamenVideojocs {
    public static void main(String[] args) {
        List<Videojoc> cataleg = creaLlistaVideojocs();
        System.out.println("=== Llista inicial de Videojocs ===");
        cataleg.forEach(System.out::println);
        System.out.println("===================================\n");

        // Per l'Exercici 0, farem servir aquest array de prova:
        String[] jocsProva = {"Zelda", "Assassin's Creed", "Mario Kart", "Halo", "GTA V"};
       
        // Descomenta les línies següents per anar provant els teus mètodes:
       
        // System.out.println(Arrays.toString(ex0(jocsProva)));
       
        // ex1(cataleg);
        // System.out.println("--- Després de l'EX 1 ---");
        // cataleg.forEach(System.out::println);
       
        // ex2(cataleg);
        // System.out.println("--- Després de l'EX 2 ---");
        // cataleg.forEach(System.out::println);
       
        // List<Integer> notesSo = ex3(cataleg);
        // System.out.println("--- Notes de So (EX 3) ---");
        // System.out.println(notesSo);
       
        // System.out.println("--- IDs Ordenats (EX 4) ---");
        // ex4(cataleg);
       
        // System.out.println("--- Jocs Top (EX 5) ---");
        // ex5(cataleg);
       
        // System.out.println("--- Filtre per 'Z' (EX 6) ---");
        // ex6(cataleg, v -> v.getTitol().startsWith("Z"));
    }

    // ====== Generació de dades del control ======
    public static List<Videojoc> creaLlistaVideojocs() {
        final String[] titols = {"Zelda", "Mario", "Elden Ring", "Halo", "Portal", "Tetris", "FIFA", "Minecraft", "Doom", "Hades"};
        final int[] ids = {101, 204, 305, 408, 510, 612, 715, 820, 925, 999};

        Random r = new Random();
        List<Videojoc> llista = new ArrayList<>(titols.length);

        for (int i = 0; i < titols.length; i++) {
            Videojoc v = new Videojoc(titols[i], ids[i]);
            v.setCategories(new Categoria[]{
                    new Categoria("Gràfics", r.nextInt(101)),
                    new Categoria("Jugabilitat", r.nextInt(101)),
                    new Categoria("So", r.nextInt(101))
            });
            llista.add(v);
        }
        return llista;
    }

    // ====== Exercicis (Per completar) ======

    public static String[] ex0(String[] titols) {
        // TODO: Implementa aquí l'Exercici 0
        // Remplazar todas las "a" de los titulos. No se puede modificar la 
        //original. Ordenar por un parametro.
       
        String[] copiaT = Arrays.copyOf(titols, titols.length);
        
        for (int i = 0; i < copiaT.length; i++) {
            
            copiaT[i] = copiaT[i].replace("a", "M");
        }
        
        Arrays.sort(copiaT, Comparator.comparing(String::length));
        
        return copiaT; // Modifica aquest return
    }

    public static void ex1(List<Videojoc> cataleg) {
        // TODO: Implementa aquí l'Exercici 1
        // Ordenar por la categoria [0], sino por id del videojuego de mayor a menor.
        
        cataleg.sort(Comparator.comparing((Videojoc v) -> v.getCategories()[0].getPuntuacio()).thenComparing(Videojoc::getId).reversed());
       
    }

    public static void ex2(List<Videojoc> cataleg) {
        // TODO: Implementa aquí l'Exercici 2
        // Borrar todos los que en la segunda columna de categoria tengan menos que 50.
       
        cataleg.removeIf(p -> p.getCategories()[1].getPuntuacio() < 50);
    }

    public static List<Integer> ex3(List<Videojoc> cataleg) {
        // TODO: Implementa aquí l'Exercici 3
        // Mapa. Devolver una lista de la tercera categoria y si el valor de la 
        // categoria es mas grande que 50 le restas 5.
        
        return cataleg.stream()
                .map(p -> p.getCategories()[2].getPuntuacio())
                .map(p -> p > 50 ? p - 5 : p)
                .collect(Collectors.toList()); // Modifica aquest return
    }

    public static void ex4(List<Videojoc> cataleg) {
        // TODO: Implementa aquí l'Exercici 4
        // Mapa. Crear un mapa de videojuegos, la clave es el ID y el valor el 
        // objeto Videojuego. Mostrar ID's ordenadas.
        
        Map<Integer, Videojoc> m = new HashMap<>();
        
        for (Videojoc v : cataleg) {
            
            m.put(v.getId(), v);
        }
        
        m.keySet().stream()
                .sorted()
                .forEach(System.out::println);
    }

    public static void ex5(List<Videojoc> cataleg) {
        // TODO: Implementa aquí l'Exercici 5
        // Crear un TreeSet de videojuegos y ordenar por la longitud del titulo.
        // Sino por el ID. Muestra todos los que tienen mas de 75 en todas las categorias.
       
        Set<Videojoc> s = new TreeSet<>(Comparator.comparingInt((Videojoc p) -> p.getTitol().length()).thenComparing(Videojoc::getId));
        
        s.addAll(cataleg);
        
        s.stream()
                .filter(p -> p.getCategories()[0].getPuntuacio() > 75 && p.getCategories()[1].getPuntuacio() > 75 && p.getCategories()[2].getPuntuacio() > 75)
                .forEach(System.out::println);
    }

    public static void ex6(List<Videojoc> cataleg, Filtre<Videojoc> filtre) {
        // TODO: Implementa aquí l'Exercici 6
        // Crear una interficie funcional llamada Filtre, tiene un metodo que
        // recibe un generico y devuelve un booleano. En el main se imprime usando la interficie, todos los juegos que empiezan por Z.
       
    }
}
