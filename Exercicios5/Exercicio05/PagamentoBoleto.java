package Exercicios5.Exercicio05;

public class PagamentoBoleto extends Pagamento {

    private String codigoBarras;

    public PagamentoBoleto(
            double valor,
            String data,
            String codigoBarras) {

        super(valor, data);
        this.codigoBarras = codigoBarras;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento via boleto.");
        System.out.println("Código de barras: " + codigoBarras);
    }

    @Override
    public double calcularTaxa() {
        return getValor() * 0.01;
    }
}
