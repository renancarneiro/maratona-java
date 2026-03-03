package core.Eassociacao.domain;

import core.Eassociacao.domain.Jogador;

public class Time {
    private String nome;
    //exemplo de associação bidirecional
    private Jogador[] jogadores;

    private Time(String nome) {
        this.nome = nome;
    }

    public Time(String nome, Jogador[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static Time of(String nome) {
        return new Time(nome);
    }

    public void imprime() {
        System.out.println("nome: " + nome);
        if (jogadores.length > 0) {
            for (Jogador jogador : jogadores) {
                jogador.imprime();
            }
        }
    }

}
