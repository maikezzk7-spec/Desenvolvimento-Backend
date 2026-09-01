package Exercicios4.Exercicio02;
public class Main {

    public static void main(String[] args) {

        Servico servico = new Servico(
            "SER-010",
            "Consultoria em Tecnologia",
            "Avaliação da infraestrutura tecnológica.",
            3500
        );

        System.out.println("Código: " + servico.getCodigo());
        System.out.println("Nome: " + servico.getNome());
        System.out.println("Descrição: " + servico.getDescricao());
        System.out.println("Valor: R$ " + servico.getValor());

        // Valor válido
        servico.setValor(5000);

        System.out.println("Novo valor: R$ " + servico.getValor());

        // Valor inválido
        servico.setValor(-1000);

        System.out.println("Valor após tentativa: R$ "
                + servico.getValor());
    }
}
