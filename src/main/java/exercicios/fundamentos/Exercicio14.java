package exercicios.fundamentos;

import java.util.Scanner;

//14 - Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A e imprima na tela os valores.
public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de A:");
        int a = scanner.nextInt();
        System.out.println("Digite o valor de B:");
        int b = scanner.nextInt();
        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("O valor de A digitado foi: "+b);
        System.out.println("O valor de B digitado foi: "+a);
        System.out.println("O valor trocado é: A="+a+" B="+b);
    }
}
