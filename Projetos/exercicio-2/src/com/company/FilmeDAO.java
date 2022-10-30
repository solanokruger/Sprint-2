package com.company;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FilmeDAO {

    private Connection connection;

    public FilmeDAO(Connection connection){
        this.connection = connection;
    }

    public List<Filme> listar() throws SQLException {
        List<Filme> filmes = new ArrayList<Filme>();
        String sql = "SELECT ID, NOME, DESCRICAO, ANO FROM FILME";
        try(PreparedStatement pstm = connection.prepareStatement(sql)){
            pstm.execute();
            try(ResultSet result = pstm.getResultSet()){
                while(result.next()){
                    Filme filme = new Filme(
                            result.getInt(1),
                            result.getString(2),
                            result.getString(3),
                            result.getDate(4)
                    );
                    filmes.add(filme);
                }
            }
        }catch (SQLException ex){
            System.out.println("Erro ao acessar o banco de dados !");
        }
        return filmes;
    }
}
