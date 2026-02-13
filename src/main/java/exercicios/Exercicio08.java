package org.example.exercicios;

import java.util.Scanner;

public class Exercicio08 {
    //8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantidade de valores: ");
        int quantidade = scanner.nextInt();
        int[] valor = new int[quantidade];

        int temp;
        for (int i = 0; i < valor.length; i++) {
            System.out.println("Digite o número do valor " + (i+1));
            valor[i] = scanner.nextInt();
        } {

        }

        for (int j = 0; j < valor.length; j++) {
            for (int k = 0; k < valor.length; k++) {
                if(valor[j]>valor[k]){
                    temp = valor[k];
                    valor[k] = valor[j];
                    valor[j]=temp;
                }
            }
        }

        System.out.println("========= ORDENAÇÃO =========");

        for (int resultado : valor) {
            System.out.println(resultado);
        }

    }
}
