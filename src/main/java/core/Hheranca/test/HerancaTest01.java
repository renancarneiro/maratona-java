package core.Hheranca.test;

import core.Hheranca.domain.Endereco;
import core.Hheranca.domain.Funcionario;
import core.Hheranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco enderecoPessoa1 = new Endereco();
        enderecoPessoa1.setCep("55502312");
        enderecoPessoa1.setRua("Passagem bom jesus");


        //Pessoa TEM Endereco -- associação
        //Funcionario É uma pessoa -- Herança

        Pessoa pessoa1 = new Pessoa("Nome pessoa1",enderecoPessoa1);
        pessoa1.setCpf("02328832323");
        pessoa1.imprime();

        Endereco enderecoFuncionario1 = new Endereco();
        enderecoFuncionario1.setCep("222222222");
        enderecoFuncionario1.setRua("Passagem funcionario");

        System.out.println("------------------------------------");
        Funcionario funcionario1 = new Funcionario("Funcionario 1");
        funcionario1.setSalario(1600);
        funcionario1.setCpf("000000000");
        funcionario1.setEndereco(enderecoFuncionario1);
        funcionario1.imprime();
        funcionario1.relatorioPagamento();
    }
}
