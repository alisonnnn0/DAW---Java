
package Estructura_Alternativa_For;

public class BucleDependiente {
    
    public static void main(String[] args) {
        
        for (int i = 0; i < 5; i++){
            System.out.println("Bucle exterior: " + i);
            
            for (int j = 0; j < i; j++){
                System.out.println("   Bucle interior: " + j);
                
            } 
        }
    }
}