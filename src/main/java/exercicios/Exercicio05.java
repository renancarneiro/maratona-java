package org.example.exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu salário atual");
        double salario = scanner.nextDouble();
        double salarioBase = 1621;
        double resultado = salario / salarioBase;
        String formataValor = String.format("%.2f",resultado);
        System.out.println("Você recebe "+formataValor+" salários minimos");
    }
}
