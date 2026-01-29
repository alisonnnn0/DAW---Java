
package TAD_Taulas;


public class Ej2 {
    
    public static void main(String[] args) {
        
        int petit = 0;
        int gran = 0;
        int [] taula = {2,8,6,85,8,4,2,-51,1,85,4,-1,8,4,2,8,-98,54,65,-168,51,685,41,54,6};
        
        for (int i = 0; i < taula.length; i++) {
            
            if (petit > taula[i]) {
                
                petit = taula[i];
                
            } else if (gran < taula [i]) {
                
                gran = taula[i];
            }
        }
        System.out.println("El nombre mes gran es: "+ gran + ". El nombre mes petit es: " + petit);
    }
}
