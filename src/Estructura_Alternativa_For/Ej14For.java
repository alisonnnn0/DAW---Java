
package Estructura_Alternativa_For;

import java.util.Scanner;

public class Ej14For {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        int nom = sc.nextInt();
        
        for (int i = nom; i >= 1; i--){
            
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
                
            }
            
            System.out.println("");
            
        }
        
    }
   
}