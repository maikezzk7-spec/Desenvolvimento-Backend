package Exercicio4.Exercicio02;
public class Servico {

    private String codigo;
    private String nome;
    private String descricao;
    private double valor;

    public Servico(String codigo, String nome, String descricao, double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        setValor(valor);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor >= 0) {
            this.valor = valor;
        } else {
            System.out.println("Erro: o valor não pode ser negativo.");
        }
    }
}
