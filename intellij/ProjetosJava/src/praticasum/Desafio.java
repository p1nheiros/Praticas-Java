package praticasum;

import java.util.Scanner;

public class Desafio {

    public static void mostrarMatriz(String[][] matriz, int linhas, int colunas) {
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void preencherMatriz(String[][] matriz, int linhas, int colunas) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.println("Insira uma informação textual na matriz:");
                matriz[i][j] = scanner.nextLine();
            }
        }
    }

    public static void main(String[] args) {
        int qtdLinhas = 5;
        int qtdColunas = 3;
        String [][] listaDeCompra = new String[qtdLinhas][qtdColunas];
        System.out.println("Matriz após a sua criação:");
        mostrarMatriz(listaDeCompra, qtdLinhas, qtdColunas);

        preencherMatriz(listaDeCompra, qtdLinhas, qtdColunas);
        System.out.println("Matriz após preenchimento");
        mostrarMatriz(listaDeCompra, qtdLinhas, qtdColunas);



    }
}