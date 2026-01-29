
package Estructura_Alternativa_Teoria;

import java.util.Scanner;

public class Apuntes3 {

    public static void main(String[] args) {
        
        int valor, bits;
        
    Scanner lector = new Scanner (System.in);
    //leer lo que se escribe en el teclado
    
    System.out.print("Introdueix un valor entre 0 i 64.");
    //Mostrar en pantalla lo que esta dentro de los parentesis
    valor = lector.nextInt();
        
    if( (valor < 0)||(valor > 64)){
        System.out.print("El valor no esta entre 0 i 64!\n\n");
    /*Si el valor que se introduce no esta entre 0 y 64 sale el 
mensaje de error*/
        
    } else {
        if (valor < 2) {
            bits = 1;
        if (valor < 4) {
            bits = 2;
    
        }
        }
    
    }
    }
    
}
