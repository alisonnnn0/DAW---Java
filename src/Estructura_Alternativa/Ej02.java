package Estructura_Alternativa;

import java.util.Scanner;

public class Ej02{
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueix la quantitat d'hores treballades: ");
        int hores = sc.nextInt();
        
        System.out.print("Introdueix el torn treballat (diurn = 1, nocturn = 2): ");
        int torn = sc.nextInt();
        
        System.out.print("Introdueix el dia de la setmana treballat: ");
        int dia = sc.nextInt();
        int salary;
        
        switch (dia){
            
            case 1, 2, 3, 4, 5, 6 -> {
                
                switch (torn) {
                    case 1 -> {
                        salary = 4 * hores;
                        System.out.println("El salari d'un dia es: " + salary + "$");
                        
                    }
                    case 2 -> {
                        salary = 6 * hores;
                        System.out.println("El salari d'un dia es: " + salary + "$");
                        
                    }
                    default -> System.out.println("Les dades introduides son incorrectes.");
                    
                }
            }
                
            case 7 -> {
                
                switch (torn) {
                    case 1 -> {
                        salary = (4 + 2) * hores;
                        System.out.print("El salari d'un dia es: " + salary + "$");
                        
                    }
                    case 2 -> {
                        salary = (6 + 3) * hores;
                        System.out.print("El salari d'un dia es: " + salary + "$");
                        
                    }
                    default -> System.out.print("Les dades introduides son incorrectes.");
                    
                }
            }
            default -> System.out.print("Les dades introduides son incorrectes.");
            
        }
    }
}