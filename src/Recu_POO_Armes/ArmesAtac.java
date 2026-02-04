
package Recu_POO_Armes;


public abstract class ArmesAtac implements Armable{
    
    protected double percentatgeAtac;

    public ArmesAtac() {}
    
    @Override
    public void equiparPersonatge(Personatge p) {

        double newPuntsAtac = p.getPuntsAtac() * (this.percentatgeAtac / 100);
        p.setPuntsAtac(newPuntsAtac);
        activarAtac(p);
    }
    
    public abstract void activarAtac(Personatge p) ;
}

class Espasa extends ArmesAtac {
   
    public Espasa() {
        this.percentatgeAtac = 40;
    }

    @Override
    public void activarAtac(Personatge p) {

        p.setProteccioCosACos(true);
    }
   
    
}

class Arc extends ArmesAtac {
    
    public Arc() {
        
        this.percentatgeAtac = 15;
    }

    @Override
    public void activarAtac(Personatge p) {

        p.setAtacArquer(true);
    }  
}