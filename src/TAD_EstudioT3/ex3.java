
package TAD_EstudioT3;

import java.util.*;

public class ex3 {

    public static void main(String[] args) {
        
        TreeSet<Integer> Numeros = new TreeSet<>(Set.of(10, 5, 20, 15));
        System.out.println("primero - " + Numeros.first());
        System.out.println("ultimo - " + Numeros.last());
        System.out.println("mas de 12 - " + Numeros.higher(12));
    }   
}
