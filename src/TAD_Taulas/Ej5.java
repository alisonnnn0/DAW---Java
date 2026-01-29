
package TAD_Taulas;


public class Ej5 {
    
    public static void main(String[] args) {
        
        int [] taula1 = {8,51,5,6,2,5,1,3,9};
        int [] taula2 = {6,9,4,8,5,85,1,7,2};
        
        for (int i = 0; i < taula1.length; i++) {            
            
            for (int j = 0; j < taula2.length; j++) {
                
                if (taula1[i] == taula2[j]) {
                
                    System.out.println(taula2[j]);
                }                
            }           
        }
    }
}
