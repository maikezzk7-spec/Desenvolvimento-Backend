public class Main {

    public static void main(String[] args) {

        Gerente gerente = new Gerente(
            "GER-001",
            "Mariana Souza",
            "mariana@empresa.com",
            "Consultoria",
            8500
        );

        System.out.println("===== GERENTE =====");
        System.out.println("Código: " + gerente.getCodigo());
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("E-mail: " + gerente.getEmail());
        System.out.println("Departamento: "
                + gerente.getDepartamento());
        System.out.println("Salário: R$ "
                + gerente.getSalario());

        gerente.setSalario(-1000);

        System.out.println("Salário após tentativa: R$ "
                + gerente.getSalario());
    }
}
