package Estructura_Alternativa_Tema1Pt1;

import java.util.Scanner;

public class Diamant_nivells {

    public static void main(String[] args){

        Scanner teclat = new Scanner(System.in);

        System.out.print("Introdueix la mida del diamant: ");
        int n = teclat.nextInt();
        
        System.out.print("Introdueix el nombre de nivells: ");
        int niv = teclat.nextInt();
        
        int ContDiamants = 1;
        
        for (int k = 1; k <= niv; k++) {         
            
            //Parte de arriba
            for (int i = 1; i <= n; i++) {

                //Imprime varios diamantes en la misma línea
                /*No se imprime el primer diamante porque ContDiamants es igual
                a 0, por lo tanto salta de linea hasta que llega el siguiente nivel*/
                for (int u = 1; u <= ContDiamants * 2 - 2; u++) {                                     
                    
                    // Primer asterisco
                    if (i == 1) {

                        for (int j = 1; j <= 2 * n - 1; j++) {

                            if (j == n) {

                                System.out.print("*");

                            } else {

                                System.out.print(" ");

                            }
                        }
                  
                    } else {
                    
                        for (int j = 1; j <= 2 * n - 1; j++) {
                        
                            if (j == (n - 1) - (i - 2) || j == (n - 1) + i) {
                            
                                System.out.print("*");

                            } else {

                                System.out.print(" ");

                            }
                        }
                    }               
                }
                
                System.out.println();
            }

            
            int contador = n - 1;
            
            //Parte de abajo
            for (int i = n + 1; i <= 2 * n - 1; i++) {
                
                for (int u = 1; u <= ContDiamants * 2 -2 ; u++) {

                    if (i == 2 * n - 1) {
                        
                        for (int j = 1; j <= 2 * n - 1; j++) {
                        
                            if (j == n) {
                            
                                System.out.print("*");
                            
                            } else {
                            
                                System.out.print(" ");
                            
                            }
                        }
                        
                    } else {                                                
                
                        for (int j = 1; j <= 2*n-1; j++) {                    
                            
                            if (j == (n - 1) - (contador -2) || j == (n - 1) + contador) {

                                System.out.print("*");

                            } else {

                                System.out.print(" ");

                            }
                        }                
                    }                                                                    
                }

                contador--;
                System.out.println();
            }

            ContDiamants++;
            System.out.println();

        } 
    } 
}
