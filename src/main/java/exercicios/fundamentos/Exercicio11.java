package exercicios.fundamentos;

import java.util.Scanner;

//  11 - Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas, imprima na tela o nome do aluno e
//
// se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.
public class Exercicio11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float[] notas = new float[4];
        float somaNotas = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota "+(i+1));
            notas[i] = scanner.nextFloat();
            somaNotas+=notas[i];
        }

        float media = somaNotas / notas.length;

        boolean aprovado = media >= 7;

        System.out.println("A média final do aluno é: "+media);
        if(aprovado){
            System.out.println("Aluno aprovado!");
        }else {
            System.out.println("Aluno reprovado!");
        }
    }
}
