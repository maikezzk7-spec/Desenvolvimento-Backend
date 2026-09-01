package Exercicios5.Exercicio04;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Maquina> maquinas = new ArrayList<>();

        maquinas.add(
            new Esteira(
                "M001",
                "Esteira Principal",
                "Ativa"
            )
        );

        maquinas.add(
            new RoboIndustrial(
                "M002",
                "Robô de Montagem",
                "Ativo"
            )
        );

        maquinas.add(
            new Prensa(
                "M003",
                "Prensa Hidráulica",
                "Ativa"
            )
        );

        for (Maquina maquina : maquinas) {

            System.out.println("Código: " + maquina.getCodigo());
            System.out.println("Nome: " + maquina.getNome());
            System.out.println("Status: " + maquina.getStatus());

            maquina.operar();

            System.out.println();
        }
    }
}
