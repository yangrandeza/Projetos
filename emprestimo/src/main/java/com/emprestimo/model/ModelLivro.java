package com.emprestimo.model;

public class ModelLivro {
    private int id;
    private String nome;
    private String descricao;
    private String ano_publicacao;
    private ModelEditora editora;
    private ModelAutor autor;
    
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
    public String getAno_publicacao() {
        return ano_publicacao;
    }
    public void setAno_publicacao(String ano_publicacao) {
        this.ano_publicacao = ano_publicacao;
    }
    public ModelEditora getEditora() {
        return editora;
    }
    public void setEditora(ModelEditora editora) {
        this.editora = editora;
    }
    public ModelAutor getAutor() {
        return autor;
    }
    public void setAutor(ModelAutor autor) {
        this.autor = autor;
    }

    
}


