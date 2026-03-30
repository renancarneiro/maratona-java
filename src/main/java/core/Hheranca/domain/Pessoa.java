package core.Hheranca.domain;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    public String getNome() {
        return nome;
    }

    static {
        System.out.println("Inicializando Bloco de inicialização estático Pessoa");
    }

    {
        System.out.println("Bloco de inicialização Pessoa 1");
    }

    {
        System.out.println("Bloco de inicialização Pessoa 2");
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, Endereco endereco) {
        this(nome);
        this.endereco = endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua());
        System.out.println(this.endereco.getCep());
    }
}
