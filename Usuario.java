import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private String email;
    private List<Livro> livrosEmprestados;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.livrosEmprestados = new ArrayList<>();
    }

    public boolean emprestarLivro(Livro livro) {
        if (livro.emprestar()) {
            livrosEmprestados.add(livro);
            return true;
        }
        return false;
    }

    public void devolverLivro(Livro livro) {
        livro.devolver();
        livrosEmprestados.remove(livro);
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public String toString() {
        return nome + " (" + email + ")";
    }
}
