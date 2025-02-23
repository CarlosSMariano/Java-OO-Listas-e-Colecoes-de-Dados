package br.com.compras.main;

import br.com.compras.caixa.Cartao;
import br.com.compras.caixa.Item;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao = 1;

        System.out.println("Digite o limite do cartão:");
        Double limite = scan.nextDouble();

        Cartao cartao = new Cartao(limite);

        while (opcao != 0){
            System.out.println("Digite o nome do produto que deseja:");
            String nome = scan.next();
            System.out.println("Digite o preço do produto:");
            double preco = scan.nextDouble();
            Item produto = new Item(nome, preco);

            if (cartao.lancaCompra(produto)){
                System.out.println("""
                        Compra realizada com sucesso!
                        Digite 0 para sair ou 1 para continuar
                        """);
                opcao = scan.nextInt();
            }else {
                System.out.println("Saldo insuficiente!");
                opcao = 0;
            }

            System.out.println("=-=-=-=-=-=-=-=-=-=-=\nCOMPRAS REALIZADAS:\n");

            Collections.sort(cartao.getCarrinho());
            for (Item c : cartao.getCarrinho()){
                System.out.println(c.getNome() + " - R$"+c.getPreco());
            }
            System.out.println("\n=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("\nSaldo do cartão: "+cartao.getSaldo());
        }

    }
}
