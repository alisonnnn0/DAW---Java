package Estructura_Alternativa_Teoria;

import java.util.Scanner;
//Sirve para que luego lea lo que se introduce

public class Apuntes1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Espera a que se escriba algo
        
        System.out.println("Introdueix un nombre: ");
        //Que se escriba lo que ponga entre ("")
        
        int num = sc.nextInt();
        //Definir variables de numeros enteros y leerlo (int solo definir).
        
        if (num == 0) {
            /*Se usa el doble igual para decir que "Si una variable es igual a..."
            solo un igual es que la variable es igual a un numero*/
            
            System.out.println("Nombre zero.");
            
            } else if  (num > 0){
                System.out.println("Nombre positiu.");
                //Si una variable no es una valor y es este es:
                
            } else if (0 > num){
                System.out.println("Nombre negatiu.");
        }
    }
}