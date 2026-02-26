package core.Bmetodos.test;

import core.Bmetodos.domain.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Nome pessoa 1");
        pessoa.setIdade(22);
        pessoa.setSexo('F');
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getSexo());
    }
}
