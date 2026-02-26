package core.Bmetodos.test;

import core.Bmetodos.domain.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.setSexo('M');
        estudante1.setIdade(15);
        estudante1.setNome("ESTUDANTE 1");

        estudante2.setSexo('F');
        estudante2.setIdade(18);
        estudante2.setNome("ESTUDANTE 2");

        estudante1.imprimir();
        estudante2.imprimir();

    }
}
