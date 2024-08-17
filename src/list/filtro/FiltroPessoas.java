package list.filtro;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class FiltroPessoas{
    private List<Pessoa> listaPessoas;

    public FiltroPessoas(){
        this.listaPessoas = new ArrayList<>();
    }
    
    public void adicionarPessoa(String nome, int idade, double altura){
        listaPessoas.add(new Pessoa(nome, altura, idade));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoaPorIdade = new ArrayList<>(listaPessoas);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(listaPessoas);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        return pessoaPorAltura;
    }
}