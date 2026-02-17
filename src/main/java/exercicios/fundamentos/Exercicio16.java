package exercicios.fundamentos;

import java.util.Scanner;

//16 - Faça um algoritmo que leia três valores que representam os três lados de um triângulo e verifique se são válidos, determine se o triângulo é
//
//equilátero 3 lados iguais, isósceles pelo menos 2 lados iguais ou escaleno todos lados diferentes.
public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor do lado A do triangulo:");
        int a = scanner.nextInt();

        System.out.println("Informe o valor do lado B do triangulo:");
        int b = scanner.nextInt();

        System.out.println("Informe o valor do lado C do triangulo:");
        int c = scanner.nextInt();

        boolean equilatero = (a == b) & (a == c) & (b == c);
        boolean escaleno = (a != b) & (a != c) & (b != c);
        boolean isoscele = !(equilatero | escaleno);

        String mensagem= "";
        if(equilatero) mensagem = "Equilatero";
        if(escaleno) mensagem = "Escaleno";
        if(isoscele) mensagem = "Isósceles";

        System.out.println("O triangulo é: "+mensagem);
    }
}
