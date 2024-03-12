package com.emprestimo.model;

public class ModelEmprestimoLivro {
    private int id;
    private ModelLivro livro;
    private modelEmprestimo emprestimo;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public ModelLivro getLivro() {
        return livro;
    }
    public void setLivro(ModelLivro livro) {
        this.livro = livro;
    }
    public modelEmprestimo getEmprestimo() {
        return emprestimo;
    }
    public void setEmprestimo(modelEmprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }

        
}
