
package POO_Jocs_Tema2_Pt1.numeros;

import POO_Jocs_Tema2_Pt1.interficies.Jugable;

public class JocEndevinaSenar extends JocNumeros implements Jugable {
    
    private final int numSecret;
    
    //Constructor
    public JocEndevinaSenar(int vides, int numSecret) {
        
        super(vides);
        this.numSecret = numSecret;
    }
    
    
    @Override
    public boolean validaNumero(int num) {
        
        if (num % 2 == 0) {
            
            System.out.println("El numero ha de ser senar!");
            return false; 
        
        } else {
            
            return true;
        
        }
    }
    
    @Override
    public void mostraNom() {
        
        System.out.println("Joc: Endevina numeros senars.");
    }
    
    @Override
    public void mostraInfo() {
        
        System.out.println("Endevina el numero senar. Nomes pots introduir numeros senars.");
    }
    
    @Override
    public boolean heGuanyat() {
        
        return getUltimNumero() == numSecret;
    }
}
