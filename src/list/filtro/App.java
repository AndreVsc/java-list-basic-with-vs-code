package list.filtro;

public class App {
    public static void main(String[] args) {
        FiltroPessoas filtroPessoas = new FiltroPessoas();
        filtroPessoas.adicionarPessoa("Arthur", 19, 1.75);
        filtroPessoas.adicionarPessoa("Giovanna", 18, 1.50);
        filtroPessoas.adicionarPessoa("Leny", 39, 1.52);
        filtroPessoas.adicionarPessoa("Willian", 37, 1.74);

        System.out.println("Ordenado por altura:");
        for (Pessoa pessoa : filtroPessoas.ordenarPorAltura()) {
            System.out.println(pessoa.getNome());
        }

        System.out.println("\nOrdenado por idade:");
        for (Pessoa pessoa : filtroPessoas.ordenarPorIdade()) {
            System.out.println(pessoa.getNome());
        }
    }
}
