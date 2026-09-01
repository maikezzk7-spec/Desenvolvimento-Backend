package Exercicios5.Exercicio04;

public class Prensa extends Maquina {

    public Prensa(String codigo, String nome, String status) {
        super(codigo, nome, status);
    }

    @Override
    public void operar() {
        System.out.println("Prensa executando um processo de conformação.");
    }
}
