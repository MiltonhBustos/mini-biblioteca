package br.com.model;

public class Livro {

    // Atributos privados: só a própria classe mexe neles diretamente
    private String codigo;
    private String titulo;
    private String autor;
    private boolean disponivel;

    // Construtor: roda quando criamos um livro com "new Livro(...)"
    public Livro(String codigo, String titulo, String autor) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true; // todo livro novo começa disponível
    }

    // Getters: permitem LER os atributos de fora da classe
    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    // Em vez de um setter genérico, métodos com nome de ação
    public void emprestar() {
        this.disponivel = false;
    }

    public void devolver() {
        this.disponivel = true;
    }
}
