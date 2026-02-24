package core.metodos.test;

import core.metodos.domain.Funcionario;

public class FuncionarioTest03 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        double[] salario = {1300,4000,5000};
        funcionario.setIdade(21);
        funcionario.setNome("Laura");
        funcionario.setSalario(salario);

        funcionario.imprimirDados();
        funcionario.imprimirMediaSalario();
    }
}
