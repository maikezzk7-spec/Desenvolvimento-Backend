package Exercicios5.Exercicio03;

public class Main {
    public static void main(String[] args) {

        Produto produto1 = new ProdutoFisico(
            "P001",
            "Notebook",
            3500.00,
            3.5
        );

        Produto produto2 = new ProdutoDigital(
            "P002",
            "Curso de Java",
            200.00
        );

        System.out.println("Produto: " + produto1.getNome());
        System.out.println("Frete: R$ " + produto1.calcularFrete());

        System.out.println();

        System.out.println("Produto: " + produto2.getNome());
        System.out.println("Frete: R$ " + produto2.calcularFrete());
    }
}