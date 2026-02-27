
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
        
        
        try (Formatter f = new Formatter(nom)){
            
            String[] s = equips.toArray(new String[0]);
            
            for (int i = 0; i < s.length; i++) {
                
                for (int j = i +1; j < s.length; j++) {
                    
                    String equips1 = s[i];
                    String equips2 = s[j];
                    
                    int gol1 = gol.nextInt(6);
                    int gol2 = gol.nextInt(6);
                    
                    f.format("%-10s %-10s %d %d%n", equips1, equips2, gol1, gol2);
                }
            }
            
        } catch (FileNotFoundException ex) {
            
            System.out.println(ex);
        }
    }
    
    public static Map<String, Integer> llegirResultatsICalcularClassificacio(String nom){
        
        File f = new File(nom);
        
        Map<String, Integer> classificacio = new HashMap<>();
        
        try (Scanner sc= new Scanner(f)){
            
            while (sc.hasNextLine()){
                
                String linea = sc.nextLine();
                
                String[] s = linea.split(" ");
                
                if (s.length == 4) {
                    
                    String equip1 = s[0];
                    String equip2 = s[1];
                    
                    int gol1 = Integer.parseInt(s[2]);
                    int gol2 = Integer.parseInt(s[3]);
                    
                    classificacio.putIfAbsent(equip1, 0);
                    classificacio.putIfAbsent(equip2, 0);
                    
                    if (gol1 > gol2) {
                        
                        classificacio.put(equip1, classificacio.get(equip1) + 3);
                        
                    } else if (gol1 < gol2) {
                        
                        classificacio.put(equip2, classificacio.get(equip2) + 3);
                        
                    } else {
                        
                        classificacio.put(equip1, classificacio.get(equip1) + 1);
                        classificacio.put(equip2, classificacio.get(equip2) + 1);
                    }
                }
            }
            
        } catch (FileNotFoundException ex) {
            
            System.getLogger(Competicio.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        
        return classificacio;
    }
    
    
    public static void escriureClassificacio(Map<String, Integer> classificacio){
        
        try (Formatter f = new Formatter("classificacio.txt")){
            
            classificacio.entrySet().stream() 
                    .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                    
            
        } catch (FileNotFoundException ex) {
            
            System.getLogger(Competicio.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
}
