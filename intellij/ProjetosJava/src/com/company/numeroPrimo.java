/* 2 - Leia um número inteiro e positivo e verifique se ele é primo ou não. */

package com.company;

import java.util.Scanner;

public class numeroPrimo {
    public static void main(String[] args) {
        int numero;
        boolean nPrimo = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número inteiro positivo: ");
        numero = scanner.nextInt();

        // verifica se o número é positivo
        while (numero < 0) {
            System.out.println("O valor inserido deve ser positivo. Insira um novo valor:");
            numero = scanner.nextInt();
        }

        // verifica se o número é primo
        if (numero <= 1) {
            nPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    nPrimo = false;
                    break;
                }
            }
        }

        // resultado
        if (nPrimo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

        scanner.close();
    }
}
