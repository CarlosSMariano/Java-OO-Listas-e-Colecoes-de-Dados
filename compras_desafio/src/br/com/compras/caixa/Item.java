package br.com.compras.caixa;

public class Item implements Comparable<Item> {

//    Atributos
    private String nome;
    private double preco;

//    Constructor

    public Item(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

//    Getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

//    metodos


    @Override
    public int compareTo(Item o) {
        return Double.valueOf(this.preco).compareTo(Double.valueOf(o.preco));
    }

    @Override
    public String toString() {
        return nome +" - R$"+ preco;
    }
}
