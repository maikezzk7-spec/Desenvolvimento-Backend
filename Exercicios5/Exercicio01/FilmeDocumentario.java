package Exercicios5.Exercicio01;
public class FilmeDocumentario extends Filme {
    private String tema;

    public FilmeDocumentario(String titulo, int duracao, String classificacao, String tema) {
        super(titulo, duracao, classificacao);
        this.tema = tema;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("=== DOCUMENTÁRIO ===");
        System.out.println("Título: " + getTitulo());
        System.out.println("Duração: " + getDuracao() + " minutos");
        System.out.println("Classificação: " + getClassificacao());
        System.out.println("Tema: " + tema);
    }
}