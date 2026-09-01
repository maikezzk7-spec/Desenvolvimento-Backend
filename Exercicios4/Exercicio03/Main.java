package Exercicios4.Exercicio03;
public class Main {

    public static void main(String[] args) {

        Consultor consultor = new Consultor(
            "CON-001",
            "Carlos Almeida",
            "carlos@empresa.com",
            5
        );

        System.out.println("Código: "
                + consultor.getCodigo());

        System.out.println("Nome: "
                + consultor.getNome());

        System.out.println("E-mail: "
                + consultor.getEmail());

        System.out.println("Anos de experiência: "
                + consultor.getAnosExperiencia());
    }
}
