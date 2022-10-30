package com.company;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ConnectionFactory factory = new ConnectionFactory();
        Connection connection = factory.recuperarConexao();
        ProdutoDAO produtoDAO= new ProdutoDAO(connection);
        int op = 5;
        int cadastro = 0, atualizado = 0, deletado = 0;
        Scanner scan = new Scanner(System.in);

        try {
            while (op != 0) {
                System.out.println(
                        " Digite 1 para cadastrar 3 produtos\n" +
                                " Digite 2 para atualizar o primeiro produto\n" +
                                " Digite 3 para deletar o segundo produto\n" +
                                " Digite 0 para sair da aplicação"
                );

                op = scan.nextInt();

                if (op == 1) {
                    //geração da lista de produtos
                    if (cadastro == 1) {
                        System.out.println("Os produtos já foram cadastrados! ");
                    } else {
                        Produto produtos = new Produto();
                        List<Produto> listaProdutos = new ArrayList();
                        listaProdutos = produtos.gerarProdutos();
                        for (int i = 0; i < 3; i++) {
                            produtoDAO.cadastrarProdutos(listaProdutos.get(i));
                        }
                        cadastro = 1;
                    }
                } else if (op == 2) {
                    if (atualizado == 1) {
                        System.out.println("O produto já foi atualizado");
                    } else if (cadastro == 0) {
                        System.out.println("Os produtos não foram cadastrados ainda !");
                    } else {
                        Produto produtoAtualizado = new Produto(
                                "Televisão",
                                "Televisão 55 polegadas",
                                2,
                                1790.00
                        );
                        //lista o produto antigo
                        System.out.println("Produto antigo:");
                        Produto produtoAntigo = produtoDAO.listarAntigo();
                        System.out.println("Nome: " + produtoAntigo.getNome());
                        System.out.println("Nome: " + produtoAntigo.getDescricao());
                        System.out.println("Quantidade: " + produtoAntigo.getQuantidade());
                        System.out.println("Preço: " + produtoAntigo.getPreco());
                        //atualiza o produto
                        produtoDAO.atualizarProduto(produtoAtualizado);
                        //lista o novo produto
                        System.out.println("\nProduto atualizado:");
                        System.out.println("Nome: " + produtoAtualizado.getNome());
                        System.out.println("Descrição: " + produtoAtualizado.getDescricao());
                        System.out.println("Quantidade: " + produtoAtualizado.getQuantidade());
                        System.out.println("Preço: " + produtoAtualizado.getPreco());

                        atualizado = 1;
                    }
                } else if (op == 3) {
                    if (deletado == 1) {
                        System.out.println("O produto já foi deletado!");
                    } else if (cadastro == 0) {
                        System.out.println("Os produtos não foram cadastrados ainda !");
                    } else {
                        produtoDAO.deletarProduto();
                        deletado = 1;
                    }
                } else if (op == 0) {
                    break;
                }
            }
            scan.close();
        }catch(InputMismatchException ex){
            System.out.println("Voce informou uma letra em vez de um número, tente novamente !");
        }
    }
}
