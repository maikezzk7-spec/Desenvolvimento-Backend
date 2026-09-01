package Exercicios5.Exercicio01;
public class Main {
    public static void main(String[] args) {

        Filme filme1 = new FilmeAcao(
            "Velozes e Furiosos",
            130,
            "14 anos",
            "Alto"
        );

        Filme filme2 = new FilmeDocumentario(
            "Planeta Terra",
            120,
            "Livre",
            "Natureza"
        );

        filme1.exibirDetalhes();

        System.out.println();

        filme2.exibirDetalhes();
    }
}