package core.Csobrecargametodos.domain;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;

    public void init(String nome, String tipo){
        this.nome = nome;
        this.tipo = tipo;
    }

    //sobrecarga de metodo: o metodo tem o mesmo nome, mas a quantidade ou tipo diferente de parametro
    public void init(String nome, String tipo, int episodios){
        this.init(nome, tipo);
        this.episodios = episodios;
    }

    public void imprime(){
        System.out.println("Tipo: "+this.tipo);
        System.out.println("Episodios: "+this.episodios);
        System.out.println("nome: "+this.nome);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo;
    }

    public void setEpisodios(int episodios){
        this.episodios = episodios;
    }

    public int getEpisodios() {
        return episodios;
    }
}
