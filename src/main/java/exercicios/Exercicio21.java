package org.example.exercicios;

import java.util.Scanner;

//21 - Faça um algoritmo que efetue o cálculo do salário líquido de um professor. As informações fornecidas serão:
// valor da hora aula, número de aulas lecionadas no mês e percentual de desconto do INSS. Imprima na tela o salário líquido final.
public class Exercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor Hora/Aula");
        double valorHoraAula = scanner.nextDouble();
        System.out.println("Digite a quantidade de aulas no mês: ");
        int qntdAulasMes = scanner.nextInt();
        System.out.println("Digite o percentual do INSS em número inteiro: ");
        float percentualInss = scanner.nextFloat();

        double calculoSalario = valorHoraAula * qntdAulasMes;
        double salarioLiquido = calculoSalario - (calculoSalario * (percentualInss/100));
        String salarioLiquidoFormatado = String.format("%.2f", salarioLiquido);
        System.out.println("O salário líquido final é: "+salarioLiquidoFormatado);


    }
}
