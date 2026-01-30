
package TAD_Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class ProgramaPersones {
    
    public static void main(String[] args) {
        
           List<Persona> persones = new ArrayList();
           
        persones.add(new Persona("Alice", "Brown", "alice@gmail.com",
                Sexe.DONA, 26));
        persones.add(new Persona("Bob", "Young", "bob@gmail.com",
                Sexe.HOME, 12));
        persones.add(new Persona("Carol", "Hill", "carol@gmail.com",
                Sexe.DONA, 23));
        persones.add(new Persona("David", "Green", "david@gmail.com",
                Sexe.HOME, 39));
        persones.add(new Persona("Eric", "Young", "eric@gmail.com",
                Sexe.HOME, 26));
        persones.add(new Persona("Frank", "Thompson", "frank@gmail.com",
                Sexe.HOME, 33));
        persones.add(new Persona("Gibb", "Brown", "gibb@gmail.com",
                Sexe.HOME, 27));
        persones.add(new Persona("Henry", "Baker", "henry@gmail.com",
                Sexe.HOME, 30));
        persones.add(new Persona("Isabell", "Hill", "isabell@gmail.com",
                Sexe.DONA, 22));
        persones.add(new Persona("Jane", "Canela", "jane@gmail.com",
                Sexe.DONA, 24));
        
        persones.stream()//Imprimeix tot
                .sorted(Comparator.comparingInt(Persona::getEdat))
                .mapToInt(p -> p.getEdat())
                .skip(persones.size()-2) //Elements que em salto exepte els 2 ultims
                .forEach(s -> System.out.println(s + " "));
        
        persones.stream() //Imprimeix edats
                .mapToInt(p -> p.getEdat())
                .distinct()  //No dona elements repetits
                .sorted()
                .limit(4)  //Nomes mostra el nombre que vulguem des del principi
                .forEach(s -> System.out.println(s + " "));
        
        persones.stream()
                .filter(e -> e.getSexe() == Sexe.HOME && e.getEdat() > 28)  //Nomes agafa l'element si dona true
                .forEach(s -> System.out.println(s + " "));
        
        
                
    }
}
