package exercicios.fundamentos;

import java.util.Scanner;

/**
 * 9 - Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o seu peso e sua altura e imprima na tela sua condição
 * <p>
 * de acordo com a tabela abaixo:
 * <p>
 * Fórmula do IMC = peso / (altura) ²
 * <p>
 * Tabela Condições IMC
 * <p>
 * <p>
 * <p>
 * Abaixo de 18,5   | Abaixo do peso
 * <p>
 * Entre 18,6 e 24,9 | Peso ideal (parabéns)
 * <p>
 * Entre 25,0 e 29,9 | Levemente acima do peso
 * <p>
 * Entre 30,0 e 34,9 | Obesidade grau I
 * <p>
 * Entre 35,0 e 39,9 | Obesidade grau II (severa)
 * <p>
 * Maior ou igual a 40 | Obesidade grau III (mórbida)
 */
public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua altura:");
        float altura = scanner.nextFloat();

        System.out.println("Digite seu peso:");
        float peso = scanner.nextFloat();

        float imc = peso / (altura * 2);

        String mensagem = getString(imc);
        System.out.println("Sua condição é: "+mensagem);
    }

    private static String getString(float imc) {
        boolean abaixoPeso = imc < 18.5;
        boolean pesoIdeal = imc >= 18.6 && imc <= 24.9;
        boolean levementeAcimaDoPeso = imc > 25 && imc < 29.9;
        boolean obesidadeGrauI = imc >=30 && imc <= 39.9;
        boolean obesidadeGrauII = imc > 35 && imc <= 39.9;
        boolean obesidadeGrauIII = imc >= 40;

        String mensagem = "";

        if(abaixoPeso) mensagem = "ABAIXO DO PESO";
        if(pesoIdeal) mensagem = "PESO IDEAL";
        if(levementeAcimaDoPeso) mensagem = "LEVAMENTE ACIMA DO PESO";
        if(obesidadeGrauI) mensagem = "OBESIDADE GRAU I";
        if(obesidadeGrauII) mensagem = "OBESIDADE GRAU II";
        if(obesidadeGrauIII) mensagem = "OBESIDADE GRAU III";

        System.out.println("IMC: "+String.format("%.2f", imc));
        return mensagem;
    }
}
