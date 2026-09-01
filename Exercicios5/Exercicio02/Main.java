package Exercicios5.Exercicio02;

public class Main {
    public static void main(String[] args) {

        Funcionario operador = new Operador(
            "Carlos",
            "OP-001",
            2500.00,
            10,
            30.00
        );

        Funcionario supervisor = new Supervisor(
            "Mariana",
            "SUP-001",
            4000.00,
            1000.00
        );

        operador.exibirDados();

        System.out.println();

        supervisor.exibirDados();
    }
}
