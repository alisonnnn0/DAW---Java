
package TAD_Taulas;

import java.util.Arrays;


public class Ej3 {
    
    public static void main(String[] args) {
        
        int [] num = {0,1,2,3,4,5,6,7,8,9};
        int ret = 0;
        int contador = 9;
        
        for (int i = 0; i < num.length/2; i++) {
            
            ret = num[i];
            num[i] = num[contador];
            num[contador] = ret;
            
            contador--;
        }
        
        System.out.println(Arrays.toString(num));
    }
}
