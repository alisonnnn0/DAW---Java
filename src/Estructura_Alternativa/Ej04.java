
package Estructura_Alternativa;

import java.util.Scanner;

public class Ej04 {

    public static void main(String[] args) {

        char num;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix el primer nom: ");
        int nom = sc.nextInt();

        System.out.print("Introdueix la operació: ");
        num = sc.next().charAt(0);

        System.out.println("Has escrit el nom: " + nom);
        System.out.println("Has escollit l'operació: " + num);

    }
}