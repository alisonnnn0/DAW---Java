
package Estructura_Alternativa_Teoria;

import java.util.Scanner;

public class Apuntes2 {
    
    public static void main(String[] args){
        
        int numero, max=Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        /*MIN_VALUE es el numero minimo que puede soportar java, 
        se hace para asegurarse que no se va a poner ningun numero 
        mas pequeño*/
        
        Scanner teclat = new Scanner(System.in);
        System.out.print(max);
        // Se usa para ver que se escribe dentro y que se escribe afuera
        
        for(int i=1; i<=5; i++){
            
            System.out.print("Introdueix un numero: ");
            numero = teclat.nextInt();
            
            if (numero > max){
                
            } else if (numero < min) {
                min = numero;
                
            }
        }
        
        System.out.print("El maxim es: " + max);
    }   
}
