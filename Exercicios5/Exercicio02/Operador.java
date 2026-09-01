package Exercicios5.Exercicio02;

public class Operador extends Funcionario {
    private double horasExtras;
    private double valorHoraExtra;

    public Operador(String nome, String matricula, double salarioBase,
                    double horasExtras, double valorHoraExtra) {

        super(nome, matricula, salarioBase);
        this.horasExtras = horasExtras;
        this.valorHoraExtra = valorHoraExtra;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (horasExtras * valorHoraExtra);
    }

    @Override
    public void exibirDados() {
        System.out.println("=== OPERADOR ===");
        System.out.println("Nome: " + getNome());
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Horas extras: " + horasExtras);
        System.out.println("Valor da hora extra: R$ " + valorHoraExtra);
        System.out.println("Salário: R$ " + calcularSalario());
    }
}
