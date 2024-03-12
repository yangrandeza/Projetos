package com.emprestimo.model;

public class modelEdicao {
    private int id;
    private String ano;
    private String novo_conteudo;
    private ModelLivro livro;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getAno() {
        return ano;
    }
    public void setAno(String ano) {
        this.ano = ano;
    }
    public String getNovo_conteudo() {
        return novo_conteudo;
    }
    public void setNovo_conteudo(String novo_conteudo) {
        this.novo_conteudo = novo_conteudo;
    }
    public ModelLivro getLivro() {
        return livro;
    }
    public void setLivro(ModelLivro livro) {
        this.livro = livro;
    }    
}
