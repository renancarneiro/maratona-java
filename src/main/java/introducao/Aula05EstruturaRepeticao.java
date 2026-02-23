package introducao;

public class Aula05EstruturaRepeticao {
    public static void main(String[] args) {

//        CountWhile();

//        CountDoWhile();

//        CountFor();

//        CountForToOneMillion();

//        exercicioFor();


        exercicioParcelaCarro();

    }

    /*
      Dado o valor de um carro, até quantas parcelas ele pode ser parcelado
      Condição valorParcela >= 1000
     */
    private static void exercicioParcelaCarro() {

        double valorCarro = 57000;
        double valorParcela;
        System.out.println("VALOR CARRO: R$" + valorCarro);
        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) break;
            System.out.printf("\n" + parcela + "X R$ %.2f ", valorParcela);

        }
    }

    /*
     Imprima os primeiros 25 números de um dado valor, por exemplo: 50
     */
    private static void exercicioFor() {


        int valor = 75;

        for (int i = valor; i <= valor + 25; i++) {
            System.out.println("valor: " + i);
        }
    }

    private static void CountForToOneMillion() {
        for (int i = 0; i <= 1000000; ++i) {

            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    private static void CountFor() {
        for (int i = 0; i < 10; i++) {
            System.out.println("for" + i);
        }
    }

    private static void CountDoWhile() {
        int countDo = 0;


        do {
            countDo++;
            System.out.println(countDo);
        } while (countDo < 100);
    }

    private static void CountWhile() {
        int count = 0;

        while (count < 100) {
            count++;
            System.out.println(count++);
        }
    }
}
