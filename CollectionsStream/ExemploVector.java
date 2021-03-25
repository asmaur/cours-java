package CollectionsStream;

import java.util.List;
import java.util.Vector;

public class ExemploVector {
    public static void main(String[] args) {
        List<String> esportes = new Vector();

        esportes.add("futebol");
        esportes.add("Basquetebol");
        esportes.add("handebol");

        esportes.set(1, "box");

        esportes.remove(2);

        esportes.remove("basquetebol");

        System.out.println(esportes);

        System.out.println(esportes.get(0));

        for(String s: esportes){
            System.out.println(s);
        }
        
    }
}
