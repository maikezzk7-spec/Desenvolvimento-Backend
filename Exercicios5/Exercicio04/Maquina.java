package Exercicios5.Exercicio04;

public class Maquina {
    private String codigo;
    private String nome;
    private String status;

    public Maquina(String codigo, String nome, String status) {
        this.codigo = codigo;
        this.nome = nome;
        this.status = status;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getStatus() {
        return status;
    }

    public void operar() {
        System.out.println("Máquina em operação.");
    }
}
