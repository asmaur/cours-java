package CollectionsStream;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args) {
        TreeSet<String> capitais = new TreeSet<>();

        capitais.add("Porto");
        capitais.add("BH");
        capitais.add("Floripa");
        capitais.add("Curitiba");
        capitais.add("São Paulo");
        capitais.add("Rio de Janeiro");
        capitais.add("Rondonia");

        System.out.println(capitais);

        System.out.println(capitais.first());

        System.out.println(capitais.last());
        System.out.println(capitais);
        System.out.println(capitais.lower("Floripa"));
        System.out.println(capitais);
        System.out.println(capitais.higher("Floripa"));
        System.out.println(capitais);

        System.out.println(capitais.pollFirst());
        System.out.println(capitais.pollLast());

        System.out.println(capitais);

        Iterator<String> iterator = capitais.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        
        
    }
}
