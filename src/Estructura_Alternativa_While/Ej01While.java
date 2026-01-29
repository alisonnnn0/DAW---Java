
package Estructura_Alternativa_While;

import java.util.Scanner;

public class Ej01While {
    
    public static void main(String[] args) {
        
        Scanner lector = new Scanner (System.in);
        
        System.out.print("Introduce un numero (numero negatiu per finalitzar): ");
        int num = lector.nextInt();
        
        int suma = 0;
        
        while (num >= -1){
        
            suma = suma + num;
            
            System.out.println("Has introduit el nombre: " + num);
            
            System.out.print("Introduce un numero (numero negatiu per finalitzar): ");
            num = lector.nextInt();
            
        }
        
        System.out.println("Suma total: " + suma);
    }
}
