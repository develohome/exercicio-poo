package exercicio;

public class Livro extends Item {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        if(anoPublicacao < 1 || anoPublicacao > 9999) {
            System.out.println("Ano de Publicação inválido");
        }else{
            this.anoPublicacao = anoPublicacao;
        }

    }

    public void exibirDetalhes() {
        System.out.println("--- Detadlhes do livro ---");
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Ano: " + this.anoPublicacao);
    }

    @Override
    void Itens() {
        System.out.println("Livro");
    }
}
