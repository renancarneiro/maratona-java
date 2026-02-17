package exercicios.fundamentos;

import java.util.Scanner;

//https://www.dio.me/articles/lista-de-exercicios-para-treinar-logica-de-programacao
//Exercicio 1
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("============SOMA A + B + C ==============");

        System.out.println("Digite o valor de A");
        int a = scanner.nextInt();
        System.out.println("Digite o valor de B");
        int b = scanner.nextInt();
        System.out.println("Digite o valor de C");
        int c = scanner.nextInt();

        if((a + b) < c){
            System.out.println("A soma de A + B é menor que C");
        }else if((a + b) > c) {
            System.out.println("A soma de A + B é maior que C");
        }else {
            System.out.println("A soma de A + B é igual a C");
        }
    }
}
