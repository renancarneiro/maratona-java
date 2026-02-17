package exercicios.fundamentos;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro");
        int numero = scanner.nextInt();
        int sucessor = numero + 1;
        int antecessor = numero - 1;

        System.out.println("Número digitado: "+numero);
        System.out.println("O sucessor é: "+sucessor);
        System.out.println("O antecessor é: "+antecessor);
    }
}
