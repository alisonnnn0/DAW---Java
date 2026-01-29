
package Estructura_Alternativa_For;

import java.util.Scanner;

public class Ej09For {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueix el nombre de asteriscos: ");
        int nom = sc.nextInt();
        
        for (int i = 1; i <= nom; i++){
            System.out.print("* ");
            
        }
        
    }
    
}
