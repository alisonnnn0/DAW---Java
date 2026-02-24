package OBS_Lectura_I_Escriptures;

import java.io.*;
import java.util.*;

public class Ex2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueix el nombre del arxiu: ");
        String nom = sc.nextLine();

        File arxiu = new File(nom);

        if (arxiu.exists() && arxiu.isFile()) {

            try (Scanner aa = new Scanner(arxiu); Formatter f = new Formatter("Histograma" + nom)) {

                int excelent = 0, notable = 0, aprovat = 0, suspes = 0;

                double nota = -1;

                if (aa.hasNextDouble()) {

                    nota = aa.nextDouble();
                }

                while (nota != -1) {

                    if (nota >= 9) {

                        excelent++;

                    } else if (nota >= 6.5) {

                        notable++;

                    } else if (nota >= 5) {

                        aprovat++;

                    } else {

                        suspes++;
                    }

                    if (aa.hasNextDouble()) {

                        nota = aa.nextDouble();
                        
                    } else {
                        
                        nota = -1;
                    }
                    
                }
                
                f.format("Histograma del fitxer %s%n", nom);
                f.format("%s%n", "-".repeat(40));
                f.format("%-15s: %s%n", "Suspès", "*".repeat(suspes));
                f.format("%-15s: %s%n", "Aprovat", "*".repeat(aprovat));
                f.format("%-15s: %s%n", "Notable", "*".repeat(notable));
                f.format("%-15s: %s%n", "Excel·lent", "*".repeat(excelent));

                System.out.println("S'ha generat el fitxer: Histograma-" + nom);

            } catch (FileNotFoundException ex) {

                System.out.println(ex);
            }
        }
    }
}
