
package TAD_Taulas;

import java.util.Arrays;


public class Ej1 {
    
    public static void main(String[] args) {
        
        int [] taula1 = {-3, 5, 1, -4, 8, 20, -9, 2, 11, -1};
        int [] taula2 = {-3, 5, 1, -4, 8, 20, -9, 2, 11, -1};
        int [] sumaTaula = new int [taula1.length];
        
        for (int i = 0; i < taula1.length; i++) {
            
            sumaTaula[i] = taula1[i] + taula2[i];
        }
        
        System.out.println(Arrays.toString(sumaTaula));
    }
}
