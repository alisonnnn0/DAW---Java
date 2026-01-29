package Estructura_Alternativa;

import java.util.Scanner;

public class Ej01 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueix un nombre: ");
        int nom = sc.nextInt();
        int resultat;
        
        if (nom%2==0){
            resultat = nom * 2 + 3;
            System.out.print("El resultat es: " + resultat);
            
        } else {
            resultat = nom * 3 - 4;
            System.out.println("El resultat es: " + resultat);
        
        }
        
    }
    
}
