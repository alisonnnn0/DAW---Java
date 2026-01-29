
package Estructura_Alternativa_For;

import java.util.Scanner;

public class Ej05For {
    
    public static void main(String[] args) {
        
        int total = 0, nom;
        
        for (int i = 1; i <=5; i++){
            Scanner lector = new Scanner (System.in);
            
            System.out.print("Nombre " + i + ": ");
            nom = lector.nextInt();
            
            if (nom >= 10){
                total += nom;
            
            }
            
        }
        System.out.println("Suma total: " + total);
        
        
    }
    
}
