
package POO_Jocs_Tema2_Pt1.numeros;

import POO_Jocs_Tema2_Pt1.Joc;
import java.util.Scanner;

public class JocNumeros extends Joc {

    //Constructor
    private int ultimNumero;
    
    public JocNumeros(int vides) {
        
        super(vides);
    }
    
    
    @Override
    public void juga() {
        
        Scanner teclat = new Scanner(System.in);
        
        reiniciaPartida();
        mostraNom();
        mostraInfo();
        
        while (true) {
            
            System.out.println("Introdueix un numero: ");
            int num = teclat.nextInt();
            
            //VAlida el numero
            while (!validaNumero(num)) {
                
                System.out.println("Numero equivocat, torna a intentar-ho: ");
                num = teclat.nextInt();
            }
            
            ultimNumero = num;
            
            if (heGuanyat()){
                
                System.out.println("Has guanyat el joc, felicitats!");
                actualitzaRecord();
                return;
                
            }
            
            
            boolean teVides = treuVida();
            
            
            //Comprova si te vides
            if (teVides) {
                
                System.out.println("Numero incorrecte, torna a intentar-ho.");
                mostraVidesRestants();
                
            } else {
                
                System.out.println("Has perdut! No et queden vides.");
                return;
            }
        }
    }
    
    
    public int getUltimNumero() {
        
        return ultimNumero;
    }
    
    public void mostraNom() {
        
        System.out.println("Joc numeric!");
    }
    
    public void mostraInfo() {
        
        System.out.println("Introdueix nombres fins endivinar el nombre.");
    }

    public boolean validaNumero(int num) {
        
        return true;
    }
    
    @Override
    public boolean heGuanyat() {
        
        return false;
    }
}
