package org.example;

public class Aula03Operadores {
    public static void main(String[] args) {
        //Operadores aritiméticos:  + - / *
        int numero1 = 10;
        double numero2= 4;

        double soma = numero1 + numero2;
        double subtracao = numero1 - numero2;
        double divisao = numero1 / numero2;
        double multiplicacao = numero1 * numero2;
        System.out.println("=========== OPERADORES ARITIMÉTICOS ===========");
        System.out.println("Soma: "+soma);
        System.out.println("Subtração: "+subtracao);
        System.out.println("Divisão: "+divisao);
        System.out.println("Multiplicacao: "+multiplicacao);
        System.out.println("================================================");

        System.out.println("=========== OPERADORES RELACIONAIS ===========");

        //Operadores relacionais: %
        int resto = 21 % 2;
        System.out.println("Resto "+resto);

        // < > <= >= == !=
        boolean isIgual = numero1 == numero2;
        boolean isDiferente = numero1 != numero2;
        boolean isNumero1MenorNumero2 = numero1 < numero2;
        boolean isNumero1MenorOuIgualNumero2 = numero1 <= numero2;
        System.out.println("isIgual: "+isIgual);
        System.out.println("isDiferente: "+isDiferente);
        System.out.println("isNumero1MenorNumero2: "+isNumero1MenorNumero2);
        System.out.println("isNumero1MenorOuIgualNumero2: "+isNumero1MenorOuIgualNumero2);
        System.out.println("================================================");

        //Operadores lógicos
        // && (AND)   || (OR) || ! (NEGACAO)
        /*
        EXERCÍCIO PARA DOAÇÃO DE SANGUE
        » Ter entre 16 e 69 anos, se menor de 18 ter formulário de autorização
        » Pesar no mínimo 50kg.
         */

        int idade=17;
        boolean isFormularioAutorizacaoPreenchido=false;
        float peso=55;

        boolean isPessoaAutorizadaDoacaoSangue = (idade >= 16 && idade <= 69 || isFormularioAutorizacaoPreenchido && idade >= 16) && peso >= 50;

        System.out.println("IDADE: "+idade+" anos");
        System.out.println("PESO: "+peso+" kg");
        System.out.println("FORMULARIO AUTORIZADO: "+isFormularioAutorizacaoPreenchido);
        System.out.println("RESULTADO DA ANÁLISE: "+isPessoaAutorizadaDoacaoSangue);

        //OPERADORES DE ATRIBUIÇÃO
        // = += -= *= /= %=
        // = += -= *= /= %=
        double bonus = 1800; // 1800
        bonus += 1000; // 2800
        System.out.println("bonus += "+bonus);
        bonus -= 1000; // 1800
        System.out.println("bonus -=  "+bonus);
        bonus *= 2; // 3600
        System.out.println("bonus *= "+bonus);
        bonus /= 2; // 1800
        System.out.println("bonus /= "+bonus);
        bonus %= 11; //
        System.out.println("bonus %= "+bonus);
        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador += 1; // contador = contador + 1;
        contador++;
        contador--;
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println(++contador2);


        //testar o codigo acima
    }
}
