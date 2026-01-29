
package Estructura_Alternativa;

import java.util.Scanner;

public class Ej03 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueix el primer nom: ");
        int x = sc.nextInt();
        
        System.out.print("Introdueix el primer nom: ");
        int y = sc.nextInt();
        
        System.out.print("Introdueix el primer nom: ");
        int z = sc.nextInt();
        
        int max = x;
        
        if (max < y){
            max = y;   
        }
        
        
        if (max < z){
            max = z;
        }
        
        System.out.print("El nombre mes gran es: " + max);
        
    }        
}    