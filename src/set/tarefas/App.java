package set.tarefas;

public class App {
  public static void main(String[] args) {
    
    ListaTarefas listaTarefas = new ListaTarefas();

    listaTarefas.adicionarTarefa("Estudar Java");
    listaTarefas.adicionarTarefa("Fazer exercícios físicos");
    listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
    listaTarefas.adicionarTarefa("Ler livro");
    listaTarefas.adicionarTarefa("Preparar apresentação");

    listaTarefas.exibirTarefas();

    listaTarefas.removerTarefa("Fazer exercícios físicos");
    listaTarefas.exibirTarefas();

    System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

    System.out.println(listaTarefas.obterTarefasPendentes());

    listaTarefas.marcarTarefaConcluida("Ler livro");
    listaTarefas.marcarTarefaConcluida("Estudar Java");

    System.out.println(listaTarefas.obterTarefasConcluidas());

    listaTarefas.marcarTarefaPendente("Estudar Java");
    listaTarefas.exibirTarefas();

    listaTarefas.limparListaTarefas();
    listaTarefas.exibirTarefas();
  }
}