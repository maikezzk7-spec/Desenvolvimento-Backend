package Exercicios5.Exercicio05;

public class PagamentoCartao extends Pagamento {

    private String numeroCartao;
    private int parcelas;

    public PagamentoCartao(
            double valor,
            String data,
            String numeroCartao,
            int parcelas) {

        super(valor, data);
        this.numeroCartao = numeroCartao;
        this.parcelas = parcelas;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento via cartão.");
        System.out.println("Número do cartão: " + numeroCartao);
        System.out.println("Parcelas: " + parcelas);
    }

    @Override
    public double calcularTaxa() {
        return getValor() * 0.03;
    }
}
