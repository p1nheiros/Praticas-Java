/* 1 - Leia 5 números inteiros e positivos e os ordene de forma crescente. */

package com.company;

import java.util.Scanner;

public class ordenacaoDeNumeros {

    public static void main(String[] args) {
        int n1, n2, n3, n4, n5, aux;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva o primeiro número: ");
        n1 = scanner.nextInt();
        while (n1 < 0) {
            System.out.println("O valor inserido deve ser positivo. Insira um novo valor:");
            n1 = scanner.nextInt();
        }

        System.out.println("Escreva o segundo número: ");
        n2 = scanner.nextInt();
        while (n2 < 0) {
            System.out.println("O valor inserido deve ser positivo. Insira um novo valor:");
            n2 = scanner.nextInt();
        }

        System.out.println("Escreva o terceiro número: ");
        n3 = scanner.nextInt();
        while (n3 < 0) {
            System.out.println("O valor inserido deve ser positivo. Insira um novo valor:");
            n3 = scanner.nextInt();
        }

        System.out.println("Escreva o quarto número: ");
        n4 = scanner.nextInt();
        while (n4 < 0) {
            System.out.println("O valor inserido deve ser positivo. Insira um novo valor:");
            n4 = scanner.nextInt();
        }

        System.out.println("Escreva o quinto número: ");
        n5 = scanner.nextInt();
        while (n5 < 0) {
            System.out.println("O valor inserido deve ser positivo. Insira um novo valor:");
            n5 = scanner.nextInt();
        }

        // Definindo n1 como menor valor
        if (n2 < n1) {
            aux = n1;
            n1 = n2;
            n2 = aux;
        }
        if (n3 < n1) {
            aux = n1;
            n1 = n3;
            n3 = aux;
        }
        if (n4 < n1) {
            aux = n1;
            n1 = n4;
            n4 = aux;
        }
        if (n5 < n1) {
            aux = n1;
            n1 = n5;
            n5 = aux;
        }

        // Definindo n2 como o segundo menor valor
        if (n3 < n2) {
            aux = n2;
            n2 = n3;
            n3 = aux;
        }
        if (n4 < n2) {
            aux = n2;
            n2 = n4;
            n4 = aux;
        }
        if (n5 < n2) {
            aux = n2;
            n2 = n5;
            n5 = aux;
        }

        // Definindo n3 como o terceiro menor valor
        if (n4 < n3) {
            aux = n3;
            n3 = n4;
            n4 = aux;
        }
        if (n5 < n3) {
            aux = n3;
            n3 = n5;
            n5 = aux;
        }

        // Definindo o maior valor
        if (n5 < n4) {
            aux = n4;
            n4 = n5;
            n5 = aux;
        }

        System.out.println(
                "Os valores ordenados de forma crescente são: " + n1 + "," + n2 + "," + n3 + "," + n4 + "," + n5);

        scanner.close();
    }
}