package Exercicios4.Exercicio05;
public class Cliente {

    private String codigoCti;
    private String segmento;
    private int nivel;
    private Consultor consultorResponsavel;

    public Cliente(
            String codigoCti,
            String segmento,
            int nivel,
            Consultor consultorResponsavel) {

        setCodigoCti(codigoCti);
        setSegmento(segmento);
        setNivel(nivel);
        setConsultorResponsavel(consultorResponsavel);
    }

    public String getCodigoCti() {
        return codigoCti;
    }

    public void setCodigoCti(String codigoCti) {
        this.codigoCti = codigoCti;
    }

    public String getSegmento() {
        return segmento;
    }

    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {

        if (nivel >= 1 && nivel <= 3) {
            this.nivel = nivel;
        } else {
            System.out.println(
                "Erro: o nível deve ser 1, 2 ou 3."
            );
        }
    }

    public Consultor getConsultorResponsavel() {
        return consultorResponsavel;
    }

    public void setConsultorResponsavel(
            Consultor consultorResponsavel) {

        this.consultorResponsavel = consultorResponsavel;
    }
}
