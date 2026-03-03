
package TAD_EstudioT3;

import java.util.*;

public class ex2 {
    
    public static void main(String[] args) {
        
        String texto = "Estructura de Datos";
        
        System.out.println("Longitud - " + texto.length());
        System.out.println("Caractes pos7 - "+ texto.charAt(7));
        System.out.println("Mayus - " + texto.toUpperCase());
        
        
        String t = "usuario@dominio.com";
        
        int pos = t.indexOf("@");
        
        System.out.println("dominio - " + t.substring(pos +1));
        
        
        String r = "  Manzana, Pera, Plátano  ";
        
        String e = r.replace(" ", "");
        
        String[] w = e.split(",");
        
        System.out.println(Arrays.toString(w));
    }
}
