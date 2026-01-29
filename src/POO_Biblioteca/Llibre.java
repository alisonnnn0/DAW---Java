
package POO_Biblioteca;
  
public class Llibre {
    
    private final String titol;
    private final String autor;
    private final int any;
    private boolean prestec;
    private final String categoria;
    private double valoracio;
    private int nombreValoracions = 0;
    private int totalValoracions;
   
    
    //Contructor
    public Llibre(String titol, String autor, int anyPublicacio, String categoria){
        
        this.titol = titol;
        this.autor = autor;
        this.any = anyPublicacio;
        this.categoria = categoria;
        this.prestec = false;
        this.valoracio = 0;
        this.totalValoracions = 0;
        this.nombreValoracions = 0;
    }
    
    
    //Getters
    public String titolLlibre() {
        
        return titol;
    }
    
    public String autorLlibre() {
        
        return autor;
    }
    
    public int anyLlibre() {
        
        return any;
    }
    
    public boolean prestecLlibre() {
        
        return prestec;
    }
    
    public String categoriaLlibre() {
        
        return categoria;
    }
    
    public double valoracioLlibre() {
        
        return valoracio;
    }
    
    
    //Metodo para añadir una valoracion y hacer la media
    public double afegirValoracio(int novaValoracio) {
        
        nombreValoracions++;
        totalValoracions += novaValoracio;
        valoracio = (double) totalValoracions / nombreValoracions;
        return valoracio;
    }
    
    
    //Actualizar estado del prestamo
    public void setPrestec(boolean prestec) {
        
        this.prestec = prestec;
    }
    
    //Metodos para prestar y devolver el libro
    public void prestarLlibre() {
        
        prestec = true;
    }
    
    public void tornarLlibre() {
        
        prestec = false;
    }
}
