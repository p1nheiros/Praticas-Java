import java.util.ArrayList; // armazena os números
import java.util.Collections; // ordena os números
import java.util.Scanner; // lê a entrada do usuário

public class ordenaNumeros {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(); // armazena números inteiros
        Scanner scanner = new Scanner(System.in); // criação de um objeto de leitura associado a variavel scanner

        // adiciona os números inseridos no ArrayList
        System.out.println("Escreva o primeiro número: ");
        numeros.add(scanner.nextInt());
        System.out.println("Escreva o segundo número: ");
        numeros.add(scanner.nextInt());
        System.out.println("Escreva o terceiro número: ");
        numeros.add(scanner.nextInt());
        System.out.println("Escreva o quarto número: ");
        numeros.add(scanner.nextInt());
        System.out.println("Escreva o quinto número: ");
        numeros.add(scanner.nextInt());

        Collections.sort(numeros); // ordena os números do ArrayList

        System.out.println("Os números em ordem crescente: " + numeros);

        scanner.close();
    }
}
