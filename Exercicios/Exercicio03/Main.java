import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        if (numero1 > numero2) {
            System.out.println("O primeiro número é maior.");
        } else if (numero2 > numero1) {
            System.out.println("O segundo número é maior.");
        } else {
            System.out.println("Os dois números são iguais.");
        }

        scanner.close();
    }
}