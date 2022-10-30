package com.company;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private int id;
    private String nome;
    private String descricao;
    private int quantidade;
    private double preco;

    public Produto(){

    }

    public Produto(String nome, String descricao, int quantidade,double preco){
        this.nome = nome;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public List gerarProdutos(){
        ArrayList<Produto> produtos = new ArrayList();
        Produto p1 = new Produto();
        p1.setNome("Mouse");
        p1.setDescricao("Mouse com fio");
        p1.setPreco(25.00);
        p1.setQuantidade(5);
        produtos.add(p1);

        Produto p2 = new Produto();
        p2.setNome("Teclado");
        p2.setDescricao("Teclado com fio");
        p2.setPreco(50.00);
        p2.setQuantidade(7);
        produtos.add(p2);

        Produto p3 = new Produto();
        p3.setNome("Headset");
        p3.setDescricao("Headset com fio");
        p3.setPreco(80.00);
        p3.setQuantidade(3);
        produtos.add(p3);

        return produtos;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
