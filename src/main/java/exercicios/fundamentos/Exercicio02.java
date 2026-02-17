package exercicios.fundamentos;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mensagem = "";

        System.out.println("Digite o valor do número: ");
        double numero = scanner.nextDouble();

        boolean impar = numero%2 != 0;
        boolean par = numero%2 == 0;
        boolean negativo = numero < 0;
        boolean positivo = numero > 0;

        if(impar) mensagem = "IMPAR";
        if(par) mensagem = "PAR";
        if(negativo) mensagem = mensagem + " NEGATIVO";
        if(positivo) mensagem = mensagem + " POSITIVO";

        System.out.println("O número: "+numero+" é: "+mensagem);

    }
}
