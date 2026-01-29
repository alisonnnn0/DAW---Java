
package Estructura_Alternativa_While;

import java.util.Scanner;

public class Ej03While {
    
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Introdueix un numero: ");
        int n = lector.nextInt();
        
        int suma, d;
        
        suma = 0;
        
        d = n % 10;
        
        while (n != 0){
                        
            suma = suma + d;
            
            n = n /10;
            d = n % 10;

        }
        
        System.out.print("La suma de les xifres es: " + suma);
    }
}
