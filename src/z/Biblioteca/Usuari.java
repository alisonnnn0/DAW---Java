
package z.Biblioteca;


public class Usuari {
    
    private String nom;
    private int id;
    private String llibresEnPrestec;

    
    public Usuari(String nom, int id, String llibresEnPrestec) {
        this.nom = nom;
        this.id = id;
        this.llibresEnPrestec = llibresEnPrestec;
    }

    
    
    
    
    public String getNom() {
        return nom;
    }

    public int getId() {
        return id;
    }

    public String getLlibresEnPrestec() {
        return llibresEnPrestec;
    }

    
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLlibresEnPrestec(String llibresEnPrestec) {
        this.llibresEnPrestec = llibresEnPrestec;
    }
    
    
}
