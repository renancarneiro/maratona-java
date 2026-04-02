package core.LclasseAbstrata.domain;

public class Gerente extends Funcionario{

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calcularBonusAbstrato() {

    }

    @Override
    public void imprime() {
        System.out.println("Imprime do gerente");
    }

}
