package Exercicios5.Exercicio04;

public class RoboIndustrial extends Maquina {

    public RoboIndustrial(String codigo, String nome, String status) {
        super(codigo, nome, status);
    }

    @Override
    public void operar() {
        System.out.println("Robô industrial realizando uma operação de montagem.");
    }
}
