package Exercicios4.Exercicio01;
public class Empresa {

    private String codigo;
    private String razaoSocial;
    private int numeroFuncionarios;

    public Empresa(String codigo, String razaoSocial, int numeroFuncionarios) {
        this.codigo = codigo;
        this.razaoSocial = razaoSocial;
        setNumeroFuncionarios(numeroFuncionarios);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(int numeroFuncionarios) {
        if (numeroFuncionarios >= 0) {
            this.numeroFuncionarios = numeroFuncionarios;
        } else {
            System.out.println("Erro: o número de funcionários não pode ser negativo.");
        }
    }
}