package core.Eassociacao.domain;

public class Jogador {
    private String nome;
    private int idade;
    private char sexo;
    private Time time;

    private Jogador(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public static Jogador of(String nome, int idade, char sexo){
        return new Jogador(nome, idade,sexo);
    }

    public void imprime(){
        System.out.println("=======================");
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Sexo: "+this.sexo);
        if(this.time != null) System.out.println("Time: "+this.time.getNome());
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
