package br.com.compras.caixa;

import java.util.ArrayList;
import java.util.List;

public class Cartao {

//    Atributos
    private double limite;
    private double saldo;
    private List<Item> carrinho;

//    Construtor
    public Cartao(double limite){
        this.limite = limite;
        this.saldo = limite;
        this.carrinho = new ArrayList<>();
    }

//    Compras
    public boolean lancaCompra(Item compra) {
        if(this.saldo > compra.getPreco()){
            this.saldo -= compra.getPreco();
            this.carrinho.add(compra);
            return true;
        }
        return false;
    }
//    Getters

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Item> getCarrinho() {
        return carrinho;
    }
}
