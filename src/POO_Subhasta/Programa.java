
package POO_Subhasta;

public class Programa {
    
    public static class Main {
        
        public static void main(String[] args) {

            //Crear usuaris.
            Usuari joan = new Usuari("Joan", 100);
            Usuari pere = new Usuari("Pere", 150);
            Usuari enric = new Usuari("Enric", 300);
            
            
            //Crear nova subhasta.
            Subhasta subhasta = new Subhasta(joan, "Telefon Mobil");
            
            
            //Licitacio del pere.
            boolean a1 = subhasta.licitar(pere, 100);
            
            System.out.println("Licitacio major despres de Pere:");
            mostrarMajor(subhasta);
            
            
            //LIcitacio del enric (negada).
            boolean a2 = subhasta.licitar(enric, 50);
            
            System.out.println("Licitacio major despres d'Enric (50$):");
            mostrarMajor(subhasta);
            System.out.println("Licitacio acceptada?: " + a2);
            
            
            //Subhasta tancada.
            subhasta.tancar();
            
            
            //Licitacio del enric negada perque esta tancada la subhasta.
            boolean a3 = subhasta.licitar(enric, 200);
            System.out.println("Enric licita 200 amb subhasta tancada. Acceptada? " + a3);
            
            subhasta.executar();
            
            
            //Mostrar credits finals.
            System.out.println("\n=== Credits finals ===");
            System.out.println("Joan: " + joan.getCredit());
            System.out.println("Pere: " + pere.getCredit());
            System.out.println("Enric: " + enric.getCredit());
            
            
            //Mostar informacio per usuari.
            System.out.println("\n=== Informacio per usuari ===");
            
            mostrarUsuari(joan);
            mostrarUsuari(pere);
            mostrarUsuari(enric);
        }
        
        
        //Visualitzar la informacio de la puja mes alta.
        public static void mostrarMajor(Subhasta subhasta) {
            
            Licitacio major = subhasta.getLicitacioMajor();
            
            if (major == null) {
                
                System.out.println("No hi ha licitacions.");
                
                
            } else {
                
                System.out.println("Producte: " + subhasta.getProducte() + ", Usuari: " + major.getUsuari().getNom() + ", Quantitat: " + major.getQuantitat());
            }
        }
        
        
        //Mostrar un resumen complert de la activitat dels usuaris. 
        public static void mostrarUsuari(Usuari usuari) {
            
            System.out.println("\nUsuari: " + usuari.getNom());
            System.out.println("  Subhastes creades:");
            
            
            for (Subhasta subhasta : usuari.getSubhastesPropietari())
                
                System.out.println("   - " + subhasta.getProducte());
                System.out.println("  Subhastes guanyades:");
            
                
            for (Subhasta subhasta : usuari.getSubhastesGuanyades())
                
                System.out.println("   - " + subhasta.getProducte());
                System.out.println("  Licitacions acceptades:");
                
                
            for (Licitacio l : usuari.getLicitacionsAcceptades())
                
                System.out.println("   - " + l.getSubhasta().getProducte() + " (" + l.getQuantitat() + "$)");
        }
    }
}
