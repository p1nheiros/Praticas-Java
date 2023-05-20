/* 3 - Leia um número que determine o tamanho de um vetor. Após isso, preencha os espaços disponíveis desse vetor e mostre os elementos. */

package com.company;

import java.util.Scanner;

public class exemploVetor {
    public static void main(String[] args) {
        int[] temp = new int[10];
        int i = 0, j=0;
        Scanner scanner = new Scanner(System.in);

        temp[0] = 15;
        temp[1] = 40;
        temp[2] = 22;
        temp[1] = 10;

        // lendo elementos do vetor
        while(i < 10) {
            System.out.println("Insira um elemento no vertor " + i);
            temp[i] = scanner.nextInt();
            i++;
            /*i=0;*/
        }

        for (int k = 0; k < 10 ; k++) {
            System.out.println("Insira um elemento no vertor " + k);
            temp[k] = scanner.nextInt();
        }

        // lendo elementos do vetor
        while (i < 10) {
            System.out.println(temp[i]);
            // i = i + 1;
            // i += 1;
            i++;

            for (int k = 0; k < 10; k++) {
                System.out.println(temp[k]);
            }

            scanner.close();
        }
    }
}