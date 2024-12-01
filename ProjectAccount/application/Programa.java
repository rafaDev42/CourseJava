package application;

import entities.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    //portuguese version of the 'Program'
    //redoing the exercise to improve learning retention
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Conta conta;

        System.out.print("Insira o número da sua conta: ");
        int numero = sc.nextInt();

        System.out.print("Insira o seu nome: ");
        sc.nextLine();
        String titular = sc.nextLine();

        System.out.println("Você quer fazer um depósito inicial (S/N) ?");
        char resposta = sc.next().charAt(0);

        if (resposta == 'S') {
            System.out.println("Insira o valor que deseja depositar: ");
            double depositoInicial = sc.nextDouble();
            conta = new Conta(numero, titular, depositoInicial);
        } else {//sobrecarga
            conta = new Conta(numero, titular);
        }

        System.out.println("\nDados da conta: ");
        System.out.println(conta);

        System.out.print("\nInsira um valor para depositar: ");
        double valorDeposito = sc.nextDouble();
        conta.deposito(valorDeposito);
        System.out.println("Dados da conta atualizados: ");
        System.out.println(conta);

        System.out.println("\nInsira um valor para saque: ");
        double valorRetirada = sc.nextDouble();
        conta.retirada(valorRetirada);
        System.out.println("\nDados da conta atualizados: ");
        System.out.println(conta);

        sc.close();
    }
}
