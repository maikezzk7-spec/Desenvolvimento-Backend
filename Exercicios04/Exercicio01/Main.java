package Exercicios04.Exercicio01;
public class Main {

    public static void main(String[] args) {

        Empresa empresa = new Empresa(
            "EMP-001",
            "Tech Solutions Ltda",
            50
        );

        System.out.println("Código: " + empresa.getCodigo());
        System.out.println("Razão Social: " + empresa.getRazaoSocial());
        System.out.println("Funcionários: " + empresa.getNumeroFuncionarios());

        empresa.setNumeroFuncionarios(-10);

        System.out.println("Funcionários após tentativa: "
                + empresa.getNumeroFuncionarios());
    }
}
