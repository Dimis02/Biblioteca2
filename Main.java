public class Main {
    public static void main(String[] args) {
        // Criar autores
        Autor autor1 = new Autor("J.K. Rowling", "Britânica");
        Autor autor2 = new Autor("George Orwell", "Britânico");

        // Criar gêneros
        Genero genero1 = new Genero("Fantasia");
        Genero genero2 = new Genero("Distopia");

        // Criar livros
        Livro livro1 = new LivroDigital("Harry Potter e a Pedra Filosofal", autor1, genero1, 1997, "link1");
        Livro livro2 = new LivroFisico("1984", autor2, genero2, 1949, "12345");

        // Criar usuário
        Usuario usuario = new Usuario("João Silva", "joao@gmail.com");

        // Emprestar livros
        System.out.println("Emprestando livro 1: " + usuario.emprestarLivro(livro1));
        System.out.println("Emprestando livro 2: " + usuario.emprestarLivro(livro2));

        // Verificar livros emprestados
        System.out.println("Livros emprestados:");
        for (Livro livro : usuario.getLivrosEmprestados()) {
            System.out.println(livro);
        }

        // Devolver um livro
        usuario.devolverLivro(livro1);
        System.out.println("\nApós devolução do livro 1:");

        // Verificar livros emprestados novamente
        for (Livro livro : usuario.getLivrosEmprestados()) {
            System.out.println(livro);
        }
    }
}
