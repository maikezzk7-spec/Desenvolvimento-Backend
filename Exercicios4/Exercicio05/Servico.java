package Exercicios4.Exercicio05;
public class Servico {

    private String codigo;
    private String nome;
    private double valor;
    private boolean ativo;

    public Servico(
            String codigo,
            String nome,
            double valor) {

        this.codigo = codigo;
        this.nome = nome;
        setValor(valor);

        this.ativo = true;
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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {

        if (valor >= 0) {
            this.valor = valor;
        } else {
            System.out.println(
                "Erro: o valor não pode ser negativo."
            );
        }
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void ativar() {
        ativo = true;
    }

    public void desativar() {
        ativo = false;
    }
}
