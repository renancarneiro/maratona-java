package core.Dblocoinicializacao.test;

import core.Dblocoinicializacao.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("Teste1",200);
        Carro c2 = new Carro("Teste2",200);
        Carro c3 = new Carro("Teste3",200);

        c1.imprime();
        c2.imprime();
        c3.imprime();

    }

}
