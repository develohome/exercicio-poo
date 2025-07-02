package exercicio;

public class Revista extends Livro {

    private int edicao;

    @Override
    public void exibirDetalhes() {
        System.out.println("--- Detadlhes do livro ---");
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Ano: " + getAnoPublicacao());
        System.out.println("Edicao: " + edicao);
    }

    @Override
    void Itens() {
        System.out.println("Revista");
    }
}
