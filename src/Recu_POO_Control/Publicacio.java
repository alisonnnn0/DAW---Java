
package Recu_POO_Control;


public abstract class Publicacio implements Prestable{
    
    private final String titol;
    private final String autor;
    private final int anyPublicacio;
    private boolean prestat;
    
    private static int numPublicacions = 0;

    public String getTitol() {
        return titol;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnyPublicacio() {
        return anyPublicacio;
    }

    public boolean isPrestat() {
        return prestat;
    }

    public static int getNumPublicacions() {
        return numPublicacions;
    }

    public Publicacio(String titol, String autor, int anyPublicacio) {
        this.titol = titol;
        this.autor = autor;
        this.anyPublicacio = anyPublicacio;
        this.prestat = false;
        numPublicacions++;
    }

    @Override
    public String toString() {
        return "Publicacio{" + "titol=" + titol + ", autor=" + autor + ", anyPublicacio=" + anyPublicacio + ", prestat=" + prestat + '}';
    }
    
    
    
    @Override
    public void prestar() {    }

    @Override
    public void retornar() {    }

    @Override
    public boolean estaPrestat() {
        return Prestable.super.estaPrestat(); 
    }
}
