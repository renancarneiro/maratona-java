package core.metodos.domain;

public class Calculadora {

    public void mensagem(){
        System.out.println("============= CALCULADORA =============");
    }

    public void soma(){
        System.out.println(2 + 2);
    }

    public void somaNumeros(int a, int b){
        System.out.println("A soma dos números é: "+a + b);
    }

    public void multiplicacao(int a , int b){
        System.out.println(a * b);
    }


    public double divideNumeros(double num1, double num2){
        return num1 / num2;
    }
}
