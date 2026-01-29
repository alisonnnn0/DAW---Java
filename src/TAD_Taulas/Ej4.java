
package TAD_Taulas;


public class Ej4 {
    
    
    public static void main(String[] args) {
        
        int [] taula = {5,8,1,5,4,7,1,2,9,1};
        
        for (int i = 0; i < taula.length; i++) {
            
            for (int j = 0; j < taula[i]; j++) {
                
                System.out.print("*");
            }
            
            System.out.println("");
        }
    }
}
