package CollectionsStream;

import java.util.Optional;

public class ExemploOptional {
    public static void main(String[] args) {
        

        Optional<String> opcional = Optional.of("Valor presente");

        System.out.println("Valor presente opcional");
        opcional.ifPresentOrElse(System.out::println, () -> System.out.println("Não está presente"));

        Optional<String> opcionalNull = Optional.ofNullable(null);

        System.out.println("Valor opcional que não está presente");
        opcionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("Null = não está presente"));

        Optional<String> opcionalEmpty = Optional.empty();
        System.out.println("Valor opcioanl que não está presente");
        opcionalEmpty.ifPresentOrElse(System.out::println, () -> System.out.println("empty = não está presente"));

        Optional<String> opcionalNullErro = Optional.of(null);
        System.out.println("Valor opcional que lança erro NullPointerException");
        opcionalNullErro.ifPresentOrElse(System.out::println, ()->System.out.println("Erro =  não está presente"));


    }
    
}
