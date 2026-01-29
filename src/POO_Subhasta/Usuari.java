
package POO_Subhasta;


import java.util.ArrayList;
import java.util.List;


public class Usuari {
    
    //Atributs on nomes credit no pot canvar el valor.
    private final String nom;
    private double credit;
            
    private final List<Subhasta> subhastesPropietari = new ArrayList<>();
    private final List<Licitacio> licitacionsAcceptades = new ArrayList<>();
    private final List<Subhasta> subhastesGuanyades = new ArrayList<>();

    
    //Constructor.
    public Usuari(String nom, double credit) {
        
        this.nom = nom;
        this.credit = credit;
    }

    //Getters
    public String getNom() {
        
        return nom;
    }

    public double getCredit() {
        
        return credit;
    }

    public void incrementarCredit(double quantitat) {
        
        credit += quantitat;
    }

    public void decrementarCredit(double quantitat) {
        
        credit -= quantitat;
    }

    public void afegirSubhasta(Subhasta subhasta) {
        
        subhastesPropietari.add(subhasta);
    }

    public void afegirLicitacio(Licitacio licitacio) {
        
        licitacionsAcceptades.add(licitacio);
    }

    public void afegirSubhastaGuanyada(Subhasta subhasta) {
        
        subhastesGuanyades.add(subhasta);
    }

    public List<Subhasta> getSubhastesPropietari() {
        
        return subhastesPropietari;
    }

    public List<Licitacio> getLicitacionsAcceptades() {
        
        return licitacionsAcceptades;
    }

    public List<Subhasta> getSubhastesGuanyades() {
        
        return subhastesGuanyades;
    }
}
