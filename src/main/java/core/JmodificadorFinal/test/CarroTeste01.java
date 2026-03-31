package core.JmodificadorFinal.test;

import core.JmodificadorFinal.domain.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
//        Carro.VELOCIDADE_LIMITE = 200; como a variável estática está com final não é permitido fazer alteração no valor
        System.out.println(Carro.VELOCIDADE_LIMITE);

        Carro carro = new Carro();
        carro.imprimir();
    }
}
