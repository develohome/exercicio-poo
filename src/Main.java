import exercicio.Biblioteca;
import exercicio.Livro;
import menu.Menu;

import javax.swing.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String titulo;
        String autor;
        int anoPublicacao;
        Livro livro = new Livro();
        Menu.Menu();
        Biblioteca biblioteca = new Biblioteca();

        Scanner scanner = new Scanner(System.in);

        int opcao = scanner.nextInt();

        if (opcao == 1) {
            System.out.println("Digite o nome do livro: ");
            livro.setTitulo(scanner.next());
            System.out.println("Digite o autor do livro: ");
            livro.setAutor(scanner.next());
            System.out.println("Digite a ano do livro: ");
            livro.setAnoPublicacao(scanner.nextInt());

            biblioteca.adicionarLivro(livro);
            biblioteca.listarLivros();
        } else {

        }

        System.out.println("Digite um titulo");
        biblioteca.buscaLivroPorTitulo(scanner.next());

    }
}