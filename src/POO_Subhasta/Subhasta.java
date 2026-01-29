
package POO_Subhasta;

import java.util.List;
import java.util.ArrayList;

public class Subhasta {
    
    //Atributs on propietari, producte i la arraylist no es moden canviar de valor.
    private final Usuari propietari;
    private final String producte;
    private boolean tancada = false;
    private boolean executada = false;
    
    private final List<Licitacio> licitacionsAcceptades = new ArrayList<>();

    
    //Constructor, assigna qui es el propietari del producte a subhastar i quin 
    //es el producte.
    public Subhasta(Usuari propietari, String producte) {
        
        this.propietari = propietari;
        this.producte = producte;
        
        propietari.afegirSubhasta(this);
    }

    
    //Getters
    public Usuari getPropietari() {
        
        return propietari;
    }


    public String getProducte() {
        
        return producte;
    }

   
    public Licitacio getLicitacioMajor() {
        
        if (licitacionsAcceptades.isEmpty()) return null;
        return licitacionsAcceptades.get(licitacionsAcceptades.size() - 1);
    }

    //Si la subhasta esta tancada o oberta. 
    public boolean estaTancada() {
        
        return tancada;
    }

    public boolean estaExecutada() {
        
        return executada;
    }

    //Comprova si la licitacio es posible.
    public boolean licitar(Usuari usuari, double quantitat) {
        
        if (tancada) return false;
        if (usuari == propietari) return false;
        if (usuari.getCredit() < quantitat) return false;

        Licitacio major = getLicitacioMajor();
        if (major != null && quantitat <= major.getQuantitat()) return false;

        Licitacio nova = new Licitacio(this, usuari, quantitat);
        licitacionsAcceptades.add(nova);
        usuari.afegirLicitacio(nova);

        return true;
    }
    
    // licitar sense quantitat
    public boolean licitar(Usuari usuari) {
        
        double quantitat = 1;
        
        Licitacio major = getLicitacioMajor();
        if (major != null) quantitat = major.getQuantitat() + 1;
        
        return licitar(usuari, quantitat);
    }
    
    public void tancar() {
        
        tancada = true;
    }
    
    //Dona qui es el guanyador de la subhasta 
    public void executar() {
        
        if (!tancada || executada) return;

        Licitacio guanyadora = getLicitacioMajor();
        if (guanyadora == null) return;

        Usuari usuariGuanyador = guanyadora.getUsuari();
        double quantitat = guanyadora.getQuantitat();

        usuariGuanyador.decrementarCredit(quantitat);
        propietari.incrementarCredit(quantitat);

        usuariGuanyador.afegirSubhastaGuanyada(this);

        executada = true;
    }
    
    public List<Licitacio> getLicitacionsAcceptades() {
        
        return licitacionsAcceptades;
    }
}
