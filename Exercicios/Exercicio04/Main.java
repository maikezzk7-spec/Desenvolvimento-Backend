import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: R$ ");
        double valorCompra = scanner.nextDouble();

        double desconto;

        if (valorCompra <= 100) {
            desconto = 0;
        } else if (valorCompra <= 500) {
            desconto = valorCompra * 0.10;
        } else {
            desconto = valorCompra * 0.15;
        }

        double valorFinal = valorCompra - desconto;

        System.out.println("Valor da compra: R$ " + valorCompra);
        System.out.println("Valor do desconto: R$ " + desconto);
        System.out.println("Valor final: R$ " + valorFinal);

        scanner.close();
    }
}