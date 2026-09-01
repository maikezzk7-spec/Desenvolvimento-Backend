package Exercicios04.Exercicio05;
public class Consultor extends Pessoa {

    private int anosExperiencia;

    public Consultor(
            String codigo,
            String nome,
            String email,
            int anosExperiencia) {

        super(codigo, nome, email);
        setAnosExperiencia(anosExperiencia);
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {

        if (anosExperiencia >= 0) {
            this.anosExperiencia = anosExperiencia;
        } else {
            System.out.println(
                "Erro: anos de experiência não podem ser negativos."
            );
        }
    }
}
