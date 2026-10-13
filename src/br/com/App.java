package br.com;

import br.com.model.Emprestimo;
import br.com.model.Livro;
import br.com.model.Usuario;

public class App {
    public static void main(String[] args) {
    
        Livro livro = new Livro("001", "Dom Casmurro", "Machado de Assis");
        Usuario usuario = new Usuario(1, "Ana");
        Emprestimo emp = new Emprestimo(livro, usuario);

        System.out.println("Data: " + emp.getDataEmprestimo());
        System.out.println("Ativo? " + emp.isAtivo());

        emp.registrarDevolucao();
        System.out.println("Ativo? " + emp.isAtivo());
    
    }
}
