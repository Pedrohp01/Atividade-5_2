package model;

import Atividade5_2.model.Produto;


public class App {
    public static void main(String[] args) {
        // Criando um novo produto
        Produto produto = new Produto("Café", 15.00, 30);

        // Exibindo informações iniciais
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: R$ " + produto.getPreco());
        System.out.println("Quantidade: " + produto.getQuantidade());

        System.out.println("\n--- Aplicando desconto de R$ 3,00 ---");
        produto.alterarPreco(3.00); // Aplica desconto

        System.out.println("\n--- Vendendo 5 unidades ---");
        produto.alterarQuantidade(5); // Reduz quantidade em 5

        // Exibindo informações atualizadas
        System.out.println("\n--- Dados atualizados ---");
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: R$ " + produto.getPreco());
        System.out.println("Quantidade: " + produto.getQuantidade());
    }
}
