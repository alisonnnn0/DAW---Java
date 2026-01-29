
package Estructura_Alternativa_For;

import java.util.Scanner;

public class Ej16For {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un numero: ");
        int nom = sc.nextInt();
        
        for (int i = 1; i <= nom; i++){
            
            for (int j = 1; j <= nom; j++){
                
                if (j <= i - 1){
                    System.out.print("  ");
                    
                } else {
                    System.out.print("* ");
                    
                }
                
            }
            
            System.out.println("");
            
        }
        
    }
    
}
