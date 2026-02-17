package exercicios.fundamentos;

import java.util.Scanner;

// 13 - Faça algoritmo que leia o nome e a idade de uma pessoa e imprima na tela o nome da pessoa e se ela é maior ou menor de idade.
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome da pessoa:");
        String nome = scanner.nextLine();
        System.out.println("Digite a idade da pessoa:");
        int idade = scanner.nextInt();

        if(idade>=18){
            System.out.println(nome+", é maior de idade");
        }else{
            System.out.println(nome+", é menor de idade");
        }
    }
}
