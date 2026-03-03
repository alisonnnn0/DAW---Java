package Recu_TAD;

import java.util.*;

public class Ex1 {

    public static void main(String[] args) {

        int[] nums = {4, -2, 7, 0, 3, -5};
        int suma = 0, cont = 0;

        for (int i = 0; i < nums.length; i++) {

            suma = +nums[i];

            if (nums[i] < 0) {

                cont++;
            }
        }

        System.out.println(suma);

        //-------------------------------------------------
        int[] num = {4, -2, 7, 0, 3, -5};

        int var = 0;

        for (int i = 0; i < num.length / 2; i++) {

            var = num[i];

            num[i] = num[num.length - 1 - i];

            num[num.length - 1 - i] = var;
        }

        System.out.println(Arrays.toString(num));

        //---------------------------------------------------
        int[][] m = {
            
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int sumaC = 0;
        int sumaF = 0;
        
        for (int i = 0; i < m.length; i++) {
            
            for (int j = 0; j < m[i].length; j++) {
                
                sumaF = sumaF + m[i][j];
                sumaC = sumaC + m[j][i];
            }
            
            System.out.println("Columnas - " + sumaC + " / Filas - " + sumaF);

            sumaC = 0;
            sumaF = 0;
        }
    }
}
