package exercicio;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {

    Scanner scanner = new Scanner(System.in);
    ArrayList<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void adicionarLivro(Revista revista) {
        livros.add(revista);
    }
    public void listarLivros() {
        for (Livro livro : livros) {
            System.out.println("Titulo: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println("Ano: " + livro.getAnoPublicacao());
        }
    }

    public String buscaLivroPorTitulo(String titulo) {
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getTitulo().equals(titulo)) {
                String detalhesLivro = "Titulo: " + livros.get(i).getTitulo() + "\n Autor: " + livros.get(i).getAutor() + "\n Ano de Publica" +
                        "ção " + livros.get(i).getAnoPublicacao();
                return livros.get(i).getTitulo();
            }
        }
        return "Não foi encontrado nenhum livro com o titulo:" + titulo;
    }
}
