package POO_Jocs_Tema2_Pt1.numeros;

import POO_Jocs_Tema2_Pt1.interficies.Jugable;

public class JocEndevinaMultiplicacio extends JocNumeros implements Jugable {

    private final int nombre1, nombre2, resultat;

    public JocEndevinaMultiplicacio(int vides, int nivell) {
        
        super(vides);
        int max;
        
        switch (nivell) {
            
            case 1 -> max = 5;   //Fàcil
            case 2 -> max = 10;  //Mitjà
            default -> max = 15; //Difícil
        }

        this.nombre1 = (int) (Math.random() * max) + 1;
        this.nombre2 = (int) (Math.random() * max) + 1;
        this.resultat = nombre1 * nombre2;
    }

    @Override
    public boolean heGuanyat() {
        
        return getUltimNumero() == resultat;
    }

    @Override
    public void mostraNom() {
        
        System.out.println("Joc: Endevina la multiplicació.");
    }

    @Override
    public void mostraInfo() {
        
        System.out.println("Resol la multiplicació: " + nombre1 + " x " + nombre2);
    }

    @Override
    public boolean validaNumero(int num) {
        
        return true;
    }
}