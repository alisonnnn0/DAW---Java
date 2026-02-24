
package OBS_Lectura_I_Escriptures;

import java.io.*;
import java.util.*;

public class Competicio {
    
    public static void main(String[] args) {
        
        List<String> equips = List.of("Marc", "Mochi", "Alex", "Enric", "Satan");
        
        String nom = "Resultats.txt";
    }
    
    public static void escriureResultatsAleatoris(String nom, List <String> equips){
    
        Random gol = new Random();
        gol.nextInt(6);
        
        try (Formatter f = new Formatter(nom)){
            
            for (int i = 0; i < arr.length; i++) {
                Object object = arr[i];
                
            }
            
        } catch (FileNotFoundException ex) {
            
            System.out.println(ex);
        }
    
    }
}
