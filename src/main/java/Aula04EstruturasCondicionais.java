package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Aula04EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 65;
        boolean isCategoriaInfantil = idade < 15;
        boolean isCategoriaJuvenil = idade >= 15 && idade < 18;
        boolean isCategoriaAdulto = idade >= 18 && idade < 60;
        String categoria;

        if (isCategoriaInfantil) {
            categoria = "CATEGORIA INFANTIL";
        } else if (isCategoriaJuvenil) {
            categoria = "CATEGORIA JUVENIL";
        } else if (isCategoriaAdulto) {
            categoria = "CATEGORIA ADULTO";
        } else {
            categoria = "CATEGORIA IDOSO";
        }
//        System.out.println(categoria);


        //operador ternário
        double valor = 12;
        String resultado = valor % 2 == 0 ? "PAR" : "IMPAR";
//        System.out.println(resultado);


        /*
        EXERCICIO TAXAS NETHERLAND 2020
        0 a 34,712 taxa 9.70%
        34,713 a 68,507 taxa 37.35%
        a partir de 68,508 taxa 49.50%
         */
        double salario = 70000;
        double taxa = 0;
        if (salario >= 0 && salario < 34712) {
            taxa = 0.097;
        } else if (salario >= 34713 && salario <= 68507) {
            taxa = 0.3735;
        } else if (salario > 68507) {
            taxa = 0.495;
        }
        double resultadoTaxa = salario * taxa;

//        System.out.println("A taxa que deve pagar é: "+resultadoTaxa);


        // ESTRUTURA DO SWITCH

        char dia = 1;
        boolean isDiaUtil = dia == 1 || dia == 7 ? false : true;

        switch (dia) {
            case 1:
                System.out.println("DOMINGO");
                break;
            case 2:
                System.out.println("SEGUNDA");
                break;
            case 3:
                System.out.println("TERÇA");
                break;
            case 4:
                System.out.println("QUARTA");
                break;
            case 5:
                System.out.println("QUINTA");
                break;
            case 6:
                System.out.println("SEXTA");
                break;
            case 7:
                System.out.println("SÁBADO");
                break;
            default:
                System.out.println("OPÇÃO INVÁLIDA");
                break;
        }
        System.out.println(isDiaUtil ? "É DIA ÚTIL": "NÃO É DIA ÚTIL");
    }

    //ASSISTIR AULA 27
}
