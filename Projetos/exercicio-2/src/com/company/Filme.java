package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Filme {
    private int id;
    private String nome;
    private String descricao;
    private Date ano;
    private int pagina;

    public Filme (){

    }

    public Filme(int id, String nome, String descricao, Date ano) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.ano = ano;
    }

    public void exibirFiltrados(List<Filme> catalogo){
        System.out.println("\nLista dos filmes escolhidos:");
        for (int i = 0; i < catalogo.size(); i++) {
            System.out.println("Filme: " + catalogo.get(i).getNome());
            System.out.println("Descrição: " + catalogo.get(i).getDescricao());
            System.out.println("Ano de lançamento: " + catalogo.get(i).getAno());
            System.out.println("\n");
        }
    }

    public List<Filme> filtrarEscolha(int quantidadeFilmes, int pagina, List<Filme> catalogo){
        List<Filme> filmesFiltrados = new ArrayList();
        int i = 0;
        while(filmesFiltrados.size() != quantidadeFilmes){
            if(catalogo.get(i).getPagina() == pagina){
                filmesFiltrados.add(catalogo.get(i));
            }
            i++;
        }
        return filmesFiltrados;
    }

    public List<Filme> paginarFilmes(List filmes){
        List<Filme> filmesPaginados = new ArrayList();

        for (int i = 0; i < 20; i++) {
            Filme filmePaginado = (Filme)filmes.get(i);

            if(i >= 10 ){
                filmePaginado.setPagina(2);
            }else{
                filmePaginado.setPagina(1);
            }
            filmesPaginados.add(filmePaginado);
        }
        return filmesPaginados;
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

    public Date getAno() {
        return ano;
    }

    public void setAno(Date ano) {
        this.ano = ano;
    }

    public int getPagina() {
        return pagina;
    }

    public void setPagina(int pagina) {
        this.pagina = pagina;
    }
}
