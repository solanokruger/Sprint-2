package com.company;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException {

        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection connection = connectionFactory.recuperarConexao();
        FilmeDAO filmeDAO = new FilmeDAO(connection);

        Filme filme = new Filme();
        List<Filme> catalogo = filme.paginarFilmes(filmeDAO.listar());
        Scanner scan = new Scanner(System.in);
        int pagina = 0;
        int quantidade = 0;

        try{
            while (pagina != 1 && pagina !=2){
                System.out.println("Qual página deseja acessar? (2 páginas disponíveis)");
                pagina = scan.nextInt();
            }

            while (quantidade < 1 || quantidade > 10){
                System.out.println("Quantos filmes deseja assistir? (10 filmes disponíveis)");
                quantidade = scan.nextInt();
            }
        }catch(InputMismatchException ex){
            System.out.println("Voce informou uma letra no lugar do número, tente novamente !");
        }

        List<Filme> filmes = filme.filtrarEscolha(quantidade, pagina, catalogo);
        filme.exibirFiltrados(filmes);

	scan.close();
    }
}
