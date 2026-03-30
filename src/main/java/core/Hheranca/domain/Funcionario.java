package core.Hheranca.domain;

public class Funcionario extends Pessoa {
    private double salario;

    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }


    static{
        System.out.println("Inicializando Bloco de inicialização estático Funcionario");
    }
    {
        System.out.println("Bloco de inicialização Funcionario 1");
    }
    {
        System.out.println("Bloco de inicialização Funcionario 2");
    }
    public Funcionario(String nome){
        super(nome);
        System.out.println("Construtor construtor");
        this.salario = 0;
    }

    public void relatorioPagamento(){
        System.out.println("O salário do CPF: "+this.cpf + " É: "+this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}

