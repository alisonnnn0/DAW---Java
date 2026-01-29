
package POO_Teoria;

public class Alumne {
    
    //Atributs
    String nom;
    int edat;
    double notaFinal;
        
    //Constructors
    public Alumne(String nomAlumne, int edatAlumne) {
        
        
    }
    
    //Metodes
    public void posarNotaFinal(double nota) {
        
        notaFinal = nota;
    }
    
    public double consultaNotaFinal() {
        
        return notaFinal;
    }
}
