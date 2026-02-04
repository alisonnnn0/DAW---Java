
package Recu_POO_Biblioteca;

import java.util.Scanner;


public class Llibre {
    
    private String titol;
    private String autor;
    private int anyPublicacio;
    private String categoria;
    private boolean prestec = false;
    private int valoracio;
    private int totalValoracions = 0;
    private int nombreValoracions;

    public Llibre(String titol, String autor, int anyPublicacio, String categoria) {
        this.titol = titol;
        this.autor = autor;
        this.anyPublicacio = anyPublicacio;
        this.categoria = categoria;
        this.valoracio = 0;
        this.nombreValoracions = 0;
        this.prestec = false;
    }

    
    public int afegirValoracio(int novaValoracio){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix una valoracio(1-5): ");
        novaValoracio = sc.nextInt();
        
        while (novaValoracio > 5 && novaValoracio < 0) {
            
            System.out.println("Valoració no vàlida, torna a intentar-ho.");
            System.out.println("Introdueix una valoracio(1-5): ");
            novaValoracio = sc.nextInt();
        }
        
        System.out.println("Nova valoracio afegida - "+ novaValoracio +" estrellas");
        
        nombreValoracions++;
        
        totalValoracions = totalValoracions + novaValoracio;
        valoracio = totalValoracions/nombreValoracions;
        
        return valoracio;
    }
    
    
    public boolean prestar(){
        
        return prestec = true;
    }
    
    public boolean retornar(){
        
        return prestec = false;
    }
    
    
    public String getTitol() {
        return titol;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnyPublicacio() {
        return anyPublicacio;
    }

    public String getCategoria() {
        return categoria;
    }

    public boolean isPrestec() {
        return prestec;
    }

    public int getValoracio() {
        return valoracio;
    }
}
