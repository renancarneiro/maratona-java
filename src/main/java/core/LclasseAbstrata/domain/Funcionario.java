package core.LclasseAbstrata.domain;

public abstract class Funcionario extends Pessoa{
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double calculoBonusConcreto(){
        return this.salario + (this.salario * 0.2);
    }

    public abstract void calcularBonusAbstrato();

}
