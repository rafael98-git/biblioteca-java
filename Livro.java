import java.util.ArrayList;
import java.util.List;

class Livro {

    String titulo;
    String autor;
    int data;
    boolean disponibilidade;

    public Livro(String titulo, String autor, int anoPublicacao, boolean disponibilidade) {
        this.titulo = titulo;
        this.'autor = autor;
        this.data = data;
        this.disponibilidade = disponibilidade;
    }

    @Override
    public String toString() {
        return "Título: " + titulo +
               " | Autor: " + autor +
               " | Ano de publicação: " + data +
               " | Disponível: " + disponibilidade;
    }

    public static void main(String[] args) {

        List<Livro> biblioteca = new ArrayList<>();

        biblioteca.add(new Livro(
                "Java: Como Programar",
                "Deitel",
                2016,
                true
        ));

        biblioteca.add(new Livro(
                "Use a Cabeça! Java",
                "Kathy Sierra",
                2005,
                false
        ));

        biblioteca.forEach(System.out::println);
    }
}