package core.Aclasses.test;

import core.Aclasses.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "Nissan";
        carro1.modelo = "Versa";
        carro1.ano = 2018;

        Carro carro2 = new Carro();
        carro2.nome = "Fiat";
        carro2.modelo = "Modelo";
        carro2.ano = 1999;
        System.out.println("CARRO 1:");

        carro2 = carro1;

        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);
        System.out.println("\nCARRO 2: ");

        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }
}
