
package Estructura_Alternativa_For;

import java.util.Scanner;

public class Ej17For {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueix un nom: ");
        int n = sc.nextInt();
        
        for (int i = 1; i < n; i++) {
            
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
                
            }
            System.out.println("  ");
            
        }
    }
}
