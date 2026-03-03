package org.example.core.Eassociacao.test;

import core.Eassociacao.domain.Jogador;
import core.Eassociacao.domain.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = Jogador.of("Jogador 1", 22, 'M');
        Jogador jogador2 = Jogador.of("Jogador 2", 24, 'M');
        Jogador jogador3 = Jogador.of("Jogador 3", 26, 'M');
        Time time = new Time("Time 1", new Jogador[]{jogador1, jogador2, jogador3});
        jogador1.setTime(time);
        jogador2.setTime(time);
        jogador3.setTime(time);

        jogador1.imprime();
        jogador2.imprime();
        jogador3.imprime();

        System.out.println("====== LOGS TIME ======");

        time.imprime();
    }
}
