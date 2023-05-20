import java.util.Scanner;

public class numeroPrimo {
    public static void main(String[] args) {
        int numero;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número: ");
        numero = scanner.nextInt();
        while (numero < 0) {
            System.out.println("O valor inserido deve ser positivo. Insira um novo valor:");
            numero = scanner.nextInt();
        }
        {
            if (5 % numero == 0) {
                System.out.println(numero +" NÃO é divisivel por 2");
            } else {
                System.out.println(numero +" é divisivel por 2");
            }

            scanner.close();
        }
    }
}