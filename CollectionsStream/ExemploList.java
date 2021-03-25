package CollectionsStream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class ExemploList {

    public static void main(String[] args) {
   
    List<String> nomes = new ArrayList<>();

    nomes.add("Carlos");
    nomes.add("Xara");
    nomes.add("Maur");
    nomes.add("Yvo");

    System.out.println(nomes);

    Collections.sort(nomes);

    System.out.println(nomes.get(3));

    System.out.println(nomes.contains("uuu"));

    System.out.println(nomes.isEmpty());

    System.out.println(nomes.indexOf("xara"));
    System.out.println(nomes.indexOf("dgKDKDkgKGDJGAH"));

    Iterator<String> iterator = nomes.iterator();

    while (iterator.hasNext()){
        System.out.println("-->" +iterator.next());
    }
    

    }

}
