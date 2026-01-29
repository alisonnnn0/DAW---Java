package POO_Teoria.ExBiblio;

public class Llibre {
    
    String titol;
    String autor;
    String categoria;
    int anyPublicacio;
    boolean prestec;
    int nombreValoracions = 0;
    double totalValoracions = 0;
    
    public double afegirValoracio(int novaValoracio) {
        
        if (novaValoracio < 1 && novaValoracio > 5) {
           
            System.out.println("Màxima puntuació de 5.");
            
        } else  {
            
            nombreValoracions++;
            totalValoracions += novaValoracio / nombreValoracions;
        
        }
        
        return totalValoracions;
    }
    
    public boolean prestecLlibre() {
        
        return prestec;
    }
    
    public void main() {
        
        
    }
}
