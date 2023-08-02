/* 4 - Posicione o elemento de menor valor na primeira posição do vetor definido anteriormente. */

package praticasum;

import java.util.Scanner;

public class posicaoElemento {
    public static void main(String[] args) {
        int tamanho, i;
        int [] vetor;
        Scanner scanner = new Scanner(System.in);

                System.out.println("Insira o tamanho do vetor: ");
        tamanho = scanner.nextInt();

        vetor = new int [tamanho];

        i = 0;
        while (i < tamanho) {
            vetor [i] = scanner.nextInt();
            i++;
        }

    }
}
