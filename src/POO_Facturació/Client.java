
package POO_Facturació;

public class Client {
    
    private String nif;
    private String nom;
    private int telefon;
    
    public Client(String nif, String nom, int telefon) {
        
        this.nif = nif;
        this.nom = nom;
        this.telefon = telefon;
    }
    
    public String getNif() {
    
        return nif;
    }
    
    public String getNom() {
        
        return nom;
    }
    
    public int getTelefon() {
        
        return telefon;
    }
}
