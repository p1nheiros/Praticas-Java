import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] temp = new int[10];
        int i = 0;

        temp[0] = 13;
        temp[1] = 40;
        temp[2] = 22;
        temp[3] = 10;

        // lendo elementos do vetor

        while(i < 10) {
            System.out.println(/*insira um lemento no vertor*/ + i);
            temp[i] = scanner.nextInt();
        }

        while (i < 10) {
            System.out.println(temp[i]);
            // i = i + 1;
            // i += 1;
            i++;

            scanner.close();
        }
    }
}
