
package TAD_Streams;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ProgramaAlumnes {
    
    public static void main(String[] args) {
          
        List<Vehicle> vehicles = new ArrayList();
        vehicles.add(new Vehicle("1111AAA", Model.BMW, 10000));
        vehicles.add(new Vehicle("2222BBB", Model.AUDI, 20000));
        vehicles.add(new Vehicle("3333CCC", Model.OPEL, 30000));
        vehicles.add(new Vehicle("4444DDD", Model.BMW, 100000));
        vehicles.add(new Vehicle("5555EEE", Model.AUDI, 200000));
        vehicles.add(new Vehicle("6666FFF", Model.OPEL, 300000));
        vehicles.add(new Vehicle("7777GGG", Model.CITROEN, 0));
      
        /*
        Crea una llista d'enters que tingui el doble dels quilòmetres 
        de cada cotxe i imprimeix el resultat. 
        A continuació crea una altre llista que 
        contingui els quilòmetres i mostra el resultat
        */
        
        vehicles.stream()
                .map(k -> k.getQuilometres() * 2)
                .collect(Collectors.toList());

        
    
        /*
        Crea una llista de Vehicle que només contingui els AUDI i mostra el 
        resultat
        */
       
        System.out.println("Llista de Vehicle que només contingui els AUDI");
        vehicles.stream()
                .filter(m -> m.getModel() == Model.AUDI)
                .forEach(m -> System.out.println(m + " "));
        System.out.println("");
        
        
        
        /*
        Crea una llista amb els vehicles ordenats per quilòmetres
        Mostra el resultat
        */
      
        System.out.println("Llista amb els vehicles ordenats per quilòmetres");
        vehicles.stream()
                .sorted(Comparator.comparingInt(Vehicle::getQuilometres))
                .forEach(System.out::println);
        System.out.println("");
        
        
        
        /*
        Mostra el model dels cotxes sense repeticio. Has de crear una llista
        de models
        */
      
        System.out.println("Model dels cotxes sense repeticio");
        vehicles.stream()
                .map(m -> m.getModel())
                .distinct()
                .sorted()
                .forEach(s -> System.out.println(s + " "));
        System.out.println("");
        
        
        /*
        Crea una llista de 5 vehicles i mostra-la
        */
        
        System.out.println("Llista de 5 vehicles");
        vehicles.stream()
                .limit(5)
                .forEach(System.out::println);
        System.out.println("");
       
        
        /*
        Agrupa els vehicles per model en un Map i mostra el resultat
        */
       
        System.out.println("Agrupa els vehicles per model");
        vehicles.stream()
                .map(m -> m.getModel())
                .distinct()
                .forEach(m -> System.out.println(m + " "));
        System.out.println("");
    }
}

