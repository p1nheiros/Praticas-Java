package com.company;

import java.util.Scanner;

public class trabalho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanho, operacao;

        //to do (Garantir que o tamanho seja positivo e inteiro)
        System.out.println("\nInforme o tamanho do vetor:");
        tamanho = scanner.nextInt();

        //garante que o vetor tenha um comprimento inteiro e positivo
        while (tamanho <= 0 || tamanho % 1  != 0){
            System.out.println("Voce inseriu um tamanho inválido para o vetor, insira um valor correto!");
            System.out.println("\nInforme um tamanho válido para o vetor:");
            tamanho = scanner.nextInt();
        }

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

            switch (operacao) {
                case 1:
                    // Operação 1.
                    for (int i = 0; i < tamanho; i++) {
                        System.out.println("Insira um valor no vetor na posição " + i + ":");
                        vetor[i] = scanner.next();
                    }

                    //imprime o vetor
                    System.out.print("O vetor inserido ficou assim: [");
                    for (int i = 0; i < tamanho; i++) {
                        System.out.print(vetor[i]);
                        if (i < tamanho - 1) {
                            System.out.print(", ");
                        }
                    }
                    System.out.println("]");
                    break;

                    //opção 2
                case 2:
                    if (vetor[0] == null){
                        System.out.println("Voce não pode acessar essa opção, pois o vetor está vazio");
                        System.out.println("Volte na opção 1 e preencha o vetor...");
                    }
                    else {
                        for (int i = 0; i < tamanho; i++) {
                            System.out.println("vetor[" + i + "] = " + vetor[i]);
                        }
                    }
                    break;

                    //opcao 3
                case 3:
                    // Operação 3.
                    if (vetor[0] == null){
                        System.out.println("O vetor está vazio, volte na opção 1 e preencha o vetor para poder buscar um indice");
                    }
                    else {
                        System.out.println("Insira um índice para encontrar o elemento desejado:");
                        int i = scanner.nextInt();
                        if (i >= 0 && i < tamanho) {
                            String elemento = vetor[i];
                            System.out.println("O elemento encontrado no índice " + i + " foi o " + elemento);
                        } else {
                            System.out.println("O índice inserido está inválido. Insira um índice válido.");
                            System.out.println("Insira um índice para encontrar o elemento desejado:");
                            int e = scanner.nextInt();
                            if (e >= 0 && e < tamanho) {
                                String elemento = vetor[e];
                                System.out.println("O elemento encontrado no índice " + e + " foi o " + elemento);
                            }
                        }
                    }
                    break;

                    //opcao 4
                case 4:
                    System.out.println("Digite o índice do elemento que deseja remover do vetor:");
                int indiceRemover = scanner.nextInt();

                if (vetor[0] == null){
                    System.out.println("O vetor está vazio, volte na opção 1 e preencha");
                }
                else {
                    if (indiceRemover >= 0 && indiceRemover < tamanho) {

                        for (int i = indiceRemover; i < tamanho - 1; i++) {
                            vetor[i] = vetor[i + 1];
                        }
                        vetor[tamanho - 1] = null;

                        String[] novoVetor = new String[tamanho - 1];
                        for (int i = 0; i < novoVetor.length; i++) {
                            novoVetor[i] = vetor[i];
                        }
                        vetor = novoVetor;

                        int tamanho2 = tamanho;

                        System.out.print("O vetor final ficou assim: [");
                        for (int i = 0; i < tamanho2 - 1; i++) {
                            System.out.print(vetor[i]);
                            if (i < tamanho2 - 2) {
                                System.out.print(", ");
                            }
                        }
                        System.out.println("]");
                    } else {
                        System.out.println("Índice inválido. Insira um valor válido.");
                    }
                }
                break;

                //opção 5
                case 5:
                    System.out.println("Encerrando o programa...");
                    return;

                default:
                    System.out.println("Operação inválida. Insira um valor válido (1 a 5).");
                    break;
            }

            //operação 5.
        } while (operacao != 5);
        }
    }
