package core.Bmetodos.test;

import core.Bmetodos.domain.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2;

        calculadora.alteraValorNumero(num1, num2);
        System.out.println("dentro da CalculadoraTest03");
        System.out.println("Num1: "+num1);
        System.out.println("Num2: "+num2);

    }
}
