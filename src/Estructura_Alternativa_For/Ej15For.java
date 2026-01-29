
package Estructura_Alternativa_For;

import java.util.Scanner;

public class Ej15For {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un numero: ");
        int nom = sc.nextInt();
        
        for (int i = 1; i <= nom; i++){
            
            for (int j = nom; j >= 1; j--){
                
                if (j - 1 >= i){
                    System.out.print("  ");
                    
                } else {
                    System.out.print("* ");
                    
                }
                
            }
            
            System.out.println("");
            
        }
        
    }
    
}
