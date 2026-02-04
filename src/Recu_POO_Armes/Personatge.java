
package Recu_POO_Armes;

import java.util.ArrayList;


class Personatge implements Armable{
    
    private double puntsVida;
    private double puntsAtac;
    private boolean proteccioArquer;
    private boolean proteccioCosACos;
    private boolean atacArquer;
    private boolean atacCosACos;
    private final ArrayList <Armable> armes;

    public Personatge(double puntsVida, double puntsAtac) {
        this.puntsVida = puntsVida;
        this.puntsAtac = puntsAtac;
        this.armes = new ArrayList<>();
    }

    
    public void equipar() {
        
        for (Armable arma : this.armes){
            
            arma.equiparPersonatge(this);
        }
    }
    
    public void afegirArma(Armable a) {
        
        armes.add(a);
    }
    
    public void treureArma(Armable a) {
        
        armes.remove(a);
    }
    
    public double getPuntsVida() {
        return puntsVida;
    }

    public void setPuntsVida(double puntsVida) {
        this.puntsVida = puntsVida;
    }

    public double getPuntsAtac() {
        return puntsAtac;
    }

    public void setPuntsAtac(double puntsAtac) {
        this.puntsAtac = puntsAtac;
    }

    
    public boolean isProteccioArquer() {
        return proteccioArquer;
    }

    public void setProteccioArquer(boolean proteccioArquer) {
        this.proteccioArquer = proteccioArquer;
    }

    public boolean isProteccioCosACos() {
        return proteccioCosACos;
    }

    public void setProteccioCosACos(boolean proteccioCosACos) {
        this.proteccioCosACos = proteccioCosACos;
    }

    public boolean isAtacArquer() {
        return atacArquer;
    }

    public void setAtacArquer(boolean atacArquer) {
        this.atacArquer = atacArquer;
    }

    public boolean isAtacCosACos() {
        return atacCosACos;
    }

    public void setAtacCosACos(boolean atacCosACos) {
        this.atacCosACos = atacCosACos;
    }



    @Override
    public void equiparPersonatge(Personatge p) {    }
}
