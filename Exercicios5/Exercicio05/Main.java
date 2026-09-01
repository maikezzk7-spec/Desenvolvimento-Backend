package Exercicios5.Exercicio05;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Pagamento> pagamentos = new ArrayList<>();

        pagamentos.add(
            new PagamentoPix(
                100.00,
                "31/08/2026",
                "cliente@email.com"
            )
        );

        pagamentos.add(
            new PagamentoCartao(
                200.00,
                "31/08/2026",
                "1234-5678",
                3
            )
        );

        pagamentos.add(
            new PagamentoBoleto(
                300.00,
                "31/08/2026",
                "00190500954014481606906809350314337370000000100"
            )
        );

        for (Pagamento pagamento : pagamentos) {

            System.out.println("Valor: R$ " + pagamento.getValor());
            System.out.println("Data: " + pagamento.getData());

            pagamento.processarPagamento();

            System.out.println(
                "Taxa: R$ " + pagamento.calcularTaxa()
            );

            System.out.println();
        }
    }
}