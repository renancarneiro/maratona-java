package org.example.core.Eassociacao.test;

import java.util.Scanner;

public class LeituraScannerTest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = scanner.nextLine();
        System.out.println("Nome digitado: "+nome);
    }
}
