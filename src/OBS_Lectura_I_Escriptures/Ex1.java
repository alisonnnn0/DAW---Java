package OBS_Lectura_I_Escriptures;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Ex1 {

    public static void main(String[] args) {

        try (Scanner lector = new Scanner(new File("fistro.txt"))) {

            if (lector.hasNextLine()) {

                int cont = 1;

                while (lector.hasNextLine() && !lector.nextLine().equals("fi")) {

                    String linea[] = lector.nextLine().split(" ");

                    System.out.println("La linea " + cont + " te " + linea.length + " paraules.");

                    cont++;
                    //linea.length
                }
            }

        } catch (FileNotFoundException ex) {

            System.out.println(ex);

        }
    }
}
