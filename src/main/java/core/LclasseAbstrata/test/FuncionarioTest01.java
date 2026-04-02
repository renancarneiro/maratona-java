package core.LclasseAbstrata.test;


import core.LclasseAbstrata.domain.Funcionario;
import core.LclasseAbstrata.domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Nome funcionario", 2000);
        Gerente gerente = new Gerente("Nome gerente", 2000);

        System.out.println(funcionario);
        System.out.println(gerente );
    }
}
