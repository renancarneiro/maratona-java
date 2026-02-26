package core.Bmetodos.domain;

public class Calculadora {

    public void mensagem() {
        System.out.println("============= CALCULADORA =============");
    }

    public void soma() {
        System.out.println(2 + 2);
    }

    public void somaNumeros(int a, int b) {
        System.out.println("A soma dos números é: " + a + b);
    }

    public void multiplicacao(int a, int b) {
        System.out.println(a * b);
    }


    public double divideNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não existe divisão por zero");
            return 0;
        }
        return num1 / num2;
    }

    public void alteraValorNumero(int num1, int num2) {
        num1 = 99;
        num2 = 22;

        System.out.println("Dentro do método alteraValorNumero");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }

    public void somaArrays(int... numeros){
        int soma = 0;
        for(int num: numeros){
            soma+=num;
        }
        System.out.println("A soma dos arrays é: "+soma);
    }
}
