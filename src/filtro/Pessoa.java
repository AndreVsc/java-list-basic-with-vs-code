package filtro;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private double altura;
    private int idade;

    public Pessoa(String nome, double altura, int idade) {
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
    
    }
    @Override
    public int compareTo(Pessoa p){
        return Integer.compare(idade, p.getIdade());
    }

    public String getNome(){
        return this.nome;
    }

    public double getAltura(){
        return this.altura;
    }

    public int getIdade(){
        return this.idade;
    }

}

class ComparatorPorAltura implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
}