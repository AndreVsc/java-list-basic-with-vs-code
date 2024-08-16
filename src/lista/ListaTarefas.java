package lista;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> listaTarefas;

    public ListaTarefas() {
        this.listaTarefas = new ArrayList<>();
    }

    public void addTerafa(String descricao){
        this.listaTarefas.add(new Tarefa(descricao));
        System.err.println("Tarefa "+ descricao +" adicionada!");
    }

    public void removeTerafa(String descricao){
        Tarefa tarefaRemover = null;
        for (Tarefa tarefa : this.listaTarefas){
            String descricaoTarefa = tarefa.getDescricao();
            if(descricao.equalsIgnoreCase(descricaoTarefa)){
                tarefaRemover = tarefa;
                break;
            }
        }
        if (tarefaRemover != null) {
            this.listaTarefas.remove(tarefaRemover);
            System.out.println("Tarefa excluida com sucesso!");
        }else{
            System.out.println("Essa tarefa não existe");
        }
    }
    
    public int totalTarefas(){
        return this.listaTarefas.size() ;
    }

    public void getTarefas(){
        for (Tarefa tarefa : this.listaTarefas){
            System.out.println(tarefa.getDescricao());
        }
    }
}
