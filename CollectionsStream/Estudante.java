package CollectionsStream;

import java.util.Collections;

public class Estudante implements Comparable<Estudante> {
    private final String nome;
    private final Integer idade;

    public Estudante(String nome, Integer idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }
    public Integer getIdade(){
        return idade;
    }

    @Override
    public String toString(){
        return "Estudante[nome="+getNome()+ "-- "+ getIdade();
    }

    @Override
    public int compareTo(Estudante obj){
        return this.getIdade() - obj.getIdade();
    }
    
}
