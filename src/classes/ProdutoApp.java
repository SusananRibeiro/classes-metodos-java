package classes;
public class ProdutoApp {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 4356.89);

        var p2 = new Produto(); // outra forma de fazer a instância do objeto.
        p2.nome = "Caneta Preta";
        p2.preco = 12.56;

        Produto.desconto = 0.50;

        System.out.println(p1.nome + " " + p1.precoComDesconto()); // Notebook 2178.445
        System.out.println(p2.nome + " " + p2.precoComDesconto()); // Caneta Preta 6.28

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto();
        double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
        System.out.printf("Media do carrinho = R$%.2f.", mediaCarrinho); // Media do carrinho = R$1092,36.

    }
}
