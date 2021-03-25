package CollectionsStream;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {
    public static void main(String[] args) {
        Map<String, Integer> mundial = new HashMap<>();

        mundial.put("Brasil", 5);
        mundial.put("Alemanha", 4);
        mundial.put("Italia", 4);
        mundial.put("Uruguai", 2);
        mundial.put("Argentina", 2);
        mundial.put("França", 2);
        mundial.put("Espanha", 1);

        System.out.println(mundial);

        mundial.put("Brasil", 6);

        System.out.println(mundial);

        System.out.println(mundial.get("Argentina"));

        System.out.println(mundial.containsKey("França"));

        mundial.remove("França");
        System.out.println(mundial);

        System.out.println(mundial.containsKey("França"));

        System.out.println(mundial.containsValue(6));

        System.out.println(mundial.size());

        for(Map.Entry<String, Integer> entry: mundial.entrySet()){
            System.out.println(entry.getKey()+ "--- "+ entry.getValue());
        }

        for(String key:mundial.keySet()){
            System.out.println(key + " ---> "+ mundial.get(key));
        }

        System.out.println(mundial.get("belgica"));

        mundial.put("São Paulo", null);

        System.out.println(mundial.get(3));
        

    }
}
