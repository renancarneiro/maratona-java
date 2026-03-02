package org.example.core.Eassociacao.domain;

public class Escola {
    private String nome;
    private Professor[] professores;

    public Escola(String nome) {
        this.nome = nome;
    }

    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        if (professores.length > 0) {
            System.out.println("Professores: ");
            for (Professor professor : professores) {
                System.out.println(professor.getNome());
            }
        }
    }
}
