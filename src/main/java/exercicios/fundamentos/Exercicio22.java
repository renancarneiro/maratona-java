package exercicios.fundamentos;

import java.util.Scanner;

/**
 * 22 - Faça um algoritmo que calcule a quantidade de litros de combustível gastos em uma viagem, sabendo que o carro faz 12km com um litro.
 * Deve-se fornecer ao usuário o tempo que será gasto na viagem a sua velocidade média, distância percorrida
 * e a quantidade de litros utilizados para fazer a viagem.
 */
public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tempo da viagem em minutos: ");
        float tempoViagem = scanner.nextInt();


        System.out.println("Digite a velocidade média: ");
        float velocidadeMedia = scanner.nextFloat();

        int qntdKmPorLitro = 12;

        float calculoDistancia = (tempoViagem / 60) * velocidadeMedia;
        float calculoEmHora = tempoViagem / 60;
        float calculoLitrosGastos = calculoDistancia / qntdKmPorLitro;

        System.out.println("Calculo em horas: "+calculoEmHora);
        System.out.println("Quantidade de litros utilizados para fazer a viagem: "+calculoLitrosGastos);
        System.out.println("Distancia da viagem: "+calculoDistancia + "KM");
    }
}
