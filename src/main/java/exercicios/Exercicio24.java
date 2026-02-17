package exercicios;

import java.util.Scanner;

//22 - Faça um algoritmo que leia dois valores inteiros A e B, imprima na tela o quociente e o resto da divisão inteira entre eles.
public class Exercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor 1");
        int valor1 = scanner.nextInt();
        System.out.println("Digite o valor 2");
        int valor2 = scanner.nextInt();

        int quociente = valor1/valor2;
        int resto = valor1%valor2;

        System.out.println("Quociente: "+quociente);
        System.out.println("Resto: "+resto);
    }
}
