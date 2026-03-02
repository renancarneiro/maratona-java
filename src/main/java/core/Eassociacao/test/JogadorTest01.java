package core.Eassociacao.test;

import core.Eassociacao.domain.Jogador;
import core.Eassociacao.domain.Time;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = Jogador.of("Jogador 1", 22, 'M');
        Jogador jogador2 = Jogador.of("Jogador 2", 23, 'F');
        Jogador jogador3 = Jogador.of("Jogador 3", 24, 'M');
        Jogador[] jogadores = new Jogador[]{jogador1, jogador2, jogador3};

        jogador1.setTime(Time.of("Flamengo"));
        jogador2.setTime(Time.of("Corintians"));
        jogador3.setTime(Time.of("Remo"));

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }
    }


}
