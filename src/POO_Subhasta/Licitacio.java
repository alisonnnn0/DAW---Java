
package POO_Subhasta;

public class Licitacio {
    
    //Atributs que no se pueden cambiar el valor.
    private final Subhasta subhasta;
    private final Usuari usuari;
    private final double quantitat;

    
    //Constructor
    public Licitacio(Subhasta subasta, Usuari usuari, double quantitat) {
        
        this.subhasta = subasta;
        this.usuari = usuari;
        this.quantitat = quantitat;
    }

    
    //Getters (subhasta, usuari i quantitat)
    public Subhasta getSubhasta() {
        
        return subhasta;
    }

    public Usuari getUsuari() {
        
        return usuari;
    }

    public double getQuantitat() {
        
        return quantitat;
    }
}
