package exercicios.fundamentos;

import java.util.Scanner;

//17 - Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau Celsius. Imprima na tela as duas temperaturas.
//
//Fórmula: C = (5 * ( F-32) / 9)
public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em Fahrenheit");
        float temperatura = scanner.nextFloat();
        float celcius = (5 * (temperatura-32) / 9);

        System.out.println("A temperatura convertida de Fahrenheit para Celcius é: "+celcius);
    }
}
