package CollectionsStream;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Pati");
        filaBanco.add("roberto");
        filaBanco.add("flavio");
        filaBanco.add("jose");

        System.out.println(filaBanco);

        String clientAtendida = filaBanco.poll();

        System.out.println(clientAtendida);

        System.out.println(filaBanco);

        String primeiro = filaBanco.peek();

        System.out.println(primeiro);

        System.out.println(filaBanco);

        filaBanco.clear();

        filaBanco.element();

    }
}
