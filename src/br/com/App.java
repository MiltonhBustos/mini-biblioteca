package br.com;

import br.com.model.Livro;

public class App {
    public static void main(String[] args) {
        Livro livro = new Livro("001", "Dom Casmurro", "Machado de Assis");
        System.out.println(livro.getTitulo() + " disponível? " + livro.isDisponivel());
        livro.emprestar();
        System.out.println(livro.getTitulo() + " disponível? " + livro.isDisponivel());
    }
}
