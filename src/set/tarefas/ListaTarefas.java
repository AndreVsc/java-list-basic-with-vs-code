package set.tarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
  //atributos
  private Set<Tarefa> tarefasSet;

  public ListaTarefas() {
    this.tarefasSet = new HashSet<>();
  }

  public void adicionarTarefa(String descricao) {
    tarefasSet.add(new Tarefa(descricao));
  }

  public void removerTarefa(String descricao) {
    Tarefa tarefaParaRemover = null;
    if (!tarefasSet.isEmpty()) {
      for (Tarefa t : tarefasSet) {
        if (t.getDescricao().equalsIgnoreCase(descricao)) {
          tarefaParaRemover = t;
          break;
        }
      }
      tarefasSet.remove(tarefaParaRemover);
    } else {
      System.out.println("O conjunto está vazio");
    }

    if(tarefaParaRemover == null) {
      System.out.println("Tarefa não encontrada!");
    }
  }

  public void exibirTarefas() {
    if(!tarefasSet.isEmpty()) {
      System.out.println(tarefasSet);
    } else {
      System.out.println("Tarefa não encontrada!");
    }
  }

  public int contarTarefas() {
    return tarefasSet.size();
  }

  public Set<Tarefa> obterTarefasConcluidas() {
    Set<Tarefa> tarefasConcluidas = new HashSet<>();
    for (Tarefa t : tarefasSet) {
      if (t.isConcluida()) {
        tarefasConcluidas.add(t);
      }
    }
    return tarefasConcluidas;
  }

  public Set<Tarefa> obterTarefasPendentes() {
    Set<Tarefa> tarefasNaoConcluidas = new HashSet<>();
    for (Tarefa t : tarefasSet) {
      if (!t.isConcluida()) {
        tarefasNaoConcluidas.add(t);
      }
    }
    return tarefasNaoConcluidas;
  }

  public void marcarTarefaConcluida(String descricao) {
    for (Tarefa t : tarefasSet) {
      if (t.getDescricao().equalsIgnoreCase(descricao)) {
        t.setConcluida(true);
      }
    }
  }

  public void marcarTarefaPendente(String descricao) {
    Tarefa tarefaParaMarcarComoPendente = null;
    for (Tarefa t : tarefasSet) {
      if (t.getDescricao().equalsIgnoreCase(descricao)) {
        tarefaParaMarcarComoPendente = t;
        break;
      }
    }

    if (tarefaParaMarcarComoPendente != null) {
      if(tarefaParaMarcarComoPendente.isConcluida()) {
        tarefaParaMarcarComoPendente.setConcluida(false);
      }
    } else {
      System.out.println("Tarefa não encontrada na lista.");
    }
  }

  public void limparListaTarefas() {
    if(tarefasSet.isEmpty()) {
      System.out.println("A lista já está vazia!");
    } else {
      tarefasSet.clear();
    }
  }

}
