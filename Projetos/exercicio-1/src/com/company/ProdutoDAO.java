package com.company;

import java.sql.*;
import java.util.List;

public class ProdutoDAO {
    private Connection connection;

    public ProdutoDAO(Connection connection){
        this.connection = connection;
    }

    public void cadastrarProdutos(Produto produto){
        String sql = "INSERT INTO PRODUTO (NOME, DESCRICAO, QUANTIDADE, PRECO) VALUES (?, ?, ?, ? )";
        try(PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
            pstm.setString(1, produto.getNome());
            pstm.setString(2, produto.getDescricao());
            pstm.setInt(3, produto.getQuantidade());
            pstm.setDouble(4, produto.getPreco());
            pstm.execute();
            try(ResultSet result = pstm.getGeneratedKeys()) {
                while (result.next()) {
                    Integer id = result.getInt(1);
                    System.out.println("O Produto criado foi de id: " + id);
                }
            }
        }catch (SQLException ex){
            ex.printStackTrace();
            System.out.println("Erro ao acessar o banco de dados! ");
        }
    }

    //para exibir o produto antes do update
    public Produto listarAntigo(){
        Produto produtoAntigo = new Produto();
        String sql = "SELECT ID, NOME, DESCRICAO, QUANTIDADE, PRECO FROM PRODUTO WHERE ID=?";
        try(PreparedStatement pstm = connection.prepareStatement(sql)) {
            pstm.setInt(1, 1);
            pstm.execute();
            try(ResultSet result = pstm.getResultSet()) {
                while (result.next()) {
                    produtoAntigo.setId(result.getInt(1));
                    produtoAntigo.setNome(result.getString(2));
                    produtoAntigo.setDescricao(result.getString(3));
                    produtoAntigo.setQuantidade(result.getInt(4));
                    produtoAntigo.setPreco(result.getDouble(5));
                }
            }
        }catch (SQLException ex){
            ex.printStackTrace();
            System.out.println("Erro ao acessar o banco de dados! ");
        }
        return produtoAntigo;
    }
    //aqui começa o update do produto novo
    public void atualizarProduto(Produto produto){
        String sql = "UPDATE PRODUTO SET NOME = ?, DESCRICAO = ?, QUANTIDADE = ?, PRECO = ? WHERE ID = ?";
        try(PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
            pstm.setString(1, produto.getNome());
            pstm.setString(2, produto.getDescricao());
            pstm.setInt(3, produto.getQuantidade());
            pstm.setDouble(4, produto.getPreco());
            pstm.setInt(5, 1);
            pstm.execute();
        }catch (SQLException ex){
            ex.printStackTrace();
            System.out.println("Erro ao acessar o banco de dados! ");
        }
    }

    public void deletarProduto(){
        String sql = "DELETE FROM PRODUTO WHERE ID = ?";
        try(PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
            pstm.setInt(1, 2);
            pstm.execute();
            System.out.println("Produto 1 deletado !");
        }catch (SQLException ex){
            ex.printStackTrace();
            System.out.println("Erro ao acessar o banco de dados! ");
        }
    }

}
