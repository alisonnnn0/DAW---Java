package POO_Jocs_Tema2_Pt1.numeros;

import POO_Jocs_Tema2_Pt1.interficies.Jugable;

public class JocEndevinaNumero extends JocNumeros implements Jugable {

    private final int numSecret;

    // Constructor: recibe vidas y número secreto
    public JocEndevinaNumero(int vides, int numSecret) {
        super(vides);
        this.numSecret = numSecret;
    }

    @Override
    public boolean heGuanyat() {
        return getUltimNumero() == numSecret;
    }

    @Override
    public void mostraNom() {
        System.out.println("Joc: Endevina el número.");
    }

    @Override
    public void mostraInfo() {
        System.out.println("Has d'endevinar un número entre 0 i 10.");
    }

    @Override
    public boolean validaNumero(int num) {
        // En este juego cualquier número entre 0 y 10 es válido
        if (num < 0 || num > 10) {
            System.out.println("El número ha d'estar entre 0 i 10!");
            return false;
        }
        return true;
    }
}