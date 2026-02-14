package org.example.exercicios;

import java.util.Scanner;

//19 - Faça um algoritmo que imprima na tela a tabuada de 1 até 10.
public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número da tabuada:");
        int num = scanner.nextInt();
        int[] numero = new int[10];

        for (int i = 0; i <= numero.length; i++) {
            System.out.println(num+" X "+i+ " = "+ (num*i));
        }

    }

}
