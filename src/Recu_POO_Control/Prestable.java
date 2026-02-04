
package Recu_POO_Control;


public interface Prestable {
    
    void prestar();
    void retornar();
    
    default boolean estaPrestat() {
        
        return false;
    }
}
