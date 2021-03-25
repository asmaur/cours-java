package CollectionsStream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStream {

    public static void main(String[] args) {
        
        List<String> estudantes = new ArrayList<>();
    
        estudantes.add("pedro");
        estudantes.add("janis");
        estudantes.add("jose");
        estudantes.add("andre");
        estudantes.add("yvo");
        estudantes.add("taliska");
        estudantes.add("sunde");
        estudantes.add("tayo");

        //retorna contagem do stream
        System.out.println("contagem=" + estudantes.stream().count());

        //elemento com maior numero de letras
        System.out.println("Maior numero de letras: "+estudantes.stream().max(Comparator.comparingInt(String::length)));

        //elemento com menor numero de letras
        System.out.println("Menor numero de letras: "+ estudantes.stream().min(Comparator.comparingInt(String::length)));

        //elemento com a letra r no nome
        System.out.println("Com letra r no nome: "+ estudantes.stream().filter( (estudante) -> estudante.toLowerCase().contains("r")).collect(Collectors.toList()));

        //retorna uma noma coleçao com os nomes concatenaos a quantidade de letras de cada nome
        System.out.println("Retorna numa coleçao com quantidade de letras: "+ estudantes.stream().map(estudante -> estudante.concat("--").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));

        //retorna somente os 3 primeiros elementos da coleção
        System.out.println("Retorna os 3 primeiros elementos: "+ estudantes.stream().limit(3).collect(Collectors.toList()));

        //exibe cada elemento no console e depois retorna a mesma coleção
        System.out.println("Retorna os elementos: "+ estudantes.stream().peek(System.out::println).collect(Collectors.toList()) );

        //Exibe cada elemento no console sem retornar outra coleçao
        System.out.println("retorna os elementos");
        estudantes.stream().forEach(System.out::println);

        //retorna true se todos os elementos possuem a letra W no nome
        System.out.println("Tem algum elemento com 'W' no nome? "+ estudantes.stream().allMatch((elemento) -> elemento.contains("W") ) );

        //retorna true se todos os elementos possuem a letra minuscula a no nome
        System.out.println("Tem algum elemento com 'a' minusculo no nome? "+ estudantes.stream().anyMatch((elemento) -> elemento.contains("a") ) );

        //retorna true se nenhum elementos possuem a letra 'a' no nome
        System.out.println("Tem algum elemento com W no nome? "+ estudantes.stream().noneMatch((elemento) -> elemento.contains("a") ) );


        //retorna o primeiro elemento da coleção
        System.out.println("Retorna o primeiro elemento da coleção: ");
        estudantes.stream().findFirst().ifPresent(System.out::println);

        //operação encadeado
        System.out.println("Operação encadeada: ");
        System.out.println(
            estudantes.stream()
            .peek(System.out::println)
            .map(e -> e.concat("-").concat(String.valueOf(e.length())) )
            .peek(System.out::println)
            .filter(e -> e.toLowerCase().contains("r"))
        //    .collect(Collectors.toList())
        //    .collect(Collectors.joining(", ")));
        //    .collect(Collectors.toSet())
            .collect(Collectors.groupingBy(e -> e.substring(e.indexOf("-")+1)))
        );


        
    
    }
    
}
