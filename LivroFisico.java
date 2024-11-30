public class LivroFisico extends Livro {
    private String codigoBarras;

    public LivroFisico(String titulo, Autor autor, Genero genero, int anoPublicacao, String codigoBarras) {
        super(titulo, autor, genero, anoPublicacao);
        this.codigoBarras = codigoBarras;
    }

    public String toString() {
        return super.toString() + " (Físico)";
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }
}
