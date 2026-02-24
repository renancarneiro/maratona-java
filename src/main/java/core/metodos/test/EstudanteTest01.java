package core.metodos.test;

import core.metodos.domain.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.sexo = 'M';
        estudante1.idade = 21;
        estudante1.nome = "ESTUDANTE 1";

        estudante2.sexo = 'F';
        estudante2.idade = 18;
        estudante2.nome = "ESTUDANTE 2";

        estudante1.imprimir();
        estudante2.imprimir();

    }
}
