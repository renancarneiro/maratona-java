package exercicios;

import java.util.Scanner;

public class Exercicio08 {
    //8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidade = scanner.nextInt();

        int[] valor = new int[quantidade];
        //todo: ajustar lógica de ordenação
        int maiorTemp;
        int menorTemp;
        for(int i=0;i<valor.length;i++){
            System.out.println(i);
            System.out.println("Digite o valor "+i);
            valor[i]= scanner.nextInt();

            for (int j=0;j<valor.length-1;j++){
                if(valor[j]<valor[j+1]){
                   menorTemp = valor[j];
                   maiorTemp = valor[j+1];

                   valor[j] = maiorTemp;
                   valor[j+1] = menorTemp;
                }
            }
        }

        for (int k = 0; k < valor.length; k++) {
            System.out.println(valor[k]);
        }

    }
}
