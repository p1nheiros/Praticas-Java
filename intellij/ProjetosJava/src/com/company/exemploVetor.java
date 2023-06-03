package com.company;

import java.util.Scanner;

public class exemploVetor {
    public static void main(String [] args) {
        int [] temp = new int[10];
        int i = 0, j=0;
        Scanner scanner = new Scanner(System.in);

        //temp[0] = 15;
        //temp[1] = 40;
        //temp[2] = 22;
        //temp[1] = 10;

        //Lendo os elementos do meu vetor
        /*while(i < 10) {
            System.out.println("Insira um elemento no vetor na posição " + i);
            temp[i] = scanner.nextInt();
            i++;
        }
        i=0;*/

        for (int k = 0; k < 10 ; k++) {
            System.out.println("Insira um elemento no vetor na posição " + k);
            temp[k] = scanner.nextInt();
        }



        //Exibindo os elementos do meu vetor
        /*while(i < 10) {
            System.out.println(temp[i]);
            i++;
        }*/

        for (int k = 0; k < 10; k++) {
            System.out.println(temp[k]);
        }



    }


}