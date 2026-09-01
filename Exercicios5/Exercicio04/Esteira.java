package Exercicios5.Exercicio04;

public class Esteira extends Maquina {

    public Esteira(String codigo, String nome, String status) {
        super(codigo, nome, status);
    }

    @Override
    public void operar() {
        System.out.println("Esteira transportando materiais.");
    }
}
