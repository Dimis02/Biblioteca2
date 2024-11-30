public class LivroDigital extends Livro {
    private String linkDownload;

    public LivroDigital(String titulo, Autor autor, Genero genero, int anoPublicacao, String linkDownload) {
        super(titulo, autor, genero, anoPublicacao);
        this.linkDownload = linkDownload;
    }


    public String toString() {
        return super.toString() + " (Digital)";
    }

    public String getLinkDownload() {
        return linkDownload;
    }
}
