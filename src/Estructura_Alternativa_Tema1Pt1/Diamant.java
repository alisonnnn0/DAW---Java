package Estructura_Alternativa_Tema1Pt1;

import java.util.Scanner;

public class Diamant {

    public static void main(String[] args){

        Scanner teclat = new Scanner(System.in);

        System.out.print("Introdueix la mida del diamant: ");
        int n = teclat.nextInt();
        
        int contador = n -1;
        
        //Part d'adalt i central del diamant
        for (int i = 1; i <= n; i++) {
            
            //Primer asterisco
            if (i == 1) {                
                
                for (int j = 1; j <= 2*n-1; j++) {
                    
                    if (j == n) {
                        
                        System.out.print("*");
                        
                    } else {
                        
                        System.out.print(" ");
                        
                    }
                }
            
            //Resto de asteriscos
            } else {
                
                for (int j = 1; j <= 2*n-1; j++) {
                    
                    if (j == (n - 1) - (i - 2) || j == (n - 1) + i) {
                        
                        System.out.print("*");
                        
                    } else {
                        
                        System.out.print(" ");
                        
                    }
                }                
            }
            System.out.println("");
            
        }
        
        
        //Parte de abajo
        for (int i = n +1; i <= 2*n -1; i++) {
            
            //Ultimo asterisco
            if (i == 2*n-1) {                
                
                for (int j = 1; j <= 2*n-1; j++) {
                    
                    if (j == n) {
                        
                        System.out.print("*");
                        
                    } else {
                        
                        System.out.print(" ");
                        
                    }
                }
            
            //Resto de asteriscos
            } else {
                
                for (int j = 1; j <= 2*n-1; j++) {
                    
                    if (j == (n - 1) - (contador -2) || j == (n - 1) + contador) {
                        
                        System.out.print("*");
                        
                    } else {
                        
                        System.out.print(" ");
                        
                    }
                }                
            }
            
            /*Lo que hace el contador es la misma funcion que la i en la parte 
            de arriba, se usa para calcular cuantos espacios se necesitan para 
            que el diamante quede centrado.*/
            
            contador--;
            System.out.println("");
            
        }
    }
}
