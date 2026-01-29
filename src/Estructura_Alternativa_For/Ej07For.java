
package Estructura_Alternativa_For;

import java.util.Scanner;

public class Ej07For {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int maxp, max = Integer.MIN_VALUE;
        
        System.out.println(max);
        for (int i = 1; i <= 5; i++){
            
            System.out.print("Numero " + i + ":");
            maxp = sc.nextInt();
            
            if (maxp > max){
                max = maxp;
                
            } 
        } 
        
        System.out.print("El nombre més gran és: " + max);
        
    }
}
