package core.Eassociacao.domain;

public class Time {
    private String nome;

    private Time(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static Time of(String nome){
        return new Time(nome);
    }
}
