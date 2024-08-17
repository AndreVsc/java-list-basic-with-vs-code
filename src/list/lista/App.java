package list.lista;

public class App extends ListaTarefas{
    public static void main(String[] args) throws Exception {
       ListaTarefas tarefasDiarias = new ListaTarefas();
       ListaTarefas tarefasEscolares = new ListaTarefas();

       tarefasDiarias.addTerafa("Lavar louça");
       tarefasDiarias.addTerafa("Varrer o chão");
       tarefasDiarias.addTerafa("Limpar a mesa");
       tarefasDiarias.addTerafa("Limpar o fogao");

       tarefasEscolares.addTerafa("Estudar python");
       tarefasEscolares.addTerafa("Curso da Oracle");
       tarefasEscolares.addTerafa("Projeto de POO");

       System.out.println("\nTarefas do Dia: \n");
       tarefasDiarias.getTarefas();

       System.out.println("\nTarefas da Escola: \n");
       tarefasEscolares.getTarefas();

       System.out.println("\nTotal de tarefas do Dia: " + tarefasDiarias.totalTarefas());
       System.out.println("Total de tarefas da Escola: " + tarefasEscolares.totalTarefas());
       
    }
}
