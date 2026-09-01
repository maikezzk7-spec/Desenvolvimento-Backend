package Exercicios5.Exercicio05;

public class PagamentoPix extends Pagamento {

    private String chavePix;

    public PagamentoPix(double valor, String data, String chavePix) {
        super(valor, data);
        this.chavePix = chavePix;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento via PIX.");
        System.out.println("Chave PIX: " + chavePix);
    }

    @Override
    public double calcularTaxa() {
        return 0;
    }
}
