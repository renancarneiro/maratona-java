package core.JmodificadorFinal.test;

import core.JmodificadorFinal.domain.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
//        Carro.VELOCIDADE_LIMITE = 200; como a variável estática está com final não é permitido fazer alteração no valor
        Carro carro = new Carro();
        carro.COMPRADOR.setNome("Nome do comprador");
        System.out.println(carro.COMPRADOR);

        carro.imprimir();
    }
}
