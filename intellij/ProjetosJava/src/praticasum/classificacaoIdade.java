package praticasum;

import java.util.Scanner;

public class classificacaoIdade {
    public static void main(String[] args) {
        int idade;
        Scanner scanner = new Scanner(System.in); // Criação de um objeto de leitura associado a variavel scanner
        System.out.println("Escreva sua idade");
        idade = scanner.nextInt();

        System.out.println("A idade da pessoa é igual a " + idade + ".");

        if (idade >= 5 && idade <= 7) {
            System.out.println("Sua classificação é infantil A");
        } else if (idade >= 8 && idade <= 10) {
            System.out.println("Sua classificação é infantil B");
        } else if (idade >= 11 && idade <= 13) {
            System.out.println("Sua classificação é juvenil A");
        } else if (idade >= 14 && idade <= 17) {
            System.out.println("Sua classificação é juvenil B");
        } else {
            System.out.println("Sua classificação é adulto");
        }
        scanner.close();
    }
}