
package Recu_POO_Biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    
    private ArrayList <Llibre> llibres = new ArrayList();
    private ArrayList <Usuari> usuaris = new ArrayList();

    
    public Biblioteca() {
        this.llibres = new ArrayList<>();
        this.usuaris = new ArrayList<>();
    }
    
    
    
    void afegirLlibre(Llibre llibre) {
        
        llibres.add(llibre);
        System.out.println("Se ha afegit un llibre " + llibre.getTitol() + " a la biblioteca.");
    }
    
    void afegirUsuari(Usuari usuari) {
        
        usuaris.add(usuari);
        System.out.println("Se ha registrat un nou usuari " + usuari.getNom() + " amb la ID de " + usuari.getId());
    }
    
    void mostrarLlibresPerCategoria(String categoria) {
        
        System.out.println("Llibres de categoria " + categoria);
        
        for (Llibre llibreActual : llibres) {
            
            if (llibreActual.getCategoria().equals(categoria)) {
                
                System.out.println("- " + llibreActual.getTitol());
            }
        }
    }
    
    Llibre cercarLlibrePerTitol(String titol) {
        
        System.out.println("Llibre amb el titol " + titol);
        
        for (Llibre llibreActual : llibres) {
            
            if (llibreActual.getTitol().equals(titol)) {
                
                return llibreActual;
            }
        }
        
        return null;
    }
    
    void prestarLlibre(String titol, Usuari usuari) {
        
        Llibre llibre = cercarLlibrePerTitol(titol);
        
        if (llibre != null && !llibre.isPrestec()) {
            
            usuari.agafarLlibre(llibre);
            llibre.prestar();
            
            System.out.println("El llibre " + titol + " ha estat prestat a " + usuari.getNom());
        }
    }
    
    void retornarLlibre(String titol, Usuari usuari) {
        
        Llibre llibre = cercarLlibrePerTitol(titol);
        
        if (llibre != null) {
            
            usuari.retornarLlibre(llibre);
            llibre.retornar();
            
            System.out.println(usuari.getNom() + " ha retornat el llibre " + titol);
        }
    }
}
