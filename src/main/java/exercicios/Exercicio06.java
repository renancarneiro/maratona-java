package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    //6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um valor: ");
        double valor = scanner.nextDouble();
        double reajuste = valor + (valor * 0.05);
        System.out.println("O valor: "+valor+" com reajuste de 5% é: R$ "+reajuste);
    }
}
