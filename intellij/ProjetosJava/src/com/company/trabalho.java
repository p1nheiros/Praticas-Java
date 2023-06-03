package com.company;

import java.util.Scanner;

public class trabalho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanho, operacao;

        //to do (Garantir que o tamanho seja positivo e inteiro)
        System.out.println("\nInforme o tamanho do vetor:");
        tamanho = scanner.nextInt();

        //int [] vetor;
        String[] vetor = new String[tamanho];

        do {
            System.out.println("==============================================================");
            System.out.println("| Operação 1 | Inserir todos elementos do vetor.             |");
            System.out.println("| Operação 2 | Mostrar todos elementos do vetor.             |");
            System.out.println("| Operação 3 | Buscar um elemento do vetor pelo seu índice.  |");
            System.out.println("| Operação 4 | Remover um elemento do vetor pelo seu índice. |");
            System.out.println("| Operação 5 | Finalizar o programa.                         |");
            System.out.println("==============================================================\n");

            //to do (Garantir que o usuário informe uma operação válida)
            System.out.println("Informe a operação desejada:");
            operacao = scanner.nextInt();

            if (operacao == 1) {
                //operacao 1.
                for (int i = 0; i < tamanho; i++) {
                    System.out.println("Insira um valor no vetor na posição " + i + ".");
                    vetor[i] = scanner.next();
                }
            } else if (operacao == 2) {
                //operacao 2.
                for (int i = 0; i < tamanho; i++) {
                    System.out.println("vetor[" + i + "] = " + vetor[i]);
                }
            } else if (operacao == 3) {
                //operacao 3.
                System.out.println("Insira um índice para encontrar o elemento desejado:");
                int i = scanner.nextInt();
                if (i >= 0 && i < tamanho) {
                    String elemento = vetor[i];
                    System.out.println("O elemento encontrado no índice " + i + " foi o " + elemento);
                } else {
                    System.out.println("O índice inserido está inválido, insira um índice valido:");
                }
            }
            //operação 5.
        } while (operacao != 5);
        }
    }
