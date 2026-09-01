package Exercicios5.Exercicio02;

public class Supervisor extends Funcionario {
    private double bonus;

    public Supervisor(String nome, String matricula, double salarioBase,
                      double bonus) {

        super(nome, matricula, salarioBase);
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + bonus;
    }

    @Override
    public void exibirDados() {
        System.out.println("=== SUPERVISOR ===");
        System.out.println("Nome: " + getNome());
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Bônus: R$ " + bonus);
        System.out.println("Salário: R$ " + calcularSalario());
    }
}
