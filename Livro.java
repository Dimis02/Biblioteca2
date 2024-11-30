public class Livro {
    private String titulo;
    private Autor autor;
    private Genero genero;
    private int anoPublicacao;
    private boolean disponivel;

    public Livro(String titulo, Autor autor, Genero genero, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = true; // Livro disponível inicialmente
    }

    public boolean emprestar() {
        if (disponivel) {
            disponivel = false;
            return true;
        }
        return false;
    }

    public void devolver() {
        disponivel = true;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public String toString() {
        return titulo + " - " + autor.getNome() + " (" + anoPublicacao + ")";
    }
}
