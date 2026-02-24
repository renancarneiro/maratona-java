package core.metodos.test;

import core.metodos.domain.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int a = 23;
        int b = 0;

        calculadora.somaNumeros(a, b);
        calculadora.multiplicacao(a,b);

        double result = calculadora.divideNumeros(a,b);
        System.out.println(result);
    }
}
