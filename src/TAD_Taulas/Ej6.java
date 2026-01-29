
package TAD_Taulas;

import java.util.Arrays;
import java.util.Scanner;

public class Ej6 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueix les notes (-1 per finalitzar): ");
        int notes = sc.nextInt();
                            
        int []taulaNotes = new int [30];
        int contador = 0;
        double mitjana = 0;
            
        while (notes != -1 && contador < taulaNotes.length) {
            
            if (notes <= 10 && notes >= 0) {
                
                taulaNotes[contador] = notes;
            
                contador++;
                
                System.out.print("Introdueix les notes (-1 per finalitzar): ");
                notes = sc.nextInt();
                
            } else {
                
                System.out.println("Nota introduida no valida, torna a introduir una nota (-1 per finalitzar): ");
                notes = sc.nextInt();
            } 
        }
        
        for (int i = 0; i < taulaNotes.length; i++) {
            
            mitjana = mitjana + taulaNotes[i];
        }
        
        System.out.println("La mitjana del grup es:" + mitjana/contador);
        System.out.println(Arrays.toString(taulaNotes));
    }
}
