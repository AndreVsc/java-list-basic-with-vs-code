package carrinhomercado;

public class App {
    public static void main(String[] args) {
        Carrinho meuCarrinho = new Carrinho();
        
        meuCarrinho.adicionarItem("Maçã", 2.5, 4);
        meuCarrinho.adicionarItem("Pão", 1.2, 6);
        meuCarrinho.adicionarItem("Leite", 3.0, 2);

        meuCarrinho.exibirItens();

        meuCarrinho.calcularValorTotal();
        
        meuCarrinho.removerItem("Pão");
    
        meuCarrinho.exibirItens();
        
        meuCarrinho.calcularValorTotal();
    }
}
