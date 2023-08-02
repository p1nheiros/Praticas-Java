package praticasdois;

import java.util.Scanner;

public class Introducao {



    public static void main(String[] args) {
        //Conta conta = new Conta(1234, "Ricardo", 50.0f);
        Scanner scanner = new Scanner(System.in);
        Conta conta = new Conta(1234, "Ricardo", 50.0f, "Poupança");
        Conta conta2 = new Conta(1235, "Caio", 100.0f, "Corrente");
        //conta.saldo = 23.0f;

        //conta.sacar(12.0f);

        //System.out.println("O saldo da conta é :" + conta.saldo);
        //System.out.println("O nome do titular da conta é: " + conta.nomeTitular);

        //System.out.println("O saldo da conta é :" + conta2.saldo);
        //System.out.println("O nome do titular da conta é: " + conta2.nomeTitular);
        //conta.depositar(-100.0f);
        //System.out.println(conta2.saldo);

        //System.out.println(conta2.imprimirNomeContaRetorno());
        //conta.imprimirSaldo();
        //conta2.imprimirSaldo();
        //conta.transferir(25.0f, conta2);
        //conta.imprimirSaldo();
        //conta2.imprimirSaldo();

        //conta2.tipoDaConta();


        conta.setNomeTitular("José");
        System.out.println(conta.getNomeTitular());


    }
}