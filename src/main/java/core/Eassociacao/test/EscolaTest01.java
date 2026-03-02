package org.example.core.Eassociacao.test;

import org.example.core.Eassociacao.domain.Escola;
import org.example.core.Eassociacao.domain.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Professor 1");
        Professor professor2 = new Professor("Professor 2");
        Professor professor3 = new Professor("Professor 3");

        Professor[] professores = new Professor[]{professor1, professor2, professor3};

        Escola escola = new Escola("Nova escola", professores);
        escola.imprime();
    }
}
