package org.example.exercicios;

import java.util.Scanner;

/**
 *  12 - Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago, conforme a escolha da forma de pagamento
 *
 *  pelo comprador e imprima na tela o valor final do produto a ser pago. Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.
 *
 *
 *
 *  Tabela de Código de Condições de Pagamento
 *
 *
 *
 *  1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
 *
 *  2 - À Vista no cartão de crédito, recebe 10% de desconto
 *
 *  3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
 *
 *  4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%
 */
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float calculo = 0;
        String condicao = "";

        System.out.println("Digite o valor do produto");
        float valor = scanner.nextFloat();
        System.out.println("Digite o método de pagamento:");
        System.out.println("1 - DINHEIRO OU PIX");
        System.out.println("2 - CARTÃO DE CRÉDITO");
        int opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                calculo = valor - (valor * 0.15F);
                condicao = "desconto de 15%";
                break;
            case 2:
                System.out.println("Informe a opção:");
                System.out.println("1 - AVISTA");
                System.out.println("2 - PARCELAMENTO 2X");
                System.out.println("3 - PARCELAMENTO 3X");
                int opcaoCredito = scanner.nextInt();

                if(opcaoCredito == 1){
                    calculo = valor - (valor * 0.10F);
                    condicao = "15% de desconto";
                }
                if(opcaoCredito == 2){
                    calculo = valor;
                    condicao = "preço normal";
                }
                if(opcaoCredito == 3){
                    calculo = valor + (valor * 0.1F);
                    condicao = "acrescimo";
                }
                break;
            default:
                System.out.println("OPÇÃO INVÁLIDA!");
        }

        System.out.println("Com "+condicao+ " o preço final do produto é: "+calculo);

    }
}
