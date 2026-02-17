package exercicios.fundamentos;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int a = scanner.nextInt();
        System.out.println("Digite o valor de B");
        int b = scanner.nextInt();

        int resultado;
        String mensagem;
        if (a == b) {
            resultado = a + b;
            mensagem = "A soma dos valores é: ";
        } else {
            resultado = a * b;
            mensagem = "A multiplicação dos valores é: ";
        }
        System.out.println(mensagem+resultado);

    }
}
