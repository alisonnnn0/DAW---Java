
package Recu_POO_Biblioteca;

import java.util.ArrayList;

public class Usuari {
    
    private String nom;
    private String id;
    ArrayList <Llibre> llibresEnPrestec;

    
    public Usuari(String nom, String id) {
        
        this.nom = nom;
        this.id = id;
        this.llibresEnPrestec = new ArrayList<>();
    }
    
    
    void agafarLlibre(Llibre llibre) {
        
        llibresEnPrestec.add(llibre);
    }
    
    void retornarLlibre(Llibre llibre) {
        
        llibresEnPrestec.remove(llibre);
    }
    
    public String getNom() {
        
        return nom;
    }

    public String getId() {
        
        return id;
    }

    
    public void setNom(String nom) {
        
        this.nom = nom;
    }

    public void setId(String id) {
        
        this.id = id;
    }
}
