
package TAD_Taulas;


public class TipusAvançatsDeDades {

    public static void main(String[] args) {
        
        
        //RECORREGUT
        int num1, num2;
        
        //La primera posicio es la 0.
        int [] numeros;
        int valors[] = new int[20];
        
        //Sense dir quant d'espai necesitem no es pot fer la llista.
        //numeros = new int [10];
        
        //numeros[0] = 3;
        
        int [] num = {2, 5, 10, 45, 3, 8};
        String titols[] = {"Hola", "Benvinguts", "Adeu"};
        
        // No es pot fer -> No es pot introduir una operacio
        // int [] no = num1+num2;
        
        //Per accedir a la taula
        int []num3 = new int[10];
        int comptador = 0;
        int suma = 0;
        System.out.println(num3.length);
        
        while (comptador < num3.length){
            
            num3[comptador]=comptador;
            //o para hacer alguna operacion->
            suma = suma + num3[comptador];
            comptador++;
        }
        
        System.out.println("La suma es: " + suma);
        
        for (int i = 0; i < num3.length; i++) {
            
            suma = suma + num3[i];
        }
        
        for (int valor : num3) {
            
            suma = suma + valor;
        }
        
        
        //CERCA
        
        double [] notes = {2, 3.2, 3.6, 4.7, 5.2, 6.3, 7.5, 8.4, 9.9, 10};
        double valorBusco = 8;
        
        boolean trobat = false, acabar = false;
        int comptador1 = 0;
        
        while (comptador < notes.length && !trobat && !acabar){
            
            if (notes[comptador1] == valorBusco) {
                
                trobat = true;
                
            } else if (notes[comptador] > valorBusco){
                
                acabar = true;
            }
            
            comptador++;
        }
        
        if (trobat) {
            
            System.out.println("Algu té un " + valorBusco);
            
        } else {
            
            System.out.println("Cap persona te aquets valor: " + valorBusco);
        }
    }
}
