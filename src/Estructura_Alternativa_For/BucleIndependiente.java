
package Estructura_Alternativa_For;

public class BucleIndependiente {
    
    public static void main(String[] args) {
        
        //Bucle independiente, el bucle interno 
        //NO depende del bucle exterior. 
        
        /*Es un bucle, comienza desde 0 hasta 
        un numero entero menor que 5.
        i++ es i = i + 1, se puede modificar poniendo i+=2 o restando i--.*/
        for (int i = 0; i < 5; i++){
        
            System.out.println("Bucle extern: " + i);
            
            for (int j = 0; j < 4; j++){
                System.out.println("     Bucle intern: " + j);
                //Se puede poner un bucle dentro de otro para generar un bucle 
                //interno
            }
        }
    }
}
