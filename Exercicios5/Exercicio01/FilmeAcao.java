package Exercicios5.Exercicio01;
public class FilmeAcao extends Filme {
    private String nivelViolencia;

    public FilmeAcao(String titulo, int duracao, String classificacao, String nivelViolencia) {
        super(titulo, duracao, classificacao);
        this.nivelViolencia = nivelViolencia;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("=== FILME DE AÇÃO ===");
        System.out.println("Título: " + getTitulo());
        System.out.println("Duração: " + getDuracao() + " minutos");
        System.out.println("Classificação: " + getClassificacao());
        System.out.println("Nível de violência: " + nivelViolencia);
    }
}