package org.example.exercicios;

import java.util.Scanner;

// 10 - Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] notas = new float[3];
        float somaNotas = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota "+(i+1)+" do aluno");
            notas[i] = scanner.nextFloat();
            somaNotas+=notas[i];
        }
        float media = somaNotas / notas.length;

        System.out.println("A média do aluno é: "+media);
    }
}
