package Exercicios04.Exercicio05;
public class Main {

    public static void main(String[] args) {

        // Criando o consultor
        Consultor consultor = new Consultor(
            "CON-001",
            "Carlos Almeida",
            "carlos@empresa.com",
            5
        );

        // Criando o cliente
        Cliente cliente = new Cliente(
            "CTI-010",
            "Tecnologia",
            2,
            consultor
        );

        // Criando os serviços
        Servico servico1 = new Servico(
            "SER-001",
            "Diagnóstico Tecnológico",
            4500
        );

        Servico servico2 = new Servico(
            "SER-002",
            "Consultoria em Tecnologia",
            3500
        );

        // Desativando o segundo serviço
        servico2.desativar();

        // Relatório
        System.out.println("========== CTI INSIGHTS ==========");

        System.out.println("Cliente: "
                + cliente.getCodigoCti());

        System.out.println("Segmento: "
                + cliente.getSegmento());

        System.out.println("Nível: "
                + cliente.getNivel());

        System.out.println("Consultor:");
        System.out.println(
                consultor.getNome());

        System.out.println(
                consultor.getAnosExperiencia()
                + " anos de experiência");

        System.out.println("Serviço:");
        System.out.println(
                servico1.getNome());

        System.out.printf(
                "Valor: R$ %.2f%n",
                servico1.getValor());

        System.out.println(
                "Ativo: " + servico1.isAtivo());

        System.out.println();

        System.out.println("Segundo serviço:");
        System.out.println(
                servico2.getNome());

        System.out.printf(
                "Valor: R$ %.2f%n",
                servico2.getValor());

        System.out.println(
                "Ativo: " + servico2.isAtivo());

        // =================================
        // TESTANDO VALORES INVÁLIDOS
        // =================================

        System.out.println();
        System.out.println("===== TESTES DE VALIDAÇÃO =====");

        cliente.setNivel(5);

        consultor.setAnosExperiencia(-4);

        servico1.setValor(-1000);
    }
}
