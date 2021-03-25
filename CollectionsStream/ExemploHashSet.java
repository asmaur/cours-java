package CollectionsStream;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {
    public static void main(String[] args) {
        Set<Double> notasalunos = new HashSet<>();

        notasalunos.add(5.0);
        notasalunos.add(6.0);
        notasalunos.add(7.2);
        notasalunos.add(9.5);
        notasalunos.add(8.4);
        notasalunos.add(3.1);
        notasalunos.add(2.5);
        notasalunos.add(null);


        System.out.println(notasalunos);

        notasalunos.remove(6.0);
        
        System.out.println(notasalunos);

        System.out.println(notasalunos.size());

        Iterator<Double> iterator = notasalunos.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(notasalunos);
    }
    
}
