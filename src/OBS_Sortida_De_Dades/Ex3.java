
package OBS_Sortida_De_Dades;


public class Ex3 {
    
    public static void main(String[] args) {
        
        String nom = "Agapito Lindo";
        String curs = "1r DAW";
        double nota = 8.4565;
        
        String s = String.format("Nom: %-15s Curs: %-8s Nota final: %.2f%%\n", nom, curs, nota);
        System.out.println(s);
    }
}
