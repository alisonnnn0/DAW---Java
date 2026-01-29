
package POO_Facturació;

public class Producte {
    
    private String id;
    private String nom;
    private double preu;
    private int stock;
    
    public Producte(String id, String nom, double preu, int stock){
        
        this.id = id;
        this.nom = nom;
        this.preu = 0;
        this.stock = 0;
    }
    
    public String getId() {
        
        return id;
    }
    
    public String getNom() {
        
        return nom;
    }
    
    public double getPreu() {
        
        return preu;
    }
    
    public int getStock() {
        
        return stock;
    }
}
