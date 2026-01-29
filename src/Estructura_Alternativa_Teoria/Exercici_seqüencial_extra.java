
package Estructura_Alternativa_Teoria;

public class Exercici_seqüencial_extra {
    
    public static void main(String[] args) {
        
        int marta = 10, joan, pare, mare, avi, avia;
    
        avi = marta * 6;
        pare = (avi / marta) * 6;
        joan = pare % marta;
        mare = 3 * marta + joan;
        avia = (pare + mare) - marta;
        
    System.out.println("Edat dels familiars: ");
    System.out.println("Mare: " + mare);
    System.out.println("Pare: " + pare);
    System.out.println("Joan: " + joan);
    System.out.println("Marta: " + marta);
    System.out.println("Avi: " + avi);
    System.out.println("Avia: " + avia);
    
    }
}
