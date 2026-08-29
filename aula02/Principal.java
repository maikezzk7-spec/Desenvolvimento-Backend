public class Principal {

    public static void main(String[] args) {

        // Cria um objeto da classe Carro
        Carro meuCarro = new Carro();

        // Atribui valores aos atributos
        meuCarro.marca = "Fiat";
        meuCarro.cor = "Vermelho";

        // Exibe as informações
        System.out.println(
            "Carro marca: " + meuCarro.marca
            + " cor: " + meuCarro.cor
        );

        // Chama o método
        meuCarro.buzinar();
    }
}