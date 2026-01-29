
package POO_Teoria;

import java.util.Scanner;

public class MetodeTeoria {

    /*public static saluda([parametres d'entrada]){
    
    Codi del metode [tipo de datos que se devuelve (int a / int b...), si no devuelve nada se pone (void)]
    
    }*/
    
    public static void saluda() {
        
        System.out.println("Holaa!");
    }
    
    public static int sumar(int num1, int num2) {
        
        int suma = num1 + num2;
        return suma;
        //Se acaba, a partir del return NO se ejecuta nada mas.
    }
    
    //Es importante el orden de las variables
    public static void SaludaAAlgu(String nom, int edat) {
        
        System.out.println("Holaa!" + nom + ". Tienes " + edat + "anys");
    }
    
    public static int numero() {
        
        Scanner teclat = new Scanner(System.in);
        
        System.out.print("Introdueix un numero: ");
        int numero = teclat.nextInt();
        
        return numero;
    }
    
    
    //Cridar al metode
    public static void main(String[] args) {
        
        String nombre = "Ali";
        
        saluda();
        SaludaAAlgu(nombre, 18);
        
        int resultat = sumar(44, 77);
        System.out.println("La suma és: " + resultat);
        
        //o se puede hacer de otra manera si solo se necesita que lo vea el usuario
        System.out.println("La suma és: " + sumar(44, 77));
        
        int valor = numero();
        System.out.println("El numero és: " + valor);
    }
}
