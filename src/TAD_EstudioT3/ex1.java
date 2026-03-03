
package TAD_EstudioT3;

import java.util.*;

public class ex1 {
    
    public static void main(String[] args) {
        
        int[] tabla = new int[12];
        Arrays.fill(tabla, 100);
        
        int[] novaTaula = Arrays.copyOf(tabla, 3);
        
        System.out.println(Arrays.toString(tabla));
        System.out.println(Arrays.toString(novaTaula));
        
        
        int[] taula = new int[10];
        
        for (int i = 0; i < taula.length; i++) {
            taula[i] = i;
            
        }
        System.out.println(Arrays.toString(taula));
        
        
        int[] t = {13, 7, 6, 45, 21, 9};
        
        Arrays.sort(t);
        
        System.out.println(Arrays.toString(t));
        
        
        int[] r = {10, 20, 30};
        
        int[] a = Arrays.copyOf(r, 5);
        
        System.out.println(Arrays.toString(a));
        
        
        int e[][] = { {1, 2, 3}, {4, 5, 6}}; 
        
        for (int i = 0; i < e.length; i++) {
            
            for (int j = 0; j < e[i].length; j++) {
                
                System.out.print(e[i][j] + "  ");
            }
            
            System.out.println("");
        }
        
        
        int w[] = new int[5];
        
        Arrays.fill(w, 100);
        
        System.out.println(Arrays.toString(w));
        
        
        int q[] = {10, 15, 22, 35, 40};
        
        int posicio = Arrays.binarySearch(q, 22);
        
        System.out.println("El numero 22 esta en la posicio: " + posicio);
    }
}
