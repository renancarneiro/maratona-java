package exercicios.fundamentos;

import java.util.Scanner;

public class Exercicio07 {
    //7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite true ou false para o valor 1");
        boolean valor1 = scanner.nextBoolean();
        System.out.println("Digite true ou false para o valor 2");
        boolean valor2 = scanner.nextBoolean();

        System.out.println("Valor1: "+valor1);
        System.out.println("Valor2: "+valor2);

        boolean ambosVerdadeiro=valor1 & valor2;
        boolean ambosFalso = !valor1 & !valor2;

        if(ambosVerdadeiro){
            System.out.println("Ambos valores VERDADEIRO");
        }
        if(ambosFalso){
            System.out.println("Ambos valores FALSO");
        }
    }
}
