
package POO_Biblioteca;

import java.util.ArrayList;

public class Usuari {
    
    private String nom;
    private String id;
    private ArrayList<Llibre> llibresPrestec = new ArrayList<>();
    
    public Usuari(String nom, String id) {
        
        this.nom = nom;
        this.id = id;
    }
    
    public String idUsuari() {
        
        return id;
    }
    
    public void agafarLlibre(Llibre llibre) {
        
        llibresPrestec.add(llibre);
    }
    
    public void retornarLlibre(Llibre llibre) {
        
        llibresPrestec.remove(llibre);
    }
}
