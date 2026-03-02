package core.Eassociacao.domain;

public class Jogador {
    private String nome;
    private int idade;
    private char sexo;

    private Jogador(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public static Jogador of(String nome, int idade, char sexo){
        return new Jogador(nome, idade,sexo);
    }

    public void imprime(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Sexo: "+this.sexo);
    }
}
