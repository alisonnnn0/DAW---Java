
package Estructura_Alternativa_While;

import java.util.Scanner;

public class Ej02While {
    
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        int n, cont,  d;
        
        System.out.print("Introdueix un numero: ");
        n = lector.nextInt();
        
        cont = 0;
        
        while (n != 0){
        
        n = n / 10;
        d = n % 10;
        
        cont++;

        }
        
        System.out.print("La quantitat de xifres d'aquest numero es: " + cont);
    }
}
