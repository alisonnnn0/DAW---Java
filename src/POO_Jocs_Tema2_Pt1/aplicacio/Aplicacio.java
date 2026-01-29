package POO_Jocs_Tema2_Pt1.aplicacio;

import POO_Jocs_Tema2_Pt1.interficies.Jugable;
import POO_Jocs_Tema2_Pt1.numeros.JocEndevinaMultiplicacio;
import POO_Jocs_Tema2_Pt1.numeros.JocEndevinaNumero;
import POO_Jocs_Tema2_Pt1.numeros.JocEndevinaParell;
import POO_Jocs_Tema2_Pt1.numeros.JocEndevinaSenar;
import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacio {

    public static Jugable triaJoc() {
        
        Scanner teclat = new Scanner(System.in);

        // Crear los juegos
        Jugable joc1 = new JocEndevinaNumero(5, (int) (Math.random() * 11));
        Jugable joc2 = new JocEndevinaParell(5, 8);
        Jugable joc3 = new JocEndevinaSenar(5, 7);
        Jugable joc4 = new JocEndevinaMultiplicacio(5, 2);

        ArrayList<Jugable> jocs = new ArrayList<>();
        
        jocs.add(joc1);
        jocs.add(joc2);
        jocs.add(joc3);
        jocs.add(joc4);

        int opcio = -1;
        
        while (opcio < 0 || opcio > 3) {
            
            System.out.println("Tria un joc:");
            System.out.println("0 - Endevina Número");
            System.out.println("1 - Endevina Parell");
            System.out.println("2 - Endevina Senar");
            System.out.println("3 - Endevina Multiplicació");

            System.out.print("Introdueix un número (0-3): ");
            
            opcio = teclat.nextInt();

            if (opcio < 0 || opcio > 3) {
                
                System.out.println("Opció incorrecta, torna-ho a intentar.");
            }
        }

        return jocs.get(opcio);
    }

    public static void main(String[] args) {
        
        Scanner teclat = new Scanner(System.in);

        boolean continuar = true;
        
        while (continuar) {
            
            Jugable joc = triaJoc();

            joc.mostraNom();
            joc.mostraInfo();
            joc.juga();

            System.out.print("Vols jugar de nou? (1 = si, 2 = no): ");
            
            int resposta = teclat.nextInt();
            
            if (resposta == 2) {
                
                continuar = false;
            }
        }

        System.out.println("Gràcies per jugar!");
    }
}
