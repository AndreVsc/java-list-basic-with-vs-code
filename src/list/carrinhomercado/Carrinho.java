package list.carrinhomercado;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private List<Item> carrinho;

    public Carrinho() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        this.carrinho.add(new Item(nome, preco, quantidade));
        System.out.println("Item adicionado com sucesso!");
    }

    public void removerItem(String nome) {
        Item itemRemover = null;
        for (Item item : this.carrinho) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                itemRemover = item;
                break;
            }
        }
        if (itemRemover != null) {
            this.carrinho.remove(itemRemover);
            System.out.println("\nItem removido com sucesso!\n");
        } else {
            System.out.println("\nItem não encontrado no carrinho.");
        }
    }

    public void calcularValorTotal() {
        double valor = 0.0;
        for (Item item : this.carrinho) {
            valor += item.getPreco() * item.getQuantidade();
        }
        System.out.printf("\nO valor total da compra foi de: %.2f R$%n", valor);
    }

    public void exibirItens() {
        if (this.carrinho.isEmpty()) {
            System.out.println("\nO carrinho está vazio.");
            return;
        }

        System.out.println("\nItens no carrinho:");
        for (Item item : this.carrinho) {
            System.out.printf(" - %d X %s%n", item.getQuantidade(), item.getNome());
        }
    }
}
