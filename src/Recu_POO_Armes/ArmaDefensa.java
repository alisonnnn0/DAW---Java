
package Recu_POO_Armes;


public abstract class ArmaDefensa implements Armable {
    
    protected double percentatgeVida;
    
    public ArmaDefensa() {
        
    }
    
    public void equiparPersonatge(Personatge p) {

        double novaVida = p.getPuntsVida() * (1 + percentatgeVida / 100);
        p.setPuntsVida(novaVida);
        activarProteccio(p);
    }
    
    public abstract void activarProteccio(Personatge p);
}

class Escut extends ArmaDefensa {
    
    public Escut(){

        this.percentatgeVida = 10;
    }

    @Override
    public void activarProteccio(Personatge p) {

        p.setProteccioArquer(true);
    }
}

class Armadura extends ArmaDefensa {
    
    public Armadura (){
        
        this.percentatgeVida = 50;
        
    }
    
    @Override
    public void activarProteccio(Personatge p) {
        
        p.setProteccioCosACos(true);
    }
}